package Main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import Cheering.CheerPanel;
import GameInf.GameInfPanel;
import Player.PlayerFrame;
import RankCompare.RankComparePanel;
import login.loginFrame;

public class MainFrame {
   private JFrame frame;
   private JButton player_Btn, cheering_Btn, gameInf_Btn, rank_Btn;

   private MainAction mainAction;
   private CheerPanel cheerPanel;
   private GameInfPanel gameInfPanel;
   private PlayerFrame playerPanel;
   private RankComparePanel rankComparePanel;
   private loginFrame loginPanel;

   public MainFrame() {
      frame = new JFrame();
      Initialize();
   }

   // Main Frame
   private void frameInit() {
      frame.setTitle("Drim Olympic");
      frame.setBounds(100, 100, 1280, 960);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);

      // ���� Title
      JLabel tilteLabel = new JLabel("Drim Olympic");
      tilteLabel.setBounds(0, 50, 1280, 60);

      tilteLabel.setFont(new Font("Arial", Font.BOLD, 35)); // Font

      tilteLabel.setForeground(Color.white); // Color
      tilteLabel.setBackground(new Color(51, 63, 80));
      tilteLabel.setOpaque(true);

      tilteLabel.setHorizontalAlignment(JLabel.CENTER); // Position

      frame.add(tilteLabel);
      
      // Header
      JButton homebtn = new JButton("Home");
      homebtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mainAction.setVisible(true);
            cheerPanel.setVisible(false);
            gameInfPanel.setVisible(false);
            playerPanel.setVisible(false);
            rankComparePanel.setVisible(false);
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
      
      homebtn.setFont(new Font("���", Font.BOLD, 14));
      homebtn.setBackground(new Color(217, 217, 217));
      homebtn.setBounds(10, 20, 75, 23);
      homebtn.setBorderPainted(false);
      homebtn.setFocusPainted(false);
      frame.add(homebtn);
      

      
      
      homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            homebtn.setBackground(new Color(255, 240, 240));
            //player_Btn.setBorderPainted(true);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            homebtn.setBackground(new Color(217, 217, 217));
         }
      });
      
      JButton loginbtn = new JButton("�α���");
      loginbtn.setFont(new Font("�������", Font.BOLD, 13));
      loginbtn.setBackground(new Color(217, 217, 217));
      loginbtn.setBounds(1180, 20, 75, 23);
      loginbtn.setBorderPainted(false);
      loginbtn.setFocusPainted(false);
      frame.add(loginbtn);
      
      loginbtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mainAction.setVisible(false);
            cheerPanel.setVisible(false);
            gameInfPanel.setVisible(false);
            playerPanel.setVisible(false);
            rankComparePanel.setVisible(false);
            loginPanel.setVisible(true);
            
            player_Btn.setVisible(false);
            cheering_Btn.setVisible(false);
            gameInf_Btn.setVisible(false);
            rank_Btn.setVisible(false);
            
            loginbtn.setVisible(false);
         }
      });
      
      homebtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             mainAction.setVisible(true);
             cheerPanel.setVisible(false);
             gameInfPanel.setVisible(false);
             playerPanel.setVisible(false);
             rankComparePanel.setVisible(false);
             loginPanel.setVisible(false);
             
             player_Btn.setVisible(true);
             cheering_Btn.setVisible(true);
             gameInf_Btn.setVisible(true);
             rank_Btn.setVisible(true);
             
             loginbtn.setVisible(true);
          }
       });
      
      loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            loginbtn.setBackground(new Color(255, 240, 240));
            //player_Btn.setBorderPainted(true);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            loginbtn.setBackground(new Color(217, 217, 217));
         }
      });
      /*
      homebtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //��ư ������ �� ���� ȿ�� ����.
         }
      });
      */
      
      // Footer
      JLabel underLabel = new JLabel("�� �帲�ý�  �� ������ ���� ������Ʈ");
      underLabel.setFont(new Font("�������", Font.PLAIN, 13));

      underLabel.setForeground(Color.black);
      underLabel.setBackground(new Color(204, 204, 204));

      underLabel.setOpaque(true);

      underLabel.setHorizontalAlignment(JLabel.CENTER);
      underLabel.setBounds(0, 880, 1280, 40);

      frame.add(underLabel);

      menuButton(); // MenuButton ȣ��
   }
   
   // Menu Add
   private void menuButton() {
      // �����Ұ� �̵�
      LineBorder black_hover = new LineBorder(Color.RED);
      player_Btn = new JButton("�����Ұ�");
      player_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mainAction.setVisible(false);
            cheerPanel.setVisible(false);
            gameInfPanel.setVisible(false);
            playerPanel.setVisible(true);
            rankComparePanel.setVisible(false);
            player_Btn.setBorderPainted(true);
            cheering_Btn.setBorderPainted(false);
            cheering_Btn.setFocusPainted(false);
            gameInf_Btn.setBorderPainted(false);
            gameInf_Btn.setFocusPainted(false);
            rank_Btn.setBorderPainted(false);
            rank_Btn.setFocusPainted(false);
            loginPanel.setVisible(false);
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
            mainAction.setVisible(false);
            playerPanel.setVisible(false);
            cheerPanel.setVisible(true);
            gameInfPanel.setVisible(false);            
            rankComparePanel.setVisible(false);
            cheering_Btn.setBorderPainted(true);
            player_Btn.setBorderPainted(false);
            player_Btn.setFocusPainted(false);
            gameInf_Btn.setBorderPainted(false);
            gameInf_Btn.setFocusPainted(false);
            rank_Btn.setBorderPainted(false);
            rank_Btn.setFocusPainted(false);
            loginPanel.setVisible(false);
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
            mainAction.setVisible(false);
            playerPanel.setVisible(false);
            cheerPanel.setVisible(false);
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
            mainAction.setVisible(false);
            playerPanel.setVisible(false);
            cheerPanel.setVisible(false);
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
   }

   private void Initialize() {
      frameInit();
      
      mainAction = new MainAction(frame);
      cheerPanel = new CheerPanel(frame);
      gameInfPanel =  new GameInfPanel(frame);
      playerPanel = new PlayerFrame(frame);
      rankComparePanel = new RankComparePanel(frame);
      loginPanel = new loginFrame(frame);
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