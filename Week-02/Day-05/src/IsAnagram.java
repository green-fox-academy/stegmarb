import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 24..
 */
public class IsAnagram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Lets check whether the following two words are palindrom");
    System.out.println("Please type the first word");
    String firstWord = scanner.next();
    System.out.println("Now please type the second word");
    String secondWord = scanner.next();

    int count = 0;
    String asterix = "*";
    for (int i = 0; i < firstWord.length(); i++) {
      for (int j = 0; j < secondWord.length(); j++) {
        if (firstWord.charAt(i) == secondWord.charAt(j)) {
          count++;
          secondWord.replace(firstWord.charAt(j), asterix.charAt(0));
          break;
        }
      }
      }
      if (count == firstWord.length()) {
        System.out.println("true");
      } else {
        System.out.println("false");
    }
  }



}
