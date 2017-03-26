import java.util.Random;
import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 24..
 */
public class GuessMyNumber {
  public static void main(String[] args) {
    System.out.println("Can you show me how good guesser you are?\nChoose the range by adding the maximum number!" );
    Scanner scanner = new Scanner(System.in);
    int maxRange = scanner.nextInt();
    Random rand = new Random();
    int guessedNumber = rand.nextInt(maxRange) +1;
    System.out.println("I have made a guess between 1 and " + maxRange + ". Try to find out");
    int userInput = scanner.nextInt();
    String[] returnSentences = {"Nah!!\n", "No!!!!\n", "This is not the right answer!\n", "I have expected better performance of you.\n", "Concentrate!\n", "How many chances would you need?\n", "Almost.....but not.\n", "May be next guess will be better.\n"};
    while (guessedNumber != userInput) {
      int randomReturn = rand.nextInt(returnSentences.length);
      if (userInput > maxRange) {
        System.out.println("Your guess is out of range. Try to stay inside the range.");
        userInput = scanner.nextInt();
      } else {
        if (userInput < guessedNumber) {
          System.out.println(returnSentences[randomReturn - 1] + " The guessed number is higher");
        } else {
          System.out.println(returnSentences[randomReturn - 1] + " The guessed number is lower");
        }

        userInput = scanner.nextInt();
      }
    }
    System.out.println("Congratulations! You found the number: " + guessedNumber);
  }
}