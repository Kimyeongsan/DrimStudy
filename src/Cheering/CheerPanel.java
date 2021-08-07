package Cheering;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CheerPanel extends JPanel {

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
	      
	      //포스트잇
	      JTextField postIt = new JTextField("작성패널에서 작성한 내용");
	      postIt.setBounds(30, 30, 300, 300); //랜덤값으로 변경하기 - 추가필요
	      postIt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	      postIt.setForeground(Color.black); // Color
	      postIt.setOpaque(true);
	      postIt.setHorizontalAlignment(JLabel.CENTER);
	      
	      //포스트잇 색상변경 - 외부패널에서 값가져오기
	      /*
	      switch() { //입력변수를 cheermsgPanel에서 가져오기 필요
	    	  case : //red
	    	    postIt.setBackground(Color.black); // Color
	    	  break;
	    	  case ://yellow
	    	    postIt.setBackground(Color.black); // Color
	    	  break;
	    	  case ://orange
	    	    postIt.setBackground(Color.black); // Color
	    	  break;
	    	  case ://skyblue
	    	    postIt.setBackground(Color.black); // Color
	    	  break;
	    	  case ://green
	    	    postIt.setBackground(Color.black); // Color
	    	  break;
	    	  default:
	    	    postIt.setBackground(Color.black); // Color
	      }

		    
		    //위치도 변경 - 랜덤값
	}*/
	      this.add(postIt);
	}
}
