package Player;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Main.funVisible;
import Main.funcBtn;

public class PlayerPanel extends JPanel {
	String name, event, country, medalCount;
	PlayerContent playerContent;
	// private PlayerParser playerParser;

	public PlayerPanel(JFrame frame) {
		super();
		PanelInit(frame);
		InputBox();
		OutputBox();

		NewsPrint();
	}

	private void PanelInit(JFrame frame) {

		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 960);
		this.setLayout(null);

		funcBtn funcbtn = new funcBtn();

		// Title
		JLabel tilteLabel = new JLabel("�����Ұ�");
		funcbtn.funcMainLabel(tilteLabel, 100, 20, 900, 60, 0, 0, 0);
		this.add(tilteLabel);

		// Name(�̸�)
		JLabel Name = new JLabel("�̸�");
		funcbtn.funcLabel(Name, 350, 100, 135, 40, 166, 166, 166);
		this.add(Name);

		// event(����)
		JLabel event = new JLabel("����");
		funcbtn.funcLabel(event, 350, 210, 135, 40, 166, 166, 166);
		this.add(event);

		// country(����)
		JLabel country = new JLabel("����");
		funcbtn.funcLabel(country, 350, 310, 135, 40, 166, 166, 166);
		this.add(country);

	}

	private void InputBox() {

		// �̸� �Է�
		JTextField nameInput = new JTextField("An San");
		nameInput.setBounds(515, 100, 240, 40);
		funVisible funVisible = new funVisible();
		funVisible.clickIniti(nameInput);
		
		this.add(nameInput);

		
		// ���� �Է�
		String eventList[] = {"���", "�豸", "�±ǵ�"};

//		String eventList[] = { "3X3 ��", "7���� ����", "������", "����", "�ٴ�5�����", "���ü��", "��", "���̺�", "������", "����ü��", "������ ����",
//				"�豸", "������", "����", "��ġ�߸���", "���", "����Ŭ BMX ���̽�", "����Ŭ BMX ������Ÿ��", "����Ŭ ����", "����Ŭ ��� ������", "����Ŭ Ʈ��",
//				"����", "����", "����", "������Ʈ����", "������Ŭ���̹�", "�¸�", "��Ƽ��ƽ ����", "�߱�/����Ʈ��", "���", "����", "��Ʈ", "����", "����", "����",
//				"�౸", "ī�� ������Ʈ", "ī�� ����", "Ź��", "�±ǵ�", "�״Ͻ�", "Ʈ���ֽ̾���", "Ʈ������ ü��", "���", "��Ű", "�ڵ庼" };
		
		JComboBox eventBox = new JComboBox<Object>(eventList);
		eventBox.setBounds(515, 205, 235, 40);

		this.add(eventBox);

		// �����Է�
		String countryList[] = { "���ѹα�", "�߱�", "�̱�" };

		JComboBox countryBox = new JComboBox<Object>(countryList);
		countryBox.setBounds(515, 310, 235, 40);
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

				ArrayList<PlayerVO> SL = new ArrayList<PlayerVO>();
				// �ӽ� ���
				System.out.println(name + " / " + event + " / " + country);

				PlayerParser.PlayerSearch(name, event, country, SL);

				for(int i = 0; i < SL.size(); i++) {
					playerContent.setContent(SL.get(i).getCarrier());
					playerContent.setRank(SL.get(i).getRank());
					
					
					System.out.println(SL.get(i).getCarrier() + SL.get(i).getRank());
				};
				
				playerContent.setVisible(true);
				playerContent.repaint();
			}
		});
	}

	private void OutputBox() {
		// picture (���� ����)
		ImageIcon icon = new ImageIcon("./img/player_test.jpg");

		Image playerImg = icon.getImage();
		Image changeImg = playerImg.getScaledInstance(230, 250, Image.SCALE_SMOOTH);

		ImageIcon changeIcon = new ImageIcon(changeImg);

		JLabel playerLabel = new JLabel(changeIcon);

		playerLabel.setBounds(100, 100, 230, 250);
		add(playerLabel);

	}

	private void NewsPrint() {
		playerContent = new PlayerContent();
		playerContent.setBounds(100, 370, 900, 200);

		playerContent.setForeground(Color.black); // Color
		playerContent.setBackground(Color.WHITE);
		playerContent.setOpaque(true);

		this.add(playerContent);
	}
}
