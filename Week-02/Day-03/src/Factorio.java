/**
 * Created by stegmarb on 2017. 03. 22..
 */
public class Factorio {
  public static void main(String[] args) {
  int randomNumber = 5;
    System.out.println(factorio(randomNumber));
  }
  public static int factorio (int x) {
    int y = 1;
    for (int i = x; i > 0 ; i--) {
      y = y * i;
    }
    return y;
  }
}
