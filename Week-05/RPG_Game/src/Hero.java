public class Hero extends Character {
  private int testBoxX;
  private int testBoxY;
  private int rowN;
  private int colN;

  public Hero() {
    hp = 20 + 3*rollingDice();
    dp = 2*rollingDice();
    sp = 5 + rollingDice();
    level = 1;
    maxHp = hp;
    testBoxX = 0;
    testBoxY = 0;
    rowN = 0;
    colN = 0;
  }

  public int getTestBoxX() {
    return testBoxX;
  }

  public int getTestBoxY() {
    return testBoxY;
  }

  public int getRowN() {
    return rowN;
  }

  public int getColN() {
    return colN;
  }
}
