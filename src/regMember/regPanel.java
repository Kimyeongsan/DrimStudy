package regMember;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class regPanel extends JPanel{
   public regPanel(JFrame frame) {
      super();
      panelInit(frame);
   }

   private void panelInit(JFrame frame) {
      // �α��� ȭ�� �г�
      this.setBackground(new Color(255, 255, 255));
      this.setBounds(0, 0, 1280, 960);
      this.setLayout(null);

      //�α��� ����
      JLabel IDtitle = new JLabel("�α���");
      IDtitle.setBounds(130, 50, 800, 35);
      IDtitle.setFont(new Font("���", Font.BOLD, 30)); // Font
      IDtitle.setForeground(Color.white); // Color
      IDtitle.setBackground(new Color(24, 23, 23));
      IDtitle.setOpaque(true);
      IDtitle.setHorizontalAlignment(JLabel.CENTER);
      this.add(IDtitle);
      
      //�̸� ����
      JLabel nameTxt = new JLabel("�̸�");
      nameTxt.setBounds(250, 180, 100, 40);
      nameTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
      nameTxt.setForeground(Color.black); // Color
      nameTxt.setBackground(new Color(166, 166, 166));
      nameTxt.setOpaque(true);
      nameTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(nameTxt);
      
      //id �Է�
      JTextField inputName = new JTextField("�̸��� �Է��ϼ���.");
      inputName.setBounds(400, 180, 200, 40);
      inputName.setFont(new Font("���", Font.BOLD, 20)); // Font
      inputName.setForeground(Color.black); // Color
      inputName.setBackground(new Color(255,255,255));
      inputName.requestFocusInWindow();
      this.add(inputName);

      //id ����
      JLabel idTxt = new JLabel("ID");
      idTxt.setBounds(250, 180, 100, 40);
      idTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
      idTxt.setForeground(Color.black); // Color
      idTxt.setBackground(new Color(166, 166, 166));
      idTxt.setOpaque(true);
      idTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(idTxt);
      
      //id �Է�
      JTextField inputID = new JTextField("ID�� �Է��ϼ���.");
      inputID.setBounds(400, 180, 200, 40);
      inputID.setFont(new Font("���", Font.BOLD, 20)); // Font
      inputID.setForeground(Color.black); // Color
      inputID.setBackground(new Color(255,255,255));
      inputID.requestFocusInWindow();
      this.add(inputID);
      
      //pw ����
      JLabel pwTxt = new JLabel("PW");
      pwTxt.setBounds(250, 250, 100, 40);
      pwTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
      pwTxt.setForeground(Color.black); // Color
      pwTxt.setBackground(new Color(166, 166, 166));
      pwTxt.setOpaque(true);
      pwTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(pwTxt);

      //pw �Է�
      JPasswordField inputPW = new JPasswordField("");
      inputPW.setBounds(400, 250, 200, 40);
      inputPW.setFont(new Font("���", Font.BOLD, 20)); // Font
      inputPW.setForeground(Color.black); // Color
      inputPW.setBackground(new Color(255,255,255));
      this.add(inputPW);
   }
}