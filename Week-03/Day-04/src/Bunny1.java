/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class Bunny1 {
  public static void main(String[] args) {
    System.out.println(earsCounter(22));
  }
  public static int earsCounter (int n) {
    if (n == 1) {
      return 2;
    } else {
      return 2+earsCounter(n-1);
    }
  }
}
