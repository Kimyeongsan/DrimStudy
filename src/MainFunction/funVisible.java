package MainFunction;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Board.BoardWriteFrame;
import Cheering.cheerFrame;
import Cheering.cheermsgFrame;
import GameInf.GameInfFrame;
import Main.BoardFrame1;
import Main.BoardFrame2;
import Player.PlayerFrame;
import RankCompare.RankComparePanel;
import login.loginFrame;
import myPage.myPageFrame;
import regMember.regMemFrame;

public class funVisible {
   //홈화면
   public void mainVisible(BoardFrame1 boardPanel1, BoardFrame2 boardPanel2, cheerFrame CheerPanel,
         BoardWriteFrame BoardWritePanel, cheermsgFrame cheermsgPanel, GameInfFrame gameInfPanel,
         PlayerFrame playerPanel, RankComparePanel rankComparePanel, myPageFrame myPagePanel,
         loginFrame loginPanel, regMemFrame regMemPanel, JButton player_Btn, JButton cheering_Btn, 
         JButton gameInf_Btn, JButton rank_Btn) {
      
      boardPanel1.setVisible(true);
        boardPanel2.setVisible(true);
        BoardWritePanel.setVisible(false);
        CheerPanel.setVisible(false);
        cheermsgPanel.setVisible(false);
        gameInfPanel.setVisible(false);
        playerPanel.setVisible(false);
        rankComparePanel.setVisible(false);
        
        myPagePanel.setVisible(false);
        loginPanel.setVisible(false);
        regMemPanel.setVisible(false);
        
        //메뉴버튼 표시
        player_Btn.setVisible(true);
        cheering_Btn.setVisible(true);
        gameInf_Btn.setVisible(true);
        rank_Btn.setVisible(true);
        
        player_Btn.setBorderPainted(false);
        player_Btn.setFocusPainted(false);
        cheering_Btn.setBorderPainted(false);
        cheering_Btn.setFocusPainted(false);
        gameInf_Btn.setBorderPainted(false);
        gameInf_Btn.setFocusPainted(false);
        rank_Btn.setBorderPainted(false);
        rank_Btn.setFocusPainted(false);

   }
   public void mainbtnVisible( JButton loginbtn, JButton logOutbtn, JButton myPage_Btn,
         JButton regMembtn, JButton writebtn, JButton c_writebtn, JButton regQuitbtn, JTextField inID, 
         JTextField inputEmail, JPasswordField inPW2, JTextField inputNic, JButton regBtn,
         JButton logQuitbtn, JButton logBtn, JTextField inputName, JPasswordField inPW, JButton mypgQuitbtn,
         JPasswordField inputPW, JTextField inputID, JTextArea introInput, JButton introBtn) {
      //header버튼
        loginbtn.setVisible(true);
        logOutbtn.setVisible(true);
        myPage_Btn.setVisible(true);
        regMembtn.setVisible(true);
        
        //메인패널
        writebtn.setVisible(true);
        
        //cheer패널
        c_writebtn.setVisible(false);

        //reg패널
        regQuitbtn.setVisible(false);
        inputName.setVisible(false);
        inID.setVisible(false);
        inPW.setVisible(false);
        inPW2.setVisible(false);
        inputEmail.setVisible(false);
        inputNic.setVisible(false);
        regBtn.setVisible(false);
        
        //마이페이지 패널
        mypgQuitbtn.setVisible(false);
        introInput.setVisible(false);
        introBtn.setVisible(false);

        //로그인 패널
        logQuitbtn.setVisible(false);
        inputID.setVisible(false);
        inputPW.setVisible(false);
        logBtn.setVisible(false);
   }
   //login
   public void loginVisible(BoardFrame1 boardPanel1, BoardFrame2 boardPanel2, cheerFrame CheerPanel,
         BoardWriteFrame BoardWritePanel, cheermsgFrame cheermsgPanel, GameInfFrame gameInfPanel,
         PlayerFrame playerPanel, RankComparePanel rankComparePanel, myPageFrame myPagePanel,
         loginFrame loginPanel, regMemFrame regMemPanel, JButton player_Btn, JButton cheering_Btn, 
         JButton gameInf_Btn, JButton rank_Btn) {
        boardPanel1.setVisible(false);
        boardPanel2.setVisible(false);
        BoardWritePanel.setVisible(false);
        CheerPanel.setVisible(false);
        cheermsgPanel.setVisible(false);
        gameInfPanel.setVisible(false);
        playerPanel.setVisible(false);
        rankComparePanel.setVisible(false);
        
        myPagePanel.setVisible(false);
        loginPanel.setVisible(true);
        regMemPanel.setVisible(false);

        //메뉴버튼 표시
        player_Btn.setVisible(true);
        cheering_Btn.setVisible(true);
        gameInf_Btn.setVisible(true);
        rank_Btn.setVisible(true);
        
        player_Btn.setBorderPainted(false);
        player_Btn.setFocusPainted(false);
        cheering_Btn.setBorderPainted(false);
        cheering_Btn.setFocusPainted(false);
        gameInf_Btn.setBorderPainted(false);
        gameInf_Btn.setFocusPainted(false);
        rank_Btn.setBorderPainted(false);
        rank_Btn.setFocusPainted(false);
   }
   public void loginbtnVisible( JButton loginbtn, JButton logOutbtn, JButton myPage_Btn,
         JButton regMembtn, JButton writebtn, JButton c_writebtn, JButton regQuitbtn, JTextField inID, 
         JTextField inputEmail, JPasswordField inPW2, JTextField inputNic, JButton regBtn,
         JButton logQuitbtn, JButton logBtn, JTextField inputName, JPasswordField inPW, JButton mypgQuitbtn,
         JPasswordField inputPW, JTextField inputID, JTextArea introInput, JButton introBtn) {
      //header버튼
        loginbtn.setVisible(false);
        logOutbtn.setVisible(false);
        myPage_Btn.setVisible(false);
        regMembtn.setVisible(true);
        
        //메인패널
        writebtn.setVisible(false);
        
        //cheer패널
        c_writebtn.setVisible(false);

        //reg패널
        regQuitbtn.setVisible(false);
        inputName.setVisible(false);
        inID.setVisible(false);
        inPW.setVisible(false);
        inPW2.setVisible(false);
        inputEmail.setVisible(false);
        inputNic.setVisible(false);
        regBtn.setVisible(false);
        
        //마이페이지 패널
        mypgQuitbtn.setVisible(false);
        introInput.setVisible(false);
        introBtn.setVisible(false);

        //로그인 패널
        logQuitbtn.setVisible(true);
        inputID.setVisible(true);
        inputPW.setVisible(true);
        logBtn.setVisible(true);
   }
   //mypage
   public void mypageVisible(BoardFrame1 boardPanel1, BoardFrame2 boardPanel2, cheerFrame CheerPanel,
         BoardWriteFrame BoardWritePanel, cheermsgFrame cheermsgPanel, GameInfFrame gameInfPanel,
         PlayerFrame playerPanel, RankComparePanel rankComparePanel, myPageFrame myPagePanel,
         loginFrame loginPanel, regMemFrame regMemPanel, JButton player_Btn, JButton cheering_Btn, 
         JButton gameInf_Btn, JButton rank_Btn) {
        boardPanel1.setVisible(false);
        boardPanel2.setVisible(false);
        BoardWritePanel.setVisible(false);
        CheerPanel.setVisible(false);
        cheermsgPanel.setVisible(false);
        gameInfPanel.setVisible(false);
        playerPanel.setVisible(false);
        rankComparePanel.setVisible(false);
        
        myPagePanel.setVisible(true);
        loginPanel.setVisible(false);
        regMemPanel.setVisible(false);

        //메뉴버튼 표시
        player_Btn.setVisible(true);
        cheering_Btn.setVisible(true);
        gameInf_Btn.setVisible(true);
        rank_Btn.setVisible(true);
        
        //메뉴버튼
        player_Btn.setBorderPainted(false);
        player_Btn.setFocusPainted(false);
        cheering_Btn.setBorderPainted(false);
        cheering_Btn.setFocusPainted(false);
        gameInf_Btn.setBorderPainted(false);
        gameInf_Btn.setFocusPainted(false);
        rank_Btn.setBorderPainted(false);
        rank_Btn.setFocusPainted(false);
   }
   public void mypagebtnVisible( JButton loginbtn, JButton logOutbtn, JButton myPage_Btn,
         JButton regMembtn, JButton writebtn, JButton c_writebtn, JButton regQuitbtn, JTextField inID, 
         JTextField inputEmail, JPasswordField inPW2, JTextField inputNic, JButton regBtn,
         JButton logQuitbtn, JButton logBtn, JTextField inputName, JPasswordField inPW, JButton mypgQuitbtn,
         JPasswordField inputPW, JTextField inputID, JTextArea introInput, JButton introBtn) {
      //header버튼
        loginbtn.setVisible(false);
        logOutbtn.setVisible(true);
        myPage_Btn.setVisible(false);
        regMembtn.setVisible(false);
        
        //메인패널
        writebtn.setVisible(false);
        
        //cheer패널
        c_writebtn.setVisible(false);
        
        //reg패널
        regQuitbtn.setVisible(false);
        inputName.setVisible(false);
        inID.setVisible(false);
        inPW.setVisible(false);
        inPW2.setVisible(false);
        inputEmail.setVisible(false);
        inputNic.setVisible(false);
        regBtn.setVisible(false);
        
        //마이페이지 패널
        mypgQuitbtn.setVisible(true);
        introInput.setVisible(true);
        introBtn.setVisible(true);

        //로그인 패널
        logQuitbtn.setVisible(false);
        inputID.setVisible(false);
        inputPW.setVisible(false);
        logBtn.setVisible(false);
   }
   //regmem
   public void regVisible(BoardFrame1 boardPanel1, BoardFrame2 boardPanel2, cheerFrame CheerPanel,
         BoardWriteFrame BoardWritePanel, cheermsgFrame cheermsgPanel, GameInfFrame gameInfPanel,
         PlayerFrame playerPanel, RankComparePanel rankComparePanel, myPageFrame myPagePanel,
         loginFrame loginPanel, regMemFrame regMemPanel, JButton player_Btn, JButton cheering_Btn, 
         JButton gameInf_Btn, JButton rank_Btn) {
      boardPanel1.setVisible(false);
        boardPanel2.setVisible(false);
        BoardWritePanel.setVisible(false);
        CheerPanel.setVisible(false);
        cheermsgPanel.setVisible(false);
        gameInfPanel.setVisible(false);
        playerPanel.setVisible(false);
        rankComparePanel.setVisible(false);
        
        myPagePanel.setVisible(false);
        loginPanel.setVisible(false);
        regMemPanel.setVisible(true);

        //메뉴버튼 표시
        player_Btn.setVisible(true);
        cheering_Btn.setVisible(true);
        gameInf_Btn.setVisible(true);
        rank_Btn.setVisible(true);
        
        //메뉴버튼
        player_Btn.setBorderPainted(false);
        player_Btn.setFocusPainted(false);
        cheering_Btn.setBorderPainted(false);
        cheering_Btn.setFocusPainted(false);
        gameInf_Btn.setBorderPainted(false);
        gameInf_Btn.setFocusPainted(false);
        rank_Btn.setBorderPainted(false);
        rank_Btn.setFocusPainted(false);
   }
   
   public void regbtnVisible( JButton loginbtn, JButton logOutbtn, JButton myPage_Btn,
         JButton regMembtn, JButton writebtn, JButton c_writebtn, JButton regQuitbtn, JTextField inID, 
         JTextField inputEmail, JPasswordField inPW2, JTextField inputNic, JButton regBtn,
         JButton logQuitbtn, JButton logBtn, JTextField inputName, JPasswordField inPW, JButton mypgQuitbtn,
         JPasswordField inputPW, JTextField inputID, JTextArea introInput, JButton introBtn) {
      //header버튼
        loginbtn.setVisible(false);
        logOutbtn.setVisible(false);
        myPage_Btn.setVisible(false);
        regMembtn.setVisible(false);
        
        //메인패널
        writebtn.setVisible(false);
        
        //cheer패널
        c_writebtn.setVisible(false);

        //reg패널
        regQuitbtn.setVisible(true);
        inputName.setVisible(true);
        inID.setVisible(true);
        inPW.setVisible(true);
        inPW2.setVisible(true);
        inputEmail.setVisible(true);
        inputNic.setVisible(true);
        regBtn.setVisible(true);
        
        //마이페이지 패널
        mypgQuitbtn.setVisible(false);
        introInput.setVisible(false);
        introBtn.setVisible(false);

        //로그인 패널
        logQuitbtn.setVisible(false);
        inputID.setVisible(false);
        inputPW.setVisible(false);
        logBtn.setVisible(false);
   }
   
   //글작성패널
      public void boardWriteVisible(BoardFrame1 boardPanel1, BoardFrame2 boardPanel2, cheerFrame CheerPanel,
            BoardWriteFrame BoardWritePanel, cheermsgFrame cheermsgPanel, GameInfFrame gameInfPanel,
            PlayerFrame playerPanel, RankComparePanel rankComparePanel, myPageFrame myPagePanel,
            loginFrame loginPanel, regMemFrame regMemPanel, JButton player_Btn, JButton cheering_Btn, 
            JButton gameInf_Btn, JButton rank_Btn) {
         boardPanel1.setVisible(false);
            boardPanel2.setVisible(false);
            BoardWritePanel.setVisible(true);
            CheerPanel.setVisible(false);
            cheermsgPanel.setVisible(false);
            gameInfPanel.setVisible(false);
            playerPanel.setVisible(false);
            rankComparePanel.setVisible(false);
            
            myPagePanel.setVisible(false);
            loginPanel.setVisible(false);
            regMemPanel.setVisible(false);

            //메뉴버튼 표시
            player_Btn.setVisible(true);
            cheering_Btn.setVisible(true);
            gameInf_Btn.setVisible(true);
            rank_Btn.setVisible(true);
            
            //메뉴버튼
            player_Btn.setBorderPainted(false);
            player_Btn.setFocusPainted(false);
            cheering_Btn.setBorderPainted(false);
            cheering_Btn.setFocusPainted(false);
            gameInf_Btn.setBorderPainted(false);
            gameInf_Btn.setFocusPainted(false);
            rank_Btn.setBorderPainted(false);
            rank_Btn.setFocusPainted(false);
      }
      
      //글작성패널
      public void cheermsgvisible(BoardFrame1 boardPanel1, BoardFrame2 boardPanel2, cheerFrame CheerPanel,
            BoardWriteFrame BoardWritePanel, cheermsgFrame cheermsgPanel, GameInfFrame gameInfPanel,
            PlayerFrame playerPanel, RankComparePanel rankComparePanel, myPageFrame myPagePanel,
            loginFrame loginPanel, regMemFrame regMemPanel, JButton player_Btn, JButton cheering_Btn, 
            JButton gameInf_Btn, JButton rank_Btn) {
         boardPanel1.setVisible(false);
            boardPanel2.setVisible(false);
            BoardWritePanel.setVisible(false);
            CheerPanel.setVisible(false);
            cheermsgPanel.setVisible(true);
            gameInfPanel.setVisible(false);
            playerPanel.setVisible(false);
            rankComparePanel.setVisible(false);
            
            myPagePanel.setVisible(false);
            loginPanel.setVisible(false);
            regMemPanel.setVisible(false);

            //메뉴버튼 표시
            player_Btn.setVisible(true);
            cheering_Btn.setVisible(true);
            gameInf_Btn.setVisible(true);
            rank_Btn.setVisible(true);
            
            //메뉴버튼
            player_Btn.setBorderPainted(false);
            player_Btn.setFocusPainted(false);
            cheering_Btn.setBorderPainted(false);
            cheering_Btn.setFocusPainted(false);
            gameInf_Btn.setBorderPainted(false);
            gameInf_Btn.setFocusPainted(false);
            rank_Btn.setBorderPainted(false);
            rank_Btn.setFocusPainted(false);
      }

      public void menubtnVisible( JButton loginbtn, JButton logOutbtn, JButton myPage_Btn,
            JButton regMembtn, JButton writebtn, JButton c_writebtn, JButton regQuitbtn, JTextField inID, 
            JTextField inputEmail, JPasswordField inPW2, JTextField inputNic, JButton regBtn,
            JButton logQuitbtn, JButton logBtn, JTextField inputName, JPasswordField inPW, JButton mypgQuitbtn,
            JPasswordField inputPW, JTextField inputID, JTextArea introInput, JButton introBtn) {
         //메인패널
            writebtn.setVisible(false);
            
            //cheer패널
            c_writebtn.setVisible(false);

            //reg패널
            regQuitbtn.setVisible(false);
            inputName.setVisible(false);
            inID.setVisible(false);
            inPW.setVisible(false);
            inPW2.setVisible(false);
            inputEmail.setVisible(false);
            inputNic.setVisible(false);
            regBtn.setVisible(false);
            
            //마이페이지 패널
            mypgQuitbtn.setVisible(false);
            introInput.setVisible(false);
            introBtn.setVisible(false);

            //로그인 패널
            logQuitbtn.setVisible(false);
            inputID.setVisible(false);
            inputPW.setVisible(false);
            logBtn.setVisible(false);
      }
      
      //선수게시판
      public void playerVisible(BoardFrame1 boardPanel1, BoardFrame2 boardPanel2, cheerFrame CheerPanel,
            BoardWriteFrame BoardWritePanel, cheermsgFrame cheermsgPanel, GameInfFrame gameInfPanel,
            PlayerFrame playerPanel, RankComparePanel rankComparePanel, myPageFrame myPagePanel,
            loginFrame loginPanel, regMemFrame regMemPanel, JButton player_Btn, JButton cheering_Btn, 
            JButton gameInf_Btn, JButton rank_Btn) {
         boardPanel1.setVisible(false);
            boardPanel2.setVisible(false);
            CheerPanel.setVisible(false);
            gameInfPanel.setVisible(false);
            playerPanel.setVisible(true);
            rankComparePanel.setVisible(false);
            loginPanel.setVisible(false);
            myPagePanel.setVisible(false);
            cheermsgPanel.setVisible(true);
            BoardWritePanel.setVisible(false);
            player_Btn.setBorderPainted(true);
            cheering_Btn.setBorderPainted(false);
            cheering_Btn.setFocusPainted(false);
            gameInf_Btn.setBorderPainted(false);
            gameInf_Btn.setFocusPainted(false);
            rank_Btn.setBorderPainted(false);
            rank_Btn.setFocusPainted(false);
      }
      //응원게시판
      public void cheeringVisible(BoardFrame1 boardPanel1, BoardFrame2 boardPanel2, cheerFrame CheerPanel,
            BoardWriteFrame BoardWritePanel, cheermsgFrame cheermsgPanel, GameInfFrame gameInfPanel,
            PlayerFrame playerPanel, RankComparePanel rankComparePanel, myPageFrame myPagePanel,
            loginFrame loginPanel, regMemFrame regMemPanel, JButton player_Btn, JButton cheering_Btn, 
            JButton gameInf_Btn, JButton rank_Btn) {
          boardPanel1.setVisible(false);
               boardPanel2.setVisible(false);
               playerPanel.setVisible(false);
               CheerPanel.setVisible(true);
               gameInfPanel.setVisible(false);            
               rankComparePanel.setVisible(false);
               cheermsgPanel.setVisible(true);
               BoardWritePanel.setVisible(false);
               cheering_Btn.setBorderPainted(true);
               player_Btn.setBorderPainted(false);
               player_Btn.setFocusPainted(false);
               gameInf_Btn.setBorderPainted(false);
               gameInf_Btn.setFocusPainted(false);
               rank_Btn.setBorderPainted(false);
               rank_Btn.setFocusPainted(false);
               loginPanel.setVisible(false);
               myPagePanel.setVisible(false);
      }
      public void cheeringbtnVisible(JButton loginbtn, JButton logOutbtn, JButton myPage_Btn,
      JButton regMembtn, JButton writebtn, JButton c_writebtn, JButton regQuitbtn, JTextField inID, 
      JTextField inputEmail, JPasswordField inPW2, JTextField inputNic, JButton regBtn,
      JButton logQuitbtn, JButton logBtn, JTextField inputName, JPasswordField inPW, JButton mypgQuitbtn,
      JPasswordField inputPW, JTextField inputID, JTextArea introInput, JButton introBtn) {
       //메인패널
          writebtn.setVisible(false);
          
          //cheer패널
          c_writebtn.setVisible(true);

          //reg패널
          regQuitbtn.setVisible(false);
          inputName.setVisible(false);
          inID.setVisible(false);
          inPW.setVisible(false);
          inPW2.setVisible(false);
          inputEmail.setVisible(false);
          inputNic.setVisible(false);
          regBtn.setVisible(false);
          
          //마이페이지 패널
          mypgQuitbtn.setVisible(false);
          introInput.setVisible(false);
          introBtn.setVisible(false);

          //로그인 패널
          logQuitbtn.setVisible(false);
          inputID.setVisible(false);
          inputPW.setVisible(false);
          logBtn.setVisible(false);
      }
      //랭킹게시판
      public void rankVisible(BoardFrame1 boardPanel1, BoardFrame2 boardPanel2, cheerFrame CheerPanel,
            BoardWriteFrame BoardWritePanel, cheermsgFrame cheermsgPanel, GameInfFrame gameInfPanel,
            PlayerFrame playerPanel, RankComparePanel rankComparePanel, myPageFrame myPagePanel,
            loginFrame loginPanel, regMemFrame regMemPanel, JButton player_Btn, JButton cheering_Btn, 
            JButton gameInf_Btn, JButton rank_Btn) {
         boardPanel1.setVisible(false);
            boardPanel2.setVisible(false);
            playerPanel.setVisible(false);
            CheerPanel.setVisible(false);
            gameInfPanel.setVisible(false);            
            rankComparePanel.setVisible(true);
            rank_Btn.setBorderPainted(true);
            player_Btn.setBorderPainted(false);
            player_Btn.setFocusPainted(false);
            cheering_Btn.setBorderPainted(false);
            cheering_Btn.setFocusPainted(false);
            gameInf_Btn.setBorderPainted(false);
            gameInf_Btn.setFocusPainted(false);
            loginPanel.setVisible(false);
            myPagePanel.setVisible(false);
            BoardWritePanel.setVisible(false);
            cheermsgPanel.setVisible(true);
      }
      //
      public void gameInfVisible(BoardFrame1 boardPanel1, BoardFrame2 boardPanel2, cheerFrame CheerPanel,
            BoardWriteFrame BoardWritePanel, cheermsgFrame cheermsgPanel, GameInfFrame gameInfPanel,
            PlayerFrame playerPanel, RankComparePanel rankComparePanel, myPageFrame myPagePanel,
            loginFrame loginPanel, regMemFrame regMemPanel, JButton player_Btn, JButton cheering_Btn, 
            JButton gameInf_Btn, JButton rank_Btn) {
            boardPanel1.setVisible(false);
            boardPanel2.setVisible(false);
            playerPanel.setVisible(false);
            CheerPanel.setVisible(false);
            gameInfPanel.setVisible(true);
            rankComparePanel.setVisible(false);
            gameInf_Btn.setBorderPainted(true);
            player_Btn.setBorderPainted(false);
            player_Btn.setFocusPainted(false);
            cheering_Btn.setBorderPainted(false);
            cheering_Btn.setFocusPainted(false);
            rank_Btn.setBorderPainted(false);
            rank_Btn.setFocusPainted(false);
            loginPanel.setVisible(false);
            myPagePanel.setVisible(false);
            BoardWritePanel.setVisible(false);
            cheermsgPanel.setVisible(true);
      }
   
   //취소버튼 누르면 패널txt 초기화
   public void initiText(JTextField inputName,JTextField inputEmail,JTextField inputNic,
         JTextField inID, JPasswordField inPW2, JPasswordField inPW, JPasswordField inputPW,JTextField inputID) {
        inputName.setText("이름을 입력하세요.");
          inputEmail.setText("이메일을 입력하세요.");
         inputNic.setText("닉네임을 입력하세요.");
         inID.setText("ID를 입력하세요.");
         inPW2.setText("");
         inPW.setText("");
       
         inputPW.setText("");
        inputID.setText("ID를 입력하세요.");
   }
   
   //회원가입 입력창 초기화
   public void clickIniti(JTextField text) {
      text.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
               text.setText("");
            }
        });
   }
}