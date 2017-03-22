import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 22..
 */
public class DrawTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Just give me a number");
    int num = scanner.nextInt();

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
