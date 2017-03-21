import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 21..
 */


public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("ALMA");
    System.out.println(123);
    System.out.println(true);


    boolean isMarried = true;
    String text = "majom";
    double pi = 3.14;
    long pears = 12345678;
    short peaches = 1234;
    byte b = 122;
    int apples = 123;
    apples = 55;
    System.out.println(apples);
    System.out.println();

    Scanner newScanner = new Scanner(System.in);
    String line = newScanner.nextLine();
    System.out.println(line);
  }
}
