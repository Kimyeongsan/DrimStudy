package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RegisterDB {
   private Connection connection;
   private ConnectionDB DB_Connection;
   
   private ResultSet rs=null;
   private String query=null;
   private Statement sta;
   private PreparedStatement ps;
   String a =null;
   
   public RegisterDB() {
      ConnectionDB DB_Connection = new ConnectionDB();
      connection = DB_Connection.getConnection();
   }

   //ȸ������
   public ResultSet getRegisterInsert(String inputName, String inID, 
         String inPW, String inputEmail, String inputNic) {
      try {
         query = "INSERT INTO account values('" + inputName + "','" + inID + "','" + inPW + "','" +
               inputEmail + "','" + inputNic + "')";
         Statement sta = connection.createStatement();
         sta.executeUpdate(query);
         System.out.println(query);
         System.out.println("DB register ȸ����� �Ϸ�");
      } catch (SQLException e){
         e.printStackTrace();
         System.out.println("DB ȸ����� ����!! ���� : " + e.getMessage());
      }
      return rs;
   }
   
   //ȸ������ �� ȸ����ȸ
   public boolean getRegisterSelect(String dbIN, String in){
      try {
         query = "SELECT * FROM account WHERE "+ dbIN+ " = '" + in + "';";
         Statement sta = connection.createStatement();
         rs = sta.executeQuery(query);
         System.out.println(query);

         while(rs.next()) {
            if(rs.getString(dbIN).equals(in)) {
               System.out.println("DB ȸ����ȸ �ߺ��߻�!!!!\n");
               return false;
            }
            else {
               System.out.println("DB ȸ����ȸ�Ϸ�\n");
            }
         }
      } catch (SQLException e){
         e.printStackTrace();
         System.out.println("DB ȸ����ȸ ����!! ���� : " + e.getMessage());
      } 
      return true;
   }
}