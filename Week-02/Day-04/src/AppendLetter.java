import java.util.*;

/**
 * Created by stegmarb on 2017. 03. 23..
 */
public class AppendLetter {
  public static void main(String... args){
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
    for (int i = 0; i < far.size(); i++){
      far.set(i, far.get(i)+"a");
    }
    System.out.println(far);
    }
    // Add "a" to every string in the far list.

}
