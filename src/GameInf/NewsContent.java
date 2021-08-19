package GameInf;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class NewsContent extends JPanel {

	public NewsContent(JFrame frame, SearchDAO s) {
		super();
		panelInit(frame);
		NewsContent(s);
	}

	private void panelInit(JFrame frame) {

		this.setBackground(new Color(225, 240, 255));
		this.setBounds(0, 0, 636, 360);
		frame.getContentPane().add(this);
		this.setLayout(null);
	}
	
	private void NewsContent(SearchDAO s) {
		
	}
	
}
