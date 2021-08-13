package Player;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlayerPanel extends JPanel {
	String name, event, country, medalCount;
	
	private PlayerParser playerParser; 
	
	public PlayerPanel(JFrame frame) {
		super();
		PanelInit(frame);
		InputBox();
		OutputBox();
	}
	

	private void PanelInit(JFrame frame) {

		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 960);
		this.setLayout(null);

		// Title
		JLabel tilteLabel = new JLabel("선수소개");
		tilteLabel.setBounds(100, 20, 900, 60);

		tilteLabel.setFont(new Font("맑은 고딕", Font.BOLD, 35)); // Font

		tilteLabel.setForeground(Color.white); // Color
		tilteLabel.setBackground(Color.black);
		tilteLabel.setOpaque(true);

		tilteLabel.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(tilteLabel);


		// Name(이름)
		JLabel Name = new JLabel("이름");
		Name.setBounds(350, 100, 135, 40);

		Name.setFont(new Font("맑은 고딕", Font.BOLD, 15)); // Font

		Name.setForeground(Color.black); // Color
		Name.setBackground(new Color(166, 166, 166));
		Name.setOpaque(true);

		Name.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(Name);

		
		// event(종목)
		JLabel event = new JLabel("종목");
		event.setBounds(350, 170, 135, 40);

		event.setFont(new Font("맑은 고딕", Font.BOLD, 15)); // Font

		event.setForeground(Color.black); // Color
		event.setBackground(new Color(166, 166, 166));
		event.setOpaque(true);

		event.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(event);

		
		// country(국가)
		JLabel country = new JLabel("국가");
		country.setBounds(350, 240, 135, 40);

		country.setFont(new Font("맑은 고딕", Font.BOLD, 15)); // Font

		country.setForeground(Color.black); // Color
		country.setBackground(new Color(166, 166, 166));
		country.setOpaque(true);

		country.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(country);

		
		// medal (매달)
		JLabel medal = new JLabel("메달");
		medal.setBounds(350, 310, 135, 40);

		medal.setFont(new Font("맑은 고딕", Font.BOLD, 15)); // Font

		medal.setForeground(Color.black); // Color
		medal.setBackground(new Color(166, 166, 166));
		medal.setOpaque(true);

		medal.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(medal);

	}

	
	private void InputBox() {

		// 이름 입력
		JTextField nameInput = new JTextField("ex)김세영");
		nameInput.setBounds(515, 100, 240, 40);

		this.add(nameInput);

		
		// 종목 입력
		
		String eventList[] = { 
				 "3X3 농구",
				 "7인제 럭비",
				 "가라테",
				 "골프",
				 "근대5종경기",
				 "기계체조",
				 "농구",
				 "다이빙",
				 "레슬링",
				 "리듬체조",
				 "마라톤 수영",
				 "배구",
				 "배드민턴",
				 "복싱",
				 "비치발리볼",
				 "사격",
				 "사이클 BMX 레이싱",
				 "사이클 BMX 프리스타일",
				 "사이클 도로",
				 "사이클 산악 자전거",
				 "사이클 트랙",
				 "서핑",
				 "수구",
				 "수영",
				 "스케이트보드",
				 "스포츠클라이밍",
				 "승마",
				 "아티스틱 수영",
				 "야구/소프트볼",
				 "양궁",
				 "역도",
				 "요트",
				 "유도",
				 "육상",
				 "조정",
				 "축구",
				 "카누 스프린트",
				 "카누 슬라럼",
				 "탁구",
				 "태권도",
				 "테니스",
				 "트라이애슬론",
				 "트램폴린 체조",
				 "펜싱",
				 "하키",
				 "핸드볼" };

		JComboBox eventBox = new JComboBox<Object>(eventList);
		eventBox.setBounds(515, 170, 235, 40);

		this.add(eventBox);
        
		
		// 국가입력
		String countryList[] = { "대한민국", "중국", "미국" };

		JComboBox countryBox = new JComboBox<Object>(countryList);
		countryBox.setBounds(515, 240, 235, 40);

		this.add(countryBox);
		
		
		// input 결과물 출력
		JButton btnCompareSet = new JButton("적용");
		btnCompareSet.setBounds(870, 310, 130, 40);
		
		this.add(btnCompareSet);
		
		
		// 적용버튼 리스너
		btnCompareSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				name = (String) nameInput.getText();
				event = (String) eventBox.getSelectedItem();
				country = (String) countryBox.getSelectedItem();
				
				// 임시 출력
				System.out.println(name + " / " + event + " / " + country);

			}
		});
		
	}
	
	private void OutputBox() {
		
		//picture (선수 사진)
		ImageIcon icon = new ImageIcon("./img/player_test.jpg");
		
		Image playerImg = icon.getImage();
		Image changeImg = playerImg.getScaledInstance(230, 250, Image.SCALE_SMOOTH);
		
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		JLabel playerLabel = new JLabel(changeIcon);
		
		playerLabel.setBounds(100, 100, 230, 250);
		add(playerLabel);;
		
		
		// medal (매달)
		JLabel medalOutput = new JLabel("2개");
		medalOutput.setBounds(515, 310, 240, 40);

		medalOutput.setFont(new Font("맑은 고딕", Font.BOLD, 15)); // Font
		medalOutput.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		
		medalOutput.setForeground(Color.black); // Color
		medalOutput.setBackground(new Color(255, 255, 255));
		medalOutput.setOpaque(true);

		medalOutput.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(medalOutput);
		
		
		// 경력 내용
		JLabel content = new JLabel("경력 내용");
		content.setBounds(100, 370, 900, 200);

		content.setFont(new Font("맑은 고딕", Font.BOLD, 15)); // Font

		content.setForeground(Color.black); // Color
		content.setBackground(new Color(166, 166, 166));
		content.setOpaque(true);

		content.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(content);
		
//		playerParser = new PlayerParser();
		
		
	}
	
}
