package login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import regMember.regMemPanel;

public class loginFrame extends JPanel {
   private JFrame frame;
   private loginPanel loginPanel;

   public loginFrame(JFrame frame) {
      super();
      FrameInit(frame);
      PanelInit();
   }

   private void FrameInit(JFrame frame) {

      this.setBackground(new Color(255, 255, 255));
      this.setBounds(0, 0, 1280, 960);

      frame.getContentPane().add(this);
      this.setLayout(null);
   }

   private void PanelInit() {
      loginPanel = new loginPanel(frame);

      loginPanel.setBounds(130, 260, 1050, 450);
      loginPanel.setBackground(new Color(242, 242, 242));
      loginPanel.setBorder(null); 

      this.add(loginPanel);
   }
}