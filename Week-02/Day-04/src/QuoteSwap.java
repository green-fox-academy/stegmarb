import java.util.*;

public class QuoteSwap{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    String wordDo = list.get(2);
    String cannot = list.get(5);
    list.set(2, cannot);
    list.set (5, wordDo);
    String listInString = "";
    for (String elements : list) {
      listInString = listInString + elements + " ";
    }


    System.out.println(listInString);

    }
    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code

    // Also, print the sentence to the output with spaces in between.
  }