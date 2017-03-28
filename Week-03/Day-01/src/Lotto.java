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
  public static String filePath = "otos.txt";

  public static void main(String[] args) {
    List<String> lines = readLinesFromFile();
    List<String> numbers = filterNumbers(lines);
    Map<String, Integer> numberCounts = getNumberCounts(numbers);
    List<Integer> topFive = getTopFiveCounts(numberCounts);

    for (Map.Entry<String, Integer> entry : numberCounts.entrySet()) {
      if (topFive.contains(entry.getValue())) {
        System.out.println(entry.getKey() + "/" + entry.getValue());
      }
    }
  }
  
  public static List<Integer> getTopFiveCounts(Map<String, Integer> numberCounts) {
    List<Integer> allCounts = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : numberCounts.entrySet()) {
      allCounts.add(entry.getValue());
    }
    Collections.sort(allCounts);
    Collections.reverse(allCounts);
    return allCounts.subList(0, 5);
  }

  public static Map<String, Integer> getNumberCounts(List<String> allNumbers) {
    Map<String, Integer> numberCounts = new HashMap<String, Integer>();
    for (String number : allNumbers) {
      if (numberCounts.containsKey(number)) {
        numberCounts.put(number, numberCounts.get(number) + 1);
      } else {
        numberCounts.put(number, 1);
      }
    }
    return numberCounts;
  }

  public static List<String> filterNumbers(List<String> lines) {
    List<String> numbers = new ArrayList<>();
    for (String line : lines) {
      String stringLines = line;
      String[] separated = stringLines.split(";");
      for (int i = separated.length - 1; i > separated.length - 6; i--) {
        numbers.add(separated[i]);
      }
    }
    return numbers;
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

