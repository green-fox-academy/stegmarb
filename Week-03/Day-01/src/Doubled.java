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
  public static void main(String[] args) {
    try {
      ArrayList<String> numbers = new ArrayList<>();
      List<String> lines = Files.readAllLines(Paths.get("Doubled.txt"));
      System.out.println(duplicationRemover(lines));
      Path output = Paths.get("Doubled_result.txt");
  } catch (IOException e) {
      System.out.println("Ops! There is something wrong with the file");
    }

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
