import java.util.stream.IntStream;
import java.lang.CharSequence;

public class CharoOperations implements CharSequence{
  private String s;

  @Override
  public int length() {
    return s.length();
  }

  @Override
  public char charAt(int i) {
    return s.charAt(i);
  }

  @Override
  public CharSequence subSequence(int i, int i1) {
    CharSequence character = null;
    for (int j = i; j < i1+1; j++) {
      character += s.charAt(j);
    }
    return character;
  }

  @Override
  public IntStream chars() {
    return null;
  }

  @Override
  public IntStream codePoints() {
    return null;
  }
}
