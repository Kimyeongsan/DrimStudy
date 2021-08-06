package myPage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class myPageFrame extends JPanel {
	private JFrame frame;
	private myPagePanel myPagePanel;

	public myPageFrame(JFrame frame) {
		super();
		FrameInit(frame);
		PanelInit();
	}
	private void FrameInit(JFrame frame) {

		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 960);

		frame.getContentPane().add(this);
		this.setLayout(null);
	}

	private void PanelInit() {
		myPagePanel = new myPagePanel(frame);

		myPagePanel.setBounds(130, 230, 1050, 520);
		myPagePanel.setBackground(new Color(242, 242, 242));
		myPagePanel.setBorder(null); 

		this.add(myPagePanel);
	}
}