/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class Sumdigit {
  public static void main(String[] args) {
    System.out.println(sumDigits(1254684321));
  }
  public static int sumDigits (int n) {
    if (n <= 9 && n > 0) {
      return n;
    } else {
      return n%10 + sumDigits(n/10);
    }
  }
}
