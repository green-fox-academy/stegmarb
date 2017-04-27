import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LotteryFilter {
  public static void main(String[] args) {
    OptionParser parser = new OptionParser();
    parser.accepts("y");
    parser.accepts("f");
    parser.accepts("o");
    OptionSet option = parser.parse(args);

    if (option.has("y")) {
    }
  }
  public static List<String[]> readCsv(String fileName) {
    try {
      CSVReader reader = new CSVReader(new FileReader(fileName), ';');
      List<String[] > lines = reader.readAll();
      return lines;
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    } catch (IOException e) {
      System.out.println("File not readable");
    }
    return null;
  }

  public static List<String[]> givenLine(List<String[]> list, String number) {
    List<String[]> temp = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i)[0] == number) {
        temp.add(list.get(i));
      }
    }
    return temp;
  }

  public static void writeResults(List<String[]> list, String fileName) {
    try {
      CSVWriter writer = new CSVWriter(new FileWriter(fileName), ';', CSVWriter.DEFAULT_QUOTE_CHARACTER);
      writer.writeAll(list);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
