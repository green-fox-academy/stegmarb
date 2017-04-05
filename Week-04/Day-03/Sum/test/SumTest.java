import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {


  @Test
  public void testListFiller() {
    Sum sum = new Sum();
    int size = 100;
    sum.listFiller(size);
    assertTrue(sum.getIntList().size() == size);
  }

  @Test
  public void testSumMethod() {
    Sum sum = new Sum();
    assertTrue(sum.listFiller(10) == sum.sumElements());
  }

}