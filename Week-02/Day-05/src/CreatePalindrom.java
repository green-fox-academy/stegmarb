import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 24..
 */
public class CreatePalindrom {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write some text that you would like to read as a palindrom sequence");
    String userInput = scanner.nextLine();
    System.out.println(createPalindrom(userInput));
  }
  public static String createPalindrom (String word){
    return word + new StringBuilder(word).reverse().toString();
  }
}
