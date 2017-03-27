import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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
      Collections.sort(numbers);

      HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer> ();
      int count = 0;
      for (int k = 0; k < realNumbers.size(); k++) {
        Integer counts = countMap.get(realNumbers.get(k));
        countMap.put(realNumbers.get(k), counts == null ? 1 : count + 1);
      }

      System.out.println(countMap);
      System.out.println("The most frequent number in lotto's history was ");
    } catch (IOException e) {
      System.out.println("Ops! There is something wrong with the file");
    }
  }
}
