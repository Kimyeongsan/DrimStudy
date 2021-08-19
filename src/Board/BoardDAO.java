package Board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class BoardDAO {
	
	Connection cn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
   
   public BoardDAO() {
      try {
    	  String dbURL = "jdbc:drimstudy://192.168.123.57:3306/boardwrite";
    	  String dbID = "test1";
    	  String dbPassword = "drim1234";
    	  Class.forName("org.drimstudy.jdbc.Driver");
    	  cn = DriveManager.getConnection(dbURL, dbID, dbPassword);
      }catch (Exception e) {
            e.printStackTrace();
      }
      
   }
   
   public String getDate() {
	   String sql = "select now()";
	   try {
		   PreparedStatement pstmt = cn.prepareStatement(sql);
		   rs = pstmt.executeQuery();
		   if(rs.next()) {
			   return rs.getString(1);
		   }
	   }catch (Exception e) {
		   e.printStackTrace();
	   }
	   return "";
   }
   
   public int getNext() {
	   String sql = "select ID from board order by ID desc";
	   try {
		   PreparedStatement pstmt = cn.prepareStatement(sql);
		   rs = pstmt.executeQuery();
		   if(rs.next()) {
			   return rs.getInt(1) + 1;
		   }
		   return 1;
	   }catch (Exception e) {
		   e.printStackTrace();
	   }
	   return -1;
   }
   
   public int write(String title, String ID, String content) {
	   String sql = "insert into board values(?, ?, ?, ?, ?, ?)";
	   try {
		   PreparedStatement pstmt = cn.prepareStatement(sql);
		  pstmt.setInt(1, getNext());
		  pstmt.setString(2, title);
		  pstmt.setString(3, ID);
		  pstmt.setString(4, getDate());
		  pstmt.setString(5, content);
		  pstmt.setInt(6, 1);
		  return pstmt.executeUpdate();
	   }catch (Exception e) {
		   e.printStackTrace();
	   }
	   return -1;
   }
   
   public boolean insertBoard(BoardDTO boardDto) {
	   boolean result = false;
	   /*
	   log.debug("name : " + boardDto.getName());
	   log.debug("title : " + boardDto.getName());
	   log.debug("password : " + boardDto.getName());
	   log.debug("content : " + boardDto.getName());
	   */
	   
	   String sql = "INSERT INTO board_5(seq, name, title, password, content, writeday)" + "values(board_5_seq_nextval, ?, ?, ?, ?, sysdate)";
	   
	   try {
		   cn = getConnection();
		   ps = cn.prepareStatement(sql);
		   ps.setString(1, boardDto.getName());
		   ps.setString(2, boardDto.getTitle());
		   ps.setString(3, boardDto.getPassword());
		   ps.setString(4, boardDto.getContent());
		   
		   if (ps.executeUpdate() > 0)
			   result = true;
	   } catch (Exception e) {
		   e.printStackTrace();
	   } finally {
		   dbClose();
	   }
	   return result;
   }
   
   private void dbClose() {
	   if (rs != null)
		   try {
			   rs.close();
		   } catch (Exception e) {
		   }
	   if (ps != null)
		   try {
			   ps.close();
		   } catch (Exception e) {
		   }
   }
   
   private Connection getConnection() throws SQLException {
	   return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
   }
   
   public List<BoardDTO> getBoardList() {
	   List<BoardDTO> list = new ArrayList<BoardDTO>();
	   
	   String sql = "SELECT seq, title, name, writeday, readcount " + "FROM board_5 ORDER BY seq DESC";
	   
	   try {
		   cn = getConnection();
		   ps = cn.prepareStatement(sql);
		   rs = ps.executeQuery();
		   
		   while(rs.next()) {
			   BoardDTO boardDto = new BoardDTO();
			   boardDto.setBno(rs.getInt("bno"));
			   boardDto.setTitle(rs.getString("title"));
			   boardDto.setName(rs.getString("name"));
			   boardDto.setWriteday(rs.getString("writeday"));
			   list.add(boardDto);
		   }
	   } catch (Exception e) {
		   e.printStackTrace();
	   } finally {
		   dbClose();
	   }
	   return list;
   }
      
} // 