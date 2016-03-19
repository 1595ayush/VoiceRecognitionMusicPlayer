package demo.sphinx.helloworld;

import VRpackage.GUI;

import VRpackage.MUSICPLAYER;

import edu.cmu.sphinx.frontend.util.Microphone;

import edu.cmu.sphinx.recognizer.Recognizer;

import edu.cmu.sphinx.result.Result;

import edu.cmu.sphinx.util.props.ConfigurationManager;

import edu.cmu.sphinx.util.props.PropertyException;




import java.io.IOException;

import java.net.URL;







/**

 * A simple HelloWorld demo showing a simple speech application 

 * built using Sphinx-4. This application uses the Sphinx-4 endpointer,

 * which automatically segments incoming audio into utterances and silences.

 */

public class HelloWorld {

 MUSICPLAYER m1 = new MUSICPLAYER();

    

       

        public void speak() {

       new Thread()     

       {

            @Override

            public void run()

            {

             try {

            URL url;

           /* System.out.println(args);

            if (args.length > 0) {

                url = new File(args[0]).toURI().toURL();

            } else {*/

                url =HelloWorld.class.getResource("helloworld.config.xml");

        //}




            System.out.println("Loading...");




            ConfigurationManager cm = new ConfigurationManager(url);




	    Recognizer recognizer = (Recognizer) cm.lookup("recognizer");

	    Microphone microphone = (Microphone) cm.lookup("microphone");







           

            recognizer.allocate();




            

	    if (microphone.startRecording()) {




		System.out.println

		    ("Say: Play PAuse End )");




		while (true) {

		    System.out.println

			("Start speaking. Press Ctrl-C to quit.\n");




		    Result result = recognizer.recognize();

		    

		    if (result != null) {

			String resultText = result.getBestFinalResultNoFiller();

			System.out.println("You said: " + resultText + "\n");

                        GUI.Line.setText(resultText);

                        if("pause".equals(resultText)){

                            System.out.println("Music should be paused.");
                            m1.Pause();

                          if(resultText.equals("end")){

                              System.out.println("before stop");

                              

                              //m1.Stop();

                             System.exit(0);

                          }

                        }

                        

		    } else {

			//System.out.println("I can't hear what you said.\n");

		    }

		}

	    } else {

		System.out.println("Cannot start microphone.");

		recognizer.deallocate();

		System.exit(1);

	    }

        } catch (IOException e) {

            System.err.println("Problem when loading HelloWorld: " + e);


        } catch (PropertyException e) {

            System.err.println("Problem configuring HelloWorld: " + e);


        } catch (InstantiationException e) {

            System.err.println("Problem creating HelloWorld: " + e);


        } 

            }

       }.start();

    }

}