package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class LoginDB {
     private Connection connection;
      private ConnectionDB DB_Connection;
      
      private ResultSet rs=null;
      private String query=null;
      private Statement sta;
      private PreparedStatement ps;//���ȶ����� �̰ɷ� �ٲܿ���
      
      public LoginDB() {
         ConnectionDB DB_Connection = new ConnectionDB();
          connection = DB_Connection.getConnection();
      }

      //�α��� �� ȸ����ȸ
      public boolean getLoginSelect(String myID, String myPW){
         try {
            query = "SELECT * FROM account WHERE ID = '"+ myID+ "' AND PW = '" + myPW + "';";
            Statement sta = connection.createStatement();
            rs = sta.executeQuery(query);
            System.out.println(query);
            if(rs.next()){
               if(myPW.equals(rs.getString("PW")) && myID.equals(rs.getString("ID"))){
                    System.out.println("�α��� �Ϸ�!!!\n");
                    JOptionPane.showMessageDialog(null, "ȯ��!", "login", JOptionPane.INFORMATION_MESSAGE);
                    return true;
               }
               else {
                  System.out.println("�α��� ����!!! ȸ����������\n");
               }
            }
         }
          catch (SQLException e){
            e.printStackTrace();
            System.out.println("DB �α��� ����!! ���� : " + e.getMessage());
         } 
         return false;
      }
}