// ���������� - �Ͽ�  (MainAction ����ϽǶ� �ּ��κ� ������ �����ּ���.)
package Main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;

public class MainAction extends JPanel {


	public MainAction(JFrame frame) {
		super();
		panelInit(frame);
		
	}


	private void panelInit(JFrame frame) {
		// ���� ȭ�� �г�
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 960);
		
		frame.getContentPane().add(this);
		
		this.setLayout(null);
		
		JLabel tilteLabel = new JLabel("");

		tilteLabel.setFont(new Font("���", Font.BOLD, 20)); // Font

		tilteLabel.setForeground(Color.white); // Color
		tilteLabel.setBackground(new Color(51, 63, 80));
		tilteLabel.setPreferredSize(new Dimension(200,80)); //width�� �ȸԴµ�
		tilteLabel.setOpaque(true);


		
		//mainPanel.add(tilteLabel);
		this.add(tilteLabel);
			
		
		// JPanel �κ� ����  -> �̺κ� ���߿� �� �� �� ������ �������� �����ּ��밡��.
	    String [] fruits = {"apple", "banana", "mango"};
	    
	    
	   
        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(80, 380, 1100, 420);
        mainPanel.setBackground(new Color(242, 242, 242));
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.black));
      
        this.add(mainPanel);
        mainPanel.setVisible(true);
        mainPanel.setBorder(null); // ��� ���� setBorder�� ���ָ� �� �ڵ� �Ƚ��൵��.
        //mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        // JPanel �κ� ����
        
        Box searchBox = Box.createHorizontalBox();
        Box tableBox = Box.createHorizontalBox();
        Box underBox = Box.createVerticalBox();
        
		
		// ���� �Է�
		String eventList[] = { "�౸", "�߱�", "�豸" };

		JComboBox eventBox = new JComboBox<Object>(eventList);
		eventBox.setBounds(515, 170, 235, 40);

		searchBox.add(eventBox);
		// ���̺� ����(����)
		JButton writebtn1 = new JButton("1");
		writebtn1.setFont(new Font("�������", Font.BOLD, 13));
		writebtn1.setBackground(new Color(217, 217, 217));
		writebtn1.setBounds(500,500, 75, 23);
		writebtn1.setBorderPainted(false);
		writebtn1.setFocusPainted(false);
		tableBox.add(writebtn1);
        // Table
        String header[]={"����", "�Խù� ����", "����/�޴޿���"};
        String contents[][]={
                {"������", "��ü�������ݸ޴�", "1��/�ݸ޴�"},
                {"�迵ȣ", "����ȯ ������ �پ�Ѵ� ", "2��/���޴�"},
                {"������", "3���� �ƽ����� ���ؿ���", "3��/���޴�"},
                {"������", "��������", "����"},
                {"������", "�� ���ɽð�", "����"},
                {"�����", "�Ƶ����� ���ž�", "����"},
                {"�迵��", "1���� 1955", "1��/�ݸ޴�"},
                {"������", "2���� �Ұ�����", "2��/���޴�"},
                {"�̽±�", "�� ���� �Ƶ����� 1�� ����ŷ 2��", "2��/���޴�"},
        };

        JTable table = new JTable(contents, header);
        //table.setLocation(0,0);
        
        JScrollPane jscp1 = new JScrollPane(table); //�̷������� �����ÿ� ���̺��� �Ѱ��־�� ���������� �� �� �ִ�.
                                                    //jscp1.add(table); �� ���� �����ϸ�, ���������� ��µ��� ����.
        jscp1.setLocation(180,380);
        jscp1.setSize(300,360);
        jscp1.setPreferredSize(new Dimension(1000,140));
        //mainPanel.add(jscp1);  // �� �κ��� ����� Panel���� ǥ�� �߰��� �� ����.
        tableBox.add(jscp1);
        
        // ���̺� ����(����)
        JButton writebtn2 = new JButton("2");
		writebtn2.setFont(new Font("�������", Font.BOLD, 13));
		writebtn2.setBackground(new Color(217, 217, 217));
		writebtn2.setBounds(500,500, 75, 23);
		writebtn2.setBorderPainted(false);
		writebtn2.setFocusPainted(false);
		tableBox.add(writebtn2);
        
		// �۾��� ���� ����
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("�������", Font.BOLD, 1));
		btn3.setBackground(new Color(217, 27, 217));
		btn3.setBounds(500,500, 75, 23);
		btn3.setBorderPainted(false);
		btn3.setFocusPainted(false);
		//mainPanel.add(writebtn);
		underBox.add(btn3);
		
        JButton writebtn = new JButton("�۾���");
		writebtn.setFont(new Font("�������", Font.BOLD, 13));
		writebtn.setBackground(new Color(217, 217, 217));
		writebtn.setBounds(500,500, 75, 23);
		writebtn.setBorderPainted(false);
		writebtn.setFocusPainted(false);
		//mainPanel.add(writebtn);
		underBox.add(writebtn);
		
		// �۾��� �Ʒ��� ����
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("�������", Font.BOLD, 10));
		btn4.setBackground(new Color(217, 27, 217));
		btn4.setBounds(500,500, 75, 23);
		btn4.setBorderPainted(false);
		btn4.setFocusPainted(false);
		//mainPanel.add(writebtn);
		underBox.add(btn4);
		
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.add(searchBox);
		mainPanel.add(tableBox);
		mainPanel.add(underBox);
		
        
        // Table
	}
}
