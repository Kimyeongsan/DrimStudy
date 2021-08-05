package GameInf;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameInfPanel extends JPanel {
	
	public GameInfPanel(JFrame frame) {
		super();
		PanelInit(frame);
		OutBox();
	}

	private void PanelInit(JFrame frame) {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 960);
		this.setLayout(null);

		// Medal Title
		JLabel tilteLabel = new JLabel("¸Þ´Þ ¼øÀ§");
		tilteLabel.setBounds(45, 35, 450, 40);

		tilteLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25)); // Font

		tilteLabel.setForeground(Color.white); // Color
		tilteLabel.setBackground(Color.black);
		tilteLabel.setOpaque(true);

		tilteLabel.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(tilteLabel);
		
		
		// Medal Title
		JLabel tilteLabel1 = new JLabel("DropBox");
		tilteLabel1.setBounds(550, 35, 500, 40); 

		tilteLabel1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25)); // Font

		tilteLabel1.setForeground(Color.white); // Color
		tilteLabel1.setBackground(Color.black);
		tilteLabel1.setOpaque(true);

		tilteLabel1.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(tilteLabel1);
		
		
		// Medal Title
		JLabel tilteLabel2 = new JLabel("ÇÏÀÌ¶óÀÌÆ® °Ë»öÃ¢");
		tilteLabel2.setBounds(550, 315, 500, 40); 

		tilteLabel2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25)); // Font

		tilteLabel2.setForeground(Color.white); // Color
		tilteLabel2.setBackground(Color.black);
		tilteLabel2.setOpaque(true);

		tilteLabel2.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(tilteLabel2);
	}

	private void OutBox() {
		// Medal Picture
//		JLabel MedalImage = new JLabel("»çÁø ¿¹Á¤1");
//		MedalImage.setBounds(45, 95, 450, 480);
//
//		MedalImage.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 35)); // Font
//
//		MedalImage.setForeground(Color.black); // Color
//		MedalImage.setBackground(new Color(166, 166, 166));
//		MedalImage.setOpaque(true);
//
//		MedalImage.setHorizontalAlignment(JLabel.CENTER); // Position
//
//		this.add(MedalImage);
//		
		
		//picture (¼±¼ö »çÁø)
		ImageIcon medalIcon = new ImageIcon("./img/game_test1.PNG");
		
		Image medalImg = medalIcon.getImage();
		Image medal_changeImg = medalImg.getScaledInstance(450, 480, Image.SCALE_SMOOTH);
		
		ImageIcon medal_changeIcon = new ImageIcon(medal_changeImg);
		
		JLabel MedalImage = new JLabel(medal_changeIcon);
		
		MedalImage.setBounds(45, 95, 450, 480);
		add(MedalImage);;
		
		
		// Medal Picture
		JLabel planImage = new JLabel("»çÁø ¿¹Á¤2");
		planImage.setBounds(550, 95, 500, 200);

		planImage.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 35)); // Font

		planImage.setForeground(Color.black); // Color
		planImage.setBackground(new Color(166, 166, 166));
		planImage.setOpaque(true);

		planImage.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(planImage);

		
		// Medal Picture
		JLabel newsImage = new JLabel("»çÁø ¿¹Á¤3");
		newsImage.setBounds(550, 375, 500, 200);

		newsImage.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 35)); // Font

		newsImage.setForeground(Color.black); // Color
		newsImage.setBackground(new Color(166, 166, 166));
		newsImage.setOpaque(true);

		newsImage.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(newsImage);

	}
}
