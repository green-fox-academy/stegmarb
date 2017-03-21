import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 21..
 */
public class HelloUser {
    public static void main(String[] args) {
      // Modify this program to greet user instead of the World!
      // The program should ask for the name of the user


      System.out.println("Hello, Sir! What is your name?");
      Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
      System.out.println("My pleasure Mr. " + userInput);
    }
}
