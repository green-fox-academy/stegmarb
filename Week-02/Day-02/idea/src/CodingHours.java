/**
 * Created by stegmarb on 2017. 03. 21..
 */
public class CodingHours {
  public static void main(String[] args) {
    int codingHours = 6;
    int allDaysNumber = 17*5;
    float allHours = 52*17;
    System.out.println("The overall coding hours amount is " + codingHours*allDaysNumber + "h");
    System.out.println("The percentage of coding hours is " + (codingHours*allDaysNumber/allHours)*100 + "%");
  }
}
