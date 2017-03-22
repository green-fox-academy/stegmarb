import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 22..
 */
public class DrawDiamonds {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many lines this diamond should be consist?");
    int num = scanner.nextInt();

    for (int i = 0; i <= num; i++) {
      if (i <= (num / 2 + 1)) {
        for (int j = num - 1; j >= i; j--) {
          System.out.print(" ");
        }
        for (int k = 1; k <= (2 * i - 1); k++) {
          System.out.print("*");
        }
        System.out.println("");
      } else {
        for (int j = i; j > 1; j--) {
          System.out.print(" ");
        }
        for (int k = ((num - i)*2+1); k > 0 ; k--) {
          System.out.print("*");
        }
        System.out.println("");
      }
    }
  }
}

