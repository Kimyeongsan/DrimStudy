package login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
      inputID.addMouseListener(new MouseAdapter(){
          @Override
          public void mouseClicked(MouseEvent e){
        	  inputID.setText("");
          }
      });
      this.add(inputID);

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
   
      logBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = "hello", pw = "1234";
				
				// �ӽ� ���
				String inID = inputID.getText();
				String inPW = inputPW.getText();
				
				System.out.println(inID + " / " + inPW );
	
				if (id.equals(inID) && pw.equals(inPW)) {
					JOptionPane.showMessageDialog(null, "ȯ��!", "login", JOptionPane.INFORMATION_MESSAGE);
				} 
				// �α��� ����
				else if (id.equals(inputID.getText()) && pw.equals(inputPW.getText()) == false) {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� Ʋ�Ƚ��ϴ�.", "login", JOptionPane.ERROR_MESSAGE);
				}
				else {  
					JOptionPane.showMessageDialog(null, "�ƴ�", "login", JOptionPane.ERROR_MESSAGE);
				}
			}
      });
   }
}