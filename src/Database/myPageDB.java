package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class myPageDB {
    private Connection connection;
     private ConnectionDB DB_Connection;
     
     private ResultSet rs=null;
     private String query=null;
     private Statement sta;
     private PreparedStatement ps;
     
     public myPageDB() {
        ConnectionDB DB_Connection = new ConnectionDB();
      connection = DB_Connection.getConnection();
     }
     public ResultSet insertIntro(String text){
        try {
             query = "INSERT INTO mypage values('')";
             Statement sta = connection.createStatement();
             sta.executeUpdate(query);
             System.out.println(query);
//             if(sta != null) sta.close();
//             if(connection != null) connection.close();
             System.out.println("DB register ȸ����� �Ϸ�");
          } catch (SQLException e){
             e.printStackTrace();
             System.out.println("DB ȸ����� ����!! ���� : " + e.getMessage());
          }
        return rs;
     }
}