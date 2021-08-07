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
      // 로그인 화면 패널
      this.setBackground(new Color(255, 255, 255));
      this.setBounds(0, 0, 1280, 960);
      this.setLayout(null);

      //로그인 글자
      JLabel IDtitle = new JLabel("로그인");
      IDtitle.setBounds(130, 50, 800, 35);
      IDtitle.setFont(new Font("고딕", Font.BOLD, 30)); // Font
      IDtitle.setForeground(Color.white); // Color
      IDtitle.setBackground(new Color(24, 23, 23));
      IDtitle.setOpaque(true);
      IDtitle.setHorizontalAlignment(JLabel.CENTER);
      this.add(IDtitle);

      //id 글자
      JLabel idTxt = new JLabel("ID");
      idTxt.setBounds(250, 180, 100, 40);
      idTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      idTxt.setForeground(Color.black); // Color
      idTxt.setBackground(new Color(166, 166, 166));
      idTxt.setOpaque(true);
      idTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(idTxt);

      //pw 글자
      JLabel pwTxt = new JLabel("PW");
      pwTxt.setBounds(250, 250, 100, 40);
      pwTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      pwTxt.setForeground(Color.black); // Color
      pwTxt.setBackground(new Color(166, 166, 166));
      pwTxt.setOpaque(true);
      pwTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(pwTxt);
      
      //id 입력
      JTextField inputID = new JTextField("ID를 입력하세요.");
      inputID.setBounds(400, 180, 200, 40);
      inputID.setFont(new Font("고딕", Font.BOLD, 20)); // Font
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
      inputPW.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      inputPW.setForeground(Color.black); // Color
      inputPW.setBackground(new Color(255,255,255));
      this.add(inputPW);

      //확인 버튼
      JButton logBtn = new JButton("확인");
      logBtn.setFont(new Font("고딕", Font.BOLD, 14));
      logBtn.setBackground(new Color(217, 217, 217));
      logBtn.setBounds(500, 330, 80, 40);
      logBtn.setBorderPainted(false);
      logBtn.setFocusPainted(false);
      this.add(logBtn);      
   
      logBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = "hello", pw = "1234";
				
				// 임시 출력
				String inID = inputID.getText();
				String inPW = inputPW.getText();
				
				System.out.println(inID + " / " + inPW );
	
				if (id.equals(inID) && pw.equals(inPW)) {
					JOptionPane.showMessageDialog(null, "환영!", "login", JOptionPane.INFORMATION_MESSAGE);
				} 
				// 로그인 실패
				else if (id.equals(inputID.getText()) && pw.equals(inputPW.getText()) == false) {
					JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.", "login", JOptionPane.ERROR_MESSAGE);
				}
				else {  
					JOptionPane.showMessageDialog(null, "아님", "login", JOptionPane.ERROR_MESSAGE);
				}
			}
      });
   }
}