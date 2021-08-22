//���/��ŷ�� - ����

package RankCompare;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

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
		
		//����Ʈ�� �ٲٱ�
		RankParser getrankparser = new RankParser();
		getrankparser.addList();
		
		ArrayList<String> gameList = getrankparser.getListGame();
		Iterator<String> itrGame = gameList.iterator();
		ArrayList<String> m_player_List = getrankparser.getListMP();
		Iterator<String> itrMP = m_player_List.iterator();
		ArrayList<String> m_rank_List = getrankparser.getListMR();
		Iterator<String> itrMR = m_rank_List.iterator();
		ArrayList<String> f_player_List = getrankparser.getListFP();
		Iterator<String> itrFP = f_player_List.iterator();
		ArrayList<String> f_rank_List = getrankparser.getListFR();
		Iterator<String> itrFR = f_rank_List.iterator();

		
        //���̺�
	    String []header = {"����", "���ڼ�����" , "���ڱ��", "���ڼ�����", "���ڱ��"};
	    String [][]contents = new String[36][header.length];
	   
		   for(int j = 0; j < 36; j++) {
			   int size = 0;
			   contents[j][size] = itrGame.next();
			   size++;
			   contents[j][size] = itrMP.next();
			   size++;
			   contents[j][size] = itrMR.next();
			   size++;
			   contents[j][size] = itrFP.next();
			   size++;
			   contents[j][size] = itrFR.next();
			   size++;
		   }
		   
		
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
