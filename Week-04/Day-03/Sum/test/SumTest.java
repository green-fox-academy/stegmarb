import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
public Sum sum;

  @Before
  public void instantiateObject() {
    sum = new Sum();
  }

  @Test
  public void testListFiller() {
    int size = 100;
    sum.listFiller(size);
    assertTrue(sum.getIntList().size() == size);
  }

  @Test
  public void testSumMethod() {
    assertTrue(sum.listFiller(10) == sum.sumElements());
  }

  @Test
  public void testIfNoElements() {
    assertTrue(sum.sumElements() == 0);
  }

  @Test
  public void testIfOneElement() {
    int number = 18;
    sum.addElementSeparately(number);
    assertEquals(sum.sumElements(),number);
  }

  @Test
  public void testIfNull() {
    sum = null;
    assertNull(sum);
  }
}