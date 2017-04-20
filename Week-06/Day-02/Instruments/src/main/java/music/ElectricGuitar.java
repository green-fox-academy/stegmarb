package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    setName("Electric guitar");
    setNumberOfStrings(6);
    setFormatForPlay("Twang");
  }

  public ElectricGuitar(int number) {
    setName("Electric guitar");
    setNumberOfStrings(number);
    setFormatForPlay("Twang");
  }

  public void play() {
    System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that " + getFormatForPlay());
  }
}
