/**
 * Created by stegmarb on 2017. 03. 22..
 */
public class AppendA {
  public static void main(String[] args) {
    String am = "kuty";
    System.out.println(appendA(am));
  }
  public static String appendA (String x) {
    x = x + "a";
    return x;
  }
}
