import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 22..
 */
public class DrawPyramid {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Just give me a number");
      int num = scanner.nextInt();

      for (int i = 0; i < num; i++) {
        for (int j = num - 1; j >=i; j--) {
          System.out.print(" ");
        }
        for (int k = 1; k <= (2*i - 1); k++) {
          System.out.print("*");
        }
        System.out.println("");
      }
  }
}
