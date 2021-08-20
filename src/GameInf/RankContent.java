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
		String header[] = { "순위", "국가", "금", "은", "동", "합계" };
		String contents[][] = { 
				{ "이정현", "양궁선수드디어금메달", "1위/금메달" }, 
				{ "김영호", "박태환 선수를 뛰어넘는 ", "2위/은메달" },
				{ "전수용", "3위의 아쉬움을 전해요잉", "3위/동메달" }, 
				{ "김진희", "쓸말없다", "없음" }, 
				{ "신정섭", "곧 점심시간", "없음" },
				{ "김승현", "맥도날드 갈거야", "없음" }, 
				{ "김영석", "1위는 1955", "1위/금메달" }, 
				{ "이정석", "2위는 불고기버거", "2위/은메달" },
				{ "이승근", "내 맘속 맥도날드 1위 버거킹 2위", "2위/은메달" }, 
				{ "강하연", "오늘은 미숫가루!~", "없음" } 
				};

		JTable table = new JTable(contents, header);
		// table.setLocation(0,0);

		JScrollPane jscp1 = new JScrollPane(table); // 이런식으로 생성시에 테이블을 넘겨주어야 정상적으로 볼 수 있다.
													// jscp1.add(table); 과 같이 실행하면, 정상적으로 출력되지 않음.
		jscp1.setLocation(70, 40);
		jscp1.setSize(1060, 315);

		// mainPanel.add(jscp1); // 이 부분을 해줘야 Panel위에 표를 추가할 수 있음.
		this.add(jscp1);

		// 테이블 행, 열 크기 조절
		// table.getRow(header).setPreferredHi
		table.setRowHeight(28);
		table.getColumn(header[0]).setPreferredWidth(200);
		table.getColumn(header[1]).setPreferredWidth(500);
		table.getColumn(header[2]).setPreferredWidth(300);

		table.getTableHeader().setBackground(new Color(12, 12, 12));
		table.getTableHeader().setFont(new Font("맑은고딕", Font.BOLD, 16));
		table.getTableHeader().setForeground(Color.white);
		table.getTableHeader().setPreferredSize(new Dimension(1, 32));

		// 테이블 내용 가운데 정렬
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); // 디폴트테이블셀렌더러 생성
		dtcr.setHorizontalAlignment(SwingConstants.CENTER); // 렌더러의 가로정렬 CENTER
		TableColumnModel tcm = table.getColumnModel(); // 정렬할 테이블의 컬럼모델 가져오기

		for (int i = 0; i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr); // 각각의 셀렌더러를 dtcr에 set
		}

	}
}
