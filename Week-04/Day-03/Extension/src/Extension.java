import java.util.Arrays;
import java.util.List;

public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (b > c) {
      return b;
    } else {
      return c;
    }
  }

  double median(List<Integer> pool) {
    if (pool.size() % 2 == 1) {
      return pool.get((pool.size() / 2));
    } else {
      double one = pool.get(pool.size() / 2);
      double two = pool.get(pool.size() / 2 - 1);
      return (one + two) / 2;
    }
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    String translated = "";
    for (int i = 0; i < hungarian.length(); i++) {
      char c = teve.charAt(i);
      if (!isVowel(c)) {
        translated+=c;
      } else {
        translated+=(c+"v"+c);
      }
    }
    return translated;
  }
}

