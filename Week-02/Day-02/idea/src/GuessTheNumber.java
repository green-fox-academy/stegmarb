import java.util.Random;
import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 22..
 */
public class GuessTheNumber {
  public static void main(String[] args) {
    Random rand = new Random();
    int guessedNumber = rand.nextInt(50) +1;
    Scanner scanner = new Scanner(System.in);
    System.out.println("I have made a guess between 1 and 50. Try to find out");
    int userInput = scanner.nextInt();
    while (guessedNumber != userInput) {
      if (userInput < guessedNumber) {
        System.out.println("The stored number is higher");
      } else {
        System.out.println("The stored number is lower");
      }
      userInput = scanner.nextInt();
    }
    System.out.println("You found the number: " + guessedNumber);
  }
}
