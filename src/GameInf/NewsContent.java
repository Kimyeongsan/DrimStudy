package GameInf;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class NewsContent extends JPanel {

	String Fd = " ";
	String Ud = " ";
	String Zd = " ";

	public void setFd(String x) {
		this.Fd = x;
	}

	public void setUd(String y) {
		this.Ud = y;
	}

	public void setZd(String z) {
		this.Zd = z;
	}


	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		g.drawString(Fd, 10, 50);

		g.setColor(Color.BLUE);
		g.drawString(Ud, 10, 80);
		
		try {
		Image img = new ImageIcon(new URL(Zd)).getImage(); // URL을 통해 이미지를 받아온다.
		
		Image changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		
		g.drawImage(changeImg, 0, 0, this); // 이미지를 textarea에 뿌립니다.

	} catch (Exception e) {
	}
	}

}
