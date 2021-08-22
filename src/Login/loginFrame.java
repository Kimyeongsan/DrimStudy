package Login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Database.LoginDB;
import Main.funVisible;
import Main.funcBtn;
import Main.funcBtnEffect;

public class loginFrame extends JFrame{
   private JFrame frame;
   private loginPanel loginPanel;

   
   public loginFrame(JFrame frame) {
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
      JPasswordField inPW = new JPasswordField("");
      JButton logBtn = new JButton("Ȯ��");
      JButton logQuitbtn = new JButton("���");
      
      funcBtn.funcTextField(inID, 400, 231, 400, 40);
      funcBtn.funcTextField(inPW, 400, 321, 400, 40);
      funcBtn.funcbtn(logBtn, 660, 450, 80, 40, true);
      funcBtn.funcbtn(logQuitbtn, 750, 450, 80, 40, true);

      this.add(inID);
      this.add(inPW);
      this.add(logBtn);   
      this.add(logQuitbtn);
      
      funVisible.clickIniti(inID);
      funVisible.clickIniti(inPW);
      loginVO login = new loginVO();
//      MainFrame MainFrame = new MainFrame();
      //�α���
      btnEffect.btnMouseEffect(logBtn);   
      logBtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             LoginCheck LoginChk = new LoginCheck();
              
              String myID =inID.getText();
              String myPW= inPW.getText();
              login.setMyID(myID);
              login.setMyPW(myPW);
              System.out.println(myID + " / " + myPW );
              LoginDB login = new LoginDB();
              boolean DBbool = login.getLoginSelect(myID, myPW);
//              frame.setVisible(false);
             if(DBbool) {
                LoginChk.isLogin(myID);
                inPW.setText("");
                inID.setText("ID�� �Է��ϼ���.");
                dispose();
             }else {
                 JOptionPane.showMessageDialog(null, "ȸ�������� �������� �ʽ��ϴ�.", "login ����", JOptionPane.ERROR_MESSAGE);
                 inPW.setText("");
             }
          }
    });
    
      //��� ��ư ������ â ����
      btnEffect.btnMouseEffect(logQuitbtn); 
      logQuitbtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             dispose();
          }
    }); 
   }

   private void PanelInit() {
      loginPanel = new loginPanel(frame);

      loginPanel.setBounds(0, 0, 1000, 700);
      loginPanel.setBackground(new Color(242, 242, 242));
      loginPanel.setBorder(null); 
      this.add(loginPanel);
   }
}
