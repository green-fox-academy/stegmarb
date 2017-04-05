import org.junit.Before;

public class LetterCounterTest {
  private LetterCounter string;
  private String countableSentence;

  @Before
  public void instatiation() {
    string = new LetterCounter(countableSentence);
  }
}