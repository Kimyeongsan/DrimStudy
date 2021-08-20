package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import Database.ConnectionDB;
import Database.cheermsgDB;
import Database.maintableDB;

public class BoardPanel2 extends JPanel {

		private JTable table;
		private JScrollPane jscp1; //��ũ�ѹ�
		
		ConnectionDB cDB = null;
		Connection con = null;
		
		
		private String header[] = {"����", "����", "�ۼ���", "�ۼ��Ⱓ"};
    	private DefaultTableModel model = new DefaultTableModel(header, 0){ 
    									public boolean isCellEditable(int i, int c){
    										return false; } };
    										
    	public int now ;
    	JTextField s1;
    
    	maintableDB s = new maintableDB(); // DB�Լ��� ȣ��
   // ���̺� ������ �� ��ü ����

		
	public BoardPanel2(JFrame frame) {
		super();
		cDB = new ConnectionDB();
		PanelInit(frame);
		Search_InputBox();
		s.select(model); // �ش� �Լ��� data�� ������
		pagination();
	}

	private void PanelInit(JFrame frame) {

		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 300);
		this.setLayout(null);

		// Table
   
        table = new JTable(model);
        //table.setLocation(0,0);
        
        jscp1 = new JScrollPane(table); //�̷������� �����ÿ� ���̺��� �Ѱ��־�� ���������� �� �� �ִ�.
                                                    //jscp1.add(table); �� ���� �����ϸ�, ���������� ��µ��� ����.
        jscp1.setLocation(70,40);
        jscp1.setSize(1060,315);
       
        //mainPanel.add(jscp1);  // �� �κ��� ����� Panel���� ǥ�� �߰��� �� ����.
        this.add(jscp1);

		//���̺� ��, �� ũ�� ����
        //table.getRow(header).setPreferredHi
		table.setRowHeight(28);
		table.getColumn(header[0]).setPreferredWidth(200);
		table.getColumn(header[1]).setPreferredWidth(400);
		table.getColumn(header[2]).setPreferredWidth(200);
		table.getColumn(header[3]).setPreferredWidth(200);
		
		table.getTableHeader().setBackground(new Color(12, 12, 12));
		table.getTableHeader().setFont(new Font("�������", Font.BOLD, 16)); 
		table.getTableHeader().setForeground(Color.white);
		table.getTableHeader().setPreferredSize(new Dimension(1,32));
		
		//���̺� ���� ��� ����
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); //����Ʈ���̺������� ����
		dtcr.setHorizontalAlignment(SwingConstants.CENTER); //�������� �������� CENTER
		TableColumnModel tcm = table.getColumnModel(); //������ ���̺��� �÷��� ��������
		
		for(int i = 0;i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr); // ������ ���������� dtcr�� set
		}
		
	}

	
	private void pagination() {
        
        JButton btnfirst = new JButton("<<");
        JButton btnprev = new JButton("<");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn10 = new JButton("10");
        JButton btnnext = new JButton(">");
        JButton btnlast = new JButton(">>");
        
        
        btnfirst.setBounds(239, 400, 60, 30);
		btnfirst.setBackground(Color.black);
		btnfirst.setForeground(Color.white);
		
		btnprev.setBounds(299, 400, 50, 30);
		btnprev.setBackground(Color.black);
		btnprev.setForeground(Color.white);
		
		btn1.setBounds(360, 400, 48, 30);
		btn1.setBackground(Color.black);
		btn1.setForeground(Color.white);
		
		btn2.setBounds(410, 400, 48, 30);
		btn2.setBackground(Color.black);
		btn2.setForeground(Color.white);
		
		btn3.setBounds(460, 400, 48, 30);
		btn3.setBackground(Color.black);
		btn3.setForeground(Color.white);
		
		btn4.setBounds(510, 400, 48, 30);
		btn4.setBackground(Color.black);
		btn4.setForeground(Color.white);
		
		btn5.setBounds(560, 400, 48, 30);
		btn5.setBackground(Color.black);
		btn5.setForeground(Color.white);
		
		btn6.setBounds(610, 400, 48, 30);
		btn6.setBackground(Color.black);
		btn6.setForeground(Color.white);
		
		btn7.setBounds(660, 400, 48, 30);
		btn7.setBackground(Color.black);
		btn7.setForeground(Color.white);
		
		btn8.setBounds(710, 400, 48, 30);
		btn8.setBackground(Color.black);
		btn8.setForeground(Color.white);
		
		btn9.setBounds(760, 400, 48, 30);
		btn9.setBackground(Color.black);
		btn9.setForeground(Color.white);
		
		btn10.setBounds(810, 400, 48, 30);
		btn10.setBackground(Color.black);
		btn10.setForeground(Color.white);
		
		btnnext.setBounds(870, 400, 50, 30);
		btnnext.setBackground(Color.black);
		btnnext.setForeground(Color.white);
		
		btnlast.setBounds(920, 400, 60, 30);
		btnlast.setBackground(Color.black);
		btnlast.setForeground(Color.white);
		
		this.add(btnfirst);
		this.add(btnprev);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(btn6);
		this.add(btn7);
		this.add(btn8);
		this.add(btn9);
		this.add(btn10);
		this.add(btnnext);
		this.add(btnlast);
		
		btnfirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now =1;
				s.btn_active(model, now);
			}
		});
		
		btnprev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(now==1) now=1;
				else now = now-1;
				s.btn_active(model, now);
			}
		});
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now =1;
				s.btn_active(model, now);
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now =2;
				s.btn_active(model, now);
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now =3;
				s.btn_active(model, now);
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now =4;
				s.btn_active(model, now);
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now =5;
				s.btn_active(model, now);
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now =6;
				s.btn_active(model, now);
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now =7;
				s.btn_active(model, now);
			}
		});
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now =8;
				s.btn_active(model, now);
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now =9;
				s.btn_active(model, now);
			}
		});
		
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now =10;
				s.btn_active(model, now);
			}
		});
		
		btnnext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(now==10) now=10;
				else now = now+1;
				s.btn_active(model, now);
			}
		});
		
		btnlast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now =10;
				s.btn_active(model, now);
			}
		});
	}
	
	
	// �˻��� �Է�
	private void Search_InputBox() {
		// �̸� �Է�
		s1 = new JTextField("   �˻�� �Է��Ͻÿ�.");
		s1.setBounds(820, 0, 240, 30);

		this.add(s1);
		
		s1.addMouseListener(new MouseAdapter(){
	          @Override
	          public void mouseClicked(MouseEvent e){
	             s1.setText("");
	          }
	    });
		// input ����� ���
		JButton btnSearch = new JButton("�˻�");
		btnSearch.setBounds(1060, 0, 68, 30);
		btnSearch.setBackground(Color.black);
		btnSearch.setForeground(Color.white);
		
		this.add(btnSearch);
				
				
		// �����ư ������
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search;

				search = (String) s1.getText();
				
				// �ӽ� ���
				System.out.println(search);
				
				model.setNumRows(0);
				
				s.search(model, search, s1);

			}
		});
	}
}