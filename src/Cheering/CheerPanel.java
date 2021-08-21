package Cheering;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Database.cheermsgDB;

public class CheerPanel extends JPanel {

	private cheermsgFrame cheermsgFrame;
	
	public CheerPanel(JFrame frame) {
		super();
		//cheermsgPanel과 연결하기
		panelInit(frame);
	}	
	


	private void panelInit(JFrame frame) {
		// 메인 화면 패널
		  this.setBackground(new Color(20, 255, 255));
	      this.setBounds(0, 0, 1280, 960);
	      this.setLayout(null);
	      cheermsgDB cheermsgDB = new cheermsgDB();
	      JLabel postIT = new JLabel(cheermsgDB.getText(), JLabel.CENTER);
	      
	      cheermsgDB.callCheerMsg();
	      
	      Random rand = new Random();
	      rand.setSeed(System.currentTimeMillis());
	      for (int i = 1; i <= 5; i++) {
	    	  for (int j = 1; j <= 5; j++) {
	            System.out.print(rand.nextInt(100) + " ");
	            postIT.setBounds(i, j, 300, 300);
	        }
	      }
	      postIT.setBounds(30, 30, 300, 300); //랜덤값으로 변경하기 - 추가필요
	      postIT.setFont(new Font("고딕", Font.BOLD, 30)); // Font
	      postIT.setOpaque(true);
	      this.add(postIT);
//	      for(int i = 0;i<3;i++) {
////	      String post = {};
//	      
//	      
//	      
	      
		    //위치도 변경 - 랜덤값
	
	      
	}
	

}
