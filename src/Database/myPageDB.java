package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Login.LoginCheck;

public class myPageDB {
    private Connection connection;
     private ConnectionDB DB_Connection;
     
     private ResultSet rs=null;
     private String query=null;
     private Statement sta;
     private PreparedStatement ps;
     LoginCheck LoginChk = new LoginCheck();
     
     public myPageDB() {
        ConnectionDB DB_Connection = new ConnectionDB();
        connection = DB_Connection.getConnection();
     }
     
     //db�� �Ѱ��ֱ�
     public ResultSet insertIntro(String text){
        try {
        	String ID = LoginChk.isLogin_chk();
             query = "INSERT INTO mypage values('"+ID+"', '"+text+"');";
             Statement sta = connection.createStatement();
             sta.executeUpdate(query);
             System.out.println(query);
             System.out.println("DB mypage �۵�� �Ϸ�");
          } catch (SQLException e){
             e.printStackTrace();
             System.out.println("DB mypage �۵�� ����!! ���� : " + e.getMessage());
          }
        return rs;
     }
     
     //�г��� ���
     public String nicNameOutPut() {
    	 
		try {
			String ID = LoginChk.isLogin_chk();
	    	 String nicName=null;
	    	 query = "SELECT nicName FROM account WHERE ID = '"+ID+"';";
	    	 Statement sta = connection.createStatement();
	    	 rs = sta.executeQuery(query);
			 System.out.println(query);
			 if(rs.next()){
			 return rs.getString("nicName");
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DB mypage �г��� ����!! ���� : " + e.getMessage());
		}
    	 return null;
     }
}