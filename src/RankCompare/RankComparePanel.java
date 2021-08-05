//���/��ŷ�� - ����

package RankCompare;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

import java.awt.*;
import javax.swing.*;


public class RankComparePanel extends JPanel {

	public RankComparePanel(JFrame frame) {
		super();
		panelInit(frame);
	}

	private void panelInit(JFrame frame) {
		// ���� ȭ�� �г�
		this.setBackground(new Color(242, 242, 242));
		this.setBounds(0, 0, 1280, 960);
		
		frame.getContentPane().add(this);
		
		this.setLayout(null);

		
		//���̺�
		String []table_div = {"����", "2021 ���ѹα� ���", "���ѹα� ���� �ְ� ���"};
		String [][]contents = {{"����", "----(��)", "-------(��)"},
			                 	{"�±ǵ�", "----(��)", "-------(��)"},
			                 	{"Ź��", "----(��)", "-------(��)"},
			                 	{"Ź��", "----(��)", "-------(��)"},
			                 	{"Ź��", "----(��)", "-------(��)"},
			                 	{"Ź��", "----(��)", "-------(��)"},
			                 	{"Ź��", "----(��)", "-------(��)"},
			                 	{"Ź��", "----(��)", "-------(��)"},
			                 	{"Ź��", "----(��)", "-------(��)"},
			                 	{"Ź��", "----(��)", "-------(��)"},
			                 	{"Ź��", "----(��)", "-------(��)"}};
		
		JTable table = new JTable(contents, table_div);
		
		//���̺� ��, �� ũ�� ����
		table.setRowHeight(50);
		table.getColumn(table_div[0]).setPreferredWidth(100);
		table.getColumn(table_div[1]).setPreferredWidth(400);
		table.getColumn(table_div[2]).setPreferredWidth(400);
		
		//���̺� ���� ��� ����
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); //����Ʈ���̺������� ����
		dtcr.setHorizontalAlignment(SwingConstants.CENTER); //�������� �������� CENTER
		TableColumnModel tcm = table.getColumnModel(); //������ ���̺��� �÷��� ��������
		
		for(int i = 0;i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr); // ������ ���������� dtcr�� set
		}
		
		
		

		JScrollPane jscp1 = new JScrollPane(table);//���̺� �� �� �ְ� ����
		jscp1.setLocation(200, 200);
		jscp1.setSize(900, 576);
		
		this.add(jscp1);
		
}
}
