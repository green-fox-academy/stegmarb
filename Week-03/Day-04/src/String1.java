/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class String1 {
  public static void main(String[] args) {
    String s = "marry xmas for xenon corporation";
    char x = 'x';
    char y = 'y';
    System.out.println(xToY(s));
  }

  public static String xToY(String s) {
    char x = 'x';
    char y = 'y';
    if (s.length() < 1) {
      return s;
    } else {
      if (x == s.charAt(0)) {
        return y + xToY(s.substring(1));
      } else {
        return s.charAt(0) + xToY(s.substring(1));
      }
    }
  }
}
