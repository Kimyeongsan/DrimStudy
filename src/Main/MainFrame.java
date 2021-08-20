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

import Board.BoardWriteFrame;
import Cheering.cheerFrame;
import Cheering.cheermsgFrame;
import GameInf.GameInfFrame;
import MainFunction.funVisible;
import MainFunction.funcBtn;
import MainFunction.funcBtnEffect;
import Player.PlayerFrame;
import RankCompare.RankComparePanel;
import login.loginFrame;
import myPage.myPageFrame;
import regMember.regMemFrame;

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
   private BoardWriteFrame BoardWritePanel;
   
   public MainFrame() {
         frame = new JFrame();
      }
   
   //초기화
   private void Initialize() {
         frameInit();
         
         boardPanel1 = new BoardFrame1(frame);
         boardPanel2 = new BoardFrame2(frame);
         CheerPanel = new cheerFrame(frame);
      //   gameInfPanel =  new GameInfFrame(frame);
         playerPanel = new PlayerFrame(frame);
         rankComparePanel = new RankComparePanel(frame);
         cheermsgPanel = new cheermsgFrame(frame);
         BoardWritePanel = new BoardWriteFrame(frame);

         funVisible btnVisible = new funVisible();
         btnVisible.panelVisible("main", boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                 gameInfPanel, playerPanel, rankComparePanel);
         btnVisible.btnShow(player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
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
      
      // 메인 Title
      JLabel tilteLabel = new JLabel("Drim Olympic");
      funcBtn.funcTiTleLabel(tilteLabel, 0, 50, 1280, 60, 51, 63, 80);
      frame.add(tilteLabel);
          
      loginbtn = new JButton("로그인");
      logOutbtn = new JButton("로그아웃");
      regMembtn = new JButton("회원가입");
      myPage_Btn = new JButton("myPage");
      homebtn = new JButton("Home");
      c_writebtn = new JButton("응원메시지 +");
      writebtn = new JButton("글쓰기");
      
      funcBtn.funcbtn(loginbtn, 1168, 20, 88, 23, true);
      funcBtn.funcbtn(logOutbtn, 1168, 20, 88, 23, true);
      funcBtn.funcbtn(regMembtn, 1073, 20, 88, 23, true);
      funcBtn.funcbtn(myPage_Btn, 972, 20, 94, 23, true);
      funcBtn.funcbtn(homebtn, 10, 20, 88, 23, true);
      funcBtn.funcbtn(c_writebtn, 1085, 800, 120, 30, false);
      funcBtn.funcbtn(writebtn, 1085, 742, 75, 30, true);

      frame.add(loginbtn);
      frame.add(logOutbtn);
      frame.add(regMembtn);
      frame.add(myPage_Btn);
      frame.add(homebtn);
      frame.add(c_writebtn);
      frame.add(writebtn);

    // home
   funcBtnEffect btnEffect= new funcBtnEffect();
   btnEffect.homeMouseEffect(homebtn);
   
   funVisible btnVisible = new funVisible();

     homebtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            btnVisible.panelVisible("main", boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                    gameInfPanel, playerPanel, rankComparePanel);
            btnVisible.btnShow(player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
        }
     });
     
     //loginFrame 호출
     btnEffect.homeMouseEffect(loginbtn);
     loginbtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            loginFrame loginFrame = new loginFrame(frame);
            loginFrame.setVisible(true);
         }
      });
     
     //regMemFrame 호출
     btnEffect.homeMouseEffect(regMembtn);
     regMembtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            regMemFrame regMemFrame = new regMemFrame(frame);
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
             btnVisible.panelVisible("main", boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                     gameInfPanel, playerPanel, rankComparePanel);
             btnVisible.btnShow(player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
         }
      });
     
     // 응원게시판 작성버튼
     btnEffect.btnMouseEffect(c_writebtn);
     c_writebtn.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              btnVisible.panelVisible("cheermsg", boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel, 
                    gameInfPanel, playerPanel, rankComparePanel);  
       }
     });

     //게시판글작성
     btnEffect.btnMouseEffect(writebtn);
    writebtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            btnVisible.panelVisible("BoardWrite", boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                  gameInfPanel, playerPanel, rankComparePanel);             
            btnVisible.btnShow(player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
      }
    });

   // 선수소개 이동
      LineBorder black_hover = new LineBorder(Color.RED);
      player_Btn = new JButton("선수소개");
      player_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            btnVisible.panelVisible("player", boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel, 
                  gameInfPanel, playerPanel, rankComparePanel);
            btnVisible.menuBtnShow("player", player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
         }
      });   
      btnEffect.menubtnEffect(player_Btn, 190, 130, 150, 45);
      frame.add(player_Btn);
      
      // 응원게시판 이동
      cheering_Btn = new JButton("응원게시판");
      cheering_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            btnVisible.panelVisible("cheering", boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                    gameInfPanel, playerPanel, rankComparePanel);
           btnVisible.menuBtnShow("cheering", player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);

         }
      });
      btnEffect.menubtnEffect(cheering_Btn, 440, 130, 150, 45);
      frame.add(cheering_Btn);

      // 실시간 경기정보 이동
      gameInf_Btn = new JButton("실시간 경기정보");
      gameInf_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            btnVisible.panelVisible("gameInf", boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                    gameInfPanel, playerPanel, rankComparePanel);
           btnVisible.menuBtnShow("gameInf", player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);

         }
      });
      btnEffect.menubtnEffect(gameInf_Btn, 690, 130, 190, 45);
      frame.add(gameInf_Btn);
      
      // 랭킹 비교 이동
      rank_Btn = new JButton("메달 랭킹 비교");
      rank_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            btnVisible.panelVisible("rank", boardPanel1, boardPanel2, CheerPanel, BoardWritePanel, cheermsgPanel,
                    gameInfPanel, playerPanel, rankComparePanel);
            btnVisible.menuBtnShow("rank", player_Btn, cheering_Btn, gameInf_Btn, rank_Btn);
         }
      });
      btnEffect.menubtnEffect(rank_Btn, 940, 130, 170, 45);
      frame.add(rank_Btn);
      
      // Footer
      JLabel underLabel = new JLabel("㈜ 드림시스  ⓒ 명지대 인턴 프로젝트");
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