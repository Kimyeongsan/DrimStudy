package SignUp;

import java.sql.Connection;

import javax.swing.JOptionPane;

import Database.ConnectionDB;
import Database.RegisterDB;
import Login.LoginCheck;

public class SignUpCheck {
   private Connection connection;
   private ConnectionDB DB_Connection;
   
   public SignUpCheck() {
         ConnectionDB DB_Connection = new ConnectionDB();
         connection = DB_Connection.getConnection();
         RegisterDB registerDB = new RegisterDB();
      }
   //ȸ������ ��ȸ
   public boolean ChkRegister(String myName, String myID, String myPW, String myPW2,
         String myEmail, String myNic, String DBCol, String myRecord) {
      RegisterDB registerDB = new RegisterDB();
      LoginCheck LoginChk = new LoginCheck();
      registerDB.getRegisterSelect(DBCol, myRecord);
      boolean DBbool;
      
        if(myPW.equals(myPW2) && !myPW.equals("")){
        //�ߺ���ȸ�� ���
        String[] arrCol = {"ID", "email", "nicName"};
        String[] arrMY = {myID, myEmail, myNic};
        //DB ����
        int i = 0;
        //�ߺ���ȸ ����
       DBbool = registerDB.getRegisterSelect(arrCol[i], arrMY[i]); 
         System.out.println("DB ID : " + arrCol[i]+", "+arrMY[i]);
       //ID�ߺ� ��ȸ
       if (DBbool) {  
          i = 1;
          DBbool = registerDB.getRegisterSelect(arrCol[i], arrMY[i]);
          System.out.println("DB email : " +", "+ arrCol[i]+arrMY[i]);
        //email �ߺ� ��ȸ
          if(DBbool) {
             i = 2;
             DBbool = registerDB.getRegisterSelect(arrCol[i], arrMY[i]);
              System.out.println("DB nic : " +", "+ arrCol[i]+arrMY[i]);
           //nic �ߺ� ��ȸ
             if(DBbool) {
                 //ȸ�����Խõ�
                registerDB.getRegisterInsert(myName, myID, myPW, myEmail, myNic);
                LoginChk.Chk_Login(myID);
                  JOptionPane.showMessageDialog
                    (null, "���̵� : "+myID+ "\n�� �� : "+myName+"\n�̸��� : "+myEmail+
                    "\n�� �� �� : "+myNic, "ȸ������ �Ϸ�", JOptionPane.INFORMATION_MESSAGE); 
                 return true;
          } else JOptionPane.showMessageDialog(null, "�г��� �ߺ�!!","ȸ������ ����", JOptionPane.ERROR_MESSAGE);
          } else JOptionPane.showMessageDialog(null, "email �ߺ�!!","ȸ������ ����", JOptionPane.ERROR_MESSAGE);
       } else JOptionPane.showMessageDialog(null, "ID �ߺ�!!","ȸ������ ����", JOptionPane.ERROR_MESSAGE);
        }
     //ȸ������ ���� : PW�� ����� �ְų� PW!=PW2�̸�
        else if (myPW.equals("")) {
           JOptionPane.showMessageDialog
            (null, "��й�ȣ�� �Է��ϼ���.", "ȸ������ ����", JOptionPane.ERROR_MESSAGE);
        }
        else { //��й�ȣ Ʋ��
              JOptionPane.showMessageDialog
               (null, "��й�ȣ�� Ʋ���ϴ�.", "ȸ������ ����", JOptionPane.ERROR_MESSAGE);
           }
        return false;
   }
}