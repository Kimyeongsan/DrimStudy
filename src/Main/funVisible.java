package Main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Board.boardwriteFrame;
import Cheering.cheerFrame;
import Cheering.cheermsgFrame;
import GameInf.GameInfFrame;
import Player.PlayerFrame;
import RankCompare.RankComparePanel;

public class funVisible {
   
   public void panelVisible(String label, BoardFrame1 boardPanel1, BoardFrame2 boardPanel2, cheerFrame CheerPanel,
		   boardwriteFrame BoardWritePanel, cheermsgFrame cheermsgPanel, GameInfFrame gameInfPanel,
         PlayerFrame playerPanel, RankComparePanel rankComparePanel, JButton c_writebtn) {
      switch(label) {
     //home ȭ�� ���
      case "main": boardPanel1.setVisible(true);
                  boardPanel2.setVisible(true);
       
                  BoardWritePanel.setVisible(false);
                  CheerPanel.setVisible(false);
                  cheermsgPanel.setVisible(false);
                  gameInfPanel.setVisible(false);
                  playerPanel.setVisible(false);
                  rankComparePanel.setVisible(false);
                  c_writebtn.setVisible(false);
                  break;
      //home�� �ִ� ���ۼ��г�
      case "BoardWrite" : BoardWritePanel.setVisible(true);   
           
                          boardPanel1.setVisible(false);
                          boardPanel2.setVisible(false);
                          CheerPanel.setVisible(false);
                          cheermsgPanel.setVisible(false);
                          gameInfPanel.setVisible(false);
                          playerPanel.setVisible(false);
                          rankComparePanel.setVisible(false);
                          c_writebtn.setVisible(false);
                          break;
        //�����Խ��� ���ۼ��г�            
      case "cheermsg" :   boardPanel1.setVisible(false);
                         boardPanel2.setVisible(false);
                         BoardWritePanel.setVisible(false);
                         CheerPanel.setVisible(false);
                         
                         cheermsgPanel.setVisible(true);
                         gameInfPanel.setVisible(false);
                         playerPanel.setVisible(false);
                         rankComparePanel.setVisible(false);
                         c_writebtn.setVisible(false);

                         break;
          //�����Խ���            
      case "player" :  BoardWritePanel.setVisible(false);   
                      boardPanel1.setVisible(false);
                      boardPanel2.setVisible(false);
                      CheerPanel.setVisible(false);
                      cheermsgPanel.setVisible(false);
                      gameInfPanel.setVisible(false);
                      playerPanel.setVisible(true);
                      rankComparePanel.setVisible(false);
                      c_writebtn.setVisible(false);

                       break;
       //rank �Խ���            
      case "rank" :  BoardWritePanel.setVisible(false);   
                      boardPanel1.setVisible(false);
                      boardPanel2.setVisible(false);
                      CheerPanel.setVisible(false);
                      cheermsgPanel.setVisible(false);
                      gameInfPanel.setVisible(false);
                      playerPanel.setVisible(false);
                      rankComparePanel.setVisible(true);
                      c_writebtn.setVisible(false);

                       break;
       //�����Խ���            
      case "cheering" :  BoardWritePanel.setVisible(false);   
                      boardPanel1.setVisible(false);
                      boardPanel2.setVisible(false);
                      CheerPanel.setVisible(true);
                      cheermsgPanel.setVisible(false);
                      gameInfPanel.setVisible(false);
                      playerPanel.setVisible(false);
                      rankComparePanel.setVisible(false);
                      c_writebtn.setVisible(true);

                       break;
          //�ǽð� �Խ���            
      case "gameInf" :  BoardWritePanel.setVisible(false);   
                      boardPanel1.setVisible(false);
                      boardPanel2.setVisible(false);
                      CheerPanel.setVisible(false);
                      cheermsgPanel.setVisible(false);
                      gameInfPanel.setVisible(true);
                      playerPanel.setVisible(false);
                      rankComparePanel.setVisible(false);
                      c_writebtn.setVisible(false);

                       break;
      }
   }
   
   //menu ��ư ���̱�� menu ��ư�� ȿ������ �Լ�
   public void btnShow(JButton player_Btn, JButton cheering_Btn, 
          JButton gameInf_Btn, JButton rank_Btn) {
        player_Btn.setVisible(true);
        cheering_Btn.setVisible(true);
        gameInf_Btn.setVisible(true);
        rank_Btn.setVisible(true);
        
        player_Btn.setBorderPainted(false);
        player_Btn.setFocusPainted(false);
        cheering_Btn.setBorderPainted(false);
        cheering_Btn.setFocusPainted(false);
        gameInf_Btn.setBorderPainted(false);
        gameInf_Btn.setFocusPainted(false);
        rank_Btn.setBorderPainted(false);
        rank_Btn.setFocusPainted(false);
   }
   
   public void menuBtnShow(String label, JButton player_Btn, JButton cheering_Btn, 
          JButton gameInf_Btn, JButton rank_Btn) {
      switch(label) {
    //�����Խ���            
      case "player" :  player_Btn.setBorderPainted(true);
                     cheering_Btn.setBorderPainted(false);
                     cheering_Btn.setFocusPainted(false);
                     gameInf_Btn.setBorderPainted(false);
                     gameInf_Btn.setFocusPainted(false);
                     rank_Btn.setBorderPainted(false);
                     rank_Btn.setFocusPainted(false);
                       break;
       //rank �Խ���            
      case "rank" : rank_Btn.setBorderPainted(true);
                  player_Btn.setBorderPainted(false);
                  player_Btn.setFocusPainted(false);
                  cheering_Btn.setBorderPainted(false);
                  cheering_Btn.setFocusPainted(false);
                  gameInf_Btn.setBorderPainted(false);
                  gameInf_Btn.setFocusPainted(false);
                       break;
       //�����Խ���            
      case "cheering" :  cheering_Btn.setBorderPainted(true);
                        player_Btn.setBorderPainted(false);
                        player_Btn.setFocusPainted(false);
                        gameInf_Btn.setBorderPainted(false);
                        gameInf_Btn.setFocusPainted(false);
                        rank_Btn.setBorderPainted(false);
                        rank_Btn.setFocusPainted(false);
                       break;
          //�ǽð� �Խ���            
      case "gameInf" : gameInf_Btn.setBorderPainted(true);
                     player_Btn.setBorderPainted(false);
                     player_Btn.setFocusPainted(false);
                     cheering_Btn.setBorderPainted(false);
                     cheering_Btn.setFocusPainted(false);
                     rank_Btn.setBorderPainted(false);
                     rank_Btn.setFocusPainted(false);
                       break;
      }
   }
   
   //login ������ ��ư
   public void loginModeBtn(String label, JButton loginbtn, JButton logOutbtn, JButton myPage_Btn,
            JButton regMembtn, JButton writebtn) {
       switch(label) {
      //main          
     case "main" :
                  loginbtn.setVisible(false);
                  logOutbtn.setVisible(true);
                  myPage_Btn.setVisible(true);
                  regMembtn.setVisible(false);
         
                  //�����г�
                  writebtn.setVisible(true);
//                  c_writebtn.setVisible(false);
                    break;
     //main          
     case "cheering" :
                  loginbtn.setVisible(false);
                  logOutbtn.setVisible(true);
                  myPage_Btn.setVisible(true);
                  regMembtn.setVisible(false);
         
                  //�����г�
                  writebtn.setVisible(false);
//                  c_writebtn.setVisible(true);
                    break;
         default :
                     loginbtn.setVisible(false);
                  logOutbtn.setVisible(true);
                  myPage_Btn.setVisible(true);
                  regMembtn.setVisible(false);

                  //�����г�
                  writebtn.setVisible(false);
//                  c_writebtn.setVisible(false);
                  break;
       }
   }

   //login �������� ��ư
   public void freeModeBtn( JButton loginbtn, JButton logOutbtn, JButton myPage_Btn,
         JButton regMembtn, JButton writebtn) {
      //header��ư
        loginbtn.setVisible(true);
        logOutbtn.setVisible(false);
        myPage_Btn.setVisible(false);
        regMembtn.setVisible(true);
        
        //�����г�
        writebtn.setVisible(false);
//        c_writebtn.setVisible(false);
   }

   //��ҹ�ư ������ �г�txt �ʱ�ȭ
   public void initiText(JTextField inputName,JTextField inputEmail,JTextField inputNic,
         JTextField inID, JPasswordField inPW2, JPasswordField inPW, JPasswordField inputPW,JTextField inputID) {
        inputName.setText("�̸��� �Է��ϼ���.");
          inputEmail.setText("�̸����� �Է��ϼ���.");
         inputNic.setText("�г����� �Է��ϼ���.");
         inID.setText("ID�� �Է��ϼ���.");
         inPW2.setText("");
         inPW.setText("");
       
         inputPW.setText("");
        inputID.setText("ID�� �Է��ϼ���.");
   }
   
   //ȸ������ �Է�â �ʱ�ȭ
   public void clickIniti(JTextField text) {
      text.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
               text.setText("");
            }
        });
   }
}