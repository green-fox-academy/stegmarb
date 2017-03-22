import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 22..
 */
public class CountFromTo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me two numbers");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    if (num1 > num2) {
      System.out.println("The second number should be bigger");
    } else {
      while (num1 != num2) {
        System.out.println(num1);
        num1++;
      }
    }
  }
}
