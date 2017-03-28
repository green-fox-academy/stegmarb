import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by stegmarb on 2017. 03. 27..
 */
public class Doubled {
  public static String filePath = "Doubled.txt";
  public static void main(String[] args) {
    List<String> lines = readLinesFromFile();
    System.out.println(duplicationRemover(lines));

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

  public static String duplicationRemover (List<String> lines) {
    String correctedText = new String ();
    for (int i = 0; i < lines.size(); i++) {
      for (int j = 0; j < lines.get(i).length(); j+=2) {
        correctedText += lines.get(i).charAt(j);
      }
      correctedText += "\n";
    }
    return correctedText;
  }
}
