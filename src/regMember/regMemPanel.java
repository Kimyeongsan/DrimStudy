package regMember;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

   private void panelInit(JFrame frame) {
      // �α��� ȭ�� �г�
      this.setBackground(new Color(255, 255, 255));
      this.setBounds(0, 0, 1280, 960);
      this.setLayout(null);

      //�α��� ����
      JLabel regtitle = new JLabel("ȸ������");
      regtitle.setBounds(130, 30, 800, 35);
      regtitle.setFont(new Font("����", Font.BOLD, 30)); // Font
      regtitle.setForeground(Color.white); // Color
      regtitle.setBackground(new Color(24, 23, 23));
      regtitle.setOpaque(true);
      regtitle.setHorizontalAlignment(JLabel.CENTER);
      this.add(regtitle);
      
      //�̸� ����
      JLabel nameTxt = new JLabel("�̸�");
      nameTxt.setBounds(250, 100, 100, 40);
      nameTxt.setFont(new Font("����", Font.BOLD, 20)); // Font
      nameTxt.setForeground(Color.black); // Color
      nameTxt.setBackground(new Color(166, 166, 166));
      nameTxt.setOpaque(true);
      nameTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(nameTxt);
      
      //�̸� �Է�
      JTextField inputName = new JTextField("�̸��� �Է��ϼ���.");
      inputName.setBounds(400, 100, 250, 40);
      inputName.setFont(new Font("����", Font.BOLD, 20)); // Font
      inputName.setForeground(Color.black); // Color
      inputName.setBackground(new Color(255,255,255));
      inputName.requestFocusInWindow();
      this.add(inputName);

      //id ����
      JLabel idTxt = new JLabel("ID");
      idTxt.setBounds(250, 150, 100, 40);
      idTxt.setFont(new Font("����", Font.BOLD, 20)); // Font
      idTxt.setForeground(Color.black); // Color
      idTxt.setBackground(new Color(166, 166, 166));
      idTxt.setOpaque(true);
      idTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(idTxt);
      
      //id �Է�
      JTextField inputID = new JTextField("ID�� �Է��ϼ���.");
      inputID.setBounds(400, 150, 250, 40);
      inputID.setFont(new Font("����", Font.BOLD, 20)); // Font
      inputID.setForeground(Color.black); // Color
      inputID.setBackground(new Color(255,255,255));
      inputID.requestFocusInWindow();
      this.add(inputID);
      
      //pw ����
      JLabel pwTxt = new JLabel("PW");
      pwTxt.setBounds(250, 200, 100, 40);
      pwTxt.setFont(new Font("����", Font.BOLD, 20)); // Font
      pwTxt.setForeground(Color.black); // Color
      pwTxt.setBackground(new Color(166, 166, 166));
      pwTxt.setOpaque(true);
      pwTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(pwTxt);

      //pw �Է�
      JPasswordField inputPW = new JPasswordField("");
      inputPW.setBounds(400, 200, 250, 40);
      inputPW.setFont(new Font("����", Font.BOLD, 20)); // Font
      inputPW.setForeground(Color.black); // Color
      inputPW.setBackground(new Color(255,255,255));
      this.add(inputPW);
      
      //pw2 ����
      JLabel pw2Txt = new JLabel("PW Ȯ��");
      pw2Txt.setBounds(250, 250, 100, 40);
      pw2Txt.setFont(new Font("����", Font.BOLD, 20)); // Font
      pw2Txt.setForeground(Color.black); // Color
      pw2Txt.setBackground(new Color(166, 166, 166));
      pw2Txt.setOpaque(true);
      pw2Txt.setHorizontalAlignment(JLabel.CENTER);
      this.add(pw2Txt);

      //pw2�Է�
      JPasswordField inputPW2 = new JPasswordField("");
      inputPW2.setBounds(400, 250, 250, 40);
      inputPW2.setFont(new Font("����", Font.BOLD, 20)); // Font
      inputPW2.setForeground(Color.black); // Color
      inputPW2.setBackground(new Color(255,255,255));
      this.add(inputPW2);
      
      //�̸��� ����
      JLabel emailTxt = new JLabel("�̸���");
      emailTxt.setBounds(250, 300, 100, 40);
      emailTxt.setFont(new Font("����", Font.BOLD, 20)); // Font
      emailTxt.setForeground(Color.black); // Color
      emailTxt.setBackground(new Color(166, 166, 166));
      emailTxt.setOpaque(true);
      emailTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(emailTxt);

      //�̸��� �Է�
      JTextField inputEmail = new JTextField("�̸����� �Է��ϼ���.");
      inputEmail.setBounds(400, 300, 250, 40);
      inputEmail.setFont(new Font("����", Font.BOLD, 20)); // Font
      inputEmail.setForeground(Color.black); // Color
      inputEmail.setBackground(new Color(255,255,255));
      this.add(inputEmail);
      
      //�г��� ����
      JLabel nicTxt = new JLabel("�г���");
      nicTxt.setBounds(250, 350, 100, 40);
      nicTxt.setFont(new Font("����", Font.BOLD, 20)); // Font
      nicTxt.setForeground(Color.black); // Color
      nicTxt.setBackground(new Color(166, 166, 166));
      nicTxt.setOpaque(true);
      nicTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(nicTxt);

      //�г��� �Է�
      JTextField inputNic = new JTextField("�г����� �Է��ϼ���.");
      inputNic.setBounds(400, 350, 250, 40);
      inputNic.setFont(new Font("����", Font.BOLD, 20)); // Font
      inputNic.setForeground(Color.black); // Color
      inputNic.setBackground(new Color(255,255,255));
      this.add(inputNic);
      
      //�Ϸ� ��ư
      JButton regBtn = new JButton("�Ϸ�");
      regBtn.setFont(new Font("����", Font.BOLD, 14));
      regBtn.setBackground(new Color(217, 217, 217));
      regBtn.setBounds(500, 430, 80, 40);
      regBtn.setBorderPainted(false);
      regBtn.setFocusPainted(false);
      this.add(regBtn);
      
      regBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            String myName = inputName.getText();
            String myID = inputID.getText();
            String myPW = inputPW.getText();
            String myPW2 = inputPW2.getText();
            String myEmail = inputEmail.getText();
            String myNic = inputNic.getText();
   
            // �ӽ� ���
            System.out.println(myName + " / " + myID  + " / " + myPW + " / " + myPW2 + " / " + myEmail + " / "+ myNic);
            
            JOptionPane.showMessageDialog
               (null, "���̵� : "+myID+ ", "+"�� �� : "+myName+", �̸��� : "+myEmail+
               ", �� �� �� : "+myNic, "register", JOptionPane.INFORMATION_MESSAGE);
         }
      });
      
      /*
      exitBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
         }
    });
      
         
            /*
            if (id.equals(inputID.getText()) && pw.equals(inputPW.getText())) {
               JOptionPane.showMessageDialog(null, "ȯ��!", "login", JOptionPane.INFORMATION_MESSAGE);
            } 
            // �α��� ����
            else if (id.equals(inputID.getText()) && pw.equals(inputPW.getText()) == false) {
               JOptionPane.showMessageDialog(null, "��й�ȣ�� Ʋ�Ƚ��ϴ�.", "login", JOptionPane.INFORMATION_MESSAGE);
            }
            else {  
               JOptionPane.showMessageDialog(null, "�ƴ�", "login", JOptionPane.INFORMATION_MESSAGE);
            }
         }

         }
      });*/
   }
      
}