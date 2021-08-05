package Board;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class BoardWrite extends JPanel {

	public BoardWrite(JFrame frame) {
		super();
		panelInit(frame);
	}

	private void panelInit(JFrame frame) {
		// 메인 화면 패널
		this.setBackground(Color.red);
		this.setBounds(0, 0, 1280, 960);
		
		frame.getContentPane().add(this); 
		frame.setLayout(null);

	}
}
