/**
 * Created by stegmarb on 2017. 03. 23..
 */
public class DrawChessTable {
  public static void main(String[] args) {

    for (int i = 1; i < 9; i++) {
      if (i % 2 != 0) {
        for (int j = 1; j < 9; j++) {
          if (j % 2 != 0) {
            System.out.print("%");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
      } else {
        for (int j = 1; j < 9; j++) {
          if (j % 2 != 0) {
            System.out.print(" ");
          } else {
            System.out.print("%");
          }

        }
        System.out.println();
      }
    }
  }
}