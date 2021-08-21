package GameInf;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class GameInfPanel extends JPanel {
	String event, news;

	NewsContent newsContent;

	public GameInfPanel(JFrame frame) {
		super();
		PanelInit(frame);
		InputBox();

		NewsPrint();
		RankPrint();
	}

	private void PanelInit(JFrame frame) {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 960);
		this.setLayout(null);

		// Medal Title
		JLabel tilteLabel = new JLabel("메달 순위");
		tilteLabel.setBounds(45, 35, 450, 40);

		tilteLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20)); // Font

		tilteLabel.setForeground(Color.white); // Color
		tilteLabel.setBackground(Color.black);
		tilteLabel.setOpaque(true);

		tilteLabel.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(tilteLabel);

	}

	private void InputBox() {
		
		//////////////////////////// 경기 파트
		
		// 경기 선택 DropBox
		String eventList[] = { "축구", "야구", "배구" };

		JComboBox<Object> eventBox = new JComboBox<Object>(eventList);
		eventBox.setBounds(550, 35, 350, 40);

		this.add(eventBox);

		// 경기 선택 버튼
		JButton gameBtn = new JButton("경기 선택");
		gameBtn.setBounds(920, 35, 130, 40);

		gameBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20)); // Font

		gameBtn.setForeground(Color.white); // Color
		gameBtn.setBackground(Color.black);
		gameBtn.setOpaque(true);

		gameBtn.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(gameBtn);

		// 적용버튼 리스너
		gameBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				event = (String) eventBox.getSelectedItem();

				System.out.println(event);
			}
		});
		
		//////////////////////////// News 파트
		
		// 이름 입력
		JTextField newsInput = new JTextField("김연경");
		newsInput.setBounds(550, 315, 350, 40);

		this.add(newsInput);

		// 뉴스 검색 버튼
		JButton newsBtn = new JButton("검색");

		newsBtn.setBounds(920, 315, 130, 40);

		newsBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20)); // Font

		newsBtn.setForeground(Color.white); // Color
		newsBtn.setBackground(Color.black);
		newsBtn.setOpaque(true);

		newsBtn.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(newsBtn);

		JPanel NewsPanels = new JPanel();
		NewsPanels.setBounds(550, 375, 500, 200);

		NewsPanels.setForeground(Color.black); // Color
		NewsPanels.setBackground(new Color(166, 166, 166));
		NewsPanels.setOpaque(true);

		this.add(NewsPanels);

		// 적용버튼 리스너
		newsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				news = (String) newsInput.getText();

				ArrayList<SearchVO> SL = new ArrayList<SearchVO>();

				CrawlingDAO.NewsCrawling(news, SL);

				newsContent.setFd(SL.get(0).getTitle());
				newsContent.setUd(SL.get(0).getContent());
				newsContent.setVisible(true);

				newsContent.repaint();
			}
		});

	}
	

	private void RankPrint() {

		ArrayList<RankVO> RL = new ArrayList<RankVO>();
		CrawlingDAO.RankCrawling(RL);

		String header[] = { "순위", "국가", "금", "은", "동", "합계" };

		DefaultTableModel model = new DefaultTableModel(header, 0); 
		
		JTable table = new JTable(model);
		
		String[] contents = new String[6]; 
		
		for(int i = 0; i < 10; i++) {
			String rank = Integer.toString(i + 1);
			
			contents[0] = rank;
			contents[1] = RL.get(i).getCountry();
			contents[2] = RL.get(i).getGold();
			contents[3] = RL.get(i).getSilver();
			contents[4] = RL.get(i).getBronze();
			contents[5] = RL.get(i).getSum();
			
			model.addRow(contents);
		}

		table.setRowHeight(55);
		table.getColumn(header[0]).setPreferredWidth(70);
		table.getColumn(header[1]).setPreferredWidth(82);
		table.getColumn(header[2]).setPreferredWidth(72);
		table.getColumn(header[3]).setPreferredWidth(72);
		table.getColumn(header[4]).setPreferredWidth(72);
		table.getColumn(header[5]).setPreferredWidth(72);

		table.setRowHeight(45);
		table.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		JTableHeader THeader = table.getTableHeader();

		THeader.setForeground(Color.WHITE);
		THeader.setBackground(Color.BLACK);
		THeader.setFont(new Font("맑은고딕", Font.BOLD, 15));

		// 테이블 내용 가운데 정렬
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();

		for (int j = 0; j < tcm.getColumnCount(); j++) {
			tcm.getColumn(j).setCellRenderer(dtcr);
		}

		JScrollPane jscp1 = new JScrollPane(table);
		jscp1.setLocation(45, 95);
		jscp1.setSize(450, 480);

		this.add(jscp1);
	}

	
	private void NewsPrint() {
		newsContent = new NewsContent();
		newsContent.setBounds(550, 375, 500, 200);

		newsContent.setForeground(Color.black); // Color
		newsContent.setBackground(new Color(166, 166, 166));
		newsContent.setOpaque(true);

		this.add(newsContent);
	}
}