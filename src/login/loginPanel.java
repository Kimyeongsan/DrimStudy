package login;

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

      //�α��� ����
      JLabel IDtitle = new JLabel("�α���");
      IDtitle.setBounds(130, 50, 800, 35);
      IDtitle.setFont(new Font("���", Font.BOLD, 30)); // Font
      IDtitle.setForeground(Color.white); // Color
      IDtitle.setBackground(new Color(24, 23, 23));
      IDtitle.setOpaque(true);
      IDtitle.setHorizontalAlignment(JLabel.CENTER);
      this.add(IDtitle);

      //id ����
      JLabel idTxt = new JLabel("ID");
      idTxt.setBounds(250, 180, 100, 40);
      idTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
      idTxt.setForeground(Color.black); // Color
      idTxt.setBackground(new Color(166, 166, 166));
      idTxt.setOpaque(true);
      idTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(idTxt);

      //pw ����
      JLabel pwTxt = new JLabel("PW");
      pwTxt.setBounds(250, 250, 100, 40);
      pwTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
      pwTxt.setForeground(Color.black); // Color
      pwTxt.setBackground(new Color(166, 166, 166));
      pwTxt.setOpaque(true);
      pwTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(pwTxt);
      
      //id �Է�
      JTextField inputID = new JTextField("ID�� �Է��ϼ���.");
      inputID.setBounds(400, 180, 200, 40);
      inputID.setFont(new Font("���", Font.BOLD, 20)); // Font
      inputID.setForeground(Color.black); // Color
      inputID.setBackground(new Color(255,255,255));
      inputID.requestFocusInWindow();
      this.add(inputID);

      //pw �Է�
      JPasswordField inputPW = new JPasswordField("");
      inputPW.setBounds(400, 250, 200, 40);
      inputPW.setFont(new Font("���", Font.BOLD, 20)); // Font
      inputPW.setForeground(Color.black); // Color
      inputPW.setBackground(new Color(255,255,255));
      this.add(inputPW);

      //Ȯ�� ��ư
      JButton logBtn = new JButton("Ȯ��");
      logBtn.setFont(new Font("���", Font.BOLD, 14));
      logBtn.setBackground(new Color(217, 217, 217));
      logBtn.setBounds(500, 330, 80, 40);
      logBtn.setBorderPainted(false);
      logBtn.setFocusPainted(false);
      this.add(logBtn);

      //��� ��ư
      JButton exitBtn = new JButton("���");
      exitBtn.setFont(new Font("���", Font.BOLD, 14));
      exitBtn.setBackground(new Color(217, 217, 217));
      exitBtn.setBounds(600, 330, 80, 40);
      exitBtn.setBorderPainted(false);
      exitBtn.setFocusPainted(false);
      this.add(exitBtn);
      
      JButton regBtn = new JButton("ȸ������");
      regBtn.setFont(new Font("���", Font.BOLD, 14));
      regBtn.setBackground(new Color(217, 217, 217));
      regBtn.setBounds(700, 330, 100, 40);
      regBtn.setBorderPainted(false);
      regBtn.setFocusPainted(false);
      this.add(regBtn);
      
      logBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = "hello", pw = "1234";
				
				// �ӽ� ���
				System.out.println(id + " / " + pw );
	
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
      });
      /*
      regBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
    });
    */
   }
}