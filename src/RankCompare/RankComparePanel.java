//기록/랭킹비교 - 민지

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
		// 메인 화면 패널
		this.setBackground(new Color(242, 242, 242));
		this.setBounds(0, 0, 1280, 960);
		
		frame.getContentPane().add(this);
		
		this.setLayout(null);

		
		//테이블
		String []table_div = {"종목", "2021 대한민국 기록", "대한민국 역대 최고 기록"};
		String [][]contents = {{"수영", "----(금)", "-------(금)"},
			                 	{"태권도", "----(금)", "-------(은)"},
			                 	{"탁구", "----(은)", "-------(금)"},
			                 	{"탁구", "----(은)", "-------(금)"},
			                 	{"탁구", "----(은)", "-------(금)"},
			                 	{"탁구", "----(은)", "-------(금)"},
			                 	{"탁구", "----(은)", "-------(금)"},
			                 	{"탁구", "----(은)", "-------(금)"},
			                 	{"탁구", "----(은)", "-------(금)"},
			                 	{"탁구", "----(은)", "-------(금)"},
			                 	{"탁구", "----(은)", "-------(금)"}};
		
		JTable table = new JTable(contents, table_div);
		
		//테이블 행, 열 크기 조절
		table.setRowHeight(50);
		table.getColumn(table_div[0]).setPreferredWidth(100);
		table.getColumn(table_div[1]).setPreferredWidth(400);
		table.getColumn(table_div[2]).setPreferredWidth(400);
		
		//테이블 내용 가운데 정렬
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); //디폴트테이블셀렌더러 생성
		dtcr.setHorizontalAlignment(SwingConstants.CENTER); //렌더러의 가로정렬 CENTER
		TableColumnModel tcm = table.getColumnModel(); //정렬할 테이블의 컬럼모델 가져오기
		
		for(int i = 0;i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr); // 각각의 셀렌더러를 dtcr에 set
		}
		
		
		

		JScrollPane jscp1 = new JScrollPane(table);//테이블 볼 수 있게 해줌
		jscp1.setLocation(200, 200);
		jscp1.setSize(900, 576);
		
		this.add(jscp1);
		
}
}
