/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groove.pk;

import jaco.mp3.player.MP3Player;
import java.io.File;
import java.nio.file.Paths;
import java.awt.Dimension;
import java.awt.Font;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author Altair
 */
public class PlayerFrame extends javax.swing.JFrame {

    /**
     * Creates new form PlayerFrame
     */
    //Define MP3Player Class From JACO MP3Player Lib
      MP3Player player;
      //Define file for song
      File songFile;
      //Define current Directory like if we use JFileChooser then where it stays
      String currentDirectory="home.user"; //i am using home.user this will call file chooser in user documents
      //here i define currentPath of the running app class
      String currentPath;
      //this string will be for image name or path
      String imagePath;
      //we need to set up title as string
      String appName = "JHOPE TECH SOLUTIONS - (MP3 Player)";
      
      //now check if repeat button is enabled or not
    boolean repeat=false;
    
    //here i am making a boolean for windowCollapsed
    boolean windowCollapsed=false;
    
    //here i need to define mouse x and y for to get mouse position on screen.
    int xMouse,yMouse;
    
      
    public PlayerFrame() {
        initComponents();
        appTitle.setText(appName);
        
        //here i am going to set a default song file. it's not necessary.
        songFile=new File("‪F:\\#Music#\\BTS - The Truth Untold (전하지 못한 진심) (feat. Steve Aoki).mp3");
        
        //now make a string to get file name
        String fileName = songFile.getName();
        //here set our song name label with this name
        songNameDisplay.setText(fileName);
        
        // Add our method to player variable
        player = mp3Player();
        
        //add our method to player variable
        player.addToPlayList(songFile);
        
        //here get current path and images path in strings
        currentPath=Paths.get(".").toAbsolutePath().normalize().toString();
        imagePath="\\images";
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        appTitle = new javax.swing.JLabel();
        settingsBar = new javax.swing.JLabel();
        quitBtn = new javax.swing.JLabel();
        songNameMainPanel = new javax.swing.JPanel();
        songNameSubPanel = new javax.swing.JPanel();
        songNameDisplay = new javax.swing.JLabel();
        controlPanel = new javax.swing.JPanel();
        playBtn = new javax.swing.JLabel();
        repeatBtn = new javax.swing.JLabel();
        stopBtn = new javax.swing.JLabel();
        pauseBtn = new javax.swing.JLabel();
        openBtn = new javax.swing.JLabel();
        volumeDownBtn = new javax.swing.JLabel();
        muteBtn = new javax.swing.JLabel();
        volumeUpBtn = new javax.swing.JLabel();
        volumeFullBtn = new javax.swing.JLabel();

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(7, 63, 80));

        headerPanel.setBackground(new java.awt.Color(36, 93, 116));

        appTitle.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        appTitle.setForeground(new java.awt.Color(34, 202, 234));
        appTitle.setText("APP TITLE");
        appTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                appTitleMouseDragged(evt);
            }
        });
        appTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appTitleMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                appTitleMousePressed(evt);
            }
        });

        settingsBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groove/pk/images/settings.png"))); // NOI18N
        settingsBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsBarMouseClicked(evt);
            }
        });

        quitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groove/pk/images/quit.png"))); // NOI18N
        quitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsBar)
                .addGap(55, 55, 55))
            .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                    .addContainerGap(712, Short.MAX_VALUE)
                    .addComponent(quitBtn)
                    .addGap(10, 10, 10)))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settingsBar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(quitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        songNameMainPanel.setBackground(new java.awt.Color(7, 63, 80));

        songNameSubPanel.setBackground(new java.awt.Color(7, 63, 80));
        songNameSubPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 202, 234), 1, true));
        songNameSubPanel.setLayout(new java.awt.BorderLayout());

        songNameDisplay.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        songNameDisplay.setForeground(new java.awt.Color(34, 202, 234));
        songNameDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songNameDisplay.setText("PLAYING");
        songNameSubPanel.add(songNameDisplay, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout songNameMainPanelLayout = new javax.swing.GroupLayout(songNameMainPanel);
        songNameMainPanel.setLayout(songNameMainPanelLayout);
        songNameMainPanelLayout.setHorizontalGroup(
            songNameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songNameMainPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(songNameSubPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        songNameMainPanelLayout.setVerticalGroup(
            songNameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songNameMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(songNameSubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        controlPanel.setBackground(new java.awt.Color(7, 63, 80));

        playBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groove/pk/images/play.png"))); // NOI18N
        playBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playBtnMouseClicked(evt);
            }
        });

        repeatBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        repeatBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groove/pk/images/repeat.png"))); // NOI18N
        repeatBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repeatBtnMouseClicked(evt);
            }
        });

        stopBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stopBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groove/pk/images/stop.png"))); // NOI18N
        stopBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopBtnMouseClicked(evt);
            }
        });

        pauseBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pauseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groove/pk/images/pause.png"))); // NOI18N
        pauseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pauseBtnMouseClicked(evt);
            }
        });

        openBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        openBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groove/pk/images/open.png"))); // NOI18N
        openBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openBtnMouseClicked(evt);
            }
        });

        volumeDownBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volumeDownBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groove/pk/images/volume_down.png"))); // NOI18N
        volumeDownBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeDownBtnMouseClicked(evt);
            }
        });

        muteBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        muteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groove/pk/images/mute.png"))); // NOI18N
        muteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                muteBtnMouseClicked(evt);
            }
        });

        volumeUpBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volumeUpBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groove/pk/images/volume_up.png"))); // NOI18N
        volumeUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeUpBtnMouseClicked(evt);
            }
        });

        volumeFullBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volumeFullBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groove/pk/images/volume_full.png"))); // NOI18N
        volumeFullBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeFullBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(repeatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pauseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(volumeDownBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumeUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumeFullBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(muteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
            .addComponent(stopBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(muteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volumeUpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volumeFullBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(openBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volumeDownBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pauseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(repeatBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(songNameMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(songNameMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBtnMouseClicked
        // TODO add your handling code here:
        player.play();
    }//GEN-LAST:event_playBtnMouseClicked

    private void stopBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopBtnMouseClicked
        // TODO add your handling code here:
        player.stop();
    }//GEN-LAST:event_stopBtnMouseClicked

    private void pauseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseBtnMouseClicked
        // TODO add your handling code here:
        player.pause();
    }//GEN-LAST:event_pauseBtnMouseClicked

    private void repeatBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repeatBtnMouseClicked
        // TODO add your handling code here:
        if(repeat == false){
            repeat=true;
            player.setRepeat(repeat);
            
            String image=currentPath +imagePath+"\\repeat_enabled.png";
            repeatBtn.setIcon(new ImageIcon(image));
            
        }else if(repeat ==true){
            repeat=false;
            player.setRepeat(repeat);
            
           String image=currentPath +imagePath+"\\repeat.png";
            repeatBtn.setIcon(new ImageIcon(image)); 
        }
    }//GEN-LAST:event_repeatBtnMouseClicked

    private void appTitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTitleMousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_appTitleMousePressed

    private void appTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTitleMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        
        this.setLocation(x- xMouse, y-yMouse);
    }//GEN-LAST:event_appTitleMouseDragged

    private void quitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitBtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_quitBtnMouseClicked

    private void settingsBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsBarMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Your settings dialog will be popup here");
    }//GEN-LAST:event_settingsBarMouseClicked

    private void openBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openBtnMouseClicked
        // TODO add your handling code here:
        JFileChooser openFileChooser=new JFileChooser(currentDirectory);
        openFileChooser.setFileFilter(new FileTypeFilter(".mp3","Open MP3 Files Only!"));
        int result=openFileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            songFile=openFileChooser.getSelectedFile();
            player.addToPlayList(songFile);
            player.skipForward();
            currentDirectory=songFile.getAbsolutePath();
            songNameDisplay.setText("Playing Now... |"+songFile.getName());
        }
    }//GEN-LAST:event_openBtnMouseClicked

    private void appTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTitleMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            if(windowCollapsed==false){
                windowCollapsed=true;
                this.setSize(new Dimension(this.getSize().width,50));
                
                appTitle.setFont(new Font("Nirmala UI",0,12)); 
                appTitle.setText("Playing Now...| "+songFile.getName());
            }else if (windowCollapsed==true){
                windowCollapsed=false;
                this.setSize(new Dimension(this.getSize().width,250));
                
                appTitle.setFont(new Font("Nirmala UI",0,18)); 
                appTitle.setText(appName);
            }
        }
    }//GEN-LAST:event_appTitleMouseClicked

    private void volumeDownBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeDownBtnMouseClicked
        // TODO add your handling code here:
        volumeDownControl(0.1);
    }//GEN-LAST:event_volumeDownBtnMouseClicked

    private void volumeUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeUpBtnMouseClicked
        // TODO add your handling code here:
        volumeUpControl(0.1);
    }//GEN-LAST:event_volumeUpBtnMouseClicked

    private void volumeFullBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeFullBtnMouseClicked
        // TODO add your handling code here:
        volumeControl(1.0);
    }//GEN-LAST:event_volumeFullBtnMouseClicked

    private void muteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muteBtnMouseClicked
        // TODO add your handling code here:
        volumeControl(0.0);
    }//GEN-LAST:event_muteBtnMouseClicked

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
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new PlayerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appTitle;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel muteBtn;
    private javax.swing.JLabel openBtn;
    private javax.swing.JLabel pauseBtn;
    private javax.swing.JLabel playBtn;
    private javax.swing.JLabel quitBtn;
    private javax.swing.JLabel repeatBtn;
    private javax.swing.JLabel settingsBar;
    private javax.swing.JLabel songNameDisplay;
    private javax.swing.JPanel songNameMainPanel;
    private javax.swing.JPanel songNameSubPanel;
    private javax.swing.JLabel stopBtn;
    private javax.swing.JLabel volumeDownBtn;
    private javax.swing.JLabel volumeFullBtn;
    private javax.swing.JLabel volumeUpBtn;
    // End of variables declaration//GEN-END:variables

//i am going to create a custom mp3player method
    private MP3Player mp3Player(){
        MP3Player mp3Player=new MP3Player();
        return mp3Player;
    }
    //let's set volume down method it's not necessary to remember this code
    private void volumeDownControl(Double valueToPlusMinus){
        //get mixer information from adudio system
        Mixer.Info[] mixers=AudioSystem.getMixerInfo();
        //now use a for loop to list all mixers
        for(Mixer.Info mixerInfo : mixers){
            //get mixer
            Mixer mixer=AudioSystem.getMixer(mixerInfo);
            //now get the target line
            Line.Info[] lineInfos=mixer.getTargetLineInfo();
            //here again use f or loop to list lines
            for(Line.Info lineInfo : lineInfos){
               //make a null line
               Line line =null;
               //make a boolean as opened
               boolean opened=true;
               //now use try exception for opening a line 
               try{
                   line =mixer.getLine(lineInfo);
                   opened =line.isOpen()|| line instanceof Clip;
                   //now check if line is not opened
                   if(!opened){
                       //open line
                       line.open();
                   }
                   //make a float control
                   FloatControl volControl=(FloatControl) line.getControl(FloatControl.Type.VOLUME);
                   //get current volume now
                   float currentVolume=volControl.getValue();
                   //make a temp double variable and store valuePlusMinus
                   Double volumeToCut = valueToPlusMinus;
                   //make a float and calculate the addition or subtraction in volume
                   float changedCalc=(float) ((float)currentVolume -(double)volumeToCut);
                           //now set this changed value into volume line
                           volControl.setValue(changedCalc);
                           
                           
               }catch (LineUnavailableException lineException){
               }catch (IllegalArgumentException illException){
               }finally{
                   //close Line it it is opened
                   if(line != null && !opened){
                       line.close();
                   }
               }
            }
        }
    }
    //let's set volume up method it's not necessary to remember this code
    private void volumeUpControl(Double valueToPlusMinus){
        //get mixer information from adudio system
        Mixer.Info[] mixers=AudioSystem.getMixerInfo();
        //now use a for loop to list all mixers
        for(Mixer.Info mixerInfo : mixers){
            //get mixer
            Mixer mixer=AudioSystem.getMixer(mixerInfo);
            //now get the target line
            Line.Info[] lineInfos=mixer.getTargetLineInfo();
            //here again use f or loop to list lines
            for(Line.Info lineInfo : lineInfos){
               //make a null line
               Line line =null;
               //make a boolean as opened
               boolean opened=true;
               //now use try exception for opening a line 
               try{
                   line =mixer.getLine(lineInfo);
                   opened =line.isOpen()|| line instanceof Clip;
                   //now check if line is not opened
                   if(!opened){
                       //open line
                       line.open();
                   }
                   //make a float control
                   FloatControl volControl=(FloatControl) line.getControl(FloatControl.Type.VOLUME);
                   //get current volume now
                   float currentVolume=volControl.getValue();
                   //make a temp double variable and store valuePlusMinus
                   Double volumeToCut = valueToPlusMinus;
                   //make a float and calculate the addition or subtraction in volume
                   float changedCalc=(float) ((float)currentVolume +(double)volumeToCut);
                           //now set this changed value into volume line
                           volControl.setValue(changedCalc);
                           
                           
               }catch (LineUnavailableException lineException){
               }catch (IllegalArgumentException illException){
               }finally{
                   //close Line it it is opened
                   if(line != null && !opened){
                       line.close();
                   }
               }
            }
        }
    }
    //let's set volumemethod it's not necessary to remember this code
    private void volumeControl(Double valueToPlusMinus){
        //get mixer information from adudio system
        Mixer.Info[] mixers=AudioSystem.getMixerInfo();
        //now use a for loop to list all mixers
        for(Mixer.Info mixerInfo : mixers){
            //get mixer
            Mixer mixer=AudioSystem.getMixer(mixerInfo);
            //now get the target line
            Line.Info[] lineInfos=mixer.getTargetLineInfo();
            //here again use f or loop to list lines
            for(Line.Info lineInfo : lineInfos){
               //make a null line
               Line line =null;
               //make a boolean as opened
               boolean opened=true;
               //now use try exception for opening a line 
               try{
                   line =mixer.getLine(lineInfo);
                   opened =line.isOpen()|| line instanceof Clip;
                   //now check if line is not opened
                   if(!opened){
                       //open line
                       line.open();
                   }
                   //make a float control
                   FloatControl volControl=(FloatControl) line.getControl(FloatControl.Type.VOLUME);
                   //get current volume now
                   float currentVolume=volControl.getValue();
                   //make a temp double variable and store valuePlusMinus
                   Double volumeToCut = valueToPlusMinus;
                   //make a float and calculate the addition or subtraction in volume
                   float changedCalc=(float) ((double)volumeToCut);
                           //now set this changed value into volume line
                           volControl.setValue(changedCalc);
                           
                           
               }catch (LineUnavailableException lineException){
               }catch (IllegalArgumentException illException){
               }finally{
                   //close Line it it is opened
                   if(line != null && !opened){
                       line.close();
                   }
               }
            }
        }
    }
    
}

