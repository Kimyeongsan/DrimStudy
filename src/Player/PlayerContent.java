package Player;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PlayerContent extends JPanel {

	String Content = "";
	String Rank = "";
	
	ArrayList<String> al = new ArrayList<String>();
	
	public void setContent(String x) {
		this.Content = x;
		
		al.add(Content);
		System.out.println(al);
	}

	public void setRank(String y) {
		this.Rank = y;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int dayX = 20;// �ϴ� �ϼ� �� x��ǥ ����.
		
		for (int i = 0; i <= 3; i++) {
			
			g.setColor(Color.BLACK);
			g.setFont(new Font("���� ���", Font.BOLD, 15)); // Font
			g.drawString(al + ": 1��", 10, dayX);// ����,x��ǥ,y��ǥ
			dayX += 25;
		}

	}

}