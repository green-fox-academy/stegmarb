import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    int a = 3;
    int b = 3;
    assertEquals(6, extension.add(a, b));
  }

  @Test
  void testAdd_1and4is5() {
    int a = 4;
    int b = 4;
    assertEquals(8, extension.add(a, b));
  }

  @Test
  void testMaxOfThree_first() {
    int a = 12;
    int b = 6;
    int c = 15;
    assertEquals(15, extension.maxOfThree(a, b, c));
  }

  @Test

  void testMaxOfThree_third() {
    int a = 6;
    int b = 15;
    int c = 11;
    assertEquals(15, extension.maxOfThree(a, b, c));
  }

  @Test
  void testMedian_four() {
    assertEquals(9, extension.median(Arrays.asList(6,7,8,10,12,15)));
  }

  @Test
  void testMedian_five() {
    assertEquals(4, extension.median(Arrays.asList(1,2,3,4,5,6,7)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("kevereveskevedevelevem", extension.translate("kereskedelem"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("kovolbiviceve", extension.translate("kolbice"));
  }
}