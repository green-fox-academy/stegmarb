import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 21..
 */
public class PrintBigger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me two numbers");
    int userInput1 = scanner.nextInt();
    int userInput2 = scanner.nextInt();

    if (userInput1 < userInput2) {
      System.out.println(userInput2);
    } else if (userInput1 == userInput2) {
      System.out.println("They are even");
    } else {
      System.out.println(userInput1);
    }
  }
}
