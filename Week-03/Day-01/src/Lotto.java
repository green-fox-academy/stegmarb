import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
        for (int i = separated.length-1; i > separated.length-5; i--) {
            numbers.add(separated[i]);
        }
      }
      
      System.out.println(numbers);
    } catch (IOException e) {
      System.out.println("Ops! There is something wrong with the file");
    }
  }
}
