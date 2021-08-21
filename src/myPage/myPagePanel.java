
package myPage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Database.myPageDB;
import Main.funcBtn;

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

         funcBtn funcBtn = new funcBtn();
         //�α��� ����
         JLabel IDtitle = new JLabel("����������");
         funcBtn.funcMainLabel(IDtitle, 130, 50, 800, 35,24, 23, 23);
         this.add(IDtitle);

           JLabel nicInput = new JLabel("�г���");
           funcBtn.funcLabel(nicInput, 330, 120, 200, 40,166, 166, 166);
          this.add(nicInput);
           
           // �̸� �Է�
          //DB ȸ�� - �г��� �ҷ�����
          myPageDB myPageDB =new myPageDB();
         JLabel NicInput = new JLabel(myPageDB.nicNameOutPut());
         funcBtn.funcLabel(NicInput, 535, 120, 400, 40,255,255,255);
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