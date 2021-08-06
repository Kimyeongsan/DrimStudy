package regMember;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import regMember.regMemPanel;

public class regMemFrame extends JPanel {
	private JFrame frame;
	private regMemPanel regMemPanel;
	
	JButton regBtn = new JButton("회원가입");
    
	public regMemFrame(JFrame frame) {
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
		regMemPanel = new regMemPanel(frame);

		regMemPanel.setBounds(80, 200, 1100, 600);
		regMemPanel.setBackground(new Color(242, 242, 242));
		regMemPanel.setBorder(null); 
		this.add(regMemPanel);
	}
}