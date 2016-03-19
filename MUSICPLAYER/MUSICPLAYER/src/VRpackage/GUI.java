package VRpackage;

import demo.sphinx.helloworld.HelloWorld;
import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
import edu.cmu.sphinx.util.props.PropertyException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.swing.JFileChooser;
public class GUI extends javax.swing.JFrame {

   MUSICPLAYER m= new MUSICPLAYER();
   HelloWorld vr=new HelloWorld();
   JFileChooser chooser= new JFileChooser();
   String p;
   String command;
   static String songname;
   
    public GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Line = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Vr = new javax.swing.JLabel();
        filechoose1 = new javax.swing.JLabel();
        filechoose = new javax.swing.JLabel();
        stop = new javax.swing.JLabel();
        pause = new javax.swing.JLabel();
        play = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VR MUSIC PLAYER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, -1));

        Line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineActionPerformed(evt);
            }
        });
        getContentPane().add(Line, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 110, -1));

        Name.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 280, 30));

        Vr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VrMouseReleased(evt);
            }
        });
        getContentPane().add(Vr, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 429, 50, 42));

        filechoose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                filechoose1MouseReleased(evt);
            }
        });
        getContentPane().add(filechoose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 170, 30));

        filechoose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                filechooseMouseReleased(evt);
            }
        });
        getContentPane().add(filechoose, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 38, 80, 78));

        stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                stopMouseReleased(evt);
            }
        });
        getContentPane().add(stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 430, 58, 50));

        pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pauseMouseReleased(evt);
            }
        });
        getContentPane().add(pause, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 430, 58, 50));

        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                playMouseReleased(evt);
            }
        });
        getContentPane().add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 417, 71, 71));

        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 0, 20, 20));

        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 1, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VRpackage/finalGUI.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 709, 567));

        setSize(new java.awt.Dimension(709, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
       this.setState(GUI.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void playMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseReleased
     
        m.Resume();
    }//GEN-LAST:event_playMouseReleased

    private void stopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopMouseReleased
     m.Stop();
    }//GEN-LAST:event_stopMouseReleased

    private void filechooseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filechooseMouseReleased
     int result = chooser.showOpenDialog(null);
    
     if(result==JFileChooser.APPROVE_OPTION)
     { 
      m.Stop();
      File fileobj = chooser.getSelectedFile();
      p=fileobj.getPath();
      songname=chooser.getSelectedFile().getName();
      Name.setText(songname);
      
      m.Play(p);
     }
    }//GEN-LAST:event_filechooseMouseReleased

    private void pauseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseMouseReleased
       m.Pause();
    }//GEN-LAST:event_pauseMouseReleased

    private void VrMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VrMouseReleased
       new Thread()     

       {

            @Override

            public void run()

            {

             try {

            URL url;

                url =HelloWorld.class.getResource("helloworld.config.xml");

            System.out.println("Loading...");

            ConfigurationManager cm = new ConfigurationManager(url);

	    Recognizer recognizer = (Recognizer) cm.lookup("recognizer");

	    Microphone microphone = (Microphone) cm.lookup("microphone");

            recognizer.allocate();

	    if (microphone.startRecording()) {

		System.out.println

		    ("Say: Play Pause Stop");

		while (true) {

		    System.out.println

			("Start speaking.\n");
                   
                    Result result = recognizer.recognize();

		    if (result != null) {

			String resultText = result.getBestFinalResultNoFiller();

			System.out.println("You said: " + resultText + "\n");

                        GUI.Line.setText(resultText);

                        if("pause".equals(resultText)){

                            System.out.println("Music will be paused.");
                            m.Pause();
                        }  
                         if("play".equals(resultText)){

                            System.out.println("Music will resume.");
                            m.Resume();
                            
                         }
                          if("stop".equals(resultText)){
                              System.out.println("Music stops.");
                              m.Stop();                             

                         }                 

		    } else {

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

    }//GEN-LAST:event_VrMouseReleased

    private void LineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineActionPerformed
        
    }//GEN-LAST:event_LineActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        
    }//GEN-LAST:event_NameActionPerformed

    private void filechoose1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filechoose1MouseReleased
        int result = chooser.showOpenDialog(null);
        File fileobj = chooser.getSelectedFile();
        if(result==JFileChooser.APPROVE_OPTION)
        {
            m.Stop();
            p=fileobj.getPath();
            songname=chooser.getSelectedFile().getName();
            Name.setText(songname);

            m.Play(p);
        }
    }//GEN-LAST:event_filechoose1MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
               //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Line;
    public static javax.swing.JTextField Name;
    private javax.swing.JLabel Vr;
    private javax.swing.JLabel close;
    private javax.swing.JLabel filechoose;
    private javax.swing.JLabel filechoose1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel pause;
    private javax.swing.JLabel play;
    private javax.swing.JLabel stop;
    // End of variables declaration//GEN-END:variables
}
