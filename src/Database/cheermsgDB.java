package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

	private ResultSet rs=null;
    private String query=null;
    private Statement sta;
    private PreparedStatement ps;

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
	
	public String getColor() {
		try {
		query = "SELECT EXISTS (SELECT * FROM account_chk WHERE ischeck = 'true' limit 1) AS SUCCESS;";
        Statement sta = con.createStatement();
        rs = sta.executeQuery(query);
        System.out.println(query);
        if(rs.next()){
           int i=1;
            if(i == rs.getInt("SUCCESS")){
                 System.out.println("�α��� �Ǿ�����!!!\n");
                 query = "SELECT * FROM account_chk Order BY ID DESC LIMIT 1;";
                 Statement sta1 = con.createStatement();
                 rs = sta1.executeQuery(query);
                 System.out.println(query);
                 if(rs.next()){
                	 return rs.getString("bgColor");
                 }
            }
            else {
               System.out.println("�α׾ƿ���!!!!\n");
            }
         }
//        if(sta != null) sta.close();
//        if(connection != null) connection.close();
        System.out.println("DB �α��� �Ϸ�");
     }
      catch (SQLException e){
        e.printStackTrace();
        System.out.println("DB islogin ����!! ���� : " + e.getMessage());
     }
      return null;
		
	}
	
}