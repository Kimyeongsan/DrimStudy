package Player;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlayerPanel extends JPanel {

	public PlayerPanel(JFrame frame) {
		super();
		PanelInit(frame);
		InputBox();
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

		// Picture
		JLabel pictureLabel = new JLabel("�����Ұ�");
		pictureLabel.setBounds(100, 100, 230, 250);

		pictureLabel.setFont(new Font("���� ���", Font.BOLD, 35)); // Font

		pictureLabel.setForeground(Color.black); // Color
		pictureLabel.setBackground(new Color(166, 166, 166));
		pictureLabel.setOpaque(true);

		pictureLabel.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(pictureLabel);

		// List Label

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

		// ��� ����
		JLabel content = new JLabel("��� ����");
		content.setBounds(100, 370, 900, 200);

		content.setFont(new Font("���� ���", Font.BOLD, 15)); // Font

		content.setForeground(Color.black); // Color
		content.setBackground(new Color(166, 166, 166));
		content.setOpaque(true);

		content.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(content);

	}

	private void InputBox() {

		// �̸� �Է�
		JTextField t1 = new JTextField("���� �̸��� �Է��Ͻÿ�.");
		t1.setBounds(515, 100, 240, 40);

		this.add(t1);


		// ���� �Է�
		String eventList[] = { "�౸", "�߱�", "�豸" };

		JComboBox eventBox = new JComboBox<Object>(eventList);
		eventBox.setBounds(515, 170, 235, 40);

		this.add(eventBox);

		// �����Է�
		String countryList[] = { "���ѹα�", "�߱�", "�̱�" };

		JComboBox countryBox = new JComboBox<Object>(countryList);
		countryBox.setBounds(515, 240, 235, 40);

		this.add(countryBox);

		// �޴� �Է�      <- �׳� ��¹����� �ٲ� ����
		JTextField t2 = new JTextField("�޴� ���� ���� ����");
		t2.setBounds(515, 310, 240, 40);

		this.add(t2);
		
		
		// input ����� ���
		JButton btnCompareSet = new JButton("����");
		btnCompareSet.setBounds(870, 310, 130, 40);
		
		this.add(btnCompareSet);
		
		
		// �����ư ������
		btnCompareSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name, event, country, medalCount;

				name = (String) t1.getText();
				event = (String) eventBox.getSelectedItem();
				country = (String) countryBox.getSelectedItem();
				medalCount = (String) t2.getText();
				
				// �ӽ� ���
				System.out.println(name + " / " + event + " / " + country + " / " + medalCount);

			}
		});
		
	}
}
