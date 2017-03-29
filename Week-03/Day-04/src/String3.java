/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class String3 {
  public static void main(String[] args) {
    String s = "marry xmas for xenon corporation";
    System.out.println(separatedByAsterix(s));
  }
  public static String separatedByAsterix (String s) {
    if (s.length() == 1) {
      return s;
    } else {
      return s.charAt(0) + "*" + separatedByAsterix(s.substring(1));
    }
  }
}
