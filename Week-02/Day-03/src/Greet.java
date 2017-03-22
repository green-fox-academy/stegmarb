/**
 * Created by stegmarb on 2017. 03. 22..
 */
public class Greet {
  public static void main(String[] args) {
    String al = "Greenfox";
    System.out.println(greet(al));
  }
  public static String greet(String name) {
    name = "Greetings dear, " + name;
    return name;
  }

}
