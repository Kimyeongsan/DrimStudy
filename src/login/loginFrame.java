package login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class loginFrame extends JPanel {
	private JFrame frame;
	private loginPanel loginPanel;
	private regMemPanel regMemPanel;
	
	JButton regBtn = new JButton("회원가입");
    
	public loginFrame(JFrame frame) {
		super();
		FrameInit(frame);
		PanelInit();
		regMemPanel.setVisible(false);
		loginPanel.setVisible(true);
		
		regBtn.setVisible(true);
	}

	private void FrameInit(JFrame frame) {

		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 960);

		frame.getContentPane().add(this);
		this.setLayout(null);
	}

	private void PanelInit() {
		loginPanel = new loginPanel(frame);
		regMemPanel = new regMemPanel(frame);

		loginPanel.setBounds(80, 200, 1100, 600);
		loginPanel.setBackground(new Color(242, 242, 242));
		loginPanel.setBorder(null); 
		regMemPanel.setBounds(80, 200, 1100, 600);
		regMemPanel.setBackground(new Color(242, 242, 242));
		regMemPanel.setBorder(null); 
		//regMemPanel.setVisible(false);
		
		regBtn.setFont(new Font("고딕", Font.BOLD, 14));
	    regBtn.setBackground(new Color(217, 217, 217));
	    regBtn.setBounds(700, 600, 100, 40);
	    regBtn.setBorderPainted(false);
	    regBtn.setFocusPainted(false);
	    this.add(regBtn);
	      
	      regBtn.addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent e) {
	  			loginPanel.setVisible(false);
	  			regMemPanel.setVisible(true);
	  			
	  			regBtn.setVisible(false);
	  		}
	  	});
		this.add(loginPanel);
		this.add(regMemPanel);
	}
}