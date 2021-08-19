package GameInf;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameInfPanel extends JPanel {
   String event, news, rank;

   GameRank_Parsing gameRank_Parsing;
   GameSchedule_Parsing gameSchedule_Parsing;
   GameNews_Parsing gameNews_Parsing;
   
   public GameInfPanel(JFrame frame) {
      super();
      PanelInit(frame);
      InputBox();
      
      RankPrint();
      SchedulePrint();
      NewsPrint();
   }

   public GameInfPanel() {
      // TODO Auto-generated constructor stub
   }

   private void PanelInit(JFrame frame) {
      this.setBackground(new Color(255, 255, 255));
      this.setBounds(0, 0, 1280, 960);
      this.setLayout(null);

      // Medal Title
      JLabel tilteLabel = new JLabel("메달 순위");
      tilteLabel.setBounds(45, 35, 450, 40);

      tilteLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20)); // Font

      tilteLabel.setForeground(Color.white); // Color
      tilteLabel.setBackground(Color.black);
      tilteLabel.setOpaque(true);

      tilteLabel.setHorizontalAlignment(JLabel.CENTER); // Position

      this.add(tilteLabel);

   }

   private void InputBox() {
      // 경기 선택 DropBox
      String eventList[] = { "축구", "야구", "배구" };

      JComboBox eventBox = new JComboBox<Object>(eventList);
      eventBox.setBounds(550, 35, 350, 40);

      this.add(eventBox);

      // 경기 선택 버튼
      JButton gameBtn = new JButton("경기 선택");
      gameBtn.setBounds(920, 35, 130, 40);

      gameBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20)); // Font

      gameBtn.setForeground(Color.white); // Color
      gameBtn.setBackground(Color.black);
      gameBtn.setOpaque(true);

      gameBtn.setHorizontalAlignment(JLabel.CENTER); // Position

      this.add(gameBtn);

      // 적용버튼 리스너
      gameBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            event = (String) eventBox.getSelectedItem();

            System.out.println(event);
         }
      });

      // 이름 입력
      JTextField newsInput = new JTextField("김연경");
      newsInput.setBounds(550, 315, 350, 40);

      this.add(newsInput);

      // 뉴스 검색 버튼
      JButton newsBtn = new JButton("검색");

      newsBtn.setBounds(920, 315, 130, 40);

      newsBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20)); // Font

      newsBtn.setForeground(Color.white); // Color
      newsBtn.setBackground(Color.black);
      newsBtn.setOpaque(true);

      newsBtn.setHorizontalAlignment(JLabel.CENTER); // Position

      this.add(newsBtn);

      // 적용버튼 리스너
      newsBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {


            String Test;
            
            news = (String) newsInput.getText();
            
            SearchDAO searchDAO = new SearchDAO();
            searchDAO.setNews(news);
            
            
            gameNews_Parsing.Parsing_Data_init(searchDAO.getNews());
            
            gameNews_Parsing.setVisible(true);

            gameNews_Parsing = new GameNews_Parsing(); // Parsing Data 호출

         }
      });

   }
   
   private void RankPrint() {
	      
	   gameRank_Parsing = new GameRank_Parsing();
		
		ImageIcon medalIcon = new ImageIcon("./img/game_test1.PNG");
		
		Image medalImg = medalIcon.getImage();
		Image medal_changeImg = medalImg.getScaledInstance(450, 480, Image.SCALE_SMOOTH);
		
		ImageIcon medal_changeIcon = new ImageIcon(medal_changeImg);
		
		JLabel MedalImage = new JLabel(medal_changeIcon);
		
		MedalImage.setBounds(45, 95, 450, 480);
		add(MedalImage);;
	   }
   
   private void SchedulePrint() {
	      
		gameSchedule_Parsing = new GameSchedule_Parsing();  // Parsing Data 호출
		
		JLabel planImage = new JLabel("사진 예정2");
		planImage.setBounds(550, 95, 500, 200);

		planImage.setFont(new Font("맑은 고딕", Font.BOLD, 35)); // Font

		planImage.setForeground(Color.black); // Color
		planImage.setBackground(new Color(166, 166, 166));
		planImage.setOpaque(true);

		planImage.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(planImage);
	   }

   
   
   private void NewsPrint() {
      
      gameNews_Parsing = new GameNews_Parsing();
      gameNews_Parsing.setBounds(550, 375, 500, 200);

      this.add(gameNews_Parsing);
   }
}