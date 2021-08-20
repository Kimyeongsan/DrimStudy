package Board;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class boardwriteVO {
   String UserID, wridate, content, pw, title, file;
   JComboBox<String> writer;

   public String getUserID() {
      return UserID;
   }
   
   public void setUserID(String regis) {
	    this.UserID = UserID;
   }

   
   public JComboBox<String> getwriter() {
	   return writer;
   }
   
   public void setwriter(String regis) {
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
   
   public void setpw(String regis) {
      this.pw = regis;
   }

   public String gettitle() {
      return title;
   }
   
   public void settitle(String regis) {
	   this.title = regis;
   }

   public String getcontent() {
	      return content;
}
   
   public void setcontent(String regis) {
      this.content = regis;
   }
   
   public String getfile() {
	      return file;
   }
   
   public void setfile(String regis) {
      this.file = regis;
   }

}