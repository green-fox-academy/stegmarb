import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 21..
 */
public class AverageOfInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type five numbers");
    int userInput1 = scanner.nextInt();
    int userInput2 = scanner.nextInt();
    int userInput3 = scanner.nextInt();
    int userInput4 = scanner.nextInt();
    int userInput5 = scanner.nextInt();
    int sum = (userInput1+userInput2+userInput3+userInput4+userInput5);
    int average = sum/5;
    System.out.println("Sum: " + sum + ", Average: " + average);
  }
}
