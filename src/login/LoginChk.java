package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Database.ConnectionDB;
import Database.LoginDB;

import login.loginVO;

public class LoginChk {

   private Connection connection;
   private ConnectionDB DB_Connection;
   private ResultSet rs=null;
   private String query=null;
   private Statement sta;
   private PreparedStatement ps;
   
   public LoginChk() {
         ConnectionDB DB_Connection = new ConnectionDB();
         connection = DB_Connection.getConnection();
         LoginDB loginDB = new LoginDB();
      }
   loginVO login = new loginVO();
   //�α��� üũ - DB ���
   public ResultSet Chk_Login(String myID, String myPW) {
      try {
            query = "INSERT INTO account_chk values('" + myID + "','" + myPW +"', true )";
            Statement sta = connection.createStatement();
            sta.executeUpdate(query);
            System.out.println(query);
            login.setMyID(myID);
            login.setMyPW(myPW);
            if(sta != null) sta.close();
            if(connection != null) connection.close();
            System.out.println("DB register ȸ����� �Ϸ�");
         } catch (SQLException e){
            e.printStackTrace();
            System.out.println("DB ȸ����� ����!! ���� : " + e.getMessage());
         }
         return rs;
   }
   
   //�α��� ����
   public boolean isLogin() {
      String myID = login.getMyID();
      String myPW = login.getMyPW();
      
      try {
           query = "SELECT * FROM account WHERE ID = '"+myID+"' AND PW = '"+myPW+"';";
           Statement sta = connection.createStatement();
           rs = sta.executeQuery(query);
           System.out.println(query);
           
           if(rs.next()){
              if(myPW.equals(rs.getString("PW")) && myID.equals(rs.getString("ID"))) {
                   System.out.println("�α��� ��!!!\n");
                   return true;
              }
              else {
                 System.out.println("�α׾ƿ� ��!!!\n");
              }
           }
        }
         catch (SQLException e){
           e.printStackTrace();
           System.out.println("DB islogin ����!! ���� : " + e.getMessage());
        }
         return false;
   }
}