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
		String []header = {"����", "���ڼ�����" , "���ڱ��", "���ڼ�����", "���ڱ��"};
		String [][]contents = {{"������", "������", "5��", "��� ����", "��� ����"}, 
				{"����", "�Ⱥ���", "11��", "���κ�", "��"},
				{"�ٴ�5��", "������", "��", "�輼��", "11��"},
				{"���ü��", "����ȯ", "��", "������", "��"},
				{"��", "��ǥ��", "8��", "��ǥ��", "��"},
				{"���̺�", "���϶�", "4��", "�����","15��"},
				{"����", "��ǥ��", "12��", "��� ����", "��� ����"}, 
				{"����ü��", "-", "-", "�տ���", "4��"},
				{"������", "������", "��", "�̳���", "7��"},
				{"�豸", "��ǥ��", "5��", "��ǥ��", "��"},
				{"������", "���±�-�赿��", "��", "�����", "��"},
				{"����", "�ڽ���", "��", "������", "9��"},
				{"���", "������", "��", "�����", "��"},
				{"����Ŭ Ʈ��", "��ȣ��", "4��", "������", "8��"},
				{"����Ŭ ����", "�ڼ���", "87��", "���Ƹ�", "13��"},
				{"����", "��ǥ��", "12��", "��� ����", "��� ����"}, 
				{"����", "����ȯ", "��", "������", "7��"},
				{"������ Ŭ���̹�", "õ����", "10��", "��ä��", "8��"},
				{"�¸�", "-", "-", "-", "-"},
				{"��Ƽ��ƽ ������", "-", "-","������-������", "11��"},
				{"�߱�", "��ǥ��", "��", "-", "-"},
				{"���", "��ǥ��", "��", "�Ȼ�", "��"},
				{"����", "������", "��", "��̶�", "��"},
				{"��Ʈ", "������", "7��", "�ּ���", "13��"},
				{"����", "�۴볲", "��", "���μ�", "��"},
				{"����", "Ȳ����", "��", "�����", "13��"},
				{"����", "��ǥ��", "10��", "��ǥ��", "9��"},
				{"ö��3��", "���ȣ", "54��", "��� ����", "��� ����"}, 
				{"�౸", "��ǥ��", "��", "��� ����", "��� ����"}, 
				{"ī��", "������-�ֹα�", "9��", "��ǥ��", "13��"},
				{"Ź��", "���¹�", "��", "����ȭ-�翵��", "��"},
				{"�±ǵ�", "������", "��", "������", "��"},
				{"�״Ͻ�", "�����", "16��", "���ϼ�", "16��"},
				{"���", "��긣 ��ü", "��", "������", "��"},
				{"��Ű", "��ǥ��", "��", "��ǥ��", "��"},
				{"�ڵ庼", "��ǥ��", "��", "��ǥ��", "��"}};
		
		JTable table = new JTable(contents, header);
		//���̺� ��, �� ũ�� ����
		table.setRowHeight(50);
		table.getColumn(header[0]).setPreferredWidth(150);
		table.getColumn(header[1]).setPreferredWidth(250);
		table.getColumn(header[2]).setPreferredWidth(100);
		table.getColumn(header[3]).setPreferredWidth(250);
		table.getColumn(header[4]).setPreferredWidth(100);
		
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