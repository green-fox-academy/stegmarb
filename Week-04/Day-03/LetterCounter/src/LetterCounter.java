import java.util.HashMap;

public class LetterCounter {
  private String sentence;
  private HashMap<Character, Integer> letterNumber;

  public LetterCounter(String s) {
    this.sentence = s;
    letterNumber = new HashMap<>();
  }
}
