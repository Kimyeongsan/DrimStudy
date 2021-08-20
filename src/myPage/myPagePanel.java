
package myPage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class myPagePanel extends JPanel {
   
   public myPagePanel(JFrame frame) {
         super();
         panelInit(frame);
      }
   
   private void panelInit(JFrame frame) {
         // myPage ȭ�� �г�
         this.setBackground(new Color(255, 255, 255));
         this.setBounds(0, 0, 1280, 960);
         this.setLayout(null);

         //�α��� ����
         JLabel IDtitle = new JLabel("����������");
         IDtitle.setBounds(130, 50, 800, 35);
         IDtitle.setFont(new Font("���", Font.BOLD, 30)); // Font
         IDtitle.setForeground(Color.white); // Color
         IDtitle.setBackground(new Color(24, 23, 23));
         IDtitle.setOpaque(true);
         IDtitle.setHorizontalAlignment(JLabel.CENTER);
         this.add(IDtitle);

           JLabel nicInput = new JLabel("�г���");
           nicInput.setBounds(330, 120, 200, 40);
           nicInput.setFont(new Font("���", Font.BOLD, 20)); // Font
           nicInput.setForeground(Color.black); // Color
           nicInput.setBackground(new Color(166, 166, 166));
           nicInput.setOpaque(true);
           nicInput.setHorizontalAlignment(JLabel.CENTER);
          this.add(nicInput);
           
           // �̸� �Է�
          //DB ȸ�� - �г��� �ҷ�����
         JTextField NicInput = new JTextField("�г���");
         NicInput.setBounds(535, 120, 400, 40);
         NicInput.setFont(new Font("���", Font.BOLD, 20)); // Font
         NicInput.setForeground(Color.black); // Color
         NicInput.setOpaque(true);
         NicInput.setHorizontalAlignment(JLabel.CENTER);
          this.add(NicInput);
          

            
            //int cnt = 0;

            //�ڵ���ũ��
            //JScrollPane scrollPane = new JScrollPane(introInput);
            //scrollPane.setVerticalScrollBarPolicy(scrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            
              //scrollPane.setBounds(12, 10, 471, 389);
              //frame.getContentPane().add(scrollPane);
            
            //this.add(scrollPane); //ȭ�鿡 �߰�

          //���� ���
         ImageIcon icon = new ImageIcon("./img/header.png");
         
         Image regImg = icon.getImage();
         Image changeImg = regImg.getScaledInstance(200, 250, Image.SCALE_SMOOTH);
         ImageIcon changeIcon = new ImageIcon(changeImg);
         
         JLabel regLabel = new JLabel(changeIcon);
         
         regLabel.setBounds(130, 120, 190, 250);
         add(regLabel);;

         
   }
   
   
}