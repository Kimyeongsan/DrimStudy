package Board;

public class BoardDTO {
   String UserID;
   String writer;
   String wridate;
   int pw;
   String title;
   String content;
   String file;

   public String getUserID() {
      return UserID;
   }

   public void setUserID(String userID) {
      this.UserID = userID;
   }
   
   public String getwriter() {
	   return writer;
   }
   
   public void setwriter(String writer) {
	   this.writer = writer;
   }
   
   public String getwridate() {
      return wridate;
   }
   
   public void setwridate(String setwridate) {
	   this.wridate = wridate;
   }
   
   public int getpw() {
	   return pw;
   }
   
   public void setpw(int pw) {
      this.pw = pw;
   }

   public String gettitle() {
      return title;
   }
   
   public void settitle(String title) {
	   this.title = title;
   }

   public String getcontent() {
	      return content;
	   }
   
   public void setcontent(String content) {
      this.content = content;
   }
   
   public String getfile() {
	      return file;
	   }
   
   public void setfile(String file) {
      this.file = file;
   }

}