import java.util.Scanner;
import  java.util.*;

/**
 * Created by stegmarb on 2017. 03. 24..
 */
public class PalindromSearcher {
  public static void main(String[] args) {
    ArrayList<String> palindromes = new ArrayList<>();
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Give me a line and I will show you the palindromes in it.");
    String inputString = myScanner.nextLine();

    for (int i = 2; i < inputString.length(); i++) {
      int slider = i;
      for (int j = 0; j < inputString.length() - i; j++) {
        if (inputString.charAt(slider) == inputString.charAt(j)) {
          String match = inputString.substring(j, slider + 1);
          if (isPalindrome(match)) {
            palindromes.add(match);
          }
        }
        slider += 1;
      }
    }
    System.out.println("Palindromes: " + palindromes);
  }

  private static boolean isPalindrome (String inOrder) {
    StringBuilder reverser = new StringBuilder(inOrder);
    String reversed = reverser.reverse().toString();
    if (inOrder.equals(reversed)) {
      return true;
    }
    return false;
  }
}