package Board;

import java.sql.Date;

public class BoardDTO {
   private int bno;
   private String name;
   private String title;
   private String content;
   private int count;
   private String writer;
   private Date regdate;
   private int pos;
   private int depth;

   public int getBno() {
      return bno;
   }
   
   public void setBno(int bno) {
      this.bno = bno;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }

   public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public int getCount() {
      return count;
   }
   
   public void setCount(int count) {
      this.count = count;
   }
   
   public String getWriter() {
      return writer;
   }

   public void setWriter(String writer) {
      this.writer = writer;
   }

   public Date getRegdate() {
      return regdate;
   }

   public void setRegdate(Date regdate) {
      this.regdate = regdate;
   }
   
   public int getPos() {
      return pos;
   }
   
   public void setPos(int pos) {
      this.pos = pos;
   }
   
   public int getDepth() {
      return depth;
   }
   
   public void setDepth(int depth) {
      this.depth = depth;
   }
   
}