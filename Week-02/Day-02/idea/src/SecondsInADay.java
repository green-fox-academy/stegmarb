/**
 * Created by stegmarb on 2017. 03. 21..
 */
public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int secondsPassed = currentHours*3600 + currentMinutes*60 + currentSeconds;
    int remainingSeconds = 86400-secondsPassed;
    System.out.println("Remaining seconds in a day: " + remainingSeconds);
  }
}
