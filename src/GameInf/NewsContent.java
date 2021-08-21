package GameInf;

import java.awt.Color;
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
	
	

//    private void drawString(Graphics g, String text, int x, int y) {
//        for (String line : text.split("했다"))
//            g.drawString(line, x, y += g.getFontMetrics().getHeight());
//    }

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		g.drawString(Fd, 10, 50);

		g.setColor(Color.BLUE);
		g.drawString(Ud, 10, 80);
		
//		try {
//			Image img = new ImageIcon(new URL(
//					"http://images.khan.co.kr/article/2021/08/20/l_2021082002001057600222692.jpg"))
//							.getImage(); // URL을 통해 이미지를 받아온다.
//			
//			Image changeImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
//			
//			g.drawImage(changeImg, 0, 0, this); // 이미지를 textarea에 뿌립니다.
//
//		} catch (Exception e) {
//		}


	}

}
