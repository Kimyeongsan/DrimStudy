package Board;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class boardwriteVO {
   String UserID, wridate, pw, title, file;
   JComboBox<String> writer;
   JTextField content;

   public String getUserID() {
      return UserID;
   }

   public void setUserID(String UserID) {
      this.UserID = UserID;
   }
   
   public JComboBox<String> getwriter() {
	   return writer;
   }
   
   public void setwriter(JComboBox<String> writer) {
	   this.writer = writer;
   }
   
   public String getwridate() {
      return wridate;
   }
   
   public void setwridate(String wridate) {
	   this.wridate = wridate;
   }
   
   public String getpw() {
	   return pw;
   }
   
   public void setpw(String pw) {
      this.pw = pw;
   }

   public String gettitle() {
      return title;
   }
   
   public void settitle(String title) {
	   this.title = title;
   }

   public JTextField getcontent() {
	      return content;
}
   
   public void setcontent(JTextField content) {
      this.content = content;
   }
   
   public String getfile() {
	      return file;
   }
   
   public void setfile(String file) {
      this.file = file;
   }

}