/**
 * Created by stegmarb on 2017. 03. 23..
 */
public class Reverse {
  public static void main(String[] args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    reversed = new StringBuilder(reversed).reverse().toString();
    System.out.println(reversed);


    // Create a function that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.
  }
  /*public static String reverse (String text) {
    String reversed = "";
    for (int i = text.length()-1; i < 0; i-- ) {


    }
    return;*/
  }

