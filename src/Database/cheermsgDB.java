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
	
	//String color; //게터를 이용해서 데이터를 사용해 줄것이므로 이부분을 지움
	//String cheertext;
	
	ConnectionDB cDB = null;
	Connection con = null;

	private ResultSet rs=null;
    private String query=null;
    private Statement sta;
    private PreparedStatement ps;

    LoginCheck LoginChk = new LoginCheck();
	//ArrayList<GetterSetter> ar = new ArrayList<GetterSetter>(); // 게터를 부를때는 이부분이 필요없음
	public cheermsgDB() {
		//public Connection con; // DB 커넥션 연결 객체
		cDB = new ConnectionDB();
		con = cDB.getConnection();
	}
	
	public void sendDB(cheermsgVO s) { // MsgVO 에서 data를 GET 해서 사용함
		
		try {
	
			String query = "INSERT INTO cheermsg(bgcolor, cheertext) VALUES('" + s.getColor() + "','" + s.getCheertext() + "')";
			
			JOptionPane.showMessageDialog
            (null, "응원메시지 등록완료!", "CHEER MESSAGE", JOptionPane.INFORMATION_MESSAGE);
			
			System.out.println("배경색: " + s.getColor() + " / 내용: '" + s.getCheertext() + "' 가 " + "DB로 전송되었습니다!");
			Statement state = con.createStatement();
			
			int x = state.executeUpdate(query);
			System.out.println("보내진 query문 : " + x);
			
			query= "SELECT * from cheermsg";
			ResultSet rs = state.executeQuery(query);

			
			try {
				rs.close();
				state.close();
				con.close();
			 } catch (SQLException e1) { }
			
		} catch(Exception e) {
			System.out.println("ERROR : query문 DB로 전송 실패");
		    e.printStackTrace();
		}
	
	}
	
	
	//색을 가져오는 함수
	public String getColor() {
		try {
		query = "SELECT bgColor from cheermsg;";
        Statement sta = con.createStatement();
        rs = sta.executeQuery(query);
        System.out.println(query);
                 if(rs.next()){
                	 return rs.getString("bgColor");
                 } else {
               System.out.println("색깔 받아오지 못함!!!!\n");
         }
     }
      catch (SQLException e){
        e.printStackTrace();
        System.out.println("DB 색깔 받아오지 못함 실패!! 사유 : " + e.getMessage());
     }
      return "white";
	}
	
	//text을 가져오는 함수
		public String getText() {
			try {
			query = "SELECT cheertext from cheermsg;";
	        Statement sta = con.createStatement();
	        rs = sta.executeQuery(query);
	        System.out.println(query);
	                 if(rs.next()){
	                	 return rs.getString("cheertext");
	                 } else {
	               System.out.println("text 받아오지 못함!!!!\n");
	         }
	     }
	      catch (SQLException e){
	        e.printStackTrace();
	        System.out.println("DB text 받아오지 못함 실패!! 사유 : " + e.getMessage());
	     }
	      return null;
		}
		
		public String callCheerMsg() {
		      cheermsgDB cheermsgDB = new cheermsgDB();
		      //cheermsgDB cheermsgDB =new cheermsgDB();
		      //포스트잇
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