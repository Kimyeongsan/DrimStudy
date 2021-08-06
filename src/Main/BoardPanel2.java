package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
import javax.swing.table.TableColumnModel;

public class BoardPanel2 extends JPanel {

	public BoardPanel2(JFrame frame) {
		super();
		PanelInit(frame);
		Search_InputBox();
	}

	private void PanelInit(JFrame frame) {

		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 300);
		this.setLayout(null);

		// Table
		
		// ���� �Է�
		String eventList[] = {"����", "�౸", "�߱�", "�豸" };

		JComboBox eventBox = new JComboBox<Object>(eventList);
		eventBox.setBounds(150, 40, 70, 32);
		eventBox.setForeground(Color.white);
		eventBox.setBackground(new Color(2, 12, 12));
		eventBox.setFont(new Font("�������", Font.BOLD, 16));

		this.add(eventBox);
				
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
                {"���Ͽ�", "������ �̼�����!~", "����"}
        };

        JTable table = new JTable(contents, header);
        //table.setLocation(0,0);
        
        JScrollPane jscp1 = new JScrollPane(table); //�̷������� �����ÿ� ���̺��� �Ѱ��־�� ���������� �� �� �ִ�.
                                                    //jscp1.add(table); �� ���� �����ϸ�, ���������� ��µ��� ����.
        jscp1.setLocation(70,40);
        jscp1.setSize(1060,315);
       
        //mainPanel.add(jscp1);  // �� �κ��� ����� Panel���� ǥ�� �߰��� �� ����.
        this.add(jscp1);

		//���̺� ��, �� ũ�� ����
        //table.getRow(header).setPreferredHi
		table.setRowHeight(28);
		table.getColumn(header[0]).setPreferredWidth(200);
		table.getColumn(header[1]).setPreferredWidth(500);
		table.getColumn(header[2]).setPreferredWidth(300);
		
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
		
		//////////////////////////////////////////////////////////////////
		
		/*
		// �۾��� ��ư
		JButton writebtn = new JButton("�۾���");
		writebtn.setFont(new Font("�������", Font.BOLD, 13));
		writebtn.setBackground(new Color(217, 217, 217));
		writebtn.setBounds(1055,365, 75, 30);
		writebtn.setBorderPainted(false);
		writebtn.setFocusPainted(false);
		this.add(writebtn);
		
		writebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		writebtn.addMouseListener(new java.awt.event.MouseAdapter() {
	          public void mouseEntered(java.awt.event.MouseEvent evt) {
	             writebtn.setBackground(Color.black);
	             writebtn.setForeground(Color.white);
	             //player_Btn.setBorderPainted(true);
	          }
	          public void mouseExited(java.awt.event.MouseEvent evt) {
	             writebtn.setBackground(new Color(217, 217, 217));
	             writebtn.setForeground(Color.black);
	          }
       });
       */
		
	}
	
	// �˻��� �Է�
	private void Search_InputBox() {
		// �̸� �Է�
		JTextField s1 = new JTextField("   �˻�� �Է��Ͻÿ�.");
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

			}
		});
	}
}