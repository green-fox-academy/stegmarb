import main.java.music.*;

public class App2 {
  public static void main(String[] args) {
    ElectricGuitar guitar2 = new ElectricGuitar(7);
    BassGuitar bassGuitar2 = new BassGuitar(5);

    System.out.println("Test 2 Play");
    guitar2.play();
    bassGuitar2.play();
  }
}
