package Board;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Font;

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
	JTextField UserID, writer, wridate, pw, title, content, file;
	/*JComboBox<String> writer;*/
	
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
	    UserID = new JTextField("");
	    UserID.setBounds(250, 100, 200, 40);
	    UserID.setFont(new Font("���", Font.BOLD, 20)); // Font
	    UserID.setForeground(Color.black); // Color
	    UserID.setBackground(new Color(255,255,255));
	    UserID.setOpaque(true);
	    UserID.setHorizontalAlignment(JLabel.CENTER);
	    this.add(UserID);
	    
	    UserID.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		UserID.setText("");
	    	}
	    });
	    
	    //�ۼ��� ǥ�� ����
	    JLabel writerTxt = new JLabel("�ۼ��� ǥ��");
	    writerTxt.setBounds(500, 100, 120, 40);
	    writerTxt.setFont(new Font("���", Font.BOLD, 20)); // Font
	    writerTxt.setForeground(Color.black); // Color
	    writerTxt.setBackground(new Color(166, 166, 166));
	    writerTxt.setOpaque(true);
	    writerTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(writerTxt);
	    
	    writer = new JTextField("");
	    writer.setBounds(650, 100, 200, 40);
	    writer.setFont(new Font("���", Font.BOLD, 20)); // Font
	    writer.setForeground(Color.black); // Color
	    writer.setBackground(new Color(255,255,255));
	    writer.setOpaque(true);
	    writer.setHorizontalAlignment(JLabel.CENTER);
	    this.add(writer);
	    
	    writer.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		writer.setText("");
	    	}
	    });
	    
	    //�ۼ��� ǥ�� ���� ����(��ӹڽ�)
	    /*
	    String[] optionsToChoose = {"�̸�", "�г���", "�͸�"};
	    JComboBox<String> writer = new JComboBox<>(optionsToChoose);
	    writer.setBounds(650, 100, 200, 40);
	    JLabel jLabel = new JLabel();
	    jLabel.setBounds(90, 100, 400, 100);
	    this.add(writer);
	    */
	    
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
	    wridate = new JTextField("");
	    wridate.setBounds(250, 150, 200, 40);
	    wridate.setFont(new Font("���", Font.BOLD, 20)); // Font
	    wridate.setForeground(Color.black); // Color
	    wridate.setBackground(new Color(255,255,255));
	    wridate.setOpaque(true);
	    wridate.setHorizontalAlignment(JLabel.CENTER);
	    this.add(wridate);
	    
	    wridate.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		wridate.setText("");
	    	}
	    });
	    
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
	    pw = new JTextField("");
	    pw.setBounds(650, 150, 200, 40);
	    pw.setFont(new Font("���", Font.BOLD, 20)); // Font
	    pw.setForeground(Color.black); // Color
	    pw.setBackground(new Color(255,255,255));
	    pw.setOpaque(true);
	    pw.setHorizontalAlignment(JLabel.CENTER);
	    this.add(pw);
	    
	    pw.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		pw.setText("");
	    	}
	    });
	    
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
	    title = new JTextField("");
	    title.setBounds(250, 200, 600, 40);
	    title.setFont(new Font("���", Font.BOLD, 20)); // Font
	    title.setForeground(Color.black); // Color
	    title.setBackground(new Color(255,255,255));
	    title.setOpaque(true);
	    title.setHorizontalAlignment(JLabel.CENTER);
	    this.add(title);
	    
	    title.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		title.setText("");
	    	}
	    });
	    
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
	    content = new JTextField("");
	    content.setBounds(250, 250, 600, 225);
	    content.setFont(new Font("���", Font.BOLD, 20)); // Font
	    content.setForeground(Color.black); // Color
	    content.setBackground(new Color(255,255,255));
	    content.setOpaque(true);
	    content.setHorizontalAlignment(JLabel.CENTER);
	    this.add(content);
	    
	    content.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		content.setText("");
	    	}
	    });
	    
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
	    file = new JTextField("");
	    file.setBounds(340, 510, 500, 30);
	    file.setFont(new Font("���", Font.BOLD, 20)); // Font
	    file.setForeground(Color.black); // Color
	    file.setBackground(new Color(255,255,255));
	    file.setOpaque(true);
	    file.setHorizontalAlignment(JLabel.CENTER);
	    this.add(file);
	    
	    file.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		file.setText("");
	    	}
	    });
	    
	    //��� ��ư
	    JButton regisBtn = new JButton("���");
	    regisBtn.setFont(new Font("���", Font.BOLD, 14));
	    regisBtn.setBackground(new Color(217, 217, 217));
	    regisBtn.setBounds(870, 550, 80, 40);
	    regisBtn.setBorderPainted(false);
	    regisBtn.setFocusPainted(false);
	    this.add(regisBtn);
	    
	 // input ����� ��� (�Խù� �ۼ�)
	 // �����ư ������
		 regisBtn.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				
				//connectDB cDB = new connectDB();
			 	String regis;
			 	regis = (String) UserID.getText();
			 	regis = (String) writer.getText();
			 	regis = (String) wridate.getText();
			 	regis = (String) pw.getText();
			 	regis = (String) title.getText();
				regis = (String) content.getText();
				regis = (String) file.getText();
				
			 	
			 	ArrayList<boardwriteVO> list = new ArrayList<boardwriteVO>(); // ���ͼ��͸� �޾��� �迭�� ���� �������
			 	boardwriteVO data = new boardwriteVO(); // �ش� Ŭ������ ȣ��
 			 	
			 	data.setUserID(UserID.getText());
			 	data.setwriter(writer.getText());
			 	data.setwridate(wridate.getText());
			 	data.setpw(pw.getText());
			 	data.settitle(title.getText());
			 	data.setcontent(content.getText());
			 	data.setfile(file.getText());
			 	
			 	list.add(data); // data�� list�� ���������
			 	
			 	boardwriteDB s = new boardwriteDB(); // DB�Լ��� ȣ��
			 	s.uploadDB(data); // �ش� �Լ��� data�� ������
			 	
			 // �ӽ� ���
 			 	System.out.println(data.getUserID() + data.getwriter() + data.getwridate() + data.getpw() + data.gettitle() + data.getcontent() + data.getfile());
 			 	BtnInit();
			 	
			 }
	      });
	}
	
	private void BtnInit() {
		UserID.setText("");
		UserID.setBackground(new Color(255,255,255));
		writer.setText("");
		writer.setBackground(new Color(255,255,255));
		wridate.setText("");
		wridate.setBackground(new Color(255,255,255));
		pw.setText("");
		pw.setBackground(new Color(255,255,255));
		title.setText("");
		title.setBackground(new Color(255,255,255));
		content.setText("");
		content.setBackground(new Color(255,255,255));
		file.setText("");
		file.setBackground(new Color(255,255,255));
	}
}