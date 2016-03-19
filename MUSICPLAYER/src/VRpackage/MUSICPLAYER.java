
package VRpackage;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
       
        if(player!=null)
       {
         
       }
    else
       {
           try 
           {
              
               F=new FileInputStream(FileLocation);
                B= new BufferedInputStream(F);
                 player=new Player(B);
                 F.skip(totallength-pauselocation);
                 
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
    
    
  
      //public static void main(String[] args) {
        // TODO code application logic here
    }
    


