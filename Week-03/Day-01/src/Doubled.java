import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by stegmarb on 2017. 03. 27..
 */
public class Doubled {
  public static void main(String[] args) {
    try {
      String separatedLines = new String();
      ArrayList<String> numbers = new ArrayList<>();
      Path path = Paths.get("Doubled.txt");
      List<String> lines = Files.readAllLines(path);
      String correctedText = new String ();
      for (int i = 0; i < lines.size(); i++) {
        for (int j = 0; j < lines.get(i).length(); j+=2) {
          correctedText = correctedText + lines.get(i).charAt(j);
        }
      }
      System.out.println(correctedText);
  } catch (IOException e) {
      System.out.println("Ops! There is something wrong with the file");
    }
  }
}
