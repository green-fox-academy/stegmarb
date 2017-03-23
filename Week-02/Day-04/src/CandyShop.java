import java.util.ArrayList;
/**
 * Created by stegmarb on 2017. 03. 23..
 */
public class CandyShop {
  public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    for (int i = 0; i < arrayList.size(); i++) {
      if (arrayList.indexOf(2) == i ) {
        arrayList.set(i, "Croissant");
      } else if (arrayList.indexOf(false) == i) {
        arrayList.set(i, "Ice cream");
      }
    }

    // Accidentally we added "2" and "false" to the list.
    // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
    // No, don't just remove the lines

    System.out.println(arrayList);
  }
}
