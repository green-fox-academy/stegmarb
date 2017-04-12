public class Boss extends Character {
  public Boss() {
    level = 2;
    maxHp = 2 * level *rollingDice()+rollingDice();
    hp = maxHp;
    dp = level/2 * rollingDice()+(rollingDice()/2);
    sp = level * rollingDice()+rollingDice();
    name = "Boss";
  }
}
