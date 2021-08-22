package Main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import Board.boardwriteFrame;
import Cheering.cheerFrame;
import Cheering.cheermsgFrame;
import Database.cheermsgDB;
import GameInf.GameInfFrame;
import Login.LoginCheck;
import Login.loginFrame;
import Player.PlayerFrame;
import RankCompare.RankComparePanel;
import SignUp.SignUpFrame;
import myPage.myPageFrame;

public class MainFrame {
   private JFrame frame;
   
   private JButton player_Btn, cheering_Btn, gameInf_Btn, rank_Btn;
   JButton loginbtn, logOutbtn, regMembtn, myPage_Btn, homebtn, c_writebtn, writebtn;

   private cheerFrame CheerPanel;
   private GameInfFrame gameInfPanel;
   private PlayerFrame playerPanel;
   private RankComparePanel rankComparePanel;
   private BoardFrame1 boardPanel1;
   private BoardFrame2 boardPanel2;
   private cheermsgFrame cheermsgPanel;
   private boardwriteFrame boardwritePanel;
   
  // private loginFrame loginPanel;
   
   public MainFrame() {
         frame = new JFrame();
      }
   
   //�ʱ�ȭ
   public void Initialize() {
         frameInit();
         
         boardPanel1 = new BoardFrame1(frame);
         boardPanel2 = new BoardFrame2(frame);
         CheerPanel = new cheerFrame(frame);
         gameInfPanel =  new GameInfFrame(frame);
         playerPanel = new PlayerFrame(frame);
         rankComparePanel = new RankComparePanel(frame);
         cheermsgPanel = new cheermsgFrame(frame);
         boardwritePanel = new boardwriteFrame(frame);

         funVisible btnVisible = new funVisible();
         LoginCheck LoginChk= new LoginCheck();
         btnVisible.panelVisible("main", boardPanel1, boardPanel2, CheerPanel, boardwritePanel, cheermsgPanel,
                 gameInfPanel, playerPanel, rankComparePanel, c_writebtn);
         btnVisible.btnShow(player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
         if(LoginChk.isLogin_chk() != null) {
            btnVisible.loginModeBtn("main",loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
         }else {
            btnVisible.freeModeBtn( loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
         }
   }

   // Main Frame
   private void frameInit() {

      frame.setTitle("Drim Olympic");
      frame.setBounds(100, 100, 1280, 960);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      ImageIcon img = new ImageIcon("./img/drim_img.png");
      frame.setIconImage(img.getImage());
      funcBtn funcBtn= new funcBtn();
      
      // ���� Title
      JLabel tilteLabel = new JLabel("Drim Olympic");
      funcBtn.funcTiTleLabel(tilteLabel, 0, 50, 1280, 60, 51, 63, 80);
      frame.add(tilteLabel);
          
      loginbtn = new JButton("�α���");
      logOutbtn = new JButton("�α׾ƿ�");
      regMembtn = new JButton("ȸ������");
      myPage_Btn = new JButton("myPage");
      homebtn = new JButton("Home");
      c_writebtn = new JButton("�����޽��� +");
      writebtn = new JButton("�۾���");
      
      funcBtn.funcbtn(loginbtn, 1168, 20, 88, 23, true);
      funcBtn.funcbtn(logOutbtn, 1168, 20, 88, 23, true);
      funcBtn.funcbtn(regMembtn, 1073, 20, 88, 23, true);
      funcBtn.funcbtn(myPage_Btn, 972, 20, 94, 23, true);
      funcBtn.funcbtn(homebtn, 10, 20, 88, 23, true);
      //�ӽ÷� ��ġ ����!!!!!!   >>>> 1085, 800
      funcBtn.funcbtn(c_writebtn, 500, 500, 120, 30, true);
      funcBtn.funcbtn(writebtn, 1085, 742, 75, 30, true);

      frame.add(loginbtn);
      frame.add(logOutbtn);
      frame.add(regMembtn);
      frame.add(myPage_Btn);
      frame.add(homebtn);
      frame.add(c_writebtn);
      frame.add(writebtn);
      LoginCheck LoginChk= new LoginCheck();
      funcBtnEffect btnEffect= new funcBtnEffect();

    // home
   //funcBtnEffect btnEffect= new funcBtnEffect();
   btnEffect.homeMouseEffect(homebtn);
   
   funVisible btnVisible = new funVisible();
   
      homebtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            btnVisible.panelVisible("main", boardPanel1, boardPanel2, CheerPanel, boardwritePanel, cheermsgPanel,
                    gameInfPanel, playerPanel, rankComparePanel, c_writebtn);
            btnVisible.btnShow(player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
        if(LoginChk.isLogin_chk() != null) {
           btnVisible.loginModeBtn("main",loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
        }else {
           btnVisible.freeModeBtn( loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
        }
        }
     });
     
     //loginFrame ȣ��
     btnEffect.homeMouseEffect(loginbtn);
     loginbtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            loginFrame loginFrame = new loginFrame(frame);
            loginFrame.setVisible(true);
         }
      });
     
     //regMemFrame ȣ��
     btnEffect.homeMouseEffect(regMembtn);
     regMembtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            SignUpFrame regMemFrame = new SignUpFrame(frame);
            regMemFrame.setVisible(true);
         }
      });
     
   btnEffect.homeMouseEffect(myPage_Btn);
   myPage_Btn.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
          myPageFrame myPageFrame = new myPageFrame(frame);
          myPageFrame.setVisible(true);
   }});

     //logOut
     btnEffect.homeMouseEffect(logOutbtn);
     
     logOutbtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             btnVisible.panelVisible("main", boardPanel1, boardPanel2, CheerPanel, boardwritePanel, cheermsgPanel,
                     gameInfPanel, playerPanel, rankComparePanel, c_writebtn);
             btnVisible.btnShow(player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);

             LoginChk.isLogOut(LoginChk.isLogin_chk());


             if(LoginChk.isLogin_chk() != null) {
                btnVisible.loginModeBtn("main",loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
             }else {
                btnVisible.freeModeBtn( loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
             }
         }
      });
     
     // �����Խ��� �ۼ���ư
     btnEffect.btnMouseEffect(c_writebtn);
     c_writebtn.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              btnVisible.panelVisible("cheermsg", boardPanel1, boardPanel2, CheerPanel, boardwritePanel, cheermsgPanel, 
                    gameInfPanel, playerPanel, rankComparePanel, c_writebtn);  
              btnVisible.btnShow(player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
              if(LoginChk.isLogin_chk() != null) {
                  btnVisible.loginModeBtn("cheermsg",loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
               }else {
                  btnVisible.freeModeBtn( loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
               }
       }
     });

     //�Խ��Ǳ��ۼ�
     btnEffect.btnMouseEffect(writebtn);
    writebtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            btnVisible.panelVisible("BoardWrite", boardPanel1, boardPanel2, CheerPanel, boardwritePanel, cheermsgPanel,
                  gameInfPanel, playerPanel, rankComparePanel, c_writebtn);             
            btnVisible.btnShow(player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
            if(LoginChk.isLogin_chk() != null) {
                  btnVisible.loginModeBtn("BoardWrite",loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
               }else {
                  btnVisible.freeModeBtn( loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
               }
      }
    });

   // �����Ұ� �̵�
      LineBorder black_hover = new LineBorder(Color.RED);
      player_Btn = new JButton("�����Ұ�");
      player_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            btnVisible.panelVisible("player", boardPanel1, boardPanel2, CheerPanel, boardwritePanel, cheermsgPanel, 
                  gameInfPanel, playerPanel, rankComparePanel, c_writebtn);
            btnVisible.menuBtnShow("player", player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
            if(LoginChk.isLogin_chk() != null) {
               btnVisible.loginModeBtn("player",loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
            }else {
               btnVisible.freeModeBtn( loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
            }
         }
      });   
      btnEffect.menubtnEffect(player_Btn, 190, 130, 150, 45);
      frame.add(player_Btn);
      
      // �����Խ��� �̵�
      cheering_Btn = new JButton("�����Խ���");
      cheering_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
   	      
            btnVisible.panelVisible("cheering", boardPanel1, boardPanel2, CheerPanel, boardwritePanel, cheermsgPanel,
                    gameInfPanel, playerPanel, rankComparePanel, c_writebtn);
           btnVisible.menuBtnShow("cheering", player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
           if(LoginChk.isLogin_chk() != null) {
              btnVisible.loginModeBtn("cheering",loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
           }else {
              btnVisible.freeModeBtn( loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
           }
         }
      });
      btnEffect.menubtnEffect(cheering_Btn, 440, 130, 150, 45);
      frame.add(cheering_Btn);

      // �ǽð� ������� �̵�
      gameInf_Btn = new JButton("�ǽð� �������");
      gameInf_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            btnVisible.panelVisible("gameInf", boardPanel1, boardPanel2, CheerPanel, boardwritePanel, cheermsgPanel,
                    gameInfPanel, playerPanel, rankComparePanel, c_writebtn);
           btnVisible.menuBtnShow("gameInf", player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
           if(LoginChk.isLogin_chk() != null) {
              btnVisible.loginModeBtn("gameInf",loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
           }else {
              btnVisible.freeModeBtn( loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
           }
         }
      });
      btnEffect.menubtnEffect(gameInf_Btn, 690, 130, 190, 45);
      frame.add(gameInf_Btn);
      
      // ��ŷ �� �̵�
      rank_Btn = new JButton("�޴� ��ŷ ��");
      rank_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            btnVisible.panelVisible("rank", boardPanel1, boardPanel2, CheerPanel, boardwritePanel, cheermsgPanel,
                    gameInfPanel, playerPanel, rankComparePanel, c_writebtn);
            btnVisible.menuBtnShow("rank", player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
            if(LoginChk.isLogin_chk() != null) {
               btnVisible.loginModeBtn("rank",loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
            }else {
               btnVisible.freeModeBtn( loginbtn, logOutbtn, myPage_Btn, regMembtn, writebtn);
            }
         }
      });
      btnEffect.menubtnEffect(rank_Btn, 940, 130, 170, 45);
      frame.add(rank_Btn);
      
      // Footer
      JLabel underLabel = new JLabel("�� �帲�ý�  �� ������ ���� ������Ʈ");
      funcBtn.funcFooterLabel(underLabel, 0, 880, 1280, 40, 204, 204, 204);
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