package Cheering;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CheerPanel extends JPanel {

	public CheerPanel(JFrame frame) {
		super();
		//cheermsgPanel�� �����ϱ�
		panelInit(frame);
	}

	private void panelInit(JFrame frame) {
		// ���� ȭ�� �г�
		  this.setBackground(new Color(20, 255, 255));
	      this.setBounds(0, 0, 1280, 960);
	      this.setLayout(null);
	      
	      //����Ʈ��
	      JTextArea postIt = new JTextArea("");
	      postIt.setLineWrap(true);
	      postIt.setBounds(30, 30, 300, 300); //���������� �����ϱ� - �߰��ʿ�
	      postIt.setFont(new Font("���", Font.BOLD, 30)); // Font
	      postIt.setForeground(Color.black); // Color
	      postIt.setOpaque(true);
	      //����Ʈ�� ���󺯰� - �ܺ��гο��� ����������
	      /*
	      switch() { //�Էº����� cheermsgPanel���� �������� �ʿ�
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

		    //��ġ�� ���� - ������
	}*/
	      this.add(postIt);
	}
}
