package regMember;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class regMemPanel extends JPanel{
   public regMemPanel(JFrame frame) {
      super();
      panelInit(frame);
   }

   public void panelInit(JFrame frame) {
      // �α��� ȭ�� �г�
      this.setBackground(new Color(255, 255, 255));
      this.setBounds(0, 0, 1280, 960);
      this.setLayout(null);

      //�α��� ����
      JLabel regtitle = new JLabel("ȸ������");
      regtitle.setBounds(130, 30, 800, 35);
      regtitle.setFont(new Font("���", Font.BOLD, 30)); // Font
      regtitle.setForeground(Color.white); // Color
      regtitle.setBackground(new Color(24, 23, 23));
      regtitle.setOpaque(true);
      regtitle.setHorizontalAlignment(JLabel.CENTER);
      this.add(regtitle);
      
      //�̸� ����
      JLabel nameTxt = new JLabel("�̸�");
      nameTxt.setBounds(250, 100, 100, 40);
      nameTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
      nameTxt.setForeground(Color.black); // Color
      nameTxt.setBackground(new Color(166, 166, 166));
      nameTxt.setOpaque(true);
      nameTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(nameTxt);


      //id ����
      JLabel idTxt = new JLabel("ID");
      idTxt.setBounds(250, 150, 100, 40);
      idTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
      idTxt.setForeground(Color.black); // Color
      idTxt.setBackground(new Color(166, 166, 166));
      idTxt.setOpaque(true);
      idTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(idTxt);
      
      
      
      //pw ����
      JLabel pwTxt = new JLabel("PW");
      pwTxt.setBounds(250, 200, 100, 40);
      pwTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
      pwTxt.setForeground(Color.black); // Color
      pwTxt.setBackground(new Color(166, 166, 166));
      pwTxt.setOpaque(true);
      pwTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(pwTxt);

     
      
      //pw2 ����
      JLabel pw2Txt = new JLabel("PW Ȯ��");
      pw2Txt.setBounds(250, 250, 100, 40);
      pw2Txt.setFont(new Font("���", Font.BOLD, 20)); // Font
      pw2Txt.setForeground(Color.black); // Color
      pw2Txt.setBackground(new Color(166, 166, 166));
      pw2Txt.setOpaque(true);
      pw2Txt.setHorizontalAlignment(JLabel.CENTER);
      this.add(pw2Txt);

      
      
      //�̸��� ����
      JLabel emailTxt = new JLabel("�̸���");
      emailTxt.setBounds(250, 300, 100, 40);
      emailTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
      emailTxt.setForeground(Color.black); // Color
      emailTxt.setBackground(new Color(166, 166, 166));
      emailTxt.setOpaque(true);
      emailTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(emailTxt);

      
      //�г��� ����
      JLabel nicTxt = new JLabel("�г���");
      nicTxt.setBounds(250, 350, 100, 40);
      nicTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
      nicTxt.setForeground(Color.black); // Color
      nicTxt.setBackground(new Color(166, 166, 166));
      nicTxt.setOpaque(true);
      nicTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(nicTxt);

   }
}