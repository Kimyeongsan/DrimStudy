package Main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainAction extends JPanel {
	private JButton btnNewButton;
	private JButton btnGraphType;
	private JComboBox main_month, main_date, AreaBox;

	public MainAction(JFrame frame) {
		super();
		panelInit(frame);
	}

	private void panelInit(JFrame frame) {
		// ���� ȭ�� �г�
//		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 960);
		
		frame.getContentPane().add(this);
		this.setLayout(null);

		// ���� ȭ�� ��
		JLabel tilteLabel = new JLabel("Drim Olympic");
		tilteLabel.setFont(new Font("Arial", Font.BOLD, 35));
		
		tilteLabel.setForeground(Color.white);
		tilteLabel.setBackground(new Color(51, 63, 80));
		
		tilteLabel.setOpaque(true);
		
		tilteLabel.setHorizontalAlignment(JLabel.CENTER);
		tilteLabel.setBounds(0, 50, 1280, 60);
		this.add(tilteLabel);
		
		JLabel underLabel = new JLabel("�� �帲�ý�  �� ������ ���� ������Ʈ");
		underLabel.setFont(new Font("�������",Font.PLAIN,13));
		
		underLabel.setForeground(Color.black);
		underLabel.setBackground(new Color(204,204,204));
		
		underLabel.setOpaque(true);
		
		underLabel.setHorizontalAlignment(JLabel.CENTER);
		underLabel.setBounds(0, 882, 1280, 40);
		this.add(underLabel);

	}
}
