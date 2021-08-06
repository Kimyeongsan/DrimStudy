/*package BoardWrite;

import java.awt.Color;

public class BoardWriteFrame extends JPanel {
   private JFrame frame;
   private BoardWritePanel BoardWritePanel;
   
   JButton writeBtn = new JButton("±Û¾²±â");

   public BoardWriteFrame(JFrame frame) {
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
      BoardWritePanel = new BoardWritePanel(frame);

      BoardWritePanel.setBounds(80, 200, 1100, 600);
      BoardWritePanel.setBackground(new Color(242, 242, 242));
      BoardWritePanel.setBorder(null); 

      this.add(BoardWritePanel);
   }
}*/