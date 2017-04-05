import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LetterCounterTest {
  private LetterCounter hashMap;
  private String testString = "fffffkkkkklll";


  @Before
  public void instantiation() {
    hashMap = new LetterCounter(testString);
  }

  @Test
  public void testCounter() {
    hashMap.setSentence(testString);
    hashMap.counter();
    assertTrue(hashMap.getLetterNumber().get('k') == 5);

  }
}