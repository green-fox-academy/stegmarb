/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(numberAdder(7));
  }
  public static int numberAdder (int n) {
    if (n <= 1) {
      return 1;
    } else {
      return n + numberAdder(n-1);
    }
  }
}
