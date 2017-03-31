import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  final public static String filePath = "reversed-order.txt";
  public static void main(String[] args) {
    List<String> lines = readLinesFromFile();
    String finalText = textInString(reOrdered(lines));
    System.out.println(finalText);
  }
  public static List<String> readLinesFromFile () {
    List<String> lines = new ArrayList<>();
    Path path = Paths.get(filePath);
    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("The file is not able to open");
    }
    return lines;
  }
  public static List<String> reOrdered (List<String> lines) {
    List<String> reOrdred = new ArrayList<>();
    for (int i = lines.size()-1; i > -1  ; i--) {
      reOrdred.add(lines.get(i));
    }
    return reOrdred;
  }
  public static String textInString (List<String> reOrdered) {
    String textInString = new String();
    for (int i = 0; i < reOrdered.size(); i++) {
      textInString += reOrdered.get(i)+ "\n";
    }
    return textInString;
  }
}