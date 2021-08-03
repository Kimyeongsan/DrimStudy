package Main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame {
	private JFrame frame;
	private MainAction mainAction;
	
	public MainFrame() {
		frame = new JFrame();
		Initialize();
	}
	
	//Main Frame ũ��
	private void frameInit() {
		frame.setTitle("Drim Olympic");
		frame.setBounds(100, 100, 1280, 960);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		// ���� Title 
		JLabel tilteLabel = new JLabel("Drim Olympic");
		tilteLabel.setBounds(0, 50, 1280, 60);
		
		tilteLabel.setFont(new Font("Arial", Font.BOLD, 35));  // Font
		
		tilteLabel.setForeground(Color.white);  // Color
		tilteLabel.setBackground(new Color(51, 63, 80));
		 
		tilteLabel.setOpaque(true);
		
		
		tilteLabel.setHorizontalAlignment(JLabel.CENTER); //Position
		
		frame.add(tilteLabel);
		
		// Header
		JButton homebtn = new JButton("Home");
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
		underLabel.setFont(new Font("�������",Font.PLAIN,13));
		
		underLabel.setForeground(Color.black);
		underLabel.setBackground(new Color(204,204,204));
		
		underLabel.setOpaque(true);
		
		underLabel.setHorizontalAlignment(JLabel.CENTER);
		underLabel.setBounds(0, 803, 1280, 40);
		frame.add(underLabel);
	}

	private void Initialize() {
		frameInit();
		mainAction = new MainAction(frame);
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					
					window.frame.setVisible(true);
					window.frame.setResizable(false);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
