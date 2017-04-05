import java.util.ArrayList;
import java.util.List;

public class Sum {
  private List<Integer> intList = new ArrayList<>();

  public int listFiller(int listSize) {
    int sumWayOne = 0;
    for (int i = 0; i < listSize ; i++) {
      intList.add((int) Math.random()*100);
      sumWayOne+=intList.get(i);
    }
    return sumWayOne;
  }

  public int sumElements() {
    int sum = 0;
    for (int i = 0; i < intList.size(); i++) {
      sum+=intList.get(i);
    }
    return sum;
  }

  public List getIntList() {
    return intList;
  }

}