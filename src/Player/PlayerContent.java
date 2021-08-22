package Player;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PlayerContent  extends JPanel {

		String Fd = " ";
		//String Ud = " ";
		//String Zd = " ";

		public void setFd(String x) {
			this.Fd = x;
		}

//		public void setUd(String y) {
//			this.Ud = y;
//		}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		g.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15)); // Font
		g.drawString(Fd, 10, 30);

		//g.setColor(Color.BLACK);
		//g.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15)); // Font

//		try {
//			//Image img = new ImageIcon(new URL(Zd)).getImage();
//
//			//g.drawImage(img, 10, 50, 480, 130, this);
//
//		} catch (Exception e) {
//		}
	}

}