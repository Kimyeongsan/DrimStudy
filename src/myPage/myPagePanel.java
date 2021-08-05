
package myPage;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class myPagePanel extends JPanel {
	public myPagePanel(JFrame frame) {
	      super();
	      panelInit(frame);
	   }
	private void panelInit(JFrame frame) {
	      // 로그인 화면 패널
	      this.setBackground(new Color(255, 255, 255));
	      this.setBounds(0, 0, 1280, 960);
	      this.setLayout(null);

	      //로그인 글자
	      JLabel IDtitle = new JLabel("로그인");
	      IDtitle.setBounds(130, 50, 800, 35);
	      IDtitle.setFont(new Font("고딕", Font.BOLD, 30)); // Font
	      IDtitle.setForeground(Color.white); // Color
	      IDtitle.setBackground(new Color(24, 23, 23));
	      IDtitle.setOpaque(true);
	      IDtitle.setHorizontalAlignment(JLabel.CENTER);
	      this.add(IDtitle);

	      //id 글자
	      JLabel idTxt = new JLabel("ID");
	      idTxt.setBounds(250, 180, 100, 40);
	      idTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	      idTxt.setForeground(Color.black); // Color
	      idTxt.setBackground(new Color(166, 166, 166));
	      idTxt.setOpaque(true);
	      idTxt.setHorizontalAlignment(JLabel.CENTER);
	      this.add(idTxt);
	}
}