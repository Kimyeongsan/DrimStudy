package Player;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import MainFunction.funcBtn;

public class PlayerPanel extends JPanel {
	String name, event, country, medalCount;
	
	//private PlayerParser playerParser; 
	
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
		
		funcBtn funcbtn = new funcBtn();

		// Title
		JLabel tilteLabel = new JLabel("�����Ұ�");
		funcbtn.funcMainLabel(tilteLabel,100, 20, 900, 60, 0,0,0);
		this.add(tilteLabel);

		// Name(�̸�)
		JLabel Name = new JLabel("�̸�");
		funcbtn.funcLabel(Name,350, 100, 135, 40,166, 166, 166);
		this.add(Name);

		// event(����)
		JLabel event = new JLabel("����");
		funcbtn.funcLabel(tilteLabel, 350, 170, 135, 40,166, 166, 166);
		this.add(event);

		// country(����)
		JLabel country = new JLabel("����");
		funcbtn.funcLabel(country, 350, 240, 135, 40,166, 166, 166);
		this.add(country);
		
		// medal (�Ŵ�)
		//ũ�Ѹ�
		JLabel medal = new JLabel("�޴�");
		funcbtn.funcLabel(medal, 350, 310, 135, 40,166, 166, 166);
		this.add(medal);
	}

	
	private void InputBox() {

		// �̸� �Է�
		//ũ�Ѹ�
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
				
				//ũ�Ѹ� �Լ�ȣ��
				//�޴ް� ��»���

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
