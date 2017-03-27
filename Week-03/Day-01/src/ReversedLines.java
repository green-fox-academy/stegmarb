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

  public static void main(String[] args) {
    try {
      List<String> lines = Files.readAllLines(Paths.get(filePath));
      System.out.println(lines);
    } catch (IOException e) {
      System.out.println("Ops! There is something wrong with the file");
    }

  }
}