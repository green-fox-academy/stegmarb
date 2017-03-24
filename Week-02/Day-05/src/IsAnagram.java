import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 24..
 */
public class IsAnagram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Lets check whether the following two words are palindrom");
    System.out.println("Please type the first word");
    String firstWord = scanner.nextLine();
    System.out.println("Now please type the second word");
    String secondWord = scanner.nextLine();
    String notExpected = "- ";
    String non = "";


    if ((firstWord.length() != secondWord.length())) {
      if (firstWord.length() < secondWord.length()) {
      for (int i = 0; i < notExpected.length(); i++) {
        for (int j = 0; j < secondWord.length(); j++) {
          if (notExpected.charAt(i) == secondWord.charAt(j)) {
            secondWord.replace(secondWord.charAt(j), non.charAt(0));
          }
        }
        }
      }
    }


    int count = 0;
    String asterix = "*";
    for (int k = 0; k < firstWord.length(); k++) {
      for (int l = 0; l < secondWord.length(); l++) {
        if (firstWord.charAt(k) == secondWord.charAt(l)) {
          count++;
          secondWord.replace(firstWord.charAt(l), asterix.charAt(0));
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