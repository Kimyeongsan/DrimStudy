package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Login.LoginCheck;

public class playerDB {
	ConnectionDB ConnectionDB = null;
	Connection connection = null;

	private ResultSet rs=null;
    private String query=null;
    private Statement sta;
    private PreparedStatement ps;
    
	public playerDB() {
		ConnectionDB = new ConnectionDB();
		connection = ConnectionDB.getConnection();
	}
	
	//db search�� ���
    public boolean insertSearch(String playerName, String event, String country){
        try {
             query = "INSERT INTO playerSearch values('"+playerName+"','"+event+"','"+country+"');";
             Statement sta = connection.createStatement();
             sta.executeUpdate(query);
             System.out.println(query);
             System.out.println("DB mypage �۵�� �Ϸ�");
             return true;
          } catch (SQLException e){
             e.printStackTrace();
             System.out.println("DB mypage �۵�� ����!! ���� : " + e.getMessage());
          }
        return false;
     }
    
    public void deleteSearch() {
    	 try {
    	query = "TRUNCATE playerSearch;";
        Statement sta = connection.createStatement();
        sta.executeUpdate(query);
        System.out.println(query);
        System.out.println("DB mypage �۵�� �Ϸ�");
    	 }catch (SQLException e){
             e.printStackTrace();
             System.out.println("DB ȸ��Ż�� ����!! ���� : " + e.getMessage());
          } 
    }
    
    public String getPlayerName() {
    	try {
              query = "SELECT playerName FROM playerSearch;";
              Statement sta = connection.createStatement();
              rs = sta.executeQuery(query);
              System.out.println(query);
              if(rs.next()){
            	   return rs.getString("playerName");
            	   }
           }
            catch (SQLException e){
              e.printStackTrace();
              System.out.println("DB playerName�������� ����!! ���� : " + e.getMessage());
           }
            return null;
      }
    
    public String getEvent() {
    	try {
              query = "SELECT eventName FROM playerSearch;";
              Statement sta = connection.createStatement();
              rs = sta.executeQuery(query);
              System.out.println(query);
              if(rs.next()){
            	   return rs.getString("eventName");
            	   }
           }
            catch (SQLException e){
              e.printStackTrace();
              System.out.println("DB event �������� ����!! ���� : " + e.getMessage());
           }
            return null;
      }
    public String getCountry() {
    	try {
              query = "SELECT country FROM playerSearch;";
              Statement sta = connection.createStatement();
              rs = sta.executeQuery(query);
              System.out.println(query);
              if(rs.next()){
            	   return rs.getString("country");
            	   }
           }
            catch (SQLException e){
              e.printStackTrace();
              System.out.println("DB country s�������� ����!! ���� : " + e.getMessage());
           }
            return null;
      }
    }

