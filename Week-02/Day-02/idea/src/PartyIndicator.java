import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 21..
 */
public class PartyIndicator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me the number of boys");
    int numberOfBoys = scanner.nextInt();
    System.out.println("Give me the number of girls");
    int numberOfGirls = scanner.nextInt();

    if (numberOfBoys == numberOfGirls && (numberOfGirls+numberOfBoys >= 20)) {
      System.out.println("The party is excellent");
    } else if (numberOfBoys != numberOfGirls && (numberOfGirls+numberOfBoys > 20)) {
      System.out.println("Quite good party");
    } else if (numberOfGirls+numberOfBoys < 20) {
      System.out.println("Average party");
    } else if (numberOfGirls == 0) {
      System.out.println("Sausage party");
    } else {
      System.out.println("Nothing special");
    }

  }
}
