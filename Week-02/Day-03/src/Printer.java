/**
 * Created by stegmarb on 2017. 03. 22..
 */
public class Printer {
  public static void main(String[] args) {
    String[][] text = {{"If ", "this ", "peace "}, {"of ", "code ", "is working, "}, {"I will ", "eat my ", "mouse! "}};
    System.out.println(printer(text));
  }
  public static String printer (String[][] x) {
    String printedText = "";
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[i].length; j++) {
        printedText = printedText + x[i][j];
      }
    }
    return printedText;
  }
}
