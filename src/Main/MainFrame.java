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
import javax.swing.border.LineBorder;

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
   
   public MainFrame() {
	      frame = new JFrame();
	      Initialize();
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
       * header ��ư ����
       * */
          
	// login ��ư
	 JButton loginbtn = new JButton("�α���");
     loginbtn.setFont(new Font("�������", Font.BOLD, 13));
     loginbtn.setBackground(new Color(217, 217, 217));
     loginbtn.setBounds(1180, 20, 88, 23);
     loginbtn.setBorderPainted(false);
     loginbtn.setFocusPainted(false);
     frame.add(loginbtn);
    
     // logout ��ư
     JButton logOutbtn = new JButton("�α׾ƿ�");
     logOutbtn.setFont(new Font("�������", Font.BOLD, 13));
     logOutbtn.setBackground(new Color(217, 217, 217));
     logOutbtn.setBounds(1180, 20, 88, 23);
     logOutbtn.setBorderPainted(false);
     logOutbtn.setFocusPainted(false);
     frame.add(logOutbtn);
     
     // regMem ��ư
     JButton regMembtn = new JButton("ȸ������");
     regMembtn.setFont(new Font("�������", Font.BOLD, 13));
     regMembtn.setBackground(new Color(217, 217, 217));
     regMembtn.setBounds(1000, 20, 88, 23);
     regMembtn.setBorderPainted(false);
     regMembtn.setFocusPainted(false);
     frame.add(regMembtn);
     
     // mypage ��ư
     JButton myPage_Btn = new JButton("myPage");
     myPage_Btn.setFont(new Font("���", Font.BOLD, 14));
     myPage_Btn.setBackground(new Color(217, 217, 217));
     myPage_Btn.setBounds(1090, 20, 88, 23);
     myPage_Btn.setBorderPainted(false);
     myPage_Btn.setFocusPainted(false);
     frame.add(myPage_Btn);
     
     //home��ư
     JButton homebtn = new JButton("Home");
     homebtn.setFont(new Font("���", Font.BOLD, 14));
     homebtn.setBackground(new Color(217, 217, 217));
     homebtn.setBounds(10, 20, 75, 23);
     homebtn.setBorderPainted(false);
     homebtn.setFocusPainted(false);
     frame.add(homebtn);
     
     /*
      * panel button ����
      * */
     
     // ���� �Խ��� �۾��� ��ư
     JButton c_writebtn = new JButton("�����޽��� +");
 	 c_writebtn.setFont(new Font("�������", Font.BOLD, 13));
 	 c_writebtn.setBackground(new Color(217, 217, 217));
 	 c_writebtn.setBounds(1085,800, 120, 30);
 	 c_writebtn.setBorderPainted(false);
 	 c_writebtn.setFocusPainted(false);
 	 c_writebtn.setVisible(false);
 	 frame.add(c_writebtn);
 	 
 	// ���� �Խù� �۾��� ��ư
 	JButton writebtn = new JButton("�۾���");
	 writebtn.setFont(new Font("�������", Font.BOLD, 13));
	 writebtn.setBackground(new Color(217, 217, 217));
	 writebtn.setBounds(1085,742, 75, 30);
	 writebtn.setBorderPainted(false);
	 writebtn.setFocusPainted(false);
	 frame.add(writebtn);
	 
     	// reg - ��� ��ư
	 	JButton regQuitbtn = new JButton("���");
	 	regQuitbtn.setFont(new Font("�������", Font.BOLD, 13));
	 	regQuitbtn.setBackground(new Color(217, 217, 217));
	 	regQuitbtn.setBounds(730,660, 80, 40);
	 	regQuitbtn.setBorderPainted(false);
	 	regQuitbtn.setFocusPainted(false);
	 	regQuitbtn.setVisible(false);
		 frame.add(regQuitbtn);
		 
		// login - ��� ��ư
		 	JButton logQuitbtn = new JButton("���");
		 	logQuitbtn.setFont(new Font("�������", Font.BOLD, 13));
		 	logQuitbtn.setBackground(new Color(217, 217, 217));
		 	logQuitbtn.setBounds(730,590, 80, 40);
		 	logQuitbtn.setBorderPainted(false);
		 	logQuitbtn.setFocusPainted(false);
		 	logQuitbtn.setVisible(false);
			 frame.add(logQuitbtn);
			 
			// mypage - ��� ��ư
			 	JButton mypgQuitbtn = new JButton("���");
			 	mypgQuitbtn.setFont(new Font("�������", Font.BOLD, 13));
			 	mypgQuitbtn.setBackground(new Color(217, 217, 217));
			 	mypgQuitbtn.setBounds(1000,630, 80, 40);
			 	mypgQuitbtn.setBorderPainted(false);
			 	mypgQuitbtn.setFocusPainted(false);
			 	mypgQuitbtn.setVisible(false);
				 frame.add(mypgQuitbtn);
		 
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
        	// boardpanel�� ǥ��
           boardPanel1.setVisible(true);
           boardPanel2.setVisible(true);
           
           CheerPanel.setVisible(false);
           cheermsgPanel.setVisible(false);
           gameInfPanel.setVisible(false);
           playerPanel.setVisible(false);
           rankComparePanel.setVisible(false);
           
           myPagePanel.setVisible(false);
           loginPanel.setVisible(false);
           regMemPanel.setVisible(false);

           //�޴���ư ǥ��
           player_Btn.setVisible(true);
           cheering_Btn.setVisible(true);
           gameInf_Btn.setVisible(true);
           rank_Btn.setVisible(true);
           //login�� main�Խ��� ��ư, mypage ��ư ǥ��
           // ���� loginȰ���� out��ư/��Ȱ���� out��ư
           loginbtn.setVisible(true);
           logOutbtn.setVisible(true);
           writebtn.setVisible(true);
           c_writebtn.setVisible(false);
           myPage_Btn.setVisible(true);
           regQuitbtn.setVisible(false);
           mypgQuitbtn.setVisible(false);
           logQuitbtn.setVisible(false);

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
        	// login�� ǥ��
             boardPanel1.setVisible(false);
             boardPanel2.setVisible(false);
             
             CheerPanel.setVisible(false);
             cheermsgPanel.setVisible(false);
             gameInfPanel.setVisible(false);
             playerPanel.setVisible(false);
             rankComparePanel.setVisible(false);
             
             myPagePanel.setVisible(false);
             loginPanel.setVisible(true);
             regMemPanel.setVisible(false);

             //�޴���ư ǥ��
             player_Btn.setVisible(true);
             cheering_Btn.setVisible(true);
             gameInf_Btn.setVisible(true);
             rank_Btn.setVisible(true);

             loginbtn.setVisible(false);
             logOutbtn.setVisible(false);
             writebtn.setVisible(false);
             c_writebtn.setVisible(false);
             myPage_Btn.setVisible(false);
             regQuitbtn.setVisible(false);
             mypgQuitbtn.setVisible(false);
             logQuitbtn.setVisible(true);

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
        	// home�� ǥ��
             boardPanel1.setVisible(true);
             boardPanel2.setVisible(true);
             
             CheerPanel.setVisible(false);
             cheermsgPanel.setVisible(false);
             gameInfPanel.setVisible(false);
             playerPanel.setVisible(false);
             rankComparePanel.setVisible(false);
             
             myPagePanel.setVisible(false);
             loginPanel.setVisible(false);
             regMemPanel.setVisible(false);

             //�޴���ư ǥ��
             player_Btn.setVisible(true);
             cheering_Btn.setVisible(true);
             gameInf_Btn.setVisible(true);
             rank_Btn.setVisible(true);
            //login�� main�Խ��� ��ư, mypage ��ư ǥ��
             // ���� loginȰ���� out��ư/��Ȱ���� out��ư
             loginbtn.setVisible(true);
             logOutbtn.setVisible(true);
             writebtn.setVisible(true);
             c_writebtn.setVisible(false);
             myPage_Btn.setVisible(true);
             regQuitbtn.setVisible(false);
             mypgQuitbtn.setVisible(false);
             logQuitbtn.setVisible(false);

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
        	// regMem�� ǥ��
             boardPanel1.setVisible(false);
             boardPanel2.setVisible(false);
             
             CheerPanel.setVisible(false);
             cheermsgPanel.setVisible(false);
             gameInfPanel.setVisible(false);
             playerPanel.setVisible(false);
             rankComparePanel.setVisible(false);
             
             myPagePanel.setVisible(false);
             loginPanel.setVisible(false);
             regMemPanel.setVisible(true);

             //�޴���ư ǥ��
             player_Btn.setVisible(true);
             cheering_Btn.setVisible(true);
             gameInf_Btn.setVisible(true);
             rank_Btn.setVisible(true);

             loginbtn.setVisible(false);
             logOutbtn.setVisible(false);
             writebtn.setVisible(false);
             c_writebtn.setVisible(false);
             myPage_Btn.setVisible(false);
             regQuitbtn.setVisible(true);
             mypgQuitbtn.setVisible(false);
             logQuitbtn.setVisible(false);

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
           loginbtn.setBackground(new Color(255, 240, 240));
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
           loginbtn.setBackground(new Color(217, 217, 217));
        }
     });
     
     myPage_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	// mypage�� ǥ��
             boardPanel1.setVisible(false);
             boardPanel2.setVisible(false);
             
             CheerPanel.setVisible(false);
             cheermsgPanel.setVisible(false);
             gameInfPanel.setVisible(false);
             playerPanel.setVisible(false);
             rankComparePanel.setVisible(false);
             
             myPagePanel.setVisible(true);
             loginPanel.setVisible(false);
             regMemPanel.setVisible(false);

             //�޴���ư ǥ��
             player_Btn.setVisible(true);
             cheering_Btn.setVisible(true);
             gameInf_Btn.setVisible(true);
             rank_Btn.setVisible(true);
             //login�� main�Խ��� ��ư, mypage ��ư ǥ��
             loginbtn.setVisible(false);
             logOutbtn.setVisible(true);
             writebtn.setVisible(false);
             c_writebtn.setVisible(false);
             myPage_Btn.setVisible(false);
             regQuitbtn.setVisible(false);
             mypgQuitbtn.setVisible(true);
             logQuitbtn.setVisible(false);

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
     
     // �����Խ��� �ۼ���ư
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
 	      	// cheermsgǥ��
             boardPanel1.setVisible(false);
             boardPanel2.setVisible(false);
             
             CheerPanel.setVisible(false);
             cheermsgPanel.setVisible(true);
             gameInfPanel.setVisible(false);
             playerPanel.setVisible(false);
             rankComparePanel.setVisible(false);
             
             myPagePanel.setVisible(false);
             loginPanel.setVisible(false);
             regMemPanel.setVisible(false);

             //�޴���ư ǥ��
             player_Btn.setVisible(true);
             cheering_Btn.setVisible(true);
             gameInf_Btn.setVisible(true);
             rank_Btn.setVisible(true);
             //login�� main�Խ��� ��ư, mypage ��ư ǥ��
             loginbtn.setVisible(true);
             logOutbtn.setVisible(true);
             writebtn.setVisible(false);
             c_writebtn.setVisible(false);
             myPage_Btn.setVisible(true);
             regQuitbtn.setVisible(false);
             mypgQuitbtn.setVisible(false);
             logQuitbtn.setVisible(false);

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

 	 //�Խ��Ǳ��ۼ�
 	 //���� �ʿ�
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
	     	// boardǥ��
             boardPanel1.setVisible(false);
             boardPanel2.setVisible(false);
             
             CheerPanel.setVisible(false);
             cheermsgPanel.setVisible(false);
             gameInfPanel.setVisible(false);
             playerPanel.setVisible(false);
             rankComparePanel.setVisible(false);
             
             myPagePanel.setVisible(true);
             loginPanel.setVisible(false);
             regMemPanel.setVisible(false);

             //�޴���ư ǥ��
             player_Btn.setVisible(true);
             cheering_Btn.setVisible(true);
             gameInf_Btn.setVisible(true);
             rank_Btn.setVisible(true);
             //login�� main�Խ��� ��ư, mypage ��ư ǥ��
             loginbtn.setVisible(true);
             logOutbtn.setVisible(true);
             writebtn.setVisible(false);
             c_writebtn.setVisible(false);
             myPage_Btn.setVisible(true);
             regQuitbtn.setVisible(false);
             mypgQuitbtn.setVisible(false);
             logQuitbtn.setVisible(false);

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
	 
	//���� �ʿ�
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
		     	// boardǥ��
	             boardPanel1.setVisible(true);
	             boardPanel2.setVisible(true);
	             
	             CheerPanel.setVisible(false);
	             cheermsgPanel.setVisible(false);
	             gameInfPanel.setVisible(false);
	             playerPanel.setVisible(false);
	             rankComparePanel.setVisible(false);
	             
	             myPagePanel.setVisible(false);
	             loginPanel.setVisible(false);
	             regMemPanel.setVisible(false);

	             //�޴���ư ǥ��
	             player_Btn.setVisible(true);
	             cheering_Btn.setVisible(true);
	             gameInf_Btn.setVisible(true);
	             rank_Btn.setVisible(true);
	             //login�� main�Խ��� ��ư, mypage ��ư ǥ��
	             loginbtn.setVisible(true);
	             logOutbtn.setVisible(true);
	             writebtn.setVisible(false);
	             c_writebtn.setVisible(false);
	             myPage_Btn.setVisible(false);
	             regQuitbtn.setVisible(false);
	             mypgQuitbtn.setVisible(false);
	             logQuitbtn.setVisible(false);

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
	 
	 // �����Խ��� �ۼ���ư
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

     //mypage ��� ��ư
     mypgQuitbtn.addActionListener(new ActionListener() {
 	   	 public void actionPerformed(ActionEvent e) {
 	      	// cheermsgǥ��
             boardPanel1.setVisible(true);
             boardPanel2.setVisible(true);
             
             CheerPanel.setVisible(false);
             cheermsgPanel.setVisible(true);
             gameInfPanel.setVisible(false);
             playerPanel.setVisible(false);
             rankComparePanel.setVisible(false);
             
             myPagePanel.setVisible(false);
             loginPanel.setVisible(false);
             regMemPanel.setVisible(false);

             //�޴���ư ǥ��
             player_Btn.setVisible(true);
             cheering_Btn.setVisible(true);
             gameInf_Btn.setVisible(true);
             rank_Btn.setVisible(true);
             //login�� main�Խ��� ��ư, mypage ��ư ǥ��
             loginbtn.setVisible(true);
             logOutbtn.setVisible(true);
             writebtn.setVisible(false);
             c_writebtn.setVisible(false);
             myPage_Btn.setVisible(true);
             regQuitbtn.setVisible(false);
             mypgQuitbtn.setVisible(false);
             logQuitbtn.setVisible(false);

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
 	 
 // �α��� ��� �ۼ���ư
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
	   	// cheermsgǥ��
             boardPanel1.setVisible(true);
             boardPanel2.setVisible(true);
             
             CheerPanel.setVisible(false);
             cheermsgPanel.setVisible(true);
             gameInfPanel.setVisible(false);
             playerPanel.setVisible(false);
             rankComparePanel.setVisible(false);
             
             myPagePanel.setVisible(false);
             loginPanel.setVisible(false);
             regMemPanel.setVisible(false);

             //�޴���ư ǥ��
             player_Btn.setVisible(true);
             cheering_Btn.setVisible(true);
             gameInf_Btn.setVisible(true);
             rank_Btn.setVisible(true);
             //login�� main�Խ��� ��ư, mypage ��ư ǥ��
             loginbtn.setVisible(true);
             logOutbtn.setVisible(true);
             writebtn.setVisible(false);
             c_writebtn.setVisible(false);
             myPage_Btn.setVisible(true);
             regQuitbtn.setVisible(false);
             mypgQuitbtn.setVisible(false);
             logQuitbtn.setVisible(false);

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
	
	 /*
	  * �޴� ��ư
	  * */
	 
   // �����Ұ� �̵�
      LineBorder black_hover = new LineBorder(Color.RED);
      player_Btn = new JButton("�����Ұ�");
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
            
            player_Btn.setBorderPainted(true);
            cheering_Btn.setBorderPainted(false);
            cheering_Btn.setFocusPainted(false);
            gameInf_Btn.setBorderPainted(false);
            gameInf_Btn.setFocusPainted(false);
            rank_Btn.setBorderPainted(false);
            rank_Btn.setFocusPainted(false);
            writebtn.setVisible(false);
            c_writebtn.setVisible(false);
            regQuitbtn.setVisible(false);
            mypgQuitbtn.setVisible(false);
            logQuitbtn.setVisible(false);
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
      player_Btn.setFont(new Font("���", Font.BOLD, 20));
      player_Btn.setBackground(new Color(231, 230, 230));
      player_Btn.setBounds(190, 130, 150, 45);
      player_Btn.setBorderPainted(false);
      player_Btn.setFocusPainted(false);
      frame.add(player_Btn);


      // �����Խ��� �̵�
      cheering_Btn = new JButton("�����Խ���");
      cheering_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            boardPanel1.setVisible(false);
            boardPanel2.setVisible(false);
            playerPanel.setVisible(false);
            CheerPanel.setVisible(true);
            gameInfPanel.setVisible(false);            
            rankComparePanel.setVisible(false);
            cheermsgPanel.setVisible(true);
            
            cheering_Btn.setBorderPainted(true);
            player_Btn.setBorderPainted(false);
            player_Btn.setFocusPainted(false);
            gameInf_Btn.setBorderPainted(false);
            gameInf_Btn.setFocusPainted(false);
            rank_Btn.setBorderPainted(false);
            rank_Btn.setFocusPainted(false);
            loginPanel.setVisible(false);
            myPagePanel.setVisible(false);
            writebtn.setVisible(false);
            c_writebtn.setVisible(true);
            regQuitbtn.setVisible(false);
            mypgQuitbtn.setVisible(false);
            logQuitbtn.setVisible(false);
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
      cheering_Btn.setFont(new Font("���", Font.BOLD, 20));
      cheering_Btn.setBackground(new Color(231, 230, 230));
      cheering_Btn.setBorderPainted(false);
      cheering_Btn.setFocusPainted(false);
      cheering_Btn.setBounds(440, 130, 150, 45);
      frame.add(cheering_Btn);

      // �ǽð� ������� �̵�
      gameInf_Btn = new JButton("�ǽð� �������");
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
            writebtn.setVisible(false);
            c_writebtn.setVisible(false);
            cheermsgPanel.setVisible(true);
            regQuitbtn.setVisible(false);
            mypgQuitbtn.setVisible(false);
            logQuitbtn.setVisible(false);
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
      gameInf_Btn.setFont(new Font("���", Font.BOLD, 20));
      gameInf_Btn.setBackground(new Color(231, 230, 230));
      gameInf_Btn.setBorderPainted(false);
      gameInf_Btn.setFocusPainted(false);
      gameInf_Btn.setBounds(690, 130, 190, 45);
      frame.add(gameInf_Btn);
      
      // ��ŷ �� �̵�
      rank_Btn = new JButton("�޴� ��ŷ ��");
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
            writebtn.setVisible(false);
            c_writebtn.setVisible(false);
            cheermsgPanel.setVisible(true);
            regQuitbtn.setVisible(false);
            mypgQuitbtn.setVisible(false);
            logQuitbtn.setVisible(false);
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
      rank_Btn.setFont(new Font("���", Font.BOLD, 20));
      rank_Btn.setBackground(new Color(231, 230, 230));
      rank_Btn.setBorderPainted(false);
      rank_Btn.setFocusPainted(false);
      rank_Btn.setBounds(940, 130, 170, 45);
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

               window.frame.setVisible(true);
//               window.frame.setResizable(false);
               window.frame.setLocationRelativeTo(null);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   
   }

}