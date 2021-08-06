package GameInf;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameInfPanel extends JPanel {
	String event, news;
	
	public GameInfPanel(JFrame frame) {
		super();
		PanelInit(frame);
		InputBox();
		OutputBox();
	}

	private void PanelInit(JFrame frame) {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 960);
		this.setLayout(null);

		// Medal Title
		JLabel tilteLabel = new JLabel("�޴� ����");
		tilteLabel.setBounds(45, 35, 450, 40);

		tilteLabel.setFont(new Font("���� ���", Font.BOLD, 20)); // Font

		tilteLabel.setForeground(Color.white); // Color
		tilteLabel.setBackground(Color.black);
		tilteLabel.setOpaque(true);

		tilteLabel.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(tilteLabel);
		
	}
	
	private void InputBox() {
		// ��� ���� DropBox
		
		String eventList[] = { "�౸", "�߱�", "�豸" };

		JComboBox eventBox = new JComboBox<Object>(eventList);
		eventBox.setBounds(550, 35, 350, 40); 

		this.add(eventBox);
		
		// ��� ���� ��ư
		JButton gameBtn = new JButton("��� ����");
		gameBtn.setBounds(920, 35, 130, 40); 

		gameBtn.setFont(new Font("���� ���", Font.BOLD, 20)); // Font

		gameBtn.setForeground(Color.white); // Color
		gameBtn.setBackground(Color.black);
		gameBtn.setOpaque(true);

		gameBtn.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(gameBtn);
		
		// �����ư ������
		gameBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				event = (String) eventBox.getSelectedItem();
				
				System.out.println(event);
			}
		});
		
		// �̸� �Է�
		JTextField newsInput = new JTextField("ex)�迬�� ���޽�");
		newsInput.setBounds(550, 315, 350, 40);

		this.add(newsInput);
		
		// ���� �˻� ��ư
		JButton newsBtn = new JButton("�˻�");
		newsBtn.setBounds(920, 315, 130, 40); 

		newsBtn.setFont(new Font("���� ���", Font.BOLD, 20)); // Font

		newsBtn.setForeground(Color.white); // Color
		newsBtn.setBackground(Color.black);
		newsBtn.setOpaque(true);

		newsBtn.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(newsBtn);
		
		// �����ư ������
		newsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				news = (String) newsInput.getText();

				// �ӽ� ���
				System.out.println(news);
			}
		});
		
	}

	private void OutputBox() {
		// Medal Picture  <- ���� ���� ���� Parsing Modeling ���� 
		ImageIcon medalIcon = new ImageIcon("./img/game_test1.PNG");
		
		Image medalImg = medalIcon.getImage();
		Image medal_changeImg = medalImg.getScaledInstance(450, 480, Image.SCALE_SMOOTH);
		
		ImageIcon medal_changeIcon = new ImageIcon(medal_changeImg);
		
		JLabel MedalImage = new JLabel(medal_changeIcon);
		
		MedalImage.setBounds(45, 95, 450, 480);
		add(MedalImage);;
		
		
		// Medal Picture  <- ���� ���� ���� Parsing Modeling ���� 
		JLabel planImage = new JLabel("���� ����2");
		planImage.setBounds(550, 95, 500, 200);

		planImage.setFont(new Font("���� ���", Font.BOLD, 35)); // Font

		planImage.setForeground(Color.black); // Color
		planImage.setBackground(new Color(166, 166, 166));
		planImage.setOpaque(true);

		planImage.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(planImage);

		
		// Medal Picture <- ���� ���� ���� Parsing Modeling ���� 
		JLabel newsImage = new JLabel("���� ����3");
		newsImage.setBounds(550, 375, 500, 200);

		newsImage.setFont(new Font("���� ���", Font.BOLD, 35)); // Font

		newsImage.setForeground(Color.black); // Color
		newsImage.setBackground(new Color(166, 166, 166));
		newsImage.setOpaque(true);

		newsImage.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(newsImage);

	}
}
