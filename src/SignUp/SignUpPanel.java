package SignUp;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Main.funcBtn;

public class SignUpPanel extends JPanel{
   public SignUpPanel(JFrame frame) {
      super();
      panelInit(frame);
   }

   public void panelInit(JFrame frame) {
      
      funcBtn label = new funcBtn();
      // �α��� ȭ�� �г�
      this.setBackground(new Color(255, 255, 255));
      this.setBounds(0,0,1000,700);
      this.setLayout(null);

      //ȸ������ ����
      JLabel regtitle = new JLabel("ȸ������");
      label.funcMainLabel(regtitle, 110, 50, 800, 35,24, 23, 23);
      this.add(regtitle);
      
      //�̸� ����
      JLabel nameTxt = new JLabel("�̸�");
      label.funcLabel(nameTxt, 250, 200, 100, 40, 166, 166, 166);
      this.add(nameTxt);


      //id ����
      JLabel idTxt = new JLabel("ID");
      label.funcLabel(idTxt, 250, 250, 100, 40, 166, 166, 166);
      this.add(idTxt);
      
      //pw ����
      JLabel pwTxt = new JLabel("PW");
      label.funcLabel(pwTxt, 250, 300, 100, 40, 166, 166, 166);
      this.add(pwTxt);
      
      //pw2 ����
      JLabel pw2Txt = new JLabel("PW Ȯ��");
      label.funcLabel(pw2Txt, 250, 350, 100, 40, 166, 166, 166);
      this.add(pw2Txt);

      //�̸��� ����
      JLabel emailTxt = new JLabel("�̸���");
      label.funcLabel(emailTxt, 250, 400, 100, 40, 166, 166, 166);
      this.add(emailTxt);
      
      //�г��� ����
      JLabel nicTxt = new JLabel("�г���");
      label.funcLabel(nicTxt, 250, 450, 100, 40, 166, 166, 166);
      this.add(nicTxt);
   }
}