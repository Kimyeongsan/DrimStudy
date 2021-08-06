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
		
		// 종목 입력
		String eventList[] = {"종목", "축구", "야구", "배구" };

		JComboBox eventBox = new JComboBox<Object>(eventList);
		eventBox.setBounds(150, 40, 70, 32);
		eventBox.setForeground(Color.white);
		eventBox.setBackground(new Color(2, 12, 12));
		eventBox.setFont(new Font("맑은고딕", Font.BOLD, 16));

		this.add(eventBox);
				
        String header[]={"종목", "게시물 내용", "순위/메달여부"};
        String contents[][]={
                {"이정현", "양궁선수드디어금메달", "1위/금메달"},
                {"김영호", "박태환 선수를 뛰어넘는 ", "2위/은메달"},
                {"전수용", "3위의 아쉬움을 전해요잉", "3위/동메달"},
                {"김진희", "쓸말없다", "없음"},
                {"신정섭", "곧 점심시간", "없음"},
                {"김승현", "맥도날드 갈거야", "없음"},
                {"김영석", "1위는 1955", "1위/금메달"},
                {"이정석", "2위는 불고기버거", "2위/은메달"},
                {"이승근", "내 맘속 맥도날드 1위 버거킹 2위", "2위/은메달"},
                {"강하연", "오늘은 미숫가루!~", "없음"}
        };

        JTable table = new JTable(contents, header);
        //table.setLocation(0,0);
        
        JScrollPane jscp1 = new JScrollPane(table); //이런식으로 생성시에 테이블을 넘겨주어야 정상적으로 볼 수 있다.
                                                    //jscp1.add(table); 과 같이 실행하면, 정상적으로 출력되지 않음.
        jscp1.setLocation(70,40);
        jscp1.setSize(1060,315);
       
        //mainPanel.add(jscp1);  // 이 부분을 해줘야 Panel위에 표를 추가할 수 있음.
        this.add(jscp1);

		//테이블 행, 열 크기 조절
        //table.getRow(header).setPreferredHi
		table.setRowHeight(28);
		table.getColumn(header[0]).setPreferredWidth(200);
		table.getColumn(header[1]).setPreferredWidth(500);
		table.getColumn(header[2]).setPreferredWidth(300);
		
		table.getTableHeader().setBackground(new Color(12, 12, 12));
		table.getTableHeader().setFont(new Font("맑은고딕", Font.BOLD, 16)); 
		table.getTableHeader().setForeground(Color.white);
		table.getTableHeader().setPreferredSize(new Dimension(1,32));
		
		//테이블 내용 가운데 정렬
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); //디폴트테이블셀렌더러 생성
		dtcr.setHorizontalAlignment(SwingConstants.CENTER); //렌더러의 가로정렬 CENTER
		TableColumnModel tcm = table.getColumnModel(); //정렬할 테이블의 컬럼모델 가져오기
		
		for(int i = 0;i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr); // 각각의 셀렌더러를 dtcr에 set
		}
		
		//////////////////////////////////////////////////////////////////
		
		/*
		// 글쓰기 버튼
		JButton writebtn = new JButton("글쓰기");
		writebtn.setFont(new Font("맑은고딕", Font.BOLD, 13));
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
	
	// 검색어 입력
	private void Search_InputBox() {
		// 이름 입력
		JTextField s1 = new JTextField("   검색어를 입력하시오.");
		s1.setBounds(820, 0, 240, 30);

		this.add(s1);
		
		s1.addMouseListener(new MouseAdapter(){
	          @Override
	          public void mouseClicked(MouseEvent e){
	             s1.setText("");
	          }
	    });
		// input 결과물 출력
		JButton btnSearch = new JButton("검색");
		btnSearch.setBounds(1060, 0, 68, 30);
		btnSearch.setBackground(Color.black);
		btnSearch.setForeground(Color.white);
		
		this.add(btnSearch);
				
				
		// 적용버튼 리스너
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search;

				search = (String) s1.getText();
				
				// 임시 출력
				System.out.println(search);

			}
		});
	}
}