//기록/랭킹비교 - 민지

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
		// 메인 화면 패널
		this.setBackground(new Color(242, 242, 242));
		this.setBounds(0, 0, 1280, 960);
		frame.getContentPane().add(this);
		this.setLayout(null);

		//테이블
		String []header = {"종목", "남자선수명" , "남자기록", "여자선수명", "여자기록"};
		String [][]contents = {{"가라테", "박희준", "5위", "기록 없음", "기록 없음"}, 
				{"골프", "안병훈", "11위", "박인비", "금"},
				{"근대5종", "전웅태", "동", "김세희", "11위"},
				{"기계체조", "신재환", "금", "여서정", "동"},
				{"농구", "대표팀", "8위", "대표팀", "은"},
				{"다이빙", "우하람", "4위", "김수지","15위"},
				{"럭비", "대표팀", "12위", "기록 없음", "기록 없음"}, 
				{"리듬체조", "-", "-", "손연재", "4위"},
				{"레슬링", "김현우", "금", "이나래", "7위"},
				{"배구", "대표팀", "5위", "대표팀", "동"},
				{"배드민턴", "하태권-김동문", "금", "방수현", "금"},
				{"복싱", "박시헌", "금", "오연지", "9위"},
				{"사격", "진종오", "금", "김장미", "금"},
				{"사이클 트랙", "조호성", "4위", "이혜진", "8위"},
				{"사이클 도로", "박성백", "87위", "나아름", "13위"},
				{"수구", "대표팀", "12위", "기록 없음", "기록 없음"}, 
				{"수영", "박태환", "금", "남유선", "7위"},
				{"스포츠 클라이밍", "천종원", "10위", "서채현", "8위"},
				{"승마", "-", "-", "-", "-"},
				{"아티스틱 스위밍", "-", "-","장윤경-유나미", "11위"},
				{"야구", "대표팀", "금", "-", "-"},
				{"양궁", "대표팀", "금", "안산", "금"},
				{"역도", "사재혁", "금", "장미란", "금"},
				{"요트", "하지민", "7위", "주순안", "13위"},
				{"유도", "송대남", "금", "조민선", "금"},
				{"육상", "황영조", "금", "백옥자", "13위"},
				{"조정", "대표팀", "10위", "대표팀", "9위"},
				{"철인3종", "허민호", "54위", "기록 없음", "기록 없음"}, 
				{"축구", "대표팀", "동", "기록 없음", "기록 없음"}, 
				{"카누", "조광희-최민규", "9위", "대표팀", "13위"},
				{"탁구", "유승민", "금", "현정화-양영자", "금"},
				{"태권도", "차동민", "금", "오혜리", "금"},
				{"테니스", "김봉수", "16강", "김일순", "16강"},
				{"펜싱", "사브르 단체", "금", "김지연", "금"},
				{"하키", "대표팀", "은", "대표팀", "은"},
				{"핸드볼", "대표팀", "은", "대표팀", "금"}};
		
		JTable table = new JTable(contents, header);
		//테이블 행, 열 크기 조절
		table.setRowHeight(50);
		table.getColumn(header[0]).setPreferredWidth(150);
		table.getColumn(header[1]).setPreferredWidth(250);
		table.getColumn(header[2]).setPreferredWidth(100);
		table.getColumn(header[3]).setPreferredWidth(250);
		table.getColumn(header[4]).setPreferredWidth(100);
		
		//테이블 크기 
		table.setRowHeight(49);
		table.setFont(new Font("맑은고딕", Font.PLAIN, 18));
		JTableHeader THeader = table.getTableHeader();
		//헤더 배경 색 
		THeader.setBackground(Color.BLACK);
		
		//헤더 글자 색 및 배경 색 + 글자 크기
		THeader.setForeground(Color.WHITE);
		THeader.setBackground(Color.BLACK);
		THeader.setFont(new Font("맑은고딕", Font.BOLD, 18));
		
		//테이블 내용 가운데 정렬
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); //디폴트테이블셀렌더러 생성
		dtcr.setHorizontalAlignment(SwingConstants.CENTER); //렌더러의 가로정렬 CENTER
		TableColumnModel tcm = table.getColumnModel(); //정렬할 테이블의 컬럼모델 가져오기
		
		for(int i = 0;i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr); // 각각의 셀렌더러를 dtcr에 set
		}

		JScrollPane jscp1 = new JScrollPane(table);//테이블 볼 수 있게 해줌
		jscp1.setLocation(200, 200);
		jscp1.setSize(900, 572);
		
		this.add(jscp1);
			
}
}