/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class Power {
  public static void main(String[] args) {
    System.out.println(power(2,10));
  }
  public static int power (int n, int y) {
    if (y == 0) {
      return 1;
    } else {
      return n*power(n,y-1);
    }
  }
}
