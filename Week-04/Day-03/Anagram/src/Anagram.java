public class Anagram {
  private String firstString;
  private String secondString;

  public Anagram() {
    firstString = "adek";
    secondString = "deka";
  }

  public boolean isAnagram() {
    int count = 0;
    String asterix = "*";
    for (int i = 0; i < firstString.length() ; i++) {
      for (int j = 0; j < secondString.length(); j++) {
        if (firstString.charAt(i) == secondString.charAt(j)) {
          count++;
          secondString.replace(firstString.charAt(j), asterix.charAt(0));
        }
      }
    }
    if (count == firstString.length()) {
      return true;
    } else {
      return false;
    }
  }
}
