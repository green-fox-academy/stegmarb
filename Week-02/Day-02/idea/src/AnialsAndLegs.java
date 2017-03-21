import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 21..
 */
public class AnialsAndLegs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many chickens dou you have?");
    int userInput1 = scanner.nextInt();
    System.out.println("How many pigs do you have?");
    int userInput2 = scanner.nextInt();
    int allLegs = (userInput1*2) + (userInput2*4);
    System.out.println("The overall leg number is: " + allLegs);

  }
}
