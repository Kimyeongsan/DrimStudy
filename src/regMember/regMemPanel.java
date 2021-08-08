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


      //id 글자
      JLabel idTxt = new JLabel("ID");
      idTxt.setBounds(250, 150, 100, 40);
      idTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      idTxt.setForeground(Color.black); // Color
      idTxt.setBackground(new Color(166, 166, 166));
      idTxt.setOpaque(true);
      idTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(idTxt);
      
      
      
      //pw 글자
      JLabel pwTxt = new JLabel("PW");
      pwTxt.setBounds(250, 200, 100, 40);
      pwTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      pwTxt.setForeground(Color.black); // Color
      pwTxt.setBackground(new Color(166, 166, 166));
      pwTxt.setOpaque(true);
      pwTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(pwTxt);

     
      
      //pw2 글자
      JLabel pw2Txt = new JLabel("PW 확인");
      pw2Txt.setBounds(250, 250, 100, 40);
      pw2Txt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      pw2Txt.setForeground(Color.black); // Color
      pw2Txt.setBackground(new Color(166, 166, 166));
      pw2Txt.setOpaque(true);
      pw2Txt.setHorizontalAlignment(JLabel.CENTER);
      this.add(pw2Txt);

      
      
      //이메일 글자
      JLabel emailTxt = new JLabel("이메일");
      emailTxt.setBounds(250, 300, 100, 40);
      emailTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      emailTxt.setForeground(Color.black); // Color
      emailTxt.setBackground(new Color(166, 166, 166));
      emailTxt.setOpaque(true);
      emailTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(emailTxt);

      
      //닉네임 글자
      JLabel nicTxt = new JLabel("닉네임");
      nicTxt.setBounds(250, 350, 100, 40);
      nicTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      nicTxt.setForeground(Color.black); // Color
      nicTxt.setBackground(new Color(166, 166, 166));
      nicTxt.setOpaque(true);
      nicTxt.setHorizontalAlignment(JLabel.CENTER);
      this.add(nicTxt);

   }
}