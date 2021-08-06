package Cheering;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CheerPanel extends JPanel {

	public CheerPanel(JFrame frame) {
		super();
		panelInit(frame);
	}

	private void panelInit(JFrame frame) {
		// 메인 화면 패널
		this.setBackground(new Color(20, 255, 255));
	      this.setBounds(0, 0, 1280, 960);
	      this.setLayout(null);
	      
	      //포스트잇
	      JTextField postIt = new JTextField("작성패널에서 작성한 내용");
	      postIt.setBounds(30, 30, 300, 300);
	      postIt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	      postIt.setForeground(Color.black); // Color
	      postIt.setOpaque(true);
	      postIt.setHorizontalAlignment(JLabel.CENTER);
		    this.add(postIt);
		    
		    //반복
	}
}
