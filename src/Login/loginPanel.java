package Login;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Main.funcBtn;

public class loginPanel extends JPanel {

   public loginPanel(JFrame frame) {
      super();
      panelInit(frame);
   }

   private void panelInit(JFrame frame) {
      // �α��� ȭ�� �г�
      this.setBackground(new Color(255, 255, 255));
      this.setBounds(0, 0, 1280, 960);
      this.setLayout(null);
      funcBtn funcBtn =new funcBtn();
      //�α��� ����
      JLabel IDtitle = new JLabel("�α���");
      funcBtn.funcMainLabel(IDtitle, 130, 100, 800, 35,24, 23, 23);
      this.add(IDtitle);

      //pw ����
      JLabel pwTxt = new JLabel("PW");
      funcBtn.funcLabel(pwTxt, 250, 320, 100, 40,166, 166, 166);
      this.add(pwTxt);
      
      //id ����
      JLabel idTxt = new JLabel("ID");
      idTxt.setBounds(250, 230, 100, 40);
      funcBtn.funcLabel(idTxt, 250, 230, 100, 40,166, 166, 166);
      this.add(idTxt);
   }
}