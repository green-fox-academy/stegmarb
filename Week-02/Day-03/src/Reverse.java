import java.util.Arrays;

/**
 * Created by stegmarb on 2017. 03. 22..
 */
public class Reverse {
  public static void main(String[] args) {
    int[] aj = {3,4,5,6,7};
    int[] reversedAj = new int[aj.length];
    int count = 0;
    for (int i = aj.length-1; i > -1; i--) {
      reversedAj[count] = aj[i];
      count++;
    }
    System.out.println(Arrays.toString(reversedAj));
  }
}

// Count element was left inside the for loop, but was corrected.