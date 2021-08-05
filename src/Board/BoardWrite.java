package Board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardWrite {

   private Connection conn;
   private ResultSet rs;
   
   public BoardWrite() {
      try {
            String dbURL = "";
            String dbID = "root";
            String dbPassword = "";
            Class.forName("");
            conn=DriverManager.getConnection(dbURL, dbID, dbPassword);
            
      }catch(Exception e) {
            e.printStackTrace();
      }
      
   }
   
   public String getDate() {
      String SQL = "SELECT NOW()";
      try {
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            rs= pstmt.executeQuery();
            if(rs.next()) {
                  return rs.getString(1);
            }
      }catch(Exception e) {
            e.printStackTrace();
      }
      return "";
   }
   
   public int getNext() {
      String SQL = "SELECT ID FROM ORDER BY ID DESC";
      try {
         PreparedStatement pstmt = conn.prepareStatement(SQL);
         rs= pstmt.executeQuery();
         if(rs.next()) {
            return rs.getInt(1)+1;
         }
         return 1;
      }catch(Exception e) {
            e.printStackTrace();
      }
      return -1;
   }
   
   /*
   public int write(String Title, String ID, String Content);
      String SQL = "INSERT INTO VALUES(?, ?, ?, ?, ?, ?)";

      try {
         PreparedStatement pstmt = conn.prepareStatement(SQL);
         pstmt.setInt(1, getNext());
         pstmt.setString(2, Title);
         pstmt.setString(3, ID);
         pstmt.setString(4, getDate());
         pstmt.setString(5, Content);
         pstmt.setInt(6, 1);
         return pstmt.executeUpdate();
      }catch(Exception e) {
            e.printStackTrace();
      }
      return -1;
   } */ //일부 오류가 나서 수정할 예정입니다.
      
}