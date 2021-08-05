package Player;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PlayerImg extends JPanel{
	BufferedImage img;

	public PlayerImg() {
		try {
			img = ImageIO.read(new File("img/player_test.jpg"));
		}catch(IOException e) {
		}
	}
	public void paint(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img,0,0,null);
	}
}
