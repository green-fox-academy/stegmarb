public class Counter {
  public static void main(String[] args) {
    counter(15);
  }
  public static void counter (int number) {
    if (number <= 0) {
      System.out.println(0);
    } else {
      System.out.println(number);
      counter(number-1);
    }
  }
}
