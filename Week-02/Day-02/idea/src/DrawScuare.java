import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 22..
 */
public class DrawScuare {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Just give me a number");
    int num = scanner.nextInt();

    for (int i = 0; i < num; i++) {
      if (i == 0 || i == num-1) {
        for (int j = 0; j < num; j++) {
          System.out.print("%");
        }
        System.out.println("");
      } else {
          for(int k = 0; k < num; k++) {
            if (k == 0 || k == num-1) {
              System.out.print("%");
            } else {
              System.out.print(" ");
            }
          }
        System.out.println(" ");
      }
    }
  }
}
