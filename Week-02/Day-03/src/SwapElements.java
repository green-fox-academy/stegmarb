import java.util.Arrays;

/**
 * Created by stegmarb on 2017. 03. 22..
 */
public class SwapElements {
  public static void main(String[] args) {
    String[] abc = {"first", "second", "third"};
    String t = abc[0];
    abc [0] = abc [2];
    abc [2] = t;
    System.out.println(Arrays.toString(abc));
  }
}
