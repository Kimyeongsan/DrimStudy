package MainFunction;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class funcBtn {
   public funcBtn() {
      
   }
   public void funcbtn(JButton btn, int x, int y,int w,int l, boolean i) {
      btn.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 13));
      btn.setBackground(new Color(217, 217, 217));
      btn.setBounds(x, y, w, l);
      btn.setBorderPainted(false);
      btn.setFocusPainted(false);
      btn.setVisible(i);
   }
   public void funcTextField (JTextField inputText, int x, int y,int w,int l) {
      inputText.setBounds(x, y, w, l);
      inputText.setFont(new Font("°íµñ", Font.BOLD, 20)); // Font
      inputText.setForeground(Color.black); // Color
      inputText.setBackground(new Color(255,255,255));
      inputText.requestFocusInWindow();
      inputText.setColumns(10);
   }
   public void funcTextArea (JTextArea inputText, int x, int y,int w,int l) {
      inputText.setBounds(x, y, w, l);
      inputText.setFont(new Font("°íµñ", Font.BOLD, 20)); // Font
      inputText.setForeground(Color.black); // Color
      inputText.setOpaque(true);
      inputText.setLineWrap(true);
      inputText.setEditable(true);
   }
   public void funcPW (JPasswordField inputText, int x, int y,int w,int l) {
      inputText.setBounds(x, y, w, l);
      inputText.setFont(new Font("°íµñ", Font.BOLD, 20)); // Font
      inputText.setForeground(Color.black); // 9Color
      inputText.setBackground(new Color(255,255,255));
   }
}