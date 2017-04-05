public class Anagram {
  private String firstString;
  private String secondString;

  public Anagram() {
    firstString = "adek";
    secondString = "deka";
  }

  public boolean isAnagram() {
    int count = 0;
    String newFirst = firstString.replace(" ", "");
    String newSecond = secondString.replace(" ", "");
    String asterix = "*";
    for (int i = 0; i < newFirst.length() ; i++) {
      for (int j = 0; j < newSecond.length(); j++) {
        if (newFirst.charAt(i) == newSecond.charAt(j)) {
          count++;
          newSecond.replace(newFirst.charAt(j), asterix.charAt(0));
        }
      }
    }
    if (count == newFirst.length()) {
      return true;
    } else {
      return false;
    }
  }

  public void setFirstString(String firstString) {
    this.firstString = firstString;
  }

  public void setSecondString(String secondString) {
    this.secondString = secondString;
  }
}
