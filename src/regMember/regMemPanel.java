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
      // 로그인 화면 패널
      this.setBackground(new Color(255, 255, 255));
      this.setBounds(0, 0, 1280, 960);
      this.setLayout(null);

      //로그인 글자
      JLabel regtitle = new JLabel("회원가입");
      regtitle.setBounds(130, 30, 800, 35);
      regtitle.setFont(new Font("고딕", Font.BOLD, 30)); // Font
      regtitle.setForeground(Color.white); // Color
      regtitle.setBackground(new Color(24, 23, 23));
      regtitle.setOpaque(true);
      regtitle.setHorizontalAlignment(JLabel.CENTER);
      this.add(regtitle);
      
      //이름 글자
      JLabel nameTxt = new JLabel("이름");
      nameTxt.setBounds(250, 100, 100, 40);
      nameTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      nameTxt.setForeground(Color.black); // Color
      nameTxt.setBackground(new Color(166, 166, 166));
      nameTxt.setOpaque(true);
      nameTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(nameTxt);
      
      //이름 입력
      JTextField inputName = new JTextField("이름을 입력하세요.");
      inputName.setBounds(400, 100, 250, 40);
      inputName.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      inputName.setForeground(Color.black); // Color
      inputName.setBackground(new Color(255,255,255));
      inputName.requestFocusInWindow();
      inputName.addMouseListener(new MouseAdapter(){
          @Override
          public void mouseClicked(MouseEvent e){
        	  inputName.setText("");
          }
      });
      this.add(inputName);

      //id 글자
      JLabel idTxt = new JLabel("ID");
      idTxt.setBounds(250, 150, 100, 40);
      idTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      idTxt.setForeground(Color.black); // Color
      idTxt.setBackground(new Color(166, 166, 166));
      idTxt.setOpaque(true);
      idTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(idTxt);
      
      //id 입력
      JTextField inID = new JTextField("ID를 입력하세요.");
      inID.setBounds(400, 150, 250, 40);
      inID.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      inID.setForeground(Color.black); // Color
      inID.setBackground(new Color(255,255,255));
      inID.requestFocusInWindow();
      inID.addMouseListener(new MouseAdapter(){
          @Override
          public void mouseClicked(MouseEvent e){
        	  inID.setText("");
          }
      });
      this.add(inID);
      
      //pw 글자
      JLabel pwTxt = new JLabel("PW");
      pwTxt.setBounds(250, 200, 100, 40);
      pwTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      pwTxt.setForeground(Color.black); // Color
      pwTxt.setBackground(new Color(166, 166, 166));
      pwTxt.setOpaque(true);
      pwTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(pwTxt);

      //pw 입력
      JPasswordField inputPW = new JPasswordField("");
      inputPW.setBounds(400, 200, 250, 40);
      inputPW.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      inputPW.setForeground(Color.black); // Color
      inputPW.setBackground(new Color(255,255,255));
      inputPW.addMouseListener(new MouseAdapter(){
          @Override
          public void mouseClicked(MouseEvent e){
        	  inputPW.setText("");
          }
      });
      this.add(inputPW);
      
      //pw2 글자
      JLabel pw2Txt = new JLabel("PW 확인");
      pw2Txt.setBounds(250, 250, 100, 40);
      pw2Txt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      pw2Txt.setForeground(Color.black); // Color
      pw2Txt.setBackground(new Color(166, 166, 166));
      pw2Txt.setOpaque(true);
      pw2Txt.setHorizontalAlignment(JLabel.CENTER);
      this.add(pw2Txt);

      //pw2입력
      JPasswordField inputPW2 = new JPasswordField("");
      inputPW2.setBounds(400, 250, 250, 40);
      inputPW2.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      inputPW2.setForeground(Color.black); // Color
      inputPW2.setBackground(new Color(255,255,255));
      inputPW2.addMouseListener(new MouseAdapter(){
          @Override
          public void mouseClicked(MouseEvent e){
        	  inputPW2.setText("");
          }
      });
      this.add(inputPW2);
      
      //이메일 글자
      JLabel emailTxt = new JLabel("이메일");
      emailTxt.setBounds(250, 300, 100, 40);
      emailTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      emailTxt.setForeground(Color.black); // Color
      emailTxt.setBackground(new Color(166, 166, 166));
      emailTxt.setOpaque(true);
      emailTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(emailTxt);

      //이메일 입력
      JTextField inputEmail = new JTextField("이메일을 입력하세요.");
      inputEmail.setBounds(400, 300, 250, 40);
      inputEmail.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      inputEmail.setForeground(Color.black); // Color
      inputEmail.setBackground(new Color(255,255,255));
      inputEmail.addMouseListener(new MouseAdapter(){
          @Override
          public void mouseClicked(MouseEvent e){
        	  inputEmail.setText("");
          }
      });
      this.add(inputEmail);
      
      //닉네임 글자
      JLabel nicTxt = new JLabel("닉네임");
      nicTxt.setBounds(250, 350, 100, 40);
      nicTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      nicTxt.setForeground(Color.black); // Color
      nicTxt.setBackground(new Color(166, 166, 166));
      nicTxt.setOpaque(true);
      nicTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(nicTxt);

      //닉네임 입력
      JTextField inputNic = new JTextField("닉네임을 입력하세요.");
      inputNic.setBounds(400, 350, 250, 40);
      inputNic.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      inputNic.setForeground(Color.black); // Color
      inputNic.setBackground(new Color(255,255,255));
      inputNic.addMouseListener(new MouseAdapter(){
          @Override
          public void mouseClicked(MouseEvent e){
        	  inputNic.setText("");
          }
      });
      this.add(inputNic);
      
      //완료 버튼
      JButton regBtn = new JButton("완료");
      regBtn.setFont(new Font("고딕", Font.BOLD, 14));
      regBtn.setBackground(new Color(217, 217, 217));
      regBtn.setBounds(500, 430, 80, 40);
      regBtn.setBorderPainted(false);
      regBtn.setFocusPainted(false);
      this.add(regBtn);
      
      regBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            String myName = inputName.getText();
            String myID = inID.getText();
            String myPW = inputPW.getText();
            String myPW2 = inputPW2.getText();
            String myEmail = inputEmail.getText();
            String myNic = inputNic.getText();
            
            if(myPW == myPW2) {
   
            // 임시 출력
            System.out.println(myName + " / " + myID  + " / " + myPW + " / " + myPW2 + " / " + myEmail + " / "+ myNic);
            
            JOptionPane.showMessageDialog
               (null, "아이디 : "+myID+ ", "+"이 름 : "+myName+", 이메일 : "+myEmail+
               ", 닉 네 임 : "+myNic, "register", JOptionPane.INFORMATION_MESSAGE);
            //return ischkUser();
            
            } else { //비밀번호 틀림
            	JOptionPane.showMessageDialog
                (null, "비밀번호가 틀립니다.", "회원가입 실패", JOptionPane.INFORMATION_MESSAGE);
            }
         }
      });
      
      
   }
}