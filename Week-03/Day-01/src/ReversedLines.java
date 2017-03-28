import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by stegmarb on 2017. 03. 27..
 */
public class ReversedLines {
  public static String writePath = "ReversedLines_result.txt";
  public static String filePath = "ReversedLines.txt";
  public static void main(String[] args) {
    List<String> lines = readLinesFromFile();
    List<String> correctOrder = correctOrder(lines);
    writer(correctOrder);
  }
  public static List<String> readLinesFromFile() {
    List<String> lines = new ArrayList<>();
    Path path = Paths.get(filePath);
    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("The file is not able to open");
    }
    return lines;
  }
  public static List<String> correctOrder (List<String> lines) {
    List<String> correctOrder = new ArrayList<>();
    for(int i = 0; i < lines.size(); i++) {
      String correctOrderString = new String();
      for (int j = lines.get(i).length()-1; j > 0; j--) {
        correctOrderString += lines.get(i).charAt(j);
      }
      correctOrder.add(correctOrderString);
    }
    return correctOrder;
  }
  public static void writer (List<String> correctOrder) {
    for (String lines : correctOrder) {
      System.out.println(lines);
    }
  }
}
