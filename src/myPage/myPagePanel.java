
package myPage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class myPagePanel extends JPanel {
	public myPagePanel(JFrame frame) {
	      super();
	      panelInit(frame);
	     // OutputBox();
	   }
	private void panelInit(JFrame frame) {
	      // myPage ȭ�� �г�
	      this.setBackground(new Color(255, 255, 255));
	      this.setBounds(0, 0, 1280, 960);
	      this.setLayout(null);

	      //�α��� ����
	      JLabel IDtitle = new JLabel("����������");
	      IDtitle.setBounds(130, 50, 800, 35);
	      IDtitle.setFont(new Font("���", Font.BOLD, 30)); // Font
	      IDtitle.setForeground(Color.white); // Color
	      IDtitle.setBackground(new Color(24, 23, 23));
	      IDtitle.setOpaque(true);
	      IDtitle.setHorizontalAlignment(JLabel.CENTER);
	      this.add(IDtitle);

	  		JLabel nicInput = new JLabel("�г���");
	  		nicInput.setBounds(200, 250, 100, 40);
	  		nicInput.setFont(new Font("���", Font.BOLD, 20)); // Font
	  		nicInput.setForeground(Color.black); // Color
	  		nicInput.setBackground(new Color(166, 166, 166));
	  		nicInput.setOpaque(true);
	  		nicInput.setHorizontalAlignment(JLabel.CENTER);
		    this.add(nicInput);
	  		
	  	// �̸� �Է�
			JTextField nameInput = new JTextField("�г���");
			nameInput.setBounds(250, 180, 100, 40);
			nameInput.setFont(new Font("���", Font.BOLD, 20)); // Font
			nameInput.setForeground(Color.black); // Color
			nameInput.setBackground(new Color(166, 166, 166));
			nameInput.setOpaque(true);
			nameInput.setHorizontalAlignment(JLabel.CENTER);
		    this.add(nameInput);
			
			//id ����
			JTextField introInput = new JTextField("�ڱ�Ұ�");
			introInput.setBounds(250, 180, 100, 40);
			introInput.setFont(new Font("���", Font.BOLD, 20)); // Font
			introInput.setForeground(Color.black); // Color
			introInput.setBackground(new Color(166, 166, 166));
			introInput.setOpaque(true);
			introInput.setHorizontalAlignment(JLabel.CENTER);
		    this.add(introInput);
		    
		  //��� ��ư
		      JButton writeBtn = new JButton("����");
		      writeBtn.setFont(new Font("���", Font.BOLD, 14));
		      writeBtn.setBackground(new Color(217, 217, 217));
		      writeBtn.setBounds(600, 330, 80, 40);
		      writeBtn.setBorderPainted(false);
		      writeBtn.setFocusPainted(false);
		      this.add(writeBtn);
		      
		    //��� ��ư
		      JButton quitBtn = new JButton("ȸ��Ż��");
		      quitBtn.setFont(new Font("���", Font.BOLD, 14));
		      quitBtn.setBackground(new Color(217, 217, 217));
		      quitBtn.setBounds(600, 330, 80, 40);
		      quitBtn.setBorderPainted(false);
		      quitBtn.setFocusPainted(false);
		      this.add(quitBtn);
		      
	      }
	}
