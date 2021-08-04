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
import GameInf.GameInfFrame;
import Player.PlayerFrame;
import RankCompare.RankComparePanel;

public class MainFrame {
	private JFrame frame;
	private JButton player_Btn, cheering_Btn, gameInf_Btn, rank_Btn;

	private MainAction mainAction;
	private CheerPanel cheerPanel;
	private GameInfFrame gameInfPanel;
	private PlayerFrame playerPanel;
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

		// ���� Title
		JLabel tilteLabel = new JLabel("Drim Olympic");
		tilteLabel.setBounds(0, 50, 1280, 60);

		tilteLabel.setFont(new Font("Arial", Font.BOLD, 35)); // Font

		tilteLabel.setForeground(Color.white); // Color
		tilteLabel.setBackground(new Color(51, 63, 80));
		tilteLabel.setOpaque(true);

		tilteLabel.setHorizontalAlignment(JLabel.CENTER); // Position

		frame.add(tilteLabel);
		
		// Header
		JButton homebtn = new JButton("Home");
		homebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainAction.setVisible(true);
				cheerPanel.setVisible(false);
				gameInfPanel.setVisible(false);
				playerPanel.setVisible(false);
				rankComparePanel.setVisible(false);
			}
		});
		
		homebtn.setFont(new Font("���", Font.BOLD, 14));
		homebtn.setBackground(new Color(217, 217, 217));
		homebtn.setBounds(10, 20, 75, 23);
		frame.add(homebtn);
		
		
		JButton loginbtn = new JButton("�α���");
		loginbtn.setFont(new Font("���", Font.BOLD, 13));
		loginbtn.setBackground(new Color(217, 217, 217));
		loginbtn.setBounds(1180, 20, 75, 23);
		frame.add(loginbtn);
		
		/*
		homebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//��ư ������ �� ���� ȿ�� ����.
			}
		});
		*/
		
		// Footer
		JLabel underLabel = new JLabel("�� �帲�ý�  �� ������ ���� ������Ʈ");
		underLabel.setFont(new Font("�������", Font.PLAIN, 13));

		underLabel.setForeground(Color.black);
		underLabel.setBackground(new Color(204, 204, 204));

		underLabel.setOpaque(true);

		underLabel.setHorizontalAlignment(JLabel.CENTER);
		underLabel.setBounds(0, 880, 1280, 40);

		frame.add(underLabel);

		menuButton(); // MenuButton ȣ��
	}
	
	// Menu Add
	private void menuButton() {
		// �����Ұ� �̵�
		player_Btn = new JButton("�����Ұ�");
		player_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainAction.setVisible(false);
				playerPanel.setVisible(true);
				cheerPanel.setVisible(false);
				gameInfPanel.setVisible(false);				
				rankComparePanel.setVisible(false);
				
			}
		});
		player_Btn.setBounds(200, 130, 150, 45);
		frame.add(player_Btn);

		// �����Խ��� �̵�
		cheering_Btn = new JButton("�����Խ���");
		cheering_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainAction.setVisible(false);
				playerPanel.setVisible(false);
				cheerPanel.setVisible(true);
				gameInfPanel.setVisible(false);				
				rankComparePanel.setVisible(false);
			}
		});
		cheering_Btn.setBounds(450, 130, 150, 45);
		frame.add(cheering_Btn);

		// �ǽð� ������� �̵�
		gameInf_Btn = new JButton("�ǽð� �������");
		gameInf_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainAction.setVisible(false);
				playerPanel.setVisible(false);
				cheerPanel.setVisible(false);
				gameInfPanel.setVisible(true);
				rankComparePanel.setVisible(false);
			}
		});
		gameInf_Btn.setBounds(700, 130, 150, 45);
		frame.add(gameInf_Btn);
		
		// ��ŷ �� �̵�
		rank_Btn = new JButton("�޴� ��ŷ ��");
		rank_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainAction.setVisible(false);
				playerPanel.setVisible(false);
				cheerPanel.setVisible(false);
				gameInfPanel.setVisible(false);				
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
		gameInfPanel =  new GameInfFrame(frame);
		playerPanel = new PlayerFrame(frame);
		rankComparePanel = new RankComparePanel(frame);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();

					window.frame.setVisible(true);
//					window.frame.setResizable(false);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}