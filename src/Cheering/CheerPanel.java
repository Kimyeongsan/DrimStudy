package Cheering;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheerPanel extends JPanel {

	public CheerPanel(JFrame frame) {
		super();
		panelInit(frame);
	}

	private void panelInit(JFrame frame) {
		// ���� ȭ�� �г�
		this.setBackground(Color.red);
		this.setBounds(0, 0, 1280, 960);
		
		frame.getContentPane().add(this);
		
		this.setLayout(null);

	}
}
