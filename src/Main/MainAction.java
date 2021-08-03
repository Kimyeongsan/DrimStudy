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
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1000, 600);
		
		frame.getContentPane().add(this);
		this.setLayout(null);

		// ���� ȭ�� ��
		JLabel tilteLabel = new JLabel("Drim Olympic");
		tilteLabel.setFont(new Font("Arial", Font.BOLD, 35));
		tilteLabel.setForeground(new Color(0, 35, 110));
		tilteLabel.setHorizontalAlignment(JLabel.CENTER);
		tilteLabel.setBounds(70, 4, 850, 40);
		tilteLabel.setBackground(new Color(0, 0, 0));
		this.add(tilteLabel);

	}
}
