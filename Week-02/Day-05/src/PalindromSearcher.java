import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 24..
 */
public class PalindromSearcher {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write some text where you looking for a palindrom sequences");
    String userInput = scanner.nextLine();
    int k = 1;
    for (int i = 0; i < userInput.length()-2; i++) {
      if (userInput.charAt(i) == userInput.charAt(i+2)) {
        for (int j = 1; j <userInput.length()/2; j++) {
          if(userInput.charAt(i-j) == userInput.charAt(i+j)){
          }

        }

      }
    }
  }
}
