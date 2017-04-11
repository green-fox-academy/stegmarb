public class Character {
  int hp;
  int maxHp;
  int dp;
  int sp;
  int level;

  public int rollingDice() {
    int dice = (int) (Math.random()*6);
    return dice+1;
  }
}
