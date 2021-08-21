package Database;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Cheering.cheermsgVO;
//import test.GetterSetter;
import Login.LoginCheck;

public class cheermsgDB {
	
	//String color; //���͸� �̿��ؼ� �����͸� ����� �ٰ��̹Ƿ� �̺κ��� ����
	//String cheertext;
	
	ConnectionDB cDB = null;
	Connection con = null;

	private ResultSet rs=null;
    private String query=null;
    private Statement sta;
    private PreparedStatement ps;

    LoginCheck LoginChk = new LoginCheck();
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
	
	
	//���� �������� �Լ�
	public String getColor() {
		try {
		query = "SELECT bgColor from cheermsg;";
        Statement sta = con.createStatement();
        rs = sta.executeQuery(query);
        System.out.println(query);
                 if(rs.next()){
                	 return rs.getString("bgColor");
                 } else {
               System.out.println("���� �޾ƿ��� ����!!!!\n");
         }
     }
      catch (SQLException e){
        e.printStackTrace();
        System.out.println("DB ���� �޾ƿ��� ���� ����!! ���� : " + e.getMessage());
     }
      return "white";
	}
	
	//text�� �������� �Լ�
		public String getText() {
			try {
			query = "SELECT cheertext from cheermsg;";
	        Statement sta = con.createStatement();
	        rs = sta.executeQuery(query);
	        System.out.println(query);
	                 if(rs.next()){
	                	 return rs.getString("cheertext");
	                 } else {
	               System.out.println("text �޾ƿ��� ����!!!!\n");
	         }
	     }
	      catch (SQLException e){
	        e.printStackTrace();
	        System.out.println("DB text �޾ƿ��� ���� ����!! ���� : " + e.getMessage());
	     }
	      return null;
		}
		
		public String callCheerMsg() {
		      cheermsgDB cheermsgDB = new cheermsgDB();
		      //cheermsgDB cheermsgDB =new cheermsgDB();
		      //����Ʈ��
		      String color = cheermsgDB.getColor();
		      System.out.println(color);
		      switch(color) {
		      case "RED" : return "postIT.setBackground(Color.RED);" ;
		      case "YELLOW" : return "postIT.setBackground(Color.YELLOW);";
		      case "ORANGE" : return "postIT.setBackground(Color.ORANGE);";
		      case "SKYBLUE" : return "postIT.setBackground(new Color(105,216,255));"; 
		      case "GREEN" : return "postIT.setBackground(Color.GREEN);";
		      default : return "postIT.setBackground(new Color(166, 166, 166));";
		      }
		}
}