package Main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import Board.BoardWriteFrame;
import Cheering.cheerFrame;
import Cheering.cheermsgFrame;
import Database.ConnectionDB;
import Database.RegisterDB;
import GameInf.GameInfFrame;
import MainFunction.funVisible;
import MainFunction.funcBtn;
import MainFunction.funcBtnEffect;
import Player.PlayerFrame;
import RankCompare.RankComparePanel;
import login.loginFrame;
import myPage.myPageFrame;
import regMember.regMemFrame;

import regMember.funcRegisterChk;

public class MainFrame {
   private JFrame frame;
   private JButton player_Btn, cheering_Btn, gameInf_Btn, rank_Btn;

   private cheerFrame CheerPanel;
   private GameInfFrame gameInfPanel;
   private PlayerFrame playerPanel;
   private RankComparePanel rankComparePanel;
   private BoardFrame1 boardPanel1;
   private BoardFrame2 boardPanel2;
   private loginFrame loginPanel;
   private myPageFrame myPagePanel;
   private regMemFrame regMemPanel;
   private cheermsgFrame cheermsgPanel;
   private BoardWriteFrame BoardWritePanel;
   
   public MainFrame() {
         frame = new JFrame();
         
      }
   
   //�ʱ�ȭ
   private void Initialize() {
         frameInit();
         
         boardPanel1 = new BoardFrame1(frame);
         boardPanel2 = new BoardFrame2(frame);
         CheerPanel = new cheerFrame(frame);
         gameInfPanel =  new GameInfFrame(frame);
         playerPanel = new PlayerFrame(frame);
         rankComparePanel = new RankComparePanel(frame);
         loginPanel = new loginFrame(frame);
         myPagePanel = new myPageFrame(frame);
         regMemPanel = new regMemFrame(frame);
         cheermsgPanel = new cheermsgFrame(frame);
         BoardWritePanel = new BoardWriteFrame(frame);

         funVisible btnVisible = new funVisible();
         btnVisible.mainVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                 gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                 player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
       
      }

   // Main Frame
   private void frameInit() {

      frame.setTitle("Drim Olympic");
      frame.setBounds(100, 100, 1280, 960);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      ImageIcon img = new ImageIcon("./img/drim_img.png");
      frame.setIconImage(img.getImage());
      
      // ���� Title
      JLabel tilteLabel = new JLabel("Drim Olympic");
      tilteLabel.setBounds(0, 50, 1280, 60);

      tilteLabel.setFont(new Font("Arial", Font.BOLD, 35)); // Font

      tilteLabel.setForeground(Color.white); // Color
      tilteLabel.setBackground(new Color(51, 63, 80));
      tilteLabel.setOpaque(true);

      tilteLabel.setHorizontalAlignment(JLabel.CENTER); // Position

      frame.add(tilteLabel);
     
      /*
       * ��ư ����
       * */
          
     funcBtn btn= new funcBtn();
     funcBtn text= new funcBtn();
     funcBtn pw= new funcBtn();

     //title btn
   // login ��ư
     JButton loginbtn = new JButton("�α���");
     btn.funcbtn(loginbtn, 1168, 20, 88, 23, true);
     frame.add(loginbtn);
    
     // logout ��ư
     JButton logOutbtn = new JButton("�α׾ƿ�");
     btn.funcbtn(logOutbtn, 1168, 20, 88, 23, true);
     frame.add(logOutbtn);
     
     // regMem ��ư
     JButton regMembtn = new JButton("ȸ������");
     btn.funcbtn(regMembtn, 1073, 20, 88, 23, true);
     frame.add(regMembtn);
     
     // mypage ��ư
     JButton myPage_Btn = new JButton("myPage");
     btn.funcbtn(myPage_Btn, 972, 20, 94, 23, true);
     frame.add(myPage_Btn);
     
     // home��ư
     JButton homebtn = new JButton("Home");
     btn.funcbtn(homebtn, 10, 20, 88, 23, true);
     frame.add(homebtn);
     
     //panel
     
     // ���� �Խ��� �۾��� ��ư
     JButton c_writebtn = new JButton("�����޽��� +");
     btn.funcbtn(c_writebtn, 1085, 800, 120, 30, false);
     frame.add(c_writebtn);
     
    // ���� �Խù� �۾��� ��ư
    JButton writebtn = new JButton("�۾���");
     btn.funcbtn(writebtn, 1085, 742, 75, 30, true);
    frame.add(writebtn);
    
    //ȸ������
     //�̸� �Է�
     JTextField inputName = new JTextField("�̸��� �Է��ϼ���.");
     text.funcTextField(inputName, 510, 330, 250, 40);
     frame.add(inputName);
     
     //id �Է�
     JTextField inID = new JTextField("ID�� �Է��ϼ���.");
     text.funcTextField(inID, 510, 380, 250, 40);
     frame.add(inID);
     
     //pw �Է�
     JPasswordField inPW = new JPasswordField("");
     text.funcTextField(inPW, 510, 430, 250, 40);
     frame.add(inPW);
     
     //pw2�Է�
     JPasswordField inPW2 = new JPasswordField("");
     text.funcTextField(inPW2, 510, 480, 250, 40);
     frame.add(inPW2);
     
     //�̸��� �Է�
     JTextField inputEmail = new JTextField("�̸����� �Է��ϼ���.");
     text.funcTextField(inputEmail, 510, 530, 250, 40);
     frame.add(inputEmail);
     
     //�г��� �Է�
     JTextField inputNic = new JTextField("�г����� �Է��ϼ���.");
     text.funcTextField(inputNic, 510, 580, 250, 40);
     frame.add(inputNic);
     
     // ��� ��ư
     JButton regQuitbtn = new JButton("���");
     btn.funcbtn(regQuitbtn, 900, 660, 80, 40, false);
     frame.add(regQuitbtn);

     //�Ϸ� ��ư
     JButton regBtn = new JButton("�Ϸ�");
     btn.funcbtn(regBtn, 800, 660, 80, 40, false);
     frame.add(regBtn);
 
       //�α���
     // login - ��� ��ư
     JButton logQuitbtn = new JButton("���");
     btn.funcbtn(logQuitbtn, 730, 590, 80, 40, false);
     frame.add(logQuitbtn);
      
     //Ȯ�� ��ư
     JButton logBtn = new JButton("Ȯ��");
     btn.funcbtn(logBtn, 630, 590, 80, 40, false);
     frame.add(logBtn);      
            
     //id �Է�
     JTextField inputID = new JTextField("ID�� �Է��ϼ���.");
     text.funcTextField(inputID, 500, 439, 400, 40);
     frame.add(inputID);
            
    //pw �Է�
    JPasswordField inputPW = new JPasswordField("");
    pw.funcTextField(inputPW, 500, 512, 400, 40);
    frame.add(inputPW);
            
   //����������    
   // mypage - ��� ��ư
   JButton mypgQuitbtn = new JButton("�ڱ�Ұ� ���� �����");
   btn.funcbtn(mypgQuitbtn, 1000, 630, 170, 40, false);
   frame.add(mypgQuitbtn);

    //�ڱ�Ұ� �Է¹�ư
     JTextArea introInput = new JTextArea("");
     text.funcTextArea(introInput, 465, 405, 605, 200);
   frame.add(introInput);
               
   //���������� �ڱ�Ұ� �Ϸ� ��ư
   JButton introBtn = new JButton("�Ϸ�");
   btn.funcbtn(introBtn, 915, 630, 80, 40, false);
   frame.add(introBtn);
                  
    /*
     * header button action
     * */

    // home
   funcBtnEffect btnEffect= new funcBtnEffect();
   btnEffect.homeMouseEffect(homebtn);
   
   funVisible btnVisible = new funVisible();

     homebtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           btnVisible.mainVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                 gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                 player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
            btnVisible.mainbtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn, 
                  regQuitbtn, inID, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
                  inPW, mypgQuitbtn, inputPW, inputID, introInput, introBtn);
           btnVisible.initiText(inputName, inputEmail, inputNic, inID, inPW2, inPW2, inputPW, inputID);
         }
     });

     //login
     btnEffect.homeMouseEffect(loginbtn);
     
     loginbtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
           // login�� ǥ��
            btnVisible.loginVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                  gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                  player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
            btnVisible.loginbtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn, 
                   regQuitbtn, inID, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
                   inPW, mypgQuitbtn, inputPW, inputID, introInput, introBtn);
         }
      });
    
     //logOut
     btnEffect.homeMouseEffect(logOutbtn);
     
     logOutbtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            btnVisible.mainVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                 gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                 player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
             btnVisible.mainbtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn, 
                   regQuitbtn, inID, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
                   inPW, mypgQuitbtn, inputPW, inputID, introInput, introBtn);
         }
      });
     
     //regMem
     btnEffect.homeMouseEffect(regMembtn);
     regMembtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            btnVisible.regVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                  gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                  player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
            btnVisible.regbtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn, 
                  regQuitbtn, inID, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
                  inPW, mypgQuitbtn, inputPW, inputID, introInput, introBtn);
             
         }
      });
     
   //myPage
     btnEffect.homeMouseEffect(myPage_Btn);
     myPage_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            btnVisible.mypageVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                  gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                  player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
            btnVisible.mypagebtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn, 
                    regQuitbtn, inID, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
                    inPW, mypgQuitbtn, inputPW, inputID, introInput, introBtn);
                      }
      });
     
     // �����Խ��� �ۼ���ư
     btnEffect.btnMouseEffect(c_writebtn);
     c_writebtn.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              btnVisible.cheermsgvisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel, 
                    gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel, 
                    player_Btn, cheering_Btn, gameInf_Btn, rank_Btn); 
             btnVisible.menubtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn, 
                    regQuitbtn, inID, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
                    inPW, mypgQuitbtn, inputPW, inputID, introInput, introBtn); 
       }
     });

     //�Խ��Ǳ��ۼ�
     //���� �ʿ�
     btnEffect.btnMouseEffect(writebtn);
    writebtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            btnVisible.boardWriteVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                  gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                  player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
            btnVisible.menubtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn, 
                  regQuitbtn, inID, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
                  inPW, mypgQuitbtn, inputPW, inputID, introInput, introBtn);
      }
    });
    
    //ȸ������
    //ȸ������ �Է�â �ʱ�ȭ
    btnVisible.clickIniti(inPW);
    btnVisible.clickIniti(inPW2);
    btnVisible.clickIniti(inID);
    btnVisible.clickIniti(inputEmail);
    btnVisible.clickIniti(inputNic);
    btnVisible.clickIniti(inputName);
     
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
           funcRegisterChk register = new funcRegisterChk();
           DBbool = register.ChkRegister(myName, myID, myPW, myPW2, myEmail, myNic, arrCol[i], arrMY[i]);
        
           //�α���ȭ������ ��ȯ
           if(DBbool) {
             btnVisible.loginVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                   gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                   player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
           btnVisible.loginbtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn, 
             regQuitbtn, inID, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
             inPW, mypgQuitbtn, inputPW, inputID, introInput, introBtn);
           btnVisible.initiText(inputName, inputEmail, inputNic, inID, inPW, inPW2, inputPW, inputID);
           }
           else {
              inPW.setText("");
               inPW2.setText("");
           }
         }
      });

   //ȸ������ �г� �� ��ҹ�ư
     btnEffect.btnMouseEffect(regQuitbtn);
     regQuitbtn.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
               btnVisible.mainVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                    gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                    player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);

             btnVisible.mainbtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn, 
                     regQuitbtn, inID, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
                     inPW, mypgQuitbtn, inputPW, inputID, introInput, introBtn);
                 btnVisible.initiText(inputName, inputEmail, inputNic, inID, inPW2, inPW2, inputPW, inputID);
         }
       });
    
    //����������
   //mypage ��� ��ư
     btnEffect.btnMouseEffect(mypgQuitbtn);   
     mypgQuitbtn.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
             // cheermsgǥ��
             btnVisible.mypageVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                 gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                 player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
             btnVisible.mypagebtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn,
                   regQuitbtn, inID, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
                   inPW, mypgQuitbtn, inputPW, inputID, introInput, introBtn);        
             introInput.setText("");
       }
     });
   //mypage �ڱ�Ұ� �Ϸ� ��ư
     btnEffect.btnMouseEffect(introBtn);   
     introBtn.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
             // cheermsgǥ��
              
             String inIntro = introInput.getText();
          System.out.println(inIntro);
         JOptionPane.showMessageDialog
              (null, "��ϵǾ����ϴ�.", "Success!", JOptionPane.INFORMATION_MESSAGE); 
           }
     });

     //�α���
 // �α��� ��� �ۼ���ư
     btnVisible.clickIniti(inputID);
     btnVisible.clickIniti(inputPW);
     
     btnEffect.btnMouseEffect(logQuitbtn);   
     
     logQuitbtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            btnVisible.mainVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                 gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                 player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
          btnVisible.mainbtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn, 
               regQuitbtn, inID, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
               inPW, mypgQuitbtn, inputPW, inputID, introInput, introBtn);
             btnVisible.initiText(inputName, inputEmail, inputNic, inID, inPW2, inPW2, inputPW, inputID);
      }
    });
     
     btnEffect.btnMouseEffect(logBtn);   
     logBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            String id = "hello", pw = "1234";
            // �ӽ� ���
            String inID = inputID.getText();
            String inPW = inputPW.getText();
            
            System.out.println(inID + " / " + inPW );
   
            if (id.equals(inID) && pw.equals(inPW)) {
               JOptionPane.showMessageDialog(null, "ȯ��!", "login", JOptionPane.INFORMATION_MESSAGE);
               btnVisible.mainVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                       gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                       player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
                btnVisible.mainbtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn, 
                      regQuitbtn, inputPW, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
                      inPW2, mypgQuitbtn, inputPW, inputID, introInput, introBtn);
                   inputPW.setText("");
                   inputID.setText("ID�� �Է��ϼ���.");
                   }
            // �α��� ����
            else if (id.equals(inputID.getText()) && pw.equals(inputPW.getText()) == false) {
               JOptionPane.showMessageDialog(null, "��й�ȣ�� Ʋ�Ƚ��ϴ�.", "login", JOptionPane.ERROR_MESSAGE);
                   inputPW.setText("");
            }
            else {  
               JOptionPane.showMessageDialog(null, "ȸ���� �ƴմϴ�.", "login", JOptionPane.ERROR_MESSAGE);
                   
                   inputPW.setText("");
                   inputID.setText("ID�� �Է��ϼ���.");
            } 
         }
   });     

    /*
     * �޴� ��ư
     * */
    
   // �����Ұ� �̵�
      LineBorder black_hover = new LineBorder(Color.RED);
      player_Btn = new JButton("�����Ұ�");
      player_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            btnVisible.playerVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                    gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                    player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
            btnVisible.menubtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn, 
                  regQuitbtn, inID, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
                  inPW, mypgQuitbtn, inputPW, inputID, introInput, introBtn);
         }
      });   
      btnEffect.menubtnEffect(player_Btn, 190, 130, 150, 45);
      frame.add(player_Btn);
      
      // �����Խ��� �̵�
      cheering_Btn = new JButton("�����Խ���");
      cheering_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            btnVisible.cheeringVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                    gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                    player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
            btnVisible.cheeringbtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn, 
                  regQuitbtn, inID, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
                  inPW, mypgQuitbtn, inputPW, inputID, introInput, introBtn);
         }
      });
      btnEffect.menubtnEffect(cheering_Btn, 440, 130, 150, 45);
      frame.add(cheering_Btn);

      // �ǽð� ������� �̵�
      gameInf_Btn = new JButton("�ǽð� �������");
      gameInf_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            btnVisible.gameInfVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                    gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                    player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
            
            btnVisible.menubtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn, 
                  regQuitbtn, inID, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
                  inPW, mypgQuitbtn, inputPW, inputID, introInput, introBtn);
         }
      });
      btnEffect.menubtnEffect(gameInf_Btn, 690, 130, 190, 45);
      frame.add(gameInf_Btn);
      
      // ��ŷ �� �̵�
      rank_Btn = new JButton("�޴� ��ŷ ��");
      rank_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            btnVisible.rankVisible(boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                    gameInfPanel, playerPanel, rankComparePanel, myPagePanel, loginPanel, regMemPanel,
                    player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
            btnVisible.menubtnVisible(loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn, c_writebtn, 
                  regQuitbtn, inID, inputEmail, inPW2, inputNic, regBtn, logQuitbtn, logBtn, inputName, 
                  inPW, mypgQuitbtn, inputPW, inputID, introInput, introBtn);
         }
      });
      btnEffect.menubtnEffect(rank_Btn, 940, 130, 170, 45);
      frame.add(rank_Btn);
      
      // Footer
      JLabel underLabel = new JLabel("�� �帲�ý�  �� ������ ���� ������Ʈ");
      underLabel.setFont(new Font("�������", Font.PLAIN, 13));
      underLabel.setForeground(Color.black);
      underLabel.setBackground(new Color(204, 204, 204));
      underLabel.setOpaque(true);
      underLabel.setHorizontalAlignment(JLabel.CENTER);
      underLabel.setBounds(0, 880, 1280, 40);
      frame.add(underLabel);
   }

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
              try {
                 
                 MainFrame window = new MainFrame();
                 window.Initialize();
                 window.frame.setVisible(true);
//                 window.frame.setResizable(false);
                 window.frame.setLocationRelativeTo(null);
              } catch (Exception e) {
                 e.printStackTrace();
              }
         }
      });
   }
}