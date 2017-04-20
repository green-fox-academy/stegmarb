package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    setName("Bass guitar");
    setNumberOfStrings(4);
    setFormatForPlay("Duum-duum-duum");
  }

  public BassGuitar(int number) {
    setName("Bass guitar");
    setNumberOfStrings(number);
    setFormatForPlay("Duum-duum-duum");
  }

  public void play() {
    System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that " + getFormatForPlay());
  }
}
