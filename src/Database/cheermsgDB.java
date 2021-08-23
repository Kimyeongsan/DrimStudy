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
	public String getColor(int i) {
		try {
		query = "SELECT bgColor from cheermsg WHERE idx = "+i+";";
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
		public String getText(int i) {
			try {
			query = "SELECT cheertext from cheermsg WHERE idx = '"+i+"';";
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
		
		public void callCheerMsgColor(JLabel postIT1, int i) {
		      cheermsgDB cheermsgDB = new cheermsgDB();
		      //cheermsgDB cheermsgDB =new cheermsgDB();
		      //����Ʈ��
		      String color = cheermsgDB.getColor(i);
		      System.out.println(color);
		      switch(color) {
	    		case "RED" : postIT1.setBackground(Color.RED); break;
	    		case "YELLOW" : postIT1.setBackground(Color.YELLOW);break;
	    		case "ORANGE" : postIT1.setBackground(Color.ORANGE);break;
	    		case "SKYBLUE" : postIT1.setBackground(new Color(105,216,255)); break;
	    		case "GREEN" : postIT1.setBackground(Color.GREEN);break;
	    		default : postIT1.setBackground(new Color(166, 166, 166));break;
		      	}
		}
		
		public int callCountcheermsg() {
			try {
				query = "SELECT count(idx) from cheermsg;";
		        Statement sta = con.createStatement();
		        rs = sta.executeQuery(query);
		        //System.out.println(query);
		                 if(rs.next()){
		     		        //System.out.println(rs.getInt("count(idx)"));
		                	 return rs.getInt("count(idx)");
		                 } else {
		               System.out.println("text �޾ƿ��� ����!!!!\n");
		         }
		     }
		      catch (SQLException e){
		        e.printStackTrace();
		        System.out.println("DB text �޾ƿ��� ���� ����!! ���� : " + e.getMessage());
		     }
			return 0;
		}
}