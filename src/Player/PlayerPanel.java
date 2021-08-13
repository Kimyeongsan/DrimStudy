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
		JLabel tilteLabel = new JLabel("�����Ұ�");
		tilteLabel.setBounds(100, 20, 900, 60);

		tilteLabel.setFont(new Font("���� ���", Font.BOLD, 35)); // Font

		tilteLabel.setForeground(Color.white); // Color
		tilteLabel.setBackground(Color.black);
		tilteLabel.setOpaque(true);

		tilteLabel.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(tilteLabel);


		// Name(�̸�)
		JLabel Name = new JLabel("�̸�");
		Name.setBounds(350, 100, 135, 40);

		Name.setFont(new Font("���� ���", Font.BOLD, 15)); // Font

		Name.setForeground(Color.black); // Color
		Name.setBackground(new Color(166, 166, 166));
		Name.setOpaque(true);

		Name.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(Name);

		
		// event(����)
		JLabel event = new JLabel("����");
		event.setBounds(350, 170, 135, 40);

		event.setFont(new Font("���� ���", Font.BOLD, 15)); // Font

		event.setForeground(Color.black); // Color
		event.setBackground(new Color(166, 166, 166));
		event.setOpaque(true);

		event.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(event);

		
		// country(����)
		JLabel country = new JLabel("����");
		country.setBounds(350, 240, 135, 40);

		country.setFont(new Font("���� ���", Font.BOLD, 15)); // Font

		country.setForeground(Color.black); // Color
		country.setBackground(new Color(166, 166, 166));
		country.setOpaque(true);

		country.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(country);

		
		// medal (�Ŵ�)
		JLabel medal = new JLabel("�޴�");
		medal.setBounds(350, 310, 135, 40);

		medal.setFont(new Font("���� ���", Font.BOLD, 15)); // Font

		medal.setForeground(Color.black); // Color
		medal.setBackground(new Color(166, 166, 166));
		medal.setOpaque(true);

		medal.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(medal);

	}

	
	private void InputBox() {

		// �̸� �Է�
		JTextField nameInput = new JTextField("ex)�輼��");
		nameInput.setBounds(515, 100, 240, 40);

		this.add(nameInput);

		
		// ���� �Է�
		
		String eventList[] = { 
				 "3X3 ��",
				 "7���� ����",
				 "������",
				 "����",
				 "�ٴ�5�����",
				 "���ü��",
				 "��",
				 "���̺�",
				 "������",
				 "����ü��",
				 "������ ����",
				 "�豸",
				 "������",
				 "����",
				 "��ġ�߸���",
				 "���",
				 "����Ŭ BMX ���̽�",
				 "����Ŭ BMX ������Ÿ��",
				 "����Ŭ ����",
				 "����Ŭ ��� ������",
				 "����Ŭ Ʈ��",
				 "����",
				 "����",
				 "����",
				 "������Ʈ����",
				 "������Ŭ���̹�",
				 "�¸�",
				 "��Ƽ��ƽ ����",
				 "�߱�/����Ʈ��",
				 "���",
				 "����",
				 "��Ʈ",
				 "����",
				 "����",
				 "����",
				 "�౸",
				 "ī�� ������Ʈ",
				 "ī�� ����",
				 "Ź��",
				 "�±ǵ�",
				 "�״Ͻ�",
				 "Ʈ���ֽ̾���",
				 "Ʈ������ ü��",
				 "���",
				 "��Ű",
				 "�ڵ庼" };

		JComboBox eventBox = new JComboBox<Object>(eventList);
		eventBox.setBounds(515, 170, 235, 40);

		this.add(eventBox);
        
		
		// �����Է�
		String countryList[] = { "���ѹα�", "�߱�", "�̱�" };

		JComboBox countryBox = new JComboBox<Object>(countryList);
		countryBox.setBounds(515, 240, 235, 40);

		this.add(countryBox);
		
		
		// input ����� ���
		JButton btnCompareSet = new JButton("����");
		btnCompareSet.setBounds(870, 310, 130, 40);
		
		this.add(btnCompareSet);
		
		
		// �����ư ������
		btnCompareSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				name = (String) nameInput.getText();
				event = (String) eventBox.getSelectedItem();
				country = (String) countryBox.getSelectedItem();
				
				// �ӽ� ���
				System.out.println(name + " / " + event + " / " + country);

			}
		});
		
	}
	
	private void OutputBox() {
		
		//picture (���� ����)
		ImageIcon icon = new ImageIcon("./img/player_test.jpg");
		
		Image playerImg = icon.getImage();
		Image changeImg = playerImg.getScaledInstance(230, 250, Image.SCALE_SMOOTH);
		
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		JLabel playerLabel = new JLabel(changeIcon);
		
		playerLabel.setBounds(100, 100, 230, 250);
		add(playerLabel);;
		
		
		// medal (�Ŵ�)
		JLabel medalOutput = new JLabel("2��");
		medalOutput.setBounds(515, 310, 240, 40);

		medalOutput.setFont(new Font("���� ���", Font.BOLD, 15)); // Font
		medalOutput.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		
		medalOutput.setForeground(Color.black); // Color
		medalOutput.setBackground(new Color(255, 255, 255));
		medalOutput.setOpaque(true);

		medalOutput.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(medalOutput);
		
		
		// ��� ����
		JLabel content = new JLabel("��� ����");
		content.setBounds(100, 370, 900, 200);

		content.setFont(new Font("���� ���", Font.BOLD, 15)); // Font

		content.setForeground(Color.black); // Color
		content.setBackground(new Color(166, 166, 166));
		content.setOpaque(true);

		content.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(content);
		
//		playerParser = new PlayerParser();
		
		
	}
	
}
