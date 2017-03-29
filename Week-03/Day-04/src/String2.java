/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class String2 {
  public static void main(String[] args) {
    System.out.println(xRemoved("marry xmas to xenon corporation"));
  }
  public static String xRemoved (String s) {
    char x = 'x';
    if (s.length() < 1) {
      return s;
    } else {
      if (x == s.charAt(0)) {
        return "" + (xRemoved(s.substring(1)));
      } else {
        return s.charAt(0) + (xRemoved(s.substring(1)));
      }
    }
  }

}
