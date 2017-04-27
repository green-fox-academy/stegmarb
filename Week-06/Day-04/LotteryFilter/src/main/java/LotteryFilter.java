import au.com.bytecode.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class LotteryFilter {
  public static void main(String[] args) {
    readCsv("D:\\GreenFoxAcademy\\stegmarb\\Week-06\\Day-04\\LotteryFilter\\build\\classes\\main\\otos.csv");
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

  public static void writeResults(List<String[]> list) {
    
  }
}
