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
		// 게시물 작성 화면 패널
		this.setBackground(new Color(255, 255, 255));
	    this.setBounds(0, 0, 1280, 960);
	    this.setLayout(null);
	    
	    // 게시물 작성 글자
	    JLabel writetitle = new JLabel("게시물 작성");
	    writetitle.setBounds(130, 30, 800, 35);
	    writetitle.setFont(new Font("고딕", Font.BOLD, 30)); // Font
	    writetitle.setForeground(Color.white); // Color
	    writetitle.setBackground(new Color(24, 23, 23));
	    writetitle.setOpaque(true);
	    writetitle.setHorizontalAlignment(JLabel.CENTER);
	    this.add(writetitle);
	    
	    // 작성자 글자
	    JLabel UserIDTxt = new JLabel("작성자");
	    UserIDTxt.setBounds(130, 100, 100, 40);
	    UserIDTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    UserIDTxt.setForeground(Color.black); // Color
	    UserIDTxt.setBackground(new Color(166, 166, 166));
	    UserIDTxt.setOpaque(true);
	    UserIDTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(UserIDTxt);
	    
	    // 작성자 입력
	    JTextField inputUserID = new JTextField("");
	    inputUserID.setBounds(250, 100, 200, 40);
	    inputUserID.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    inputUserID.setForeground(Color.black); // Color
	    inputUserID.setBackground(new Color(255,255,255));
	    inputUserID.requestFocusInWindow();
	    this.add(inputUserID);
	    
	    //작성자 표시 글자
	    JLabel writerTxt = new JLabel("작성자 표시");
	    writerTxt.setBounds(500, 100, 120, 40);
	    writerTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    writerTxt.setForeground(Color.black); // Color
	    writerTxt.setBackground(new Color(166, 166, 166));
	    writerTxt.setOpaque(true);
	    writerTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(writerTxt);
	    
	    //작성자 표시 종류 선택(드롭박스)
	    String[] optionsToChoose = {"이름", "닉네임", "익명"};
	    JComboBox<String> writeroptions = new JComboBox<>(optionsToChoose);
	    writeroptions.setBounds(650, 100, 200, 40);
	    JLabel jLabel = new JLabel();
	    jLabel.setBounds(90, 100, 400, 100);
	    this.add(writeroptions);
	    
	    //작성 기간 글자
	    JLabel wridateTxt = new JLabel("작성 기간");
	    wridateTxt.setBounds(130, 150, 100, 40);
	    wridateTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    wridateTxt.setForeground(Color.black); // Color
	    wridateTxt.setBackground(new Color(166, 166, 166));
	    wridateTxt.setOpaque(true);
	    wridateTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(wridateTxt);
		
	  //작성 기간 입력
	    JTextField inputwridate = new JTextField("");
	    inputwridate.setBounds(250, 150, 200, 40);
	    inputwridate.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    inputwridate.setForeground(Color.black); // Color
	    inputwridate.setBackground(new Color(255,255,255));
	    inputwridate.requestFocusInWindow();
	    this.add(inputwridate);
	    
	    //비밀번호 글자
	    JLabel pwTxt = new JLabel("비밀번호");
	    pwTxt.setBounds(500, 150, 100, 40);
	    pwTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    pwTxt.setForeground(Color.black); // Color
	    pwTxt.setBackground(new Color(166, 166, 166));
	    pwTxt.setOpaque(true);
	    pwTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(pwTxt);
	    
	    //비밀번호 입력
	    JTextField inputpw = new JTextField("");
	    inputpw.setBounds(650, 150, 200, 40);
	    inputpw.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    inputpw.setForeground(Color.black); // Color
	    inputpw.setBackground(new Color(255,255,255));
	    inputpw.requestFocusInWindow();
	    this.add(inputpw);
	    
	    //제목 글자
	    JLabel titleTxt = new JLabel("제목");
	    titleTxt.setBounds(130, 200, 100, 40);
	    titleTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    titleTxt.setForeground(Color.black); // Color
	    titleTxt.setBackground(new Color(166, 166, 166));
	    titleTxt.setOpaque(true);
	    titleTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(titleTxt);
	    
	    //제목 입력
	    JTextField inputtitle = new JTextField("");
	    inputtitle.setBounds(250, 200, 600, 40);
	    inputtitle.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    inputtitle.setForeground(Color.black); // Color
	    inputtitle.setBackground(new Color(255,255,255));
	    inputtitle.requestFocusInWindow();
	    this.add(inputtitle);
	    
	    //내용 글자
	    JLabel contentTxt = new JLabel("내용");
	    contentTxt.setBounds(130, 250, 100, 40);
	    contentTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    contentTxt.setForeground(Color.black); // Color
	    contentTxt.setBackground(new Color(166, 166, 166));
	    contentTxt.setOpaque(true);
	    contentTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(contentTxt);
	    
	    //내용 입력
	    JTextField inputcontent = new JTextField("");
	    inputcontent.setBounds(250, 250, 600, 225);
	    inputcontent.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    inputcontent.setForeground(Color.black); // Color
	    inputcontent.setBackground(new Color(255,255,255));
	    inputcontent.requestFocusInWindow();
	    this.add(inputcontent);
	    
	    //첨부파일 글자
	    JLabel fileTxt = new JLabel("첨부파일");
	    fileTxt.setBounds(130, 500, 100, 40);
	    fileTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    fileTxt.setForeground(Color.black); // Color
	    fileTxt.setBackground(new Color(166, 166, 166));
	    fileTxt.setOpaque(true);
	    fileTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(fileTxt);
	    
	    //첨부파일 업로드
	    JButton fileBtn = new JButton("업로드");
	    fileBtn.setFont(new Font("고딕", Font.BOLD, 14));
	    fileBtn.setBackground(new Color(217, 217, 217));
	    fileBtn.setBounds(250, 510, 80, 30);
	    fileBtn.setBorderPainted(false);
	    fileBtn.setFocusPainted(false);
	    this.add(fileBtn);
	    
	    //첨부파일 내용표시 (기능 삽입하면서 일부 수정 예정)
	    JTextField inputfile = new JTextField("");
	    inputfile.setBounds(340, 510, 500, 30);
	    inputfile.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    inputfile.setForeground(Color.black); // Color
	    inputfile.setBackground(new Color(255,255,255));
	    inputfile.requestFocusInWindow();
	    this.add(inputfile);
	    
	    //등록 버튼
	    JButton regisBtn = new JButton("등록");
	    regisBtn.setFont(new Font("고딕", Font.BOLD, 14));
	    regisBtn.setBackground(new Color(217, 217, 217));
	    regisBtn.setBounds(870, 550, 80, 40);
	    regisBtn.setBorderPainted(false);
	    regisBtn.setFocusPainted(false);
	    this.add(regisBtn);
	    
	 // 적용버튼 리스너
		 regisBtn.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				
			 	//connectDB cDB = new connectDB();
			 	String regis;
				regis = (String) inputcontent.getText();
			 	
			 	//MsgVO data = new MsgVO();
			 	ArrayList<boardwriteVO> list = new ArrayList<boardwriteVO>(); // 게터세터를 받아줄 배열을 먼저 만들어줌
			 	boardwriteVO data = new boardwriteVO(); // 해당 클래스를 호출
			 	
			 	data.setUserID(UserID);
			 	data.setwriter(writer);
			 	data.setwridate(wridate);
			 	data.setpw(pw);
			 	data.settitle(title);
			 	data.setcontent(content);
			 	data.setfile(file);
			 	
			 	list.add(data); // data를 list에 저장시켜줌
			 	
			 	boardwriteDB s = new boardwriteDB(); // DB함수를 호출
			 	s.uploadDB(data); // 해당 함수에 data를 보내줌
			 	
			 }
	      });
	}
	
}

