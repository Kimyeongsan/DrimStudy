package myPage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import Database.myPageDB;
import MainFunction.funcBtn;
import MainFunction.funcBtnEffect;

public class myPageFrame extends JFrame {
   private JFrame frame;
   private myPagePanel myPagePanel;

   public myPageFrame(JFrame frame) {
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
         funcBtnEffect btnEffect = new funcBtnEffect();
         //����������    
         // mypage - ��� ��ư
         JButton mypgQuitbtn = new JButton("�ڱ�Ұ� ���� �����");
         funcBtn.funcbtn(mypgQuitbtn, 750, 400, 170, 40, true);
         this.add(mypgQuitbtn);

          //�ڱ�Ұ� �Է¹�ư
           JTextArea introInput = new JTextArea("");
           funcBtn.funcTextArea(introInput, 330, 170, 605, 200);
           this.add(introInput);
                     
         //���������� �ڱ�Ұ� �Ϸ� ��ư
         JButton introBtn = new JButton("�Ϸ�");
         funcBtn.funcbtn(introBtn, 650, 400, 80, 40, true);
         this.add(introBtn);

       //����������
         //mypage ��� ��ư
           btnEffect.btnMouseEffect(mypgQuitbtn);   
           mypgQuitbtn.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {       
                   introInput.setText("");
//                   dispose();
             }
           });
           myPageDB myPageDB = new myPageDB();
         //mypage �ڱ�Ұ� �Ϸ� ��ư
           btnEffect.btnMouseEffect(introBtn);   
           introBtn.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                   // cheermsgǥ��
                   
                   String inIntro = introInput.getText();
                   myPageDB.insertIntro(inIntro);
                   System.out.println(inIntro);
                   JOptionPane.showMessageDialog
                    (null, "��ϵǾ����ϴ�.", "Success!", JOptionPane.INFORMATION_MESSAGE); 
                 }
           });
   }

   private void PanelInit() {
      myPagePanel = new myPagePanel(frame);

      myPagePanel.setBounds(0, 0, 1000, 700);
      myPagePanel.setBackground(new Color(242, 242, 242));
      myPagePanel.setBorder(null); 

      this.add(myPagePanel);
   }
}