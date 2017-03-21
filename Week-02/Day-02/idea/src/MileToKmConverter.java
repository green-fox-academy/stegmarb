import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 21..
 */
public class MileToKmConverter {
  public static void main(String[] args) {

    System.out.println("Distance in kilometers?");
    Scanner scanner = new Scanner(System.in);
    int userImput = scanner.nextInt();
    double distanceInMiles = userImput*0.6214;
    System.out.println("Distance in miles: " + distanceInMiles + " miles");

    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
  }
}
