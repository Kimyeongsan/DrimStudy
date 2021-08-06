package Board;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BoardWritePanel extends JPanel {
	public BoardWritePanel(JFrame frame) {
		super();
		panelInit(frame);
	}
	
	private void panelInit(JFrame frame) {
		// �Խù� �ۼ� ȭ�� �г�
		this.setBackground(new Color(255, 255, 255));
	    this.setBounds(0, 0, 1280, 960);
	    this.setLayout(null);
	    
	    // �Խù� �ۼ� ����
	    JLabel writetitle = new JLabel("�Խù� �ۼ�");
	    writetitle.setBounds(130, 30, 800, 35);
	    writetitle.setFont(new Font("���", Font.BOLD, 30)); // Font
	    writetitle.setForeground(Color.white); // Color
	    writetitle.setBackground(new Color(24, 23, 23));
	    writetitle.setOpaque(true);
	    writetitle.setHorizontalAlignment(JLabel.CENTER);
	    this.add(writetitle);
	    
	    // �ۼ��� ����
	    JLabel writerTxt = new JLabel("�ۼ���");
	    writerTxt.setBounds(130, 100, 100, 40);
	    writerTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
	    writerTxt.setForeground(Color.black); // Color
	    writerTxt.setBackground(new Color(166, 166, 166));
	    writerTxt.setOpaque(true);
	    writerTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(writerTxt);
	    
	    // �ۼ��� �Է�
	    JTextField inputwriter = new JTextField("");
	    inputwriter.setBounds(250, 100, 200, 40);
	    inputwriter.setFont(new Font("���", Font.BOLD, 20)); // Font
	    inputwriter.setForeground(Color.black); // Color
	    inputwriter.setBackground(new Color(255,255,255));
	    inputwriter.requestFocusInWindow();
	    this.add(inputwriter);
	    
	    //�ۼ��� ǥ�� ����
	    JLabel namekindTxt = new JLabel("�ۼ��� ǥ��");
	    namekindTxt.setBounds(500, 100, 120, 40);
	    namekindTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
	    namekindTxt.setForeground(Color.black); // Color
	    namekindTxt.setBackground(new Color(166, 166, 166));
	    namekindTxt.setOpaque(true);
	    namekindTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(namekindTxt);
	    
	    /* ��Ӵٿ�/�޺��ڽ� ��� ���� */
	    
	    //�ۼ� �Ⱓ ����
	    JLabel wridateTxt = new JLabel("�ۼ� �Ⱓ");
	    wridateTxt.setBounds(130, 150, 100, 40);
	    wridateTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
	    wridateTxt.setForeground(Color.black); // Color
	    wridateTxt.setBackground(new Color(166, 166, 166));
	    wridateTxt.setOpaque(true);
	    wridateTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(wridateTxt);
	    
	    /*Ķ���� ��� �߰� ����*/
	    
	    //��й�ȣ ����
	    JLabel pwTxt = new JLabel("��й�ȣ");
	    pwTxt.setBounds(500, 150, 100, 40);
	    pwTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
	    pwTxt.setForeground(Color.black); // Color
	    pwTxt.setBackground(new Color(166, 166, 166));
	    pwTxt.setOpaque(true);
	    pwTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(pwTxt);
	    
	    //��й�ȣ �Է�
	    JTextField inputpw = new JTextField("");
	    inputpw.setBounds(650, 150, 200, 40);
	    inputpw.setFont(new Font("���", Font.BOLD, 20)); // Font
	    inputpw.setForeground(Color.black); // Color
	    inputpw.setBackground(new Color(255,255,255));
	    inputpw.requestFocusInWindow();
	    this.add(inputpw);
	    
	    //���� ����
	    JLabel titleTxt = new JLabel("����");
	    titleTxt.setBounds(130, 200, 100, 40);
	    titleTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
	    titleTxt.setForeground(Color.black); // Color
	    titleTxt.setBackground(new Color(166, 166, 166));
	    titleTxt.setOpaque(true);
	    titleTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(titleTxt);
	    
	    //���� �Է�
	    JTextField inputtitle = new JTextField("");
	    inputtitle.setBounds(250, 200, 600, 40);
	    inputtitle.setFont(new Font("���", Font.BOLD, 20)); // Font
	    inputtitle.setForeground(Color.black); // Color
	    inputtitle.setBackground(new Color(255,255,255));
	    inputtitle.requestFocusInWindow();
	    this.add(inputtitle);
	    
	    //���� ����
	    JLabel contentTxt = new JLabel("����");
	    contentTxt.setBounds(130, 250, 100, 40);
	    contentTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
	    contentTxt.setForeground(Color.black); // Color
	    contentTxt.setBackground(new Color(166, 166, 166));
	    contentTxt.setOpaque(true);
	    contentTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(contentTxt);
	    
	    //���� �Է�
	    JTextField inputcontent = new JTextField("");
	    inputcontent.setBounds(250, 250, 600, 225);
	    inputcontent.setFont(new Font("���", Font.BOLD, 20)); // Font
	    inputcontent.setForeground(Color.black); // Color
	    inputcontent.setBackground(new Color(255,255,255));
	    inputcontent.requestFocusInWindow();
	    this.add(inputcontent);
	    
	    //÷������ ����
	    JLabel fileTxt = new JLabel("÷������");
	    fileTxt.setBounds(130, 500, 100, 40);
	    fileTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
	    fileTxt.setForeground(Color.black); // Color
	    fileTxt.setBackground(new Color(166, 166, 166));
	    fileTxt.setOpaque(true);
	    fileTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(fileTxt);
	    
	    //��� ��ư
	    JButton regisBtn = new JButton("���");
	    regisBtn.setFont(new Font("���", Font.BOLD, 14));
	    regisBtn.setBackground(new Color(217, 217, 217));
	    regisBtn.setBounds(870, 550, 80, 40);
	    regisBtn.setBorderPainted(false);
	    regisBtn.setFocusPainted(false);
	    this.add(regisBtn);
	      
	}
}

