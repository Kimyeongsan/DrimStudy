package GameInf;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

public class RankContent extends JPanel {

	String Country = " ";
	int Gold = 0;
	int Silver = 0;
	int Bronze = 0;
	int Sum = 0;

	public void setCount(String country) {
		this.Country = country;
	}

	public void setGold(int gold) {
		this.Gold = gold;
	}

	public void setSilver(int silver) {
		this.Silver = silver;
	}

	public void setBronze(int bronze) {
		this.Bronze = bronze;
	}

	public void setSum(int sum) {
		this.Sum = sum;
	}

	public RankContent(JFrame frame) {
		String header[] = { "����", "����", "��", "��", "��", "�հ�" };
		String contents[][] = { 
				{ "������", "��ü�������ݸ޴�", "1��/�ݸ޴�" }, 
				{ "�迵ȣ", "����ȯ ������ �پ�Ѵ� ", "2��/���޴�" },
				{ "������", "3���� �ƽ����� ���ؿ���", "3��/���޴�" }, 
				{ "������", "��������", "����" }, 
				{ "������", "�� ���ɽð�", "����" },
				{ "�����", "�Ƶ����� ���ž�", "����" }, 
				{ "�迵��", "1���� 1955", "1��/�ݸ޴�" }, 
				{ "������", "2���� �Ұ�����", "2��/���޴�" },
				{ "�̽±�", "�� ���� �Ƶ����� 1�� ����ŷ 2��", "2��/���޴�" }, 
				{ "���Ͽ�", "������ �̼�����!~", "����" } 
				};

		JTable table = new JTable(contents, header);
		// table.setLocation(0,0);

		JScrollPane jscp1 = new JScrollPane(table); // �̷������� �����ÿ� ���̺��� �Ѱ��־�� ���������� �� �� �ִ�.
													// jscp1.add(table); �� ���� �����ϸ�, ���������� ��µ��� ����.
		jscp1.setLocation(70, 40);
		jscp1.setSize(1060, 315);

		// mainPanel.add(jscp1); // �� �κ��� ����� Panel���� ǥ�� �߰��� �� ����.
		this.add(jscp1);

		// ���̺� ��, �� ũ�� ����
		// table.getRow(header).setPreferredHi
		table.setRowHeight(28);
		table.getColumn(header[0]).setPreferredWidth(200);
		table.getColumn(header[1]).setPreferredWidth(500);
		table.getColumn(header[2]).setPreferredWidth(300);

		table.getTableHeader().setBackground(new Color(12, 12, 12));
		table.getTableHeader().setFont(new Font("�������", Font.BOLD, 16));
		table.getTableHeader().setForeground(Color.white);
		table.getTableHeader().setPreferredSize(new Dimension(1, 32));

		// ���̺� ���� ��� ����
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); // ����Ʈ���̺������� ����
		dtcr.setHorizontalAlignment(SwingConstants.CENTER); // �������� �������� CENTER
		TableColumnModel tcm = table.getColumnModel(); // ������ ���̺��� �÷��� ��������

		for (int i = 0; i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr); // ������ ���������� dtcr�� set
		}

	}
}
