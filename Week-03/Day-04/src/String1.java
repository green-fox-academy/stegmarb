/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class String1 {
  public static void main(String[] args) {
    String s = "marry xmas to xenon corporation";
    char x = 'x';
    char y = 'y';
    System.out.println(xToY(s, x, y));
  }

  public static String xToY(String s, char from, char to) {
    if (s.length() < 1) {
      return s;
    } else {
      char first = from == s.charAt(0) ? to : s.charAt(0);
      return first + xToY(s.substring(1), from, to);
    }
  }
}
