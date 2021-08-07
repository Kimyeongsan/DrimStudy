
package myPage;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class myPagePanel extends JPanel {
	JTextField introInput = new JTextField("자기소개");

	public myPagePanel(JFrame frame) {
	      super();
	      panelInit(frame);
	      
	        //자기소개 입력
			introInput.setBounds(330, 170, 605, 200);
			introInput.setFont(new Font("고딕", Font.BOLD, 20)); // Font
			introInput.setForeground(Color.black); // Color
			introInput.setOpaque(true);
			introInput.setHorizontalAlignment(JLabel.CENTER);
			introInput.addMouseListener(new MouseAdapter(){
		          @Override
		          public void mouseClicked(MouseEvent e){
		        	  introInput.setText("");
		          }
		      });
		    this.add(introInput, FlowLayout.CENTER);
	   }
	
	private void panelInit(JFrame frame) {
	      // myPage 화면 패널
	      this.setBackground(new Color(255, 255, 255));
	      this.setBounds(0, 0, 1280, 960);
	      this.setLayout(null);

	      //로그인 글자
	      JLabel IDtitle = new JLabel("마이페이지");
	      IDtitle.setBounds(130, 50, 800, 35);
	      IDtitle.setFont(new Font("고딕", Font.BOLD, 30)); // Font
	      IDtitle.setForeground(Color.white); // Color
	      IDtitle.setBackground(new Color(24, 23, 23));
	      IDtitle.setOpaque(true);
	      IDtitle.setHorizontalAlignment(JLabel.CENTER);
	      this.add(IDtitle);

	  		JLabel nicInput = new JLabel("닉네임");
	  		nicInput.setBounds(330, 120, 200, 40);
	  		nicInput.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	  		nicInput.setForeground(Color.black); // Color
	  		nicInput.setBackground(new Color(166, 166, 166));
	  		nicInput.setOpaque(true);
	  		nicInput.setHorizontalAlignment(JLabel.CENTER);
		    this.add(nicInput);
	  		
	  	   // 이름 입력
		    //DB 회원 - 닉네임 불러오기
			JTextField NicInput = new JTextField("닉네임");
			NicInput.setBounds(535, 120, 400, 40);
			NicInput.setFont(new Font("고딕", Font.BOLD, 20)); // Font
			NicInput.setForeground(Color.black); // Color
			NicInput.setOpaque(true);
			NicInput.setHorizontalAlignment(JLabel.CENTER);
		    this.add(NicInput);
		    
		  //완료 버튼
		      JButton introBtn = new JButton("완료");
		      introBtn.setFont(new Font("고딕", Font.BOLD, 14));
		      introBtn.setBackground(new Color(217, 217, 217));
		      introBtn.setBounds(777, 400, 80, 40);
		      introBtn.setBorderPainted(false);
		      introBtn.setFocusPainted(false);
		      this.add(introBtn);
		      
		      int cnt = 0;

			
		    
		    //사진 등록
			ImageIcon icon = new ImageIcon("./img/header.png");
			
			Image regImg = icon.getImage();
			Image changeImg = regImg.getScaledInstance(200, 250, Image.SCALE_SMOOTH);
			ImageIcon changeIcon = new ImageIcon(changeImg);
			
			JLabel regLabel = new JLabel(changeIcon);
			
			regLabel.setBounds(130, 120, 190, 250);
			add(regLabel);;

			
			introBtn.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	 String inIntro = introInput.getText();
		 			 System.out.println(inIntro);
		 			 
		 			JOptionPane.showMessageDialog
		               (null, "등록되었습니다.", "Success!", JOptionPane.INFORMATION_MESSAGE);
		         }
			});
	}
}
