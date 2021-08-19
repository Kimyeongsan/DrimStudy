package Board;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Database.boardwriteDB;


public class boardwritePanel extends JPanel {

	
	int count = 0;
	String UserID, wridate, pw, title, file;
	JTextField content;
	JComboBox<String> writer;
	
	public boardwritePanel(JFrame frame) {
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
	    JLabel UserIDTxt = new JLabel("�ۼ���");
	    UserIDTxt.setBounds(130, 100, 100, 40);
	    UserIDTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
	    UserIDTxt.setForeground(Color.black); // Color
	    UserIDTxt.setBackground(new Color(166, 166, 166));
	    UserIDTxt.setOpaque(true);
	    UserIDTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(UserIDTxt);
	    
	    // �ۼ��� �Է�
	    JTextField inputUserID = new JTextField("");
	    inputUserID.setBounds(250, 100, 200, 40);
	    inputUserID.setFont(new Font("���", Font.BOLD, 20)); // Font
	    inputUserID.setForeground(Color.black); // Color
	    inputUserID.setBackground(new Color(255,255,255));
	    inputUserID.requestFocusInWindow();
	    this.add(inputUserID);
	    
	    //�ۼ��� ǥ�� ����
	    JLabel writerTxt = new JLabel("�ۼ��� ǥ��");
	    writerTxt.setBounds(500, 100, 120, 40);
	    writerTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
	    writerTxt.setForeground(Color.black); // Color
	    writerTxt.setBackground(new Color(166, 166, 166));
	    writerTxt.setOpaque(true);
	    writerTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(writerTxt);
	    
	    //�ۼ��� ǥ�� ���� ����(��ӹڽ�)
	    String[] optionsToChoose = {"�̸�", "�г���", "�͸�"};
	    JComboBox<String> writeroptions = new JComboBox<>(optionsToChoose);
	    writeroptions.setBounds(650, 100, 200, 40);
	    JLabel jLabel = new JLabel();
	    jLabel.setBounds(90, 100, 400, 100);
	    this.add(writeroptions);
	    
	    //�ۼ� �Ⱓ ����
	    JLabel wridateTxt = new JLabel("�ۼ� �Ⱓ");
	    wridateTxt.setBounds(130, 150, 100, 40);
	    wridateTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
	    wridateTxt.setForeground(Color.black); // Color
	    wridateTxt.setBackground(new Color(166, 166, 166));
	    wridateTxt.setOpaque(true);
	    wridateTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(wridateTxt);
		
	  //�ۼ� �Ⱓ �Է�
	    JTextField inputwridate = new JTextField("");
	    inputwridate.setBounds(250, 150, 200, 40);
	    inputwridate.setFont(new Font("���", Font.BOLD, 20)); // Font
	    inputwridate.setForeground(Color.black); // Color
	    inputwridate.setBackground(new Color(255,255,255));
	    inputwridate.requestFocusInWindow();
	    this.add(inputwridate);
	    
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
	    
	    //÷������ ���ε�
	    JButton fileBtn = new JButton("���ε�");
	    fileBtn.setFont(new Font("���", Font.BOLD, 14));
	    fileBtn.setBackground(new Color(217, 217, 217));
	    fileBtn.setBounds(250, 510, 80, 30);
	    fileBtn.setBorderPainted(false);
	    fileBtn.setFocusPainted(false);
	    this.add(fileBtn);
	    
	    //÷������ ����ǥ�� (��� �����ϸ鼭 �Ϻ� ���� ����)
	    JTextField inputfile = new JTextField("");
	    inputfile.setBounds(340, 510, 500, 30);
	    inputfile.setFont(new Font("���", Font.BOLD, 20)); // Font
	    inputfile.setForeground(Color.black); // Color
	    inputfile.setBackground(new Color(255,255,255));
	    inputfile.requestFocusInWindow();
	    this.add(inputfile);
	    
	    //��� ��ư
	    JButton regisBtn = new JButton("���");
	    regisBtn.setFont(new Font("���", Font.BOLD, 14));
	    regisBtn.setBackground(new Color(217, 217, 217));
	    regisBtn.setBounds(870, 550, 80, 40);
	    regisBtn.setBorderPainted(false);
	    regisBtn.setFocusPainted(false);
	    this.add(regisBtn);
	    
	 // �����ư ������
		 regisBtn.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				
			 	//connectDB cDB = new connectDB();
			 	String regis;
				regis = (String) inputcontent.getText();
			 	
			 	//MsgVO data = new MsgVO();
			 	ArrayList<boardwriteVO> list = new ArrayList<boardwriteVO>(); // ���ͼ��͸� �޾��� �迭�� ���� �������
			 	boardwriteVO data = new boardwriteVO(); // �ش� Ŭ������ ȣ��
			 	
			 	data.setUserID(UserID);
			 	data.setwriter(writer);
			 	data.setwridate(wridate);
			 	data.setpw(pw);
			 	data.settitle(title);
			 	data.setcontent(content);
			 	data.setfile(file);
			 	
			 	list.add(data); // data�� list�� ���������
			 	
			 	boardwriteDB s = new boardwriteDB(); // DB�Լ��� ȣ��
			 	s.uploadDB(data); // �ش� �Լ��� data�� ������
			 	
			 }
	      });
	}
	
}

