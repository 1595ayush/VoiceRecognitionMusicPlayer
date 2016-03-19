
package VRpackage;

import static VRpackage.GUI.songname;
import java.io.*;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;

/**
 *
 * @author Ayush Shah
 * Nemil Shah
 * Prajwal Shimpi
 */
public class MUSICPLAYER {
   
    String path1;
    FileInputStream F;
    BufferedInputStream B;
    public Player player;
    public long pauselocation;
    public long totallength;
    public String FileLocation; 
    
    public void Stop()
    {
        if(player!=null)
        {  
          player.close();
          player=null;
          pauselocation=0;
          totallength=0;
          GUI.Name.setText("");
        }
    }
     public void Pause()
    {
        if(player!=null)
        {  
            try {
                pauselocation=F.available();
                player.close();
                player=null;
                
            } 
            catch (IOException ex) {
                
            }
           
        }
    }
   
     public void Resume()
    {
        GUI.Name.setText(songname);
        if(player!=null)
       {
         
       }
    else
       {
           try 
           {
              
               F=new FileInputStream(FileLocation);
               F.skip(totallength-pauselocation);
                B= new BufferedInputStream(F);
                 player=new Player(B);
                 
                 
           } 
           catch (FileNotFoundException | JavaLayerException ex) 
           {
               
           } 
           catch (IOException ex) 
           {
                
            }
 
    new Thread ()            
    {
        @Override
        public void run()
        {
            try
            {
                player.play();
            } 
            catch (JavaLayerException ex) 
            {
               
            }
        }
    }.start();
       }
    }
    
     
     public void Play(String path)
    {
       GUI.Name.setText(songname);
        if(player!=null)
       {
         
       }
    else
       {
           try 
           {
              
               F=new FileInputStream(path);
                B= new BufferedInputStream(F);
                 player=new Player(B);
                 totallength=F.available();
                 FileLocation = path + "";
           } 
           catch (FileNotFoundException | JavaLayerException ex) 
           {
               
           } 
           catch (IOException ex) 
           {
                
            }
       
       
        
    new Thread ()            
    {
        @Override
        public void run()
        {
            try
            {
                player.play();
            } 
            catch (JavaLayerException ex) 
            {
               
            }
        }
    }.start();
    }
    }   
    
    }