package myPage;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class myPageFrame extends JFrame {
   private JFrame frame;
   private myPagePanel myPagePanel;

   public myPageFrame(JFrame frame) {
      super();
      FrameInit(frame);
      PanelInit();
   }
   private void FrameInit(JFrame frame) {
        this.getContentPane().setLayout(null);
            
        ImageIcon img = new ImageIcon("./img/drim_img.png");
        this.setIconImage(img.getImage());
            
         this.setBackground(new Color(255, 255, 255));
         this.setBounds(500, 200, 1000, 700);
         this.setLayout(null);
   }

   private void PanelInit() {
      myPagePanel = new myPagePanel(frame);

      myPagePanel.setBounds(0, 0, 1000, 700);
      myPagePanel.setBackground(new Color(242, 242, 242));
      myPagePanel.setBorder(null); 

      this.add(myPagePanel);
   }
}