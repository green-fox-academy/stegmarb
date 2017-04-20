package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    setName("Violin");
    setNumberOfStrings(4);
    setFormatForPlay("Screech");
  }

  public Violin(int number) {
    setName("Violin");
    setNumberOfStrings(number);
    setFormatForPlay("Screech");
  }

  public void play() {
    System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that " + getFormatForPlay());
  }
}
