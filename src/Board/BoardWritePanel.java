package Board;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.Font;
import java.io.File;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


public class BoardWritePanel extends JPanel {
	public BoardWritePanel(JFrame frame) {
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
	    JLabel writerTxt = new JLabel("작성자");
	    writerTxt.setBounds(130, 100, 100, 40);
	    writerTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    writerTxt.setForeground(Color.black); // Color
	    writerTxt.setBackground(new Color(166, 166, 166));
	    writerTxt.setOpaque(true);
	    writerTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(writerTxt);
	    
	    // 작성자 입력
	    JTextField inputwriter = new JTextField("");
	    inputwriter.setBounds(250, 100, 200, 40);
	    inputwriter.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    inputwriter.setForeground(Color.black); // Color
	    inputwriter.setBackground(new Color(255,255,255));
	    inputwriter.requestFocusInWindow();
	    this.add(inputwriter);
	    
	    //작성자 표시 글자
	    JLabel namekindTxt = new JLabel("작성자 표시");
	    namekindTxt.setBounds(500, 100, 120, 40);
	    namekindTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    namekindTxt.setForeground(Color.black); // Color
	    namekindTxt.setBackground(new Color(166, 166, 166));
	    namekindTxt.setOpaque(true);
	    namekindTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(namekindTxt);
	    
	    //작성자 표시 종류 선택(드롭박스)
	    String[] optionsToChoose = {"이름", "닉네임", "익명"};
	    JComboBox<String> nameoptions = new JComboBox<>(optionsToChoose);
	    nameoptions.setBounds(650, 100, 200, 40);
	    JLabel jLabel = new JLabel();
	    jLabel.setBounds(90, 100, 400, 100);
	    this.add(nameoptions);
	    
	    //작성 기간 글자
	    JLabel wridateTxt = new JLabel("작성 기간");
	    wridateTxt.setBounds(130, 150, 100, 40);
	    wridateTxt.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	    wridateTxt.setForeground(Color.black); // Color
	    wridateTxt.setBackground(new Color(166, 166, 166));
	    wridateTxt.setOpaque(true);
	    wridateTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(wridateTxt);
	    
	    /*캘린더 기능 추가 예정*/
	    /*Font fnt = new Font("굴림체", Font.BOLD, 20);
	    
	    JPanel selectPane = new JPanel();
	    	JButton preyBtn = new JButton("<-");
	    	JButton nextBtn = new JButton("->");
	    	JComboBox<Integer> yearCombo = new JComboBox<Integer>();
		    JComboBox<Integer> monthCombo = new JComboBox<Integer>();
		    JLabel yearLBI = new JLabel("년");
		    JLabel monthLBI = new JLabel("월");
	    
	    JPanel centerPane = new JPanel(new BorderLayout());
	    	JPanel titlePane = new JPanel(new GridLayout(1, 7));
	    	String title[] = {"일", "월", "화", "수", "목", "금", "토"};
	    JPanel dayPane = new JPanel(new GridLayout(0, 7));
	    
	    Calendar date;
	    int year;
	    int month;
	    
	    public CalendarSwing() {
	    	super("달력");
	    	date = Calendar.getInstance();
	    	year = date.get(Calendar.YEAR);
	    	month = date.get(Calendar.MONTH)+1;
	    	
	    	selectPane.setBackground(new Color(150, 200, 200));
	    	selectPane.add(preyBtn); preyBtn.setFont(fnt);
	    	selectPane.add(yearCombo); yearCombo.setFont(fnt);
	    	selectPane.add(yearLBI); yearLBI.setFont(fnt);
	    	selectPane.add(monthCombo); monthCombo.setFont(fnt);
	    	selectPane.add(monthLBI); monthLBI.setFont(fnt);
	    	selectPane.add(newxtBtn); nextBtn.setFont(fnt);
	    	
	    	add(BorderLayout.NORTH, selectPane);
	    	
	    	setYear();
	    	setMonth();
	    	
	    	setCalendarTitle();
	    	centerPane.add(BorderLayout.NORTH, titlePane);
	    	add(centerPane);
	    	
	    	centerPane.add(dayPane);
	    	setDay();
	    	
	    	preyBtn.addActionListener(this);
	    	nextBtn.addActionListener(this);
	    	yearCombo.addItemListerner(this);
	    	monthCombo.addItemListener(this);
	    	
	    	setSize(400, 300);
	    	setVisible(true);
	    	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	    }
	    
	    public void setDay() {
	    	date.set(year, month-1, 1);
	    	int week = date.get(Calendar.DAY_OF_WEEK);
	    	int lastDay = date.getActualMaximum(Calendar.DATE);
	    	
	    	for(int s=1; s<week; s++) {
	    		JLabel lbl = new JLabel(" ");
	    		dayPane.add(lbl);
	    	}
	    	
	    	for(int day=1; day<=lastDay; day++) {
	    		JLabel lbl = new JLabel(String.valueOf(day), JLabel.CENTER);
	    		lbl.setFont(fnt);
	    		date.set(Calendar.Date, day);
	    			int w = date.get(Calendar.DAY_OF_WEEK);
	    			if(w ==1) lbl.setForeground(Color.red);
	    			if(w ==7) lbl.setForeground(Color.blue);
	    			dayPane.add(lbl);
	    	}
	    }
	    
	    public void setCalendarTitle() {
	    	for(int i = 0; i < title.length; i++) {
	    		JLabel lbl = new JLabel(title[i], JLabel.CENTER);
	    		lbl.setFont(fnt);
	    		if(i ==0) lbl.setForeground(Color.red);
	    		if(i ==6) lbl.setForeground(Color.blue);
	    		titlePane.add(lbl);
	    	}
	    }
	    
	    public void setYear() {
	    	for(int i = year-50; i < year+20; i++) {
	    		yearCombo.addItem(i);
	    	}
	    	yearCombo.setSelectedItem(year);
	    }
	    
	    public void setMonth() {
	    	for(int i = 1; i <= 12; i++) {
	    		monthCombo.addItem(i);
	    	}
	    	monthCombo.setSelectedItem(month);
	    }
	    
	    public void itemStateChanged(ItemEvent e) {
	    	year = (int)yearCombo.getSelectedItem();
	    	month = (int)monthCombo.getSelectedItem();
	    	
	    	dayPane.setVisible(false);
	    	dayPane.removeAll();
	    	setDay();
	    	dayPane.setVisible(true);
	    }
	    
	    public void actionPerformed(ActionEvent ae) {
	    	Object obj = ae.getSource();
	    	if(obj == prevBtn) {
	    		prevMonth();
	    		setDayReset();
	    	}else if(obj == nextBtn) {
	    		nextMonth();
	    		setDayReset();
	    	}
	    }
	    private void setDayReset() {
	    	yearCombo.removeItemListener(this);
	    	monthCombo.removeItemListener(this);
	    	
	    	yearCombo.setSelectedItem(year);
	    	monthCombo.setSelectedItem(month);
	    	
	    	dayPane.setVisible(false);
	    	dayPane.removeAll();
	    	setDay();
	    	dayPane.setVisible(true);
	    	
	    	yearCombo.addItemListener(this);
	    	monthCombo.addItemListener(this);
	    }
	    public void prevMonth() {
	    	if(month==1) {
	    		year--;
	    		month=12;
	    	}else {
	    		month--;
	    	}
	    }
	    public void nextMonth() {
	    	if(month==12) {
	    		year++;
	    		month=1;
	    	}else {
	    		month++;
	    	}
	    }*/
	    
	    
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
	    
	    
	    //등록 버튼
	    JButton regisBtn = new JButton("등록");
	    regisBtn.setFont(new Font("고딕", Font.BOLD, 14));
	    regisBtn.setBackground(new Color(217, 217, 217));
	    regisBtn.setBounds(870, 550, 80, 40);
	    regisBtn.setBorderPainted(false);
	    regisBtn.setFocusPainted(false);
	    this.add(regisBtn);
	      
	}

	private void add(String[] optionsToChoose) {
		// TODO Auto-generated method stub
		
	}
}

