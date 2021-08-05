
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
	      // �α��� ȭ�� �г�
	      this.setBackground(new Color(255, 255, 255));
	      this.setBounds(0, 0, 1280, 960);
	      this.setLayout(null);

	      //�α��� ����
	      JLabel IDtitle = new JLabel("�α���");
	      IDtitle.setBounds(130, 50, 800, 35);
	      IDtitle.setFont(new Font("���", Font.BOLD, 30)); // Font
	      IDtitle.setForeground(Color.white); // Color
	      IDtitle.setBackground(new Color(24, 23, 23));
	      IDtitle.setOpaque(true);
	      IDtitle.setHorizontalAlignment(JLabel.CENTER);
	      this.add(IDtitle);

	      //id ����
	      JLabel idTxt = new JLabel("ID");
	      idTxt.setBounds(250, 180, 100, 40);
	      idTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
	      idTxt.setForeground(Color.black); // Color
	      idTxt.setBackground(new Color(166, 166, 166));
	      idTxt.setOpaque(true);
	      idTxt.setHorizontalAlignment(JLabel.CENTER);
	      this.add(idTxt);
	}
}