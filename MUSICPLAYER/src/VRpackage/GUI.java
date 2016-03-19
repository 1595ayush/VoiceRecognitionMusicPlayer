package VRpackage;

import demo.sphinx.helloworld.HelloWorld;
import java.io.File;
import javax.swing.JFileChooser;
public class GUI extends javax.swing.JFrame {

   MUSICPLAYER m= new MUSICPLAYER();
   HelloWorld vr=new HelloWorld();
   JFileChooser chooser= new JFileChooser();
   String p;
   String songname;
   String command;
   
    public GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Line = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
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

        jSlider1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jSlider1MouseDragged(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

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
      String songname=chooser.getSelectedFile().getName();
      Name.setText(songname);
      
      m.Play(p);
     }
    }//GEN-LAST:event_filechooseMouseReleased

    private void filechoose1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filechoose1MouseReleased
     int result = chooser.showOpenDialog(null);
     File fileobj = chooser.getSelectedFile();
     if(result==JFileChooser.APPROVE_OPTION)
     {
      p=fileobj.getPath();
      String songname=chooser.getSelectedFile().getName();
      Name.setText(songname);
      
      m.Play(p);
     }
    }//GEN-LAST:event_filechoose1MouseReleased

    private void jSlider1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider1MouseDragged

    private void pauseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseMouseReleased
       m.Pause();
    }//GEN-LAST:event_pauseMouseReleased

    private void VrMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VrMouseReleased
       //vr.listen();
        if (Line.getText().equalsIgnoreCase("pause"))
        {
        m.Pause();
        }
    }//GEN-LAST:event_VrMouseReleased

    private void LineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LineActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel pause;
    private javax.swing.JLabel play;
    private javax.swing.JLabel stop;
    // End of variables declaration//GEN-END:variables
}
