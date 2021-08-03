package Main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Cheering.CheerPanel;
import GameInf.GameInfPanel;
import Player.PlayerPanel;
import RankCompare.RankComparePanel;

public class MainFrame {
	private JFrame frame;
	private JButton player_Btn, cheering_Btn, gameInf_Btn, rank_Btn;

	private MainAction mainAction;
	private CheerPanel cheerPanel;
	private GameInfPanel gameInfPanel;
	private PlayerPanel playerPanel;
	private RankComparePanel rankComparePanel;

	public MainFrame() {
		frame = new JFrame();
		Initialize();
	}

	// Main Frame
	private void frameInit() {
		frame.setTitle("Drim Olympic");
		frame.setBounds(100, 100, 1280, 960);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// 메인 Title
		JLabel tilteLabel = new JLabel("Drim Olympic");
		tilteLabel.setBounds(0, 50, 1280, 60);

		tilteLabel.setFont(new Font("Arial", Font.BOLD, 35)); // Font

		tilteLabel.setForeground(Color.white); // Color
		tilteLabel.setBackground(new Color(51, 63, 80));
		tilteLabel.setOpaque(true);

		tilteLabel.setHorizontalAlignment(JLabel.CENTER); // Position

		frame.add(tilteLabel);

		// Footer
		JLabel underLabel = new JLabel("㈜ 드림시스  ⓒ 명지대 인턴 프로젝트");
		underLabel.setFont(new Font("맑은고딕", Font.PLAIN, 13));

		underLabel.setForeground(Color.black);
		underLabel.setBackground(new Color(204, 204, 204));

		underLabel.setOpaque(true);

		underLabel.setHorizontalAlignment(JLabel.CENTER);
		underLabel.setBounds(0, 803, 1280, 40);

		frame.add(underLabel);

		menuButton(); // MenuButton 호출
	}
	
	// Menu Add
	private void menuButton() {
		// 선수소개 이동
		player_Btn = new JButton("선수소개");
		player_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainAction.setVisible(false);
				cheerPanel.setVisible(true);
				gameInfPanel.setVisible(false);
				playerPanel.setVisible(false);
				rankComparePanel.setVisible(false);
				
			}
		});
		player_Btn.setBounds(200, 130, 150, 45);
		frame.add(player_Btn);

		// 응원게시판 이동
		cheering_Btn = new JButton("응원게시판");
		cheering_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainAction.setVisible(false);
				cheerPanel.setVisible(false);
				gameInfPanel.setVisible(true);
				playerPanel.setVisible(false);
				rankComparePanel.setVisible(false);
			}
		});
		cheering_Btn.setBounds(450, 130, 150, 45);
		frame.add(cheering_Btn);

		// 실시간 경기정보 이동
		gameInf_Btn = new JButton("실시간 경기정보");
		gameInf_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainAction.setVisible(false);
				cheerPanel.setVisible(false);
				gameInfPanel.setVisible(false);
				playerPanel.setVisible(true);
				rankComparePanel.setVisible(false);
			}
		});
		gameInf_Btn.setBounds(700, 130, 150, 45);
		frame.add(gameInf_Btn);
		
		// 랭킹 비교 이동
		rank_Btn = new JButton("메달 랭킹 비교");
		rank_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainAction.setVisible(false);
				cheerPanel.setVisible(false);
				gameInfPanel.setVisible(false);
				playerPanel.setVisible(false);
				rankComparePanel.setVisible(true);
			}
		});
		rank_Btn.setBounds(950, 130, 150, 45);
		frame.add(rank_Btn);
	}

	private void Initialize() {
		frameInit();
		mainAction = new MainAction(frame);
		cheerPanel = new CheerPanel(frame);
		gameInfPanel =  new GameInfPanel(frame);
		playerPanel = new PlayerPanel(frame);
		rankComparePanel = new RankComparePanel(frame);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();

					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
