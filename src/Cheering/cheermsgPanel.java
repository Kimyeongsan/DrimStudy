package Cheering;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class cheermsgPanel extends JPanel {

	public cheermsgPanel(JFrame frame) {
		super();
		panelInit(frame);
	}

	private void panelInit(JFrame frame) {
		// ���� ȭ�� �г�
		this.setBackground(new Color(255, 255, 255));
	    this.setBounds(0, 0, 1280, 960);
	    this.setLayout(null);
	}
}
