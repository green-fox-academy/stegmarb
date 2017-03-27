import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by stegmarb on 2017. 03. 28..
 */
public class EncodedLines {
  final public static String filePath = "encoded-lines.txt";

  public static void main(String[] args) {
  List<String> lines = readLinesFromFile();
    System.out.println(lines.get(1));
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
}