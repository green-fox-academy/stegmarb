public class Hero extends Character {

  public Hero() {
    hp = 20 + 3*rollingDice();
    dp = 2*rollingDice();
    sp = 5 + rollingDice();
    level = 1;
    maxHp = hp;
  }
}
