package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.JOptionPane;

import Cheering.cheermsgPanel;
import Cheering.cheermsgVO;
//import test.GetterSetter;

public class cheermsgDB {
	
	//String color; //���͸� �̿��ؼ� �����͸� ����� �ٰ��̹Ƿ� �̺κ��� ����
	//String cheertext;
	
	ConnectionDB cDB = null;
	Connection con = null;


	//ArrayList<GetterSetter> ar = new ArrayList<GetterSetter>(); // ���͸� �θ����� �̺κ��� �ʿ����
	public cheermsgDB() {
		//public Connection con; // DB Ŀ�ؼ� ���� ��ü
		cDB = new ConnectionDB();
		con = cDB.getConnection();
	}
	
	public void sendDB(cheermsgVO s) { // MsgVO ���� data�� GET �ؼ� �����
		
		try {
	
			String query = "INSERT INTO cheermsg(bgcolor, cheertext) VALUES('" + s.getColor() + "','" + s.getCheertext() + "')";
			
			JOptionPane.showMessageDialog
            (null, "�����޽��� ��ϿϷ�!", "CHEER MESSAGE", JOptionPane.INFORMATION_MESSAGE);
			
			System.out.println("����: " + s.getColor() + " / ����: '" + s.getCheertext() + "' �� " + "DB�� ���۵Ǿ����ϴ�!");
			Statement state = con.createStatement();
			
			int x = state.executeUpdate(query);
			System.out.println("������ query�� : " + x);
			
			query= "SELECT * from cheermsg";
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