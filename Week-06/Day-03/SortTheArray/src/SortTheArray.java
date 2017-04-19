public class SortTheArray {
  public static void main(String[] args) {
    Double[] test = {1.2, 2.9, 3.8, 4.45, 5.487};
    sortMethod(test);
  }

  public static <T extends Number> void sortMethod(T[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 1; j < array.length; j++) {
        if (array[j-1].doubleValue() < array[j].doubleValue()) {
          T temp = array[j-1];
          array[j-1] = array[j];
          array[j] = temp;
        }
      }
    }
  }
}