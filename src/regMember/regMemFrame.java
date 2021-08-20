package regMember;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Database.RegisterDB;
import MainFunction.funVisible;
import MainFunction.funcBtn;
import MainFunction.funcBtnEffect;

import login.loginFrame;

public class regMemFrame extends JFrame {
   private JFrame frame;
   private regMemPanel regMemPanel;
   
   JButton regBtn = new JButton("회원가입");
    
   public regMemFrame(JFrame frame) {
      super();
      FrameInit(frame);
      PanelInit();
   }

   private void FrameInit(JFrame frame) {
        this.getContentPane().setLayout(null);
            
        ImageIcon img = new ImageIcon("./img/drim_img.png");
        this.setIconImage(img.getImage());
            
         this.setBackground(new Color(255, 255, 255));
         this.setBounds(500, 200, 1000, 700);
         this.setLayout(null);
         
          funcBtn funcBtn = new funcBtn();
          funcBtnEffect btnEffect= new funcBtnEffect();
          funVisible funVisible = new funVisible();
          JTextField inID = new JTextField("ID를 입력하세요.");
          JTextField inputName = new JTextField("이름을 입력하세요.");
          JPasswordField inPW = new JPasswordField("");
          JPasswordField inPW2 = new JPasswordField("");
          JTextField inputEmail = new JTextField("이메일을 입력하세요.");
          JTextField inputNic = new JTextField("닉네임을 입력하세요.");
          JButton regQuitbtn = new JButton("취소");
          JButton regBtn = new JButton("완료");

         //회원가입
          funcBtn.funcTextField(inputName, 510, 330, 250, 40);
          funcBtn.funcTextField(inID, 510, 380, 250, 40);
          funcBtn.funcTextField(inPW, 510, 430, 250, 40);
          funcBtn.funcTextField(inPW2, 510, 480, 250, 40);
          funcBtn.funcTextField(inputEmail, 510, 530, 250, 40);
          funcBtn.funcTextField(inputNic, 510, 580, 250, 40);
          funcBtn.funcbtn(regQuitbtn, 900, 660, 80, 40, true);
          funcBtn.funcbtn(regBtn, 800, 660, 80, 40, true);

          this.add(inputName);
          this.add(inID);
          this.add(inPW);
          this.add(inPW2);
          this.add(inputEmail);
          this.add(inputNic);
          this.add(regQuitbtn);
          this.add(regBtn);
          
          loginFrame loginFrame = new loginFrame(frame);
          
          //확인
        btnEffect.btnMouseEffect(regBtn);
        regBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
               String myName = inputName.getText();
               String myID = inID.getText();
               String myPW = inPW.getText();
               String myPW2 = inPW2.getText();
               String myEmail = inputEmail.getText();
               String myNic = inputNic.getText();
               RegisterDB registerDB = new RegisterDB();
               boolean DBbool = true;
               // 임시 출력
               System.out.println(myName + " / " + myID  + " / " + myPW + " / " + myPW2 + " / " + myEmail + " / "+ myNic);
                          
               //회원가입
               String[] arrCol = {"ID", "email", "nicName"};
               String[] arrMY = {myID, myEmail, myNic};
               int i = 0;
               funcRegisterChk register = new funcRegisterChk();
               DBbool = register.ChkRegister(myName, myID, myPW, myPW2, myEmail, myNic, arrCol[i], arrMY[i]);
            
               //로그인화면으로 전환
               if(DBbool) {
                  loginFrame.setVisible(true);
                   dispose();
               }
               else {
                   inPW.setText("");
                   inPW2.setText("");
               }
             }
          });
   }

   private void PanelInit() {
      regMemPanel = new regMemPanel(frame);

      regMemPanel.setBounds(0, 0, 1000, 700);
      regMemPanel.setBackground(new Color(242, 242, 242));
      regMemPanel.setBorder(null); 
      this.add(regMemPanel);
   }
}