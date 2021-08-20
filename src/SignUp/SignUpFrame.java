package SignUp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Database.RegisterDB;
import Login.loginFrame;
import Main.funVisible;
import Main.funcBtn;
import Main.funcBtnEffect;

public class SignUpFrame extends JFrame {
   private JFrame frame;
   private SignUpPanel regMemPanel;
   
   JButton regBtn = new JButton("ȸ������");
    
   public SignUpFrame(JFrame frame) {
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
          JTextField inID = new JTextField("ID�� �Է��ϼ���.");
          JTextField inputName = new JTextField("�̸��� �Է��ϼ���.");
          JPasswordField inPW = new JPasswordField("");
          JPasswordField inPW2 = new JPasswordField("");
          JTextField inputEmail = new JTextField("�̸����� �Է��ϼ���.");
          JTextField inputNic = new JTextField("�г����� �Է��ϼ���.");
          JButton regQuitbtn = new JButton("���");
          JButton regBtn = new JButton("�Ϸ�");

         //ȸ������
          funcBtn.funcTextField(inputName, 380, 200, 250, 40);
          funcBtn.funcTextField(inID, 380, 250, 250, 40);
          funcBtn.funcTextField(inPW, 380, 300, 250, 40);
          funcBtn.funcTextField(inPW2, 380, 350, 250, 40);
          funcBtn.funcTextField(inputEmail, 380, 400, 250, 40);
          funcBtn.funcTextField(inputNic, 380, 450, 250, 40);
          funcBtn.funcbtn(regQuitbtn, 800, 550, 80, 40, true);
          funcBtn.funcbtn(regBtn, 700, 550, 80, 40, true);

          this.add(inputName);
          this.add(inID);
          this.add(inPW);
          this.add(inPW2);
          this.add(inputEmail);
          this.add(inputNic);
          this.add(regQuitbtn);
          this.add(regBtn);
          
          funVisible.clickIniti(inputName);
          funVisible.clickIniti(inPW);
          funVisible.clickIniti(inID);
          funVisible.clickIniti(inPW2);
          funVisible.clickIniti(inputEmail);
          funVisible.clickIniti(inputNic);
          
          loginFrame loginFrame = new loginFrame(frame);
          
          //Ȯ��
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
               // �ӽ� ���
               System.out.println(myName + " / " + myID  + " / " + myPW + " / " + myPW2 + " / " + myEmail + " / "+ myNic);
                          
               //ȸ������
               String[] arrCol = {"ID", "email", "nicName"};
               String[] arrMY = {myID, myEmail, myNic};
               int i = 0;
               SignUpCheck register = new SignUpCheck();
               DBbool = register.ChkRegister(myName, myID, myPW, myPW2, myEmail, myNic, arrCol[i], arrMY[i]);
            
               //�α���ȭ������ ��ȯ
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
      regMemPanel = new SignUpPanel(frame);

      regMemPanel.setBounds(0, 0, 1000, 700);
      regMemPanel.setBackground(new Color(242, 242, 242));
      regMemPanel.setBorder(null); 
      this.add(regMemPanel);
   }
}