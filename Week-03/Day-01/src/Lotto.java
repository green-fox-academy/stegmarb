import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by stegmarb on 2017. 03. 27..
 */
public class Lotto {
  public static void main(String[] args) {
    try {
      String separatedLines = new String();
      ArrayList<String> numbers = new ArrayList<>();
      Path path = Paths.get("otos.txt");
      List<String> lines = Files.readAllLines(path);
      for ( String line : lines) {
        String stringLines = line;
        String[] separated = stringLines.split(";");
        for (int i = separated.length-1; i > separated.length-6; i--) {
            numbers.add(separated[i]);
        }
      }
      ArrayList<Integer> realNumbers = new ArrayList<>();
      int[] arrayNumbers;
      for (String number : numbers) {
        realNumbers.add(Integer.parseInt(number));
      }
      Collections.sort(realNumbers);

      System.out.println(realNumbers);
    } catch (IOException e) {
      System.out.println("Ops! There is something wrong with the file");
    }
  }
}
