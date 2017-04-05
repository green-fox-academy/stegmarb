import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  private Anagram anagram;

  @Before
  public void instatiate () {
    anagram = new Anagram();
  }

  @Test
  public void testAnagramMethod() {
    assertTrue(anagram.isAnagram());

  }

  @Test
  public void testIfSpaceInIt() {
    anagram.setFirstString("asdfghjkl");
    anagram.setSecondString("lkj hg fd sa");
    assertTrue(anagram.isAnagram());
  }

}