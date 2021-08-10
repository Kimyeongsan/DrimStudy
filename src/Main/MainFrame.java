package Main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
import GameInf.GameInfFrame;
import Player.PlayerFrame;
import RankCompare.RankComparePanel;
import login.loginFrame;
import myPage.myPageFrame;
import regMember.regMemFrame;

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
	      Initialize();
	   }
   
   //초기화
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
	   }

   // Main Frame
   private void frameInit() {
      frame.setTitle("Drim Olympic");
      frame.setBounds(100, 100, 1280, 960);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      ImageIcon img = new ImageIcon("./img/drim_img.png");
      frame.setIconImage(img.getImage());
      
      // 메인 Title
      JLabel tilteLabel = new JLabel("Drim Olympic");
      tilteLabel.setBounds(0, 50, 1280, 60);

      tilteLabel.setFont(new Font("Arial", Font.BOLD, 35)); // Font

      tilteLabel.setForeground(Color.white); // Color
      tilteLabel.setBackground(new Color(51, 63, 80));
      tilteLabel.setOpaque(true);

      tilteLabel.setHorizontalAlignment(JLabel.CENTER); // Position

      frame.add(tilteLabel);
     
      /*
       * header 버튼 정리
       * */
          
	// login 버튼
	 JButton loginbtn = new JButton("로그인");
     loginbtn.setFont(new Font("맑은고딕", Font.BOLD, 13));
     loginbtn.setBackground(new Color(217, 217, 217));
     loginbtn.setBounds(1168, 20, 88, 23);
     loginbtn.setBorderPainted(false);
     loginbtn.setFocusPainted(false);
     frame.add(loginbtn);
    
     // logout 버튼
     JButton logOutbtn = new JButton("로그아웃");
     logOutbtn.setFont(new Font("맑은고딕", Font.BOLD, 13));
     logOutbtn.setBackground(new Color(217, 217, 217));
     logOutbtn.setBounds(1168, 20, 88, 23);
     logOutbtn.setBorderPainted(false);
     logOutbtn.setFocusPainted(false);
     frame.add(logOutbtn);
     
     // regMem 버튼
     JButton regMembtn = new JButton("회원가입");
     regMembtn.setFont(new Font("맑은고딕", Font.BOLD, 13));
     regMembtn.setBackground(new Color(217, 217, 217));
     regMembtn.setBounds(1073, 20, 88, 23);
     regMembtn.setBorderPainted(false);
     regMembtn.setFocusPainted(false);
     frame.add(regMembtn);
     
     // mypage 버튼
     JButton myPage_Btn = new JButton("myPage");
     myPage_Btn.setFont(new Font("고딕", Font.BOLD, 14));
     myPage_Btn.setBackground(new Color(217, 217, 217));
     myPage_Btn.setBounds(972, 20, 94, 23);
     myPage_Btn.setBorderPainted(false);
     myPage_Btn.setFocusPainted(false);
     frame.add(myPage_Btn);
     
     // home버튼
     JButton homebtn = new JButton("Home");
     homebtn.setFont(new Font("고딕", Font.BOLD, 14));
     homebtn.setBackground(new Color(217, 217, 217));
     homebtn.setBounds(10, 20, 88, 23);
     homebtn.setBorderPainted(false);
     homebtn.setFocusPainted(false);
     frame.add(homebtn);
     
     /*
      * panel button 정리
      * */
     
     // 응원 게시판 글쓰기 버튼
     JButton c_writebtn = new JButton("응원메시지 +");
 	 c_writebtn.setFont(new Font("맑은고딕", Font.BOLD, 13));
 	 c_writebtn.setBackground(new Color(217, 217, 217));
 	 c_writebtn.setBounds(1085,800, 120, 30);
 	 c_writebtn.setBorderPainted(false);
 	 c_writebtn.setFocusPainted(false);
 	 c_writebtn.setVisible(false);
 	 frame.add(c_writebtn);
 	 
 	// 메인 게시물 글쓰기 버튼
 	JButton writebtn = new JButton("글쓰기");
	 writebtn.setFont(new Font("맑은고딕", Font.BOLD, 13));
	 writebtn.setBackground(new Color(217, 217, 217));
	 writebtn.setBounds(1085,742, 75, 30);
	 writebtn.setBorderPainted(false);
	 writebtn.setFocusPainted(false);
	 frame.add(writebtn);
	 
	 //회원가입

     //이름 입력
     JTextField inputName = new JTextField("이름을 입력하세요.");
     inputName.setBounds(510, 330, 250, 40);
     inputName.setFont(new Font("고딕", Font.BOLD, 20)); // Font
     inputName.setForeground(Color.black); // Color
     inputName.setBackground(new Color(255,255,255));
     inputName.requestFocusInWindow();
     frame.add(inputName);
     inputName.setColumns(10);
     
   //id 입력
     JTextField inID = new JTextField("ID를 입력하세요.");
     inID.setBounds(510, 380, 250, 40);
     inID.setFont(new Font("고딕", Font.BOLD, 20)); // Font
     inID.setForeground(Color.black); // Color
     inID.setBackground(new Color(255,255,255));
     inID.requestFocusInWindow();
     frame.add(inID);
     inID.setColumns(10);
     
     //pw 입력
     JPasswordField inPW = new JPasswordField("");
     inPW.setBounds(510, 430, 250, 40);
     inPW.setFont(new Font("고딕", Font.BOLD, 20)); // Font
     inPW.setForeground(Color.black); // Color
     inPW.setBackground(new Color(255,255,255));
     frame.add(inPW);
     inPW.setColumns(10);
     
   //pw2입력
     JPasswordField inPW2 = new JPasswordField("");
     inPW2.setBounds(510, 480, 250, 40);
     inPW2.setFont(new Font("고딕", Font.BOLD, 20)); // Font
     inPW2.setForeground(Color.black); // Color
     inPW2.setBackground(new Color(255,255,255));
     frame.add(inPW2);
     
     //이메일 입력
     JTextField inputEmail = new JTextField("이메일을 입력하세요.");
     inputEmail.setBounds(510, 530, 250, 40);
     inputEmail.setFont(new Font("고딕", Font.BOLD, 20)); // Font
     inputEmail.setForeground(Color.black); // Color
     inputEmail.setBackground(new Color(255,255,255));
     frame.add(inputEmail);
     inputEmail.setColumns(10);
     
     //닉네임 입력
     JTextField inputNic = new JTextField("닉네임을 입력하세요.");
     inputNic.setBounds(510, 580, 250, 40);
     inputNic.setFont(new Font("고딕", Font.BOLD, 20)); // Font
     inputNic.setForeground(Color.black); // Color
     inputNic.setBackground(new Color(255,255,255));
     frame.add(inputNic);
     inputNic.setColumns(10);
     
     	// reg - 취소 버튼
	 	JButton regQuitbtn = new JButton("취소");
	 	regQuitbtn.setFont(new Font("맑은고딕", Font.BOLD, 13));
	 	regQuitbtn.setBackground(new Color(217, 217, 217));
	 	regQuitbtn.setBounds(900,660, 80, 40);
	 	regQuitbtn.setBorderPainted(false);
	 	regQuitbtn.setFocusPainted(false);
	 	regQuitbtn.setVisible(false);
		 frame.add(regQuitbtn);
		 
	      //회원가입 완료버튼 눌렀을때 효과
		//완료 버튼
	      JButton regBtn = new JButton("완료");
	      regBtn.setFont(new Font("고딕", Font.BOLD, 14));
	      regBtn.setBackground(new Color(217, 217, 217));
	      regBtn.setBounds(800, 660, 80, 40);
	      regBtn.setBorderPainted(false);
	      regBtn.setFocusPainted(false);
	      frame.add(regBtn);
	      

		 
		 //로그인
		// login - 취소 버튼
		 	JButton logQuitbtn = new JButton("취소");
		 	logQuitbtn.setFont(new Font("맑은고딕", Font.BOLD, 13));
		 	logQuitbtn.setBackground(new Color(217, 217, 217));
		 	logQuitbtn.setBounds(730,590, 80, 40);
		 	logQuitbtn.setBorderPainted(false);
		 	logQuitbtn.setFocusPainted(false);
		 	logQuitbtn.setVisible(false);
			 frame.add(logQuitbtn);
			 
			//확인 버튼
		      JButton logBtn = new JButton("확인");
		      logBtn.setFont(new Font("고딕", Font.BOLD, 14));
		      logBtn.setBackground(new Color(217, 217, 217));
		      logBtn.setBounds(630, 590, 80, 40);
		      logBtn.setBorderPainted(false);
		      logBtn.setFocusPainted(false);
		      frame.add(logBtn);      
		      
		      //id 입력
		      JTextField inputID = new JTextField("ID를 입력하세요.");
		      inputID.setBounds(500, 439, 400, 40);
		      inputID.setFont(new Font("고딕", Font.BOLD, 20)); // Font
		      inputID.setForeground(Color.black); // Color
		      inputID.setBackground(new Color(255,255,255));
		      inputID.requestFocusInWindow();
		      frame.add(inputID);
		      
		      //pw 입력
		      JPasswordField inputPW = new JPasswordField("");
		      inputPW.setBounds(500, 512, 400, 40);
		      inputPW.setFont(new Font("고딕", Font.BOLD, 20)); // Font
		      inputPW.setForeground(Color.black); // 9Color
		      inputPW.setBackground(new Color(255,255,255));
		      frame.add(inputPW);
		      

		      //home 눌렀을때 회원가입, 로그인 입력 초기화
		      //로그인 완료버튼 눌렀을때 효과, 초기화, 취소시 초기화, home버튼시 초기화
		      //로그인 완료버튼 눌렀을때 효과,

		      //회원가입 버튼 누르면 초기화? pw만 초기화 나머진 그대로		
		      //화면 정리
		      //
		      
			 //마이페이지
			 
			// mypage - 취소 버튼
			 	JButton mypgQuitbtn = new JButton("자기소개 내용 지우기");
			 	mypgQuitbtn.setFont(new Font("맑은고딕", Font.BOLD, 13));
			 	mypgQuitbtn.setBackground(new Color(217, 217, 217));
			 	mypgQuitbtn.setBounds(1000,630, 170, 40);
			 	mypgQuitbtn.setBorderPainted(false);
			 	mypgQuitbtn.setFocusPainted(false);
			 	mypgQuitbtn.setVisible(false);
				 frame.add(mypgQuitbtn);

				   //자기소개 입력버튼
			     JTextArea introInput = new JTextArea("");
			     
					introInput.setBounds(465, 405, 605, 200);
					introInput.setFont(new Font("고딕", Font.BOLD, 20)); // Font
					introInput.setForeground(Color.black); // Color
					introInput.setOpaque(true);
					introInput.setLineWrap(true);
					introInput.setEditable(true);
					frame.add(introInput);
					
					  //마이페이지 자기소개 완료 버튼
				      JButton introBtn = new JButton("완료");
				      introBtn.setFont(new Font("고딕", Font.BOLD, 14));
				      introBtn.setBackground(new Color(217, 217, 217));
				      introBtn.setBounds(915, 630, 80, 40);
				      introBtn.setBorderPainted(false);
				      introBtn.setFocusPainted(false);
				      frame.add(introBtn);
				      
	 /*
	  * header button action
	  * */

	 // home
	 homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            homebtn.setBackground(new Color(255, 240, 240));
            //player_Btn.setBorderPainted(true);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            homebtn.setBackground(new Color(217, 217, 217));
         }
      });
     
     homebtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           // boardpanel만 표시
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

           //메뉴버튼
           player_Btn.setBorderPainted(false);
           player_Btn.setFocusPainted(false);
           cheering_Btn.setBorderPainted(false);
           cheering_Btn.setFocusPainted(false);
           gameInf_Btn.setBorderPainted(false);
           gameInf_Btn.setFocusPainted(false);
           rank_Btn.setBorderPainted(false);
           rank_Btn.setFocusPainted(false);
           
              inputName.setText("이름을 입력하세요.");
         	  inputEmail.setText("이메일을 입력하세요.");
        	  inputNic.setText("닉네임을 입력하세요.");
        	  inID.setText("ID를 입력하세요.");
        	  inPW2.setText("");
        	  inPW.setText("");
        	  
        	  inputPW.setText("");
	          inputID.setText("");
         }
     });

     //login
     loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
           loginbtn.setBackground(new Color(255, 240, 240));
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
           loginbtn.setBackground(new Color(217, 217, 217));
        }
     });
     
     loginbtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	// login만 표시
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
      });
    
     //logOut
     logOutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
       	 logOutbtn.setBackground(new Color(255, 240, 240));
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
       	 logOutbtn.setBackground(new Color(217, 217, 217));
        }
     });
     
     logOutbtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	// home만 표시
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
      });
     
     //regMem
     regMembtn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
       	 regMembtn.setBackground(new Color(255, 240, 240));
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
       	 regMembtn.setBackground(new Color(217, 217, 217));
        }
     });
     
     regMembtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	// regMem만 표시
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
      });
     
   //myPage
     myPage_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
        	myPage_Btn.setBackground(new Color(255, 240, 240));
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
        	myPage_Btn.setBackground(new Color(217, 217, 217));
        }
     });
     
     myPage_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	// mypage만 표시
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
      });
     
     // 응원게시판 작성버튼
     c_writebtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            c_writebtn.setBackground(Color.black);
            c_writebtn.setForeground(Color.white);
            //player_Btn.setBorderPainted(true);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            c_writebtn.setBackground(new Color(217, 217, 217));
            c_writebtn.setForeground(Color.black);
         }
     });

 	 c_writebtn.addActionListener(new ActionListener() {
 	   	 public void actionPerformed(ActionEvent e) {
 	      	// cheermsg표시
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
 	 });

 	 //게시판글작성
 	 //수정 필요
 	writebtn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
           writebtn.setBackground(Color.black);
           writebtn.setForeground(Color.white);
           //player_Btn.setBorderPainted(true);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
           writebtn.setBackground(new Color(217, 217, 217));
           writebtn.setForeground(Color.black);
        }
    });

	 writebtn.addActionListener(new ActionListener() {
	   	 public void actionPerformed(ActionEvent e) {
	     	// board표시
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

             //header버튼
             loginbtn.setVisible(false);
             logOutbtn.setVisible(true);
             myPage_Btn.setVisible(true);
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
             mypgQuitbtn.setVisible(false);
             introInput.setVisible(false);
             introBtn.setVisible(false);

             //로그인 패널
             logQuitbtn.setVisible(false);
             inputID.setVisible(false);
             inputPW.setVisible(false);
             logBtn.setVisible(false);

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
	 });
	 
	 
	 //회원가입
	 //회원가입 입력창 초기화
     inPW.addMouseListener(new MouseAdapter(){
         @Override
         public void mouseClicked(MouseEvent e){
        	 inPW.setText("");
         }
     });
     inPW2.addMouseListener(new MouseAdapter(){
         @Override
         public void mouseClicked(MouseEvent e){
       	  inPW2.setText("");
         }
     });
     inID.addMouseListener(new MouseAdapter(){
         @Override
         public void mouseClicked(MouseEvent e){
       	  inID.setText("");
         }
     });
     inputEmail.addMouseListener(new MouseAdapter(){
         @Override
         public void mouseClicked(MouseEvent e){
       	  inputEmail.setText("");
         }
     });
     inputNic.addMouseListener(new MouseAdapter(){
         @Override
         public void mouseClicked(MouseEvent e){
       	  inputNic.setText("");
         }
     });
     
     inputName.addMouseListener(new MouseAdapter(){
         @Override
         public void mouseClicked(MouseEvent e){
       	  inputName.setText("");
         }
     });
     
     regBtn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
        	regBtn.setBackground(Color.black);
        	regBtn.setForeground(Color.white);
           //player_Btn.setBorderPainted(true);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
        	regBtn.setBackground(new Color(217, 217, 217));
        	regBtn.setForeground(Color.black);
        }
    });
     
     //회원가입 완료시 로그인 화면
     regBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             
            String myName = inputName.getText();
            String myID = inID.getText();
            String myPW = inPW.getText();
            String myPW2 = inPW2.getText();
            String myEmail = inputEmail.getText();
            String myNic = inputNic.getText();
            
            //비밀번호와 비밀번호 확인 입력값이 같으면
            Connection connection;
			try {
				connection = DriverManager.getConnection("jdbc:mysql://192.168.123.57/drimDB", "test1", "drim1234");
				String query = "INSERT INTO account values('" + myName + "','" + myID + "','" + myPW + "','" +
	            		myEmail + "','" + myNic + "')";

	            Statement sta = connection.createStatement();
	            int x = sta.executeUpdate(query);
	            
	              if(myPW.equals(myPW2) && !myPW.equals("") && x != 0) {
	            	   
	                 // 임시 출력
	                 System.out.println(myName + " / " + myID  + " / " + myPW + " / " + myPW2 + " / " + myEmail + " / "+ myNic);
	                 
	                 JOptionPane.showMessageDialog
	                    (null, "아이디 : "+myID+ "\n이 름 : "+myName+"\n이메일 : "+myEmail+
	                    "\n닉 네 임 : "+myNic, "회원가입 완료", JOptionPane.INFORMATION_MESSAGE);
	                 connection.close();

            
//	                    connection.close();
//(Exception exception) {
//	                    exception.printStackTrace();
//	                }
                 
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

                 //메뉴버튼
                 player_Btn.setBorderPainted(false);
                 player_Btn.setFocusPainted(false);
                 cheering_Btn.setBorderPainted(false);
                 cheering_Btn.setFocusPainted(false);
                 gameInf_Btn.setBorderPainted(false);
                 gameInf_Btn.setFocusPainted(false);
                 rank_Btn.setBorderPainted(false);
                 rank_Btn.setFocusPainted(false);

                  inputName.setText("이름을 입력하세요.");
              	  inputEmail.setText("이메일을 입력하세요.");
               	  inputNic.setText("닉네임을 입력하세요.");
               	  inID.setText("ID를 입력하세요.");
               	  inPW2.setText("");
             	  inPW.setText("");
	              }

              else if (myPW.equals("")) {
            	  JOptionPane.showMessageDialog
                  (null, "비밀번호를 입력하세요.", "회원가입 실패", JOptionPane.ERROR_MESSAGE);
              }
              else { //비밀번호 틀림
                 	JOptionPane.showMessageDialog
                     (null, "비밀번호가 틀립니다.", "회원가입 실패", JOptionPane.ERROR_MESSAGE);
                    
                    inPW.setText("");
                    inPW2.setText("");
                 }
         } 
         catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
         }
         }});
			
     
	//회원가입 패널 내 취소버튼
	 regQuitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	regQuitbtn.setBackground(Color.black);
	        	regQuitbtn.setForeground(Color.white);
	           //player_Btn.setBorderPainted(true);
	        }
	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	regQuitbtn.setBackground(new Color(217, 217, 217));
	        	regQuitbtn.setForeground(Color.black);
	        }
	    });

	 regQuitbtn.addActionListener(new ActionListener() {
		   	 public void actionPerformed(ActionEvent e) {
		     	// board표시
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

                 //메뉴버튼
                 player_Btn.setBorderPainted(false);
                 player_Btn.setFocusPainted(false);
                 cheering_Btn.setBorderPainted(false);
                 cheering_Btn.setFocusPainted(false);
                 gameInf_Btn.setBorderPainted(false);
                 gameInf_Btn.setFocusPainted(false);
                 rank_Btn.setBorderPainted(false);
                 rank_Btn.setFocusPainted(false);
                 
                  inputName.setText("이름을 입력하세요.");
             	  inputEmail.setText("이메일을 입력하세요.");
              	  inputNic.setText("닉네임을 입력하세요.");
              	  inID.setText("ID를 입력하세요.");
              	  inPW2.setText("");
            	  inPW.setText("");
			}
		 });
	 
	 //마이페이지

	//mypage 취소 버튼
     mypgQuitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
       	  mypgQuitbtn.setBackground(Color.black);
       	  mypgQuitbtn.setForeground(Color.white);

            //player_Btn.setBorderPainted(true);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
       	  mypgQuitbtn.setBackground(new Color(217, 217, 217));
            mypgQuitbtn.setForeground(Color.black);
         }
     });
     
     mypgQuitbtn.addActionListener(new ActionListener() {
 	   	 public void actionPerformed(ActionEvent e) {
 	      	// cheermsg표시
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

             //header버튼
             loginbtn.setVisible(true);
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

             //메뉴버튼
             player_Btn.setBorderPainted(false);
             player_Btn.setFocusPainted(false);
             cheering_Btn.setBorderPainted(false);
             cheering_Btn.setFocusPainted(false);
             gameInf_Btn.setBorderPainted(false);
             gameInf_Btn.setFocusPainted(false);
             rank_Btn.setBorderPainted(false);
             rank_Btn.setFocusPainted(false);
             
             introInput.setText("");
             
 		}
 	 });
   //mypage 자기소개 완료 버튼
     introBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
        	 introBtn.setBackground(Color.black);
        	 introBtn.setForeground(Color.white);

            //player_Btn.setBorderPainted(true);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
        	 introBtn.setBackground(new Color(217, 217, 217));
        	 introBtn.setForeground(Color.black);
         }
     });
     
   
     introBtn.addActionListener(new ActionListener() {
 	   	 public void actionPerformed(ActionEvent e) {
 	      	// cheermsg표시
 	   		 
 	   		String inIntro = introInput.getText();
			 System.out.println(inIntro);
			 
			JOptionPane.showMessageDialog
              (null, "등록되었습니다.", "Success!", JOptionPane.INFORMATION_MESSAGE);
        

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

             //header버튼
             loginbtn.setVisible(true);
             logOutbtn.setVisible(true);
             myPage_Btn.setVisible(true);
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
             mypgQuitbtn.setVisible(true);
             introInput.setVisible(true);
             introBtn.setVisible(true);

             //로그인 패널
             logQuitbtn.setVisible(false);
             inputID.setVisible(false);
             inputPW.setVisible(false);
             logBtn.setVisible(false);

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
 	 });
     
     
 	 //로그인
 // 로그인 취소 작성버튼
     
     
     inputID.addMouseListener(new MouseAdapter(){
         @Override
         public void mouseClicked(MouseEvent e){
       	  inputID.setText("");
         }
     });
     
     inputPW.addMouseListener(new MouseAdapter(){
         @Override
         public void mouseClicked(MouseEvent e){
        	 inputPW.setText("");
         }
     });
     
     logQuitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
       	 logQuitbtn.setBackground(Color.black);
       	 logQuitbtn.setForeground(Color.white);
           //player_Btn.setBorderPainted(true);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
       	 logQuitbtn.setBackground(new Color(217, 217, 217));
       	 logQuitbtn.setForeground(Color.black);
        }
    });


     logQuitbtn.addActionListener(new ActionListener() {
	   	 public void actionPerformed(ActionEvent e) {
	   	// cheermsg표시
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

             //메뉴버튼
             player_Btn.setBorderPainted(false);
             player_Btn.setFocusPainted(false);
             cheering_Btn.setBorderPainted(false);
             cheering_Btn.setFocusPainted(false);
             gameInf_Btn.setBorderPainted(false);
             gameInf_Btn.setFocusPainted(false);
             rank_Btn.setBorderPainted(false);
             rank_Btn.setFocusPainted(false);
             
             inputPW.setText("");
             inputID.setText("ID를 입력하세요.");
		}
	 });
     
     logBtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
        	 logBtn.setBackground(Color.black);
        	 logBtn.setForeground(Color.white);
            //player_Btn.setBorderPainted(true);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
        	 logBtn.setBackground(new Color(217, 217, 217));
        	 logBtn.setForeground(Color.black);
         }
     });
	
     logBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = "hello", pw = "1234";
				
				// 임시 출력
				String inID = inputID.getText();
				String inPW = inputPW.getText();
				
				System.out.println(inID + " / " + inPW );
	
				if (id.equals(inID) && pw.equals(inPW)) {
					JOptionPane.showMessageDialog(null, "환영!", "login", JOptionPane.INFORMATION_MESSAGE);
					
					boardPanel1.setVisible(true);
		             boardPanel2.setVisible(true);
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

		             //header버튼
		             loginbtn.setVisible(false);
		             logOutbtn.setVisible(true);
		             myPage_Btn.setVisible(false);
		             regMembtn.setVisible(false);
		             
		             //메인패널
		             writebtn.setVisible(true);
		             
		             //cheer패널
		             c_writebtn.setVisible(false);

		             //reg패널
		             regQuitbtn.setVisible(false);
		             inputName.setVisible(false);
		             //inID.setVisible(false);
		             //inPW.setVisible(false);
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

		             //메뉴버튼
		             player_Btn.setBorderPainted(false);
		             player_Btn.setFocusPainted(false);
		             cheering_Btn.setBorderPainted(false);
		             cheering_Btn.setFocusPainted(false);
		             gameInf_Btn.setBorderPainted(false);
		             gameInf_Btn.setFocusPainted(false);
		             rank_Btn.setBorderPainted(false);
		             rank_Btn.setFocusPainted(false);
		             
		             inputPW.setText("");
		             inputID.setText("ID를 입력하세요.");
		             

		             }
				// 로그인 실패
				else if (id.equals(inputID.getText()) && pw.equals(inputPW.getText()) == false) {
					JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.", "login", JOptionPane.ERROR_MESSAGE);
					
		             
		             inputPW.setText("");
				}
				else {  
					JOptionPane.showMessageDialog(null, "회원이 아닙니다.", "login", JOptionPane.ERROR_MESSAGE);
		             
		             inputPW.setText("ID를 입력하세요.");
		             inputID.setText("");
				}
				 
			}
   });
     

	 /*
	  * 메뉴 버튼
	  * */
	 
   // 선수소개 이동
      LineBorder black_hover = new LineBorder(Color.RED);
      player_Btn = new JButton("선수소개");
      player_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
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
      });   
      
      player_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            player_Btn.setBackground(new Color(255, 240, 240));
            //player_Btn.setBorderPainted(true);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            player_Btn.setBackground(new Color(231, 230, 230));
         }
      });
      player_Btn.setFont(new Font("고딕", Font.BOLD, 20));
      player_Btn.setBackground(new Color(231, 230, 230));
      player_Btn.setBounds(190, 130, 150, 45);
      player_Btn.setBorderPainted(false);
      player_Btn.setFocusPainted(false);
      frame.add(player_Btn);


      // 응원게시판 이동
      cheering_Btn = new JButton("응원게시판");
      cheering_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
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
      });
      cheering_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            cheering_Btn.setBackground(new Color(255, 240, 240));
            //player_Btn.setBorderPainted(true);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            cheering_Btn.setBackground(new Color(231, 230, 230));
         }
      });
      cheering_Btn.setFont(new Font("고딕", Font.BOLD, 20));
      cheering_Btn.setBackground(new Color(231, 230, 230));
      cheering_Btn.setBorderPainted(false);
      cheering_Btn.setFocusPainted(false);
      cheering_Btn.setBounds(440, 130, 150, 45);
      frame.add(cheering_Btn);

      // 실시간 경기정보 이동
      gameInf_Btn = new JButton("실시간 경기정보");
      gameInf_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
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
      });
      gameInf_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            gameInf_Btn.setBackground(new Color(255, 240, 240));
            //player_Btn.setBorderPainted(true);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            gameInf_Btn.setBackground(new Color(231, 230, 230));
         }
      });
      gameInf_Btn.setFont(new Font("고딕", Font.BOLD, 20));
      gameInf_Btn.setBackground(new Color(231, 230, 230));
      gameInf_Btn.setBorderPainted(false);
      gameInf_Btn.setFocusPainted(false);
      gameInf_Btn.setBounds(690, 130, 190, 45);
      frame.add(gameInf_Btn);
      
      // 랭킹 비교 이동
      rank_Btn = new JButton("메달 랭킹 비교");
      rank_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
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
      });
      rank_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            rank_Btn.setBackground(new Color(255, 240, 240));
            //player_Btn.setBorderPainted(true);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            rank_Btn.setBackground(new Color(231, 230, 230));
         }
      });
      rank_Btn.setFont(new Font("고딕", Font.BOLD, 20));
      rank_Btn.setBackground(new Color(231, 230, 230));
      rank_Btn.setBorderPainted(false);
      rank_Btn.setFocusPainted(false);
      rank_Btn.setBounds(940, 130, 170, 45);
      frame.add(rank_Btn);
      
      
      // Footer
      JLabel underLabel = new JLabel("㈜ 드림시스  ⓒ 명지대 인턴 프로젝트");
      underLabel.setFont(new Font("맑은고딕", Font.PLAIN, 13));

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