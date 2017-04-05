import java.util.HashMap;

public class LetterCounter {
  private String sentence;
  private HashMap<Character, Integer> hashMap;


  public void counter() {
    for (int i = 0; i < sentence.length(); i++) {
      if (hashMap.containsKey(sentence.charAt(i))) {
        hashMap.put(sentence.charAt(i), hashMap.get(sentence.charAt(i))+1);
      } else {
        hashMap.put(sentence.charAt(i), 1);
      }
    }
  }

  public LetterCounter(String s) {
    this.sentence = s;
    hashMap = new HashMap<>();
  }

  public void setSentence(String sentence) {
    this.sentence = sentence;
  }

  public HashMap<Character, Integer> getLetterNumber() {
    return hashMap;
  }
}
