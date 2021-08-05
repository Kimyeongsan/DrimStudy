//���/��ŷ�� - ����

package RankCompare;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
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
		String []header = {"����", "2021 ���ѹα� ���", "���ѹα� ���� �ְ� ���"};
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
		
		JTable table = new JTable(contents, header);
		//���̺� ��, �� ũ�� ����
		table.setRowHeight(50);
		table.getColumn(header[0]).setPreferredWidth(100);
		table.getColumn(header[1]).setPreferredWidth(400);
		table.getColumn(header[2]).setPreferredWidth(400);
		
		//���̺� ũ�� 
		table.setRowHeight(49);
		table.setFont(new Font("�������", Font.PLAIN, 18));
		JTableHeader THeader = table.getTableHeader();
		//��� ��� �� 
		THeader.setBackground(Color.BLACK);
		
		//��� ���� �� �� ��� �� + ���� ũ��
		THeader.setForeground(Color.WHITE);
		THeader.setBackground(Color.BLACK);
		THeader.setFont(new Font("�������", Font.BOLD, 18));
		
		//���̺� ���� ��� ����
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); //����Ʈ���̺������� ����
		dtcr.setHorizontalAlignment(SwingConstants.CENTER); //�������� �������� CENTER
		TableColumnModel tcm = table.getColumnModel(); //������ ���̺��� �÷��� ��������
		
		for(int i = 0;i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr); // ������ ���������� dtcr�� set
		}

		JScrollPane jscp1 = new JScrollPane(table);//���̺� �� �� �ְ� ����
		jscp1.setLocation(200, 200);
		jscp1.setSize(900, 572);
		
		this.add(jscp1);
			
}
}
