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
		this.setBackground(new Color(255, 255, 255));
	    this.setBounds(0, 0, 1280, 960);
	    this.setLayout(null);
	    
	    JLabel writetitle = new JLabel("°Ô½Ã¹° ÀÛ¼º");
	    writetitle.setBounds(130, 30, 800, 35);
	    writetitle.setFont(new Font("°íµñ", Font.BOLD, 30)); // Font
	    writetitle.setForeground(Color.white); // Color
	    writetitle.setBackground(new Color(24, 23, 23));
	    writetitle.setOpaque(true);
	    writetitle.setHorizontalAlignment(JLabel.CENTER);
	    this.add(writetitle);
	      
	    JLabel writerTxt = new JLabel("ÀÛ¼ºÀÚ");
	    writerTxt.setBounds(250, 100, 100, 40);
	    writerTxt.setFont(new Font("°íµñ", Font.BOLD, 20)); // Font
	    writerTxt.setForeground(Color.black); // Color
	    writerTxt.setBackground(new Color(166, 166, 166));
	    writerTxt.setOpaque(true);
	    writerTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(writerTxt);
	    
	    JTextField inputwriter = new JTextField("");
	    inputwriter.setBounds(400, 100, 200, 40);
	    inputwriter.setFont(new Font("°íµñ", Font.BOLD, 20)); // Font
	    inputwriter.setForeground(Color.black); // Color
	    inputwriter.setBackground(new Color(255,255,255));
	    inputwriter.requestFocusInWindow();
	    this.add(inputwriter);
	    
	    JLabel namekindTxt = new JLabel("ÀÛ¼ºÀÚ Ç¥½Ã");
	    namekindTxt.setBounds(250, 100, 100, 40);
	    namekindTxt.setFont(new Font("°íµñ", Font.BOLD, 20)); // Font
	    namekindTxt.setForeground(Color.black); // Color
	    namekindTxt.setBackground(new Color(166, 166, 166));
	    namekindTxt.setOpaque(true);
	    namekindTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(namekindTxt);
	    
	    JLabel wridateTxt = new JLabel("ÀÛ¼º ±â°£");
	    wridateTxt.setBounds(250, 100, 100, 40);
	    wridateTxt.setFont(new Font("°íµñ", Font.BOLD, 20)); // Font
	    wridateTxt.setForeground(Color.black); // Color
	    wridateTxt.setBackground(new Color(166, 166, 166));
	    wridateTxt.setOpaque(true);
	    wridateTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(wridateTxt);
	    
	    JLabel pwTxt = new JLabel("ºñ¹Ð¹øÈ£");
	    pwTxt.setBounds(250, 100, 100, 40);
	    pwTxt.setFont(new Font("°íµñ", Font.BOLD, 20)); // Font
	    pwTxt.setForeground(Color.black); // Color
	    pwTxt.setBackground(new Color(166, 166, 166));
	    pwTxt.setOpaque(true);
	    pwTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(pwTxt);
	    
	    JTextField inputpw = new JTextField("");
	    inputpw.setBounds(400, 100, 200, 40);
	    inputpw.setFont(new Font("°íµñ", Font.BOLD, 20)); // Font
	    inputpw.setForeground(Color.black); // Color
	    inputpw.setBackground(new Color(255,255,255));
	    inputpw.requestFocusInWindow();
	    this.add(inputpw);
	    
	    JLabel titleTxt = new JLabel("Á¦¸ñ");
	    titleTxt.setBounds(250, 100, 100, 40);
	    titleTxt.setFont(new Font("°íµñ", Font.BOLD, 20)); // Font
	    titleTxt.setForeground(Color.black); // Color
	    titleTxt.setBackground(new Color(166, 166, 166));
	    titleTxt.setOpaque(true);
	    titleTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(titleTxt);
	    
	    JTextField inputtitle = new JTextField("");
	    inputtitle.setBounds(400, 100, 200, 40);
	    inputtitle.setFont(new Font("°íµñ", Font.BOLD, 20)); // Font
	    inputtitle.setForeground(Color.black); // Color
	    inputtitle.setBackground(new Color(255,255,255));
	    inputtitle.requestFocusInWindow();
	    this.add(inputtitle);
	    
	    JLabel contentTxt = new JLabel("³»¿ë");
	    contentTxt.setBounds(250, 100, 100, 40);
	    contentTxt.setFont(new Font("°íµñ", Font.BOLD, 20)); // Font
	    contentTxt.setForeground(Color.black); // Color
	    contentTxt.setBackground(new Color(166, 166, 166));
	    contentTxt.setOpaque(true);
	    contentTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(contentTxt);
	    
	    JTextField inputcontent = new JTextField("");
	    inputcontent.setBounds(400, 100, 200, 40);
	    inputcontent.setFont(new Font("°íµñ", Font.BOLD, 20)); // Font
	    inputcontent.setForeground(Color.black); // Color
	    inputcontent.setBackground(new Color(255,255,255));
	    inputcontent.requestFocusInWindow();
	    this.add(inputcontent);
	    
	    JLabel fileTxt = new JLabel("Ã·ºÎÆÄÀÏ");
	    fileTxt.setBounds(250, 100, 100, 40);
	    fileTxt.setFont(new Font("°íµñ", Font.BOLD, 20)); // Font
	    fileTxt.setForeground(Color.black); // Color
	    fileTxt.setBackground(new Color(166, 166, 166));
	    fileTxt.setOpaque(true);
	    fileTxt.setHorizontalAlignment(JLabel.CENTER);
	    this.add(fileTxt);
	    
	    JTextField inputfile = new JTextField("");
	    inputfile.setBounds(400, 100, 200, 40);
	    inputfile.setFont(new Font("°íµñ", Font.BOLD, 20)); // Font
	    inputfile.setForeground(Color.black); // Color
	    inputfile.setBackground(new Color(255,255,255));
	    inputfile.requestFocusInWindow();
	    this.add(inputfile);

	    JButton regisBtn = new JButton("µî·Ï");
	    regisBtn.setFont(new Font("°íµñ", Font.BOLD, 14));
	    regisBtn.setBackground(new Color(217, 217, 217));
	    regisBtn.setBounds(700, 400, 80, 40);
	    regisBtn.setBorderPainted(false);
	    regisBtn.setFocusPainted(false);
	    this.add(regisBtn);
	      
	}
}

