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
  public static String filePath = "ReversedLines.txt";
  public static List<String> goodDirections = new ArrayList<>();
  public static void main(String[] args) {
    try {
      List<String> lines = Files.readAllLines(Paths.get(filePath));
      String separatedLines = new String();
      for (int j = 0; j < lines.size(); j++) {
        for (int i = lines.get(j).length()-1; i >= 0; i--) {
          separatedLines += lines.get(j).charAt(i);
        }
        separatedLines += separatedLines + "\n";
      }
      System.out.println(separatedLines);
    } catch(IOException e) {
      System.out.println("Ops! There is something wrong with the file");
    }
    ;
  }
}