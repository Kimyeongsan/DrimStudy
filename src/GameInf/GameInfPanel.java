package GameInf;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameInfPanel extends JPanel {

	public GameInfPanel(JFrame frame) {
		super();
		panelInit(frame);
	}

	private void panelInit(JFrame frame) {
		// ���� ȭ�� �г�
		this.setBackground(Color.blue);
		this.setBounds(0, 0, 1280, 960);
		
		frame.getContentPane().add(this);
		
		this.setLayout(null);

	}
}
