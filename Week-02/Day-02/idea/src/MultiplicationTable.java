import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 22..
 */
public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Just give me a number to multiply");
    int num = scanner.nextInt();
    int multiplier = 1;
    while (multiplier <=10) {
      System.out.println(multiplier + " * " + num + " = " + multiplier*num);
      multiplier++;
    }
  }
}
