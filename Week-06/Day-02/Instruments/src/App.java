import main.java.music.BassGuitar;
import main.java.music.ElectricGuitar;
import main.java.music.Violin;

public class App {
  public static void main(String[] args) {
    ElectricGuitar electricGuitar = new ElectricGuitar();
    BassGuitar bassGuitar = new BassGuitar();
    Violin violin = new Violin();

    bassGuitar.play();
    electricGuitar.play();
    violin.play();
  }
}
