package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BoardPanel1 extends JPanel {

	public BoardPanel1(JFrame frame) {
		super();
		PanelInit(frame);
	}

	private void PanelInit(JFrame frame) {

		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 300);
		this.setLayout(null);


		// Picture1
		JLabel pictureLabel = new JLabel("»çÁø 1");
		pictureLabel.setBounds(40,0,200, 140);

		pictureLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 35)); // Font

		pictureLabel.setForeground(Color.black); // Color
		pictureLabel.setBackground(new Color(166, 166, 166));
		pictureLabel.setOpaque(true);

		pictureLabel.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(pictureLabel);
		
		// Picture2
		JLabel pictureLabel2 = new JLabel("»çÁø 2");
		pictureLabel2.setBounds(270,0,200, 140);

		pictureLabel2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 35)); // Font

		pictureLabel2.setForeground(Color.black); // Color
		pictureLabel2.setBackground(new Color(166, 166, 166));
		pictureLabel2.setOpaque(true);

		pictureLabel2.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(pictureLabel2);
		
		// Picture3
		JLabel pictureLabel3 = new JLabel("»çÁø 3");
		pictureLabel3.setBounds(500,0,200, 140);

		pictureLabel3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 35)); // Font

		pictureLabel3.setForeground(Color.black); // Color
		pictureLabel3.setBackground(new Color(166, 166, 166));
		pictureLabel3.setOpaque(true);

		pictureLabel3.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(pictureLabel3);
		
		// Picture4
		JLabel pictureLabel4 = new JLabel("»çÁø 4");
		pictureLabel4.setBounds(730,0,200, 140);

		pictureLabel4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 35)); // Font

		pictureLabel4.setForeground(Color.black); // Color
		pictureLabel4.setBackground(new Color(166, 166, 166));
		pictureLabel4.setOpaque(true);

		pictureLabel4.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(pictureLabel4);
		
		// Picture5
		JLabel pictureLabel5 = new JLabel("»çÁø 5");
		pictureLabel5.setBounds(960,0,200, 140);

		pictureLabel5.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 35)); // Font

		pictureLabel5.setForeground(Color.black); // Color
		pictureLabel5.setBackground(new Color(166, 166, 166));
		pictureLabel5.setOpaque(true);

		pictureLabel5.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(pictureLabel5);

		
		
	}
}