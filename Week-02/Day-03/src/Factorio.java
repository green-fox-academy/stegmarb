import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 22..
 */
public class Factorio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a number");
  int num = scanner.nextInt();
    System.out.println(factorio(num));
  }
  public static int factorio (int x) {
    int y = 1;
    for (int i = x; i > 0 ; i--) {
      y = y * i;
    }
    return y;
  }
}
