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
     //db로 넘겨주기
     public ResultSet insertIntro(String text){
        try {
        	String ID = LoginChk.isLogin_chk();
             query = "INSERT INTO mypage values('"+ID+"', '"+text+"');";
             Statement sta = connection.createStatement();
             sta.executeUpdate(query);
             System.out.println(query);
//             if(sta != null) sta.close();
//             if(connection != null) connection.close();
             System.out.println("DB mypage 글등록 완료");
          } catch (SQLException e){
             e.printStackTrace();
             System.out.println("DB mypage 글등록 실패!! 사유 : " + e.getMessage());
          }
        return rs;
     }
     
     //
     public String nicNameView() {
    	 String ID = LoginChk.isLogin_chk();
    	 String nicName=null;
    	 
    	 return nicName;
     }
     
}