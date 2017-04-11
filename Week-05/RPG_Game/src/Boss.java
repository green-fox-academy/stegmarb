public class Boss extends Character {
  public Boss() {
    hp = 2 * level *rollingDice()+rollingDice();
    dp = level/2 * rollingDice()+(rollingDice()/2);
    sp = level * rollingDice()+rollingDice();
  }
}
