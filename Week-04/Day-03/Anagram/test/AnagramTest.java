import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  private Anagram anagram;

  @Test
  public void testAnagramMethod() {
    anagram = new Anagram();
    assertTrue(anagram.isAnagram());

  }

}