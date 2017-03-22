import java.util.Arrays;

/**
 * Created by stegmarb on 2017. 03. 22..
 */
public class SumAll {
  public static void main(String[] args) {
    int[] ai = {3,4,5,6,7};
    int sumArray = 0;
    for (int i = 0; i < ai.length; i++) {
      sumArray = sumArray+ai[i];
    }
    System.out.println(sumArray);
  }
}
