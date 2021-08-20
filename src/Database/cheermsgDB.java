package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.JOptionPane;

import Cheering.cheermsgPanel;
import Cheering.cheermsgVO;
//import test.GetterSetter;

public class cheermsgDB {
	
	//String color; //게터를 이용해서 데이터를 사용해 줄것이므로 이부분을 지움
	//String cheertext;
	
	ConnectionDB cDB = null;
	Connection con = null;

	private ResultSet rs=null;
    private String query=null;
    private Statement sta;
    private PreparedStatement ps;

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
	
	public String getColor() {
		try {
		query = "SELECT EXISTS (SELECT * FROM account_chk WHERE ischeck = 'true' limit 1) AS SUCCESS;";
        Statement sta = con.createStatement();
        rs = sta.executeQuery(query);
        System.out.println(query);
        if(rs.next()){
           int i=1;
            if(i == rs.getInt("SUCCESS")){
                 System.out.println("로그인 되어있음!!!\n");
                 query = "SELECT * FROM account_chk Order BY ID DESC LIMIT 1;";
                 Statement sta1 = con.createStatement();
                 rs = sta1.executeQuery(query);
                 System.out.println(query);
                 if(rs.next()){
                	 return rs.getString("bgColor");
                 }
            }
            else {
               System.out.println("로그아웃중!!!!\n");
            }
         }
//        if(sta != null) sta.close();
//        if(connection != null) connection.close();
        System.out.println("DB 로그인 완료");
     }
      catch (SQLException e){
        e.printStackTrace();
        System.out.println("DB islogin 실패!! 사유 : " + e.getMessage());
     }
      return null;
		
	}
	
}