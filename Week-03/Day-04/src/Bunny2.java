/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class Bunny2 {
  public static void main(String[] args) {
    System.out.println(bunnyEars(10));
  }
  public static int bunnyEars (int n) {
    if (n == 1) {
      return 2;
    } else if (n%2 == 0) {
      return 3 + bunnyEars(n-1);
    } else {
      return 2 + bunnyEars(n-1);
    }
  }
}
