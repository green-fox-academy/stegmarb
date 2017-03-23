import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by stegmarb on 2017. 03. 23..
 */
public class MatchMaking {
  public static void main(String[] args) {
    ArrayList <String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList <String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
    ArrayList <String> order = new ArrayList<>();

    for (int i = 0; i < girls.size()*2; i+=2) {
      order.add(i, girls.get(i/2));
      order.add(i+1, boys.get(i/2));
    }
    System.out.println(order);
  }
}
