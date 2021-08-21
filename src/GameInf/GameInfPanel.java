package GameInf;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameInfPanel extends JPanel {
	String event, news, rank;

	NewsContent newsContent;
	RankContent rankContent;

	public GameInfPanel(JFrame frame) {
		super();
		PanelInit(frame);
		InputBox();

		NewsPrint();
//		RankPrint(frame);
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

		JPanel NewsPanels = new JPanel();
		NewsPanels.setBounds(550, 375, 500, 200);

		NewsPanels.setForeground(Color.black); // Color
		NewsPanels.setBackground(new Color(166, 166, 166));
		NewsPanels.setOpaque(true);

		this.add(NewsPanels);

		// 적용버튼 리스너
		newsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				news = (String) newsInput.getText();

				ArrayList<SearchVO> SL = new ArrayList<SearchVO>();

				CrawlingDAO.NewsCrawling(news, SL);
				
				newsContent.setFd(SL.get(0).getTitle());
				newsContent.setUd(SL.get(0).getContent());
				newsContent.setVisible(true);
				
				newsContent.repaint();
			}
		});

	}
	
//	private void RankPrint(JFrame frame) {
//		ArrayList<RankVO> SL = new ArrayList<RankVO>();
//		CrawlingDAO.RankCrawling(SL);
//		
//		rankContent = new RankContent(frame);
//
//		ImageIcon medalIcon = new ImageIcon("./img/game_test1.PNG");
//
//		Image medalImg = medalIcon.getImage();
//		Image medal_changeImg = medalImg.getScaledInstance(450, 480, Image.SCALE_SMOOTH);
//
//		ImageIcon medal_changeIcon = new ImageIcon(medal_changeImg);
//
//		JLabel MedalImage = new JLabel(medal_changeIcon);
//
//		MedalImage.setBounds(45, 95, 450, 480);
//		add(MedalImage);
//	}

	private void NewsPrint() {
		newsContent = new NewsContent();
		newsContent.setBounds(550, 375, 500, 200);

		newsContent.setForeground(Color.black); // Color
		newsContent.setBackground(new Color(166, 166, 166));
		newsContent.setOpaque(true);

		this.add(newsContent);
	}
}