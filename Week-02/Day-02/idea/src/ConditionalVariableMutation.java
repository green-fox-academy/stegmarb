/**
 * Created by stegmarb on 2017. 03. 21..
 */
public class ConditionalVariableMutation {
  public static void main(String[] args) {
    double a = 24;
    int out = 0;
    // if a is even increment out by one
    if ( a%2 == 0) {
      out = ++out;
    }

    System.out.println(out);


    int b = 13;
    String out2 = "";
    if ( b >= 10 && b <= 20 ) {
      out2 = "Sweet!";
    } else if (b < 10){
      out2 = "More!";
    } else {
      out2 = "Less!";
    }
    // if b is between 10 and 20 set out2 to "Sweet!"
    // if less than 10 set out2 to "More!",
    // if more than 20 set out2 to "Less!"


    System.out.println(out2);


    int c = 123;
    int credits = 100;
    boolean isBonus = false;
    if ( c >= 50 && isBonus == false ) {
      c = c += 2;
    } else if (c < 50 && isBonus == false){
      c = c += 1;
    } else {
    }



    System.out.println(c);


    int d = 8;
    int time = 120;
    String out3 = "";
    if (d%4== 0 && time > 200) {
      out3 = "check";
    } else if (time > 200) {
      out3 = "Time out";
    } else {
      out3 = "Run Forrest Run!";
    }
    // if d is dividable by 4
    // and time is not more than 200
    // set out3 to "check"
    // if time is more than 200
    // set out3 to "Time out"
    // otherwise set out3 to "Run Forest Run!"


    System.out.println(out3);
  }
}
