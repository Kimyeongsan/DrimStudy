package regMember;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class regMemPanel extends JPanel{
   public regMemPanel(JFrame frame) {
      super();
      panelInit(frame);
   }

   private void panelInit(JFrame frame) {
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
      inputName.setBounds(400, 100, 200, 40);
      inputName.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      inputName.setForeground(Color.black); // Color
      inputName.setBackground(new Color(255,255,255));
      inputName.requestFocusInWindow();
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
      JTextField inputID = new JTextField("ID를 입력하세요.");
      inputID.setBounds(400, 150, 200, 40);
      inputID.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      inputID.setForeground(Color.black); // Color
      inputID.setBackground(new Color(255,255,255));
      inputID.requestFocusInWindow();
      this.add(inputID);
      
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
      inputPW.setBounds(400, 200, 200, 40);
      inputPW.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      inputPW.setForeground(Color.black); // Color
      inputPW.setBackground(new Color(255,255,255));
      this.add(inputPW);
      
      //pw2 글자
      JLabel pw2Txt = new JLabel("PW");
      pw2Txt.setBounds(250, 250, 100, 40);
      pw2Txt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      pw2Txt.setForeground(Color.black); // Color
      pw2Txt.setBackground(new Color(166, 166, 166));
      pw2Txt.setOpaque(true);
      pw2Txt.setHorizontalAlignment(JLabel.CENTER);
      this.add(pw2Txt);

      //pw2입력
      JPasswordField inputPW2 = new JPasswordField("");
      inputPW2.setBounds(400, 250, 200, 40);
      inputPW2.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      inputPW2.setForeground(Color.black); // Color
      inputPW2.setBackground(new Color(255,255,255));
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
      JTextField emailPW = new JTextField("이메일을 입력하세요.");
      emailPW.setBounds(400, 300, 200, 40);
      emailPW.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      emailPW.setForeground(Color.black); // Color
      emailPW.setBackground(new Color(255,255,255));
      this.add(emailPW);
      
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
      inputNic.setBounds(400, 350, 200, 40);
      inputNic.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      inputNic.setForeground(Color.black); // Color
      inputNic.setBackground(new Color(255,255,255));
      this.add(inputNic);
      
    //취소 버튼
      JButton regBtn = new JButton("완료");
      regBtn.setFont(new Font("고딕", Font.BOLD, 14));
      regBtn.setBackground(new Color(217, 217, 217));
      regBtn.setBounds(500, 400, 80, 40);
      regBtn.setBorderPainted(false);
      regBtn.setFocusPainted(false);
      this.add(regBtn);
      
    //취소 버튼
      JButton exitBtn = new JButton("취소");
      exitBtn.setFont(new Font("고딕", Font.BOLD, 14));
      exitBtn.setBackground(new Color(217, 217, 217));
      exitBtn.setBounds(700, 400, 80, 40);
      exitBtn.setBorderPainted(false);
      exitBtn.setFocusPainted(false);
      this.add(exitBtn);
   }
}