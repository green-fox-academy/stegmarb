import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

  @Test
    public void testName() {
    Apples apple = new Apples();
    assertEquals("apple", apple.getName());
  }

}