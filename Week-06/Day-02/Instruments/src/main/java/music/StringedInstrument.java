package main.java.music;

public abstract class StringedInstrument extends Instrument {
  private int numberOfStrings;
  private String formatForPlay;

  public  StringedInstrument() {
  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public void setFormatForPlay(String formatForPlay) {
    this.formatForPlay = formatForPlay;
  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  public String getFormatForPlay() {
    return formatForPlay;
  }
}
