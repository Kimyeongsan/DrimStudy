package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Board.BoardDTO;

public class BoardDB {
   private Connection connection;
   private ConnectionDB DB_Connection;
   
	ConnectionDB cDB = null;
	Connection con = null;
   
   public BoardDB() {
      cDB = new ConnectionDB();
      con = cDB.getConnection();
   }

   //�Խù� �ۼ�
   public void uploadDB(BoardDTO s) {
		
		try {
	
			String query = "INSERT INTO boardwrite(UserID, writer, wridate, pw, title, content, file) VALUES('" + s.getUserID() + "','" + s.getwriter() + "','" + s.getwridate() + "','" + s.getpw() + "','" + s.gettitle() + "','" + s.getcontent() + "','" + s.getfile() + "')";
			
			JOptionPane.showMessageDialog
           (null, "��ϵǾ����ϴ�!", "BOARD CONTENT", JOptionPane.INFORMATION_MESSAGE);
			
			System.out.println("�ۼ���: " + s.getUserID() + " / �ۼ��� ǥ��: " + s.getwriter() + " / �ۼ� �Ⱓ: " + s.getwridate() + " / ��й�ȣ: " + s.getpw() + " / ����: " + s.gettitle() + " / ����: " + s.gettitle() + "/ ÷������: " + s.getfile() + " �� " + "DB�� ���۵Ǿ����ϴ�!");
			Statement state = con.createStatement();
			
			int x = state.executeUpdate(query);
			System.out.println("������ query�� : " + x);
			
			query= "SELECT * from boardwrite";
			ResultSet rs = state.executeQuery(query);
			
			try {
				rs.close();
				state.close();
				con.close();
			 } catch (SQLException e1) { }
			
		} catch(Exception e) {
			System.out.println("ERROR : query�� DB�� ���� ����");
		    e.printStackTrace();
		}
   }
}