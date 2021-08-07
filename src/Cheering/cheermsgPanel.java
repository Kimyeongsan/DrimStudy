package Cheering;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class cheermsgPanel extends JPanel {

	
	int count =0;
	
	public cheermsgPanel(JFrame frame) {
		super();
		panelInit(frame);
	}

	private void panelInit(JFrame frame) {
		
		// ���� ȭ�� �г�
		this.setBackground(new Color(255, 255, 255));
	    this.setBounds(0, 0, 1280, 960);
	    this.setLayout(null);
	    
	    
	    // Title
 		JLabel tilteLabel = new JLabel("���� �޽��� �����");
 		tilteLabel.setBounds(300, 40, 480, 40);

 		tilteLabel.setFont(new Font("���� ���", Font.BOLD, 24)); // Font

 		tilteLabel.setForeground(Color.white); // Color
 		tilteLabel.setBackground(Color.black);
 		tilteLabel.setOpaque(true);

 		tilteLabel.setHorizontalAlignment(JLabel.CENTER); // Position

 		this.add(tilteLabel);
 		
 		
 	    // �����ۼ�
 		/*
		JLabel content = new JLabel("�����ۼ�");
		content.setBounds(330, 110, 420, 420);

		content.setFont(new Font("���� ���", Font.BOLD, 15)); // Font

		content.setForeground(Color.black); // Color
		content.setBackground(new Color(166, 166, 166));
		content.setOpaque(true);

		content.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(content);
		*/
		JTextField content = new JTextField("�����ۼ�");
		content.setBounds(330, 110, 420, 420);
		content.setFont(new Font("���� ���", Font.BOLD, 15)); // Font

		content.setForeground(Color.black); // Color
		content.setBackground(new Color(166, 166, 166));
		content.setOpaque(true);
		content.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(content);
		
		content.addMouseListener(new MouseAdapter(){
	          @Override
	          public void mouseClicked(MouseEvent e){
	             content.setText("");
	          }
	    });
		
		
		// input ����� ��� (�����޽��� �ۼ�)
		// ��Ϲ�ư
		JButton btnPostcheer = new JButton("���");
		btnPostcheer.setBounds(690, 540, 90, 34);
		btnPostcheer.setFont(new Font("���� ���", Font.BOLD, 16)); // Font
		btnPostcheer.setBackground(new Color(230,230,230));
		btnPostcheer.setForeground(Color.black);
		btnPostcheer.setBorderPainted(false);
	    btnPostcheer.setFocusPainted(false);
	    btnPostcheer.setBorderPainted(true);
		
		this.add(btnPostcheer);
				
				
		// �����ư ������
		btnPostcheer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String postCheer;

				postCheer = (String) content.getText();
				
				// �ӽ� ���
				System.out.println(postCheer);
				
			}
		});

		//��ư�� mainframe���� �ű�ų� ��ư���� cheerpanel�� �ټ��ִ� ���!!�ФФ�
		
		// ���� ���� ��ư
		JButton btnChangeColor = new JButton("���� ����");
		btnChangeColor.setBounds(110, 150, 100, 30);
		btnChangeColor.setFont(new Font("���� ���", Font.BOLD, 12)); // Font
		btnChangeColor.setBackground(new Color(242,242,242));
		btnChangeColor.setForeground(Color.black);
		btnChangeColor.setBorderPainted(false);
	    btnChangeColor.setFocusPainted(false);
	    btnChangeColor.setBorderPainted(true);
		
		this.add(btnChangeColor);
		
		JButton redbtn = new JButton("");
		JButton yellowbtn = new JButton("");
		JButton orangebtn = new JButton("");
		JButton skybluebtn = new JButton("");
		JButton greenbtn = new JButton("");
		JButton whitebtn = new JButton("");
		
		redbtn.setBounds(148, 200, 20, 28);
		redbtn.setBackground(new Color(247,146,129));
		redbtn.setFocusPainted(false);
		redbtn.setBorderPainted(false);
		redbtn.setVisible(false);
		
		yellowbtn.setBounds(148, 240, 20, 28);
		yellowbtn.setBackground(new Color(255,255,0));
		yellowbtn.setFocusPainted(false);
		yellowbtn.setBorderPainted(false);
		yellowbtn.setVisible(false);
		
		orangebtn.setBounds(148, 280, 20, 28);
		orangebtn.setBackground(new Color(255,192,0));
		orangebtn.setFocusPainted(false);
		orangebtn.setBorderPainted(false);
		orangebtn.setVisible(false);
		
		skybluebtn.setBounds(148, 320, 20, 28);
		skybluebtn.setBackground(new Color(105,216,255));
		skybluebtn.setFocusPainted(false);
		skybluebtn.setBorderPainted(false);
		skybluebtn.setVisible(false);
		
		greenbtn.setBounds(148, 360, 20, 28);
		greenbtn.setBackground(new Color(85,241,59));
		greenbtn.setFocusPainted(false);
		greenbtn.setBorderPainted(false);
		greenbtn.setVisible(false);
		
		whitebtn.setBounds(148, 400, 20, 28);
		whitebtn.setBackground(new Color(255,255,255));
		whitebtn.setFocusPainted(false);
		whitebtn.setBorderPainted(false);
		whitebtn.setVisible(false);
		
		this.add(redbtn);
		this.add(yellowbtn);
		this.add(orangebtn);
		this.add(skybluebtn);
		this.add(greenbtn);
		this.add(whitebtn);
		

		
		redbtn.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 content.setBackground(new Color(247,146,129));
	         }
	    });
		
		yellowbtn.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 content.setBackground(new Color(255,255,0));
	         }
	    });
		
		orangebtn.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 content.setBackground(new Color(255,192,0));
	         }
	    });
		
		skybluebtn.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 content.setBackground(new Color(105,216,255));
	         }
	    });
		
		greenbtn.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 content.setBackground(new Color(85,241,59));
	         }
	    });
		
		whitebtn.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 content.setBackground(new Color(166, 166, 166));
	         }
	    });
		
		btnChangeColor.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 if(count==0) {
	        		redbtn.setVisible(true);
	 	            yellowbtn.setVisible(true);
	 	            orangebtn.setVisible(true);
	 	            skybluebtn.setVisible(true);
	 	            greenbtn.setVisible(true);
	 	            whitebtn.setVisible(true);
	 	            count=1;
	        	 }
	        	 else if(count==1) {
	        		 redbtn.setVisible(false);
	 	             yellowbtn.setVisible(false);
	 	             orangebtn.setVisible(false);
	 	             skybluebtn.setVisible(false);
	 	             greenbtn.setVisible(false);
	 	             whitebtn.setVisible(false);
	 	             count=0;
	        	 }
	         }
	      });
		
		
        btnChangeColor.addMouseListener(new java.awt.event.MouseAdapter() {
          public void mouseEntered(java.awt.event.MouseEvent evt) {
             btnChangeColor.setBackground(Color.black);
             btnChangeColor.setForeground(Color.white);
             //player_Btn.setBorderPainted(true);
          }
          public void mouseExited(java.awt.event.MouseEvent evt) {
         	 btnChangeColor.setBackground(new Color(242,242,242));
             btnChangeColor.setForeground(Color.black);
         }
        });
		
	}
}
