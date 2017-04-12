public class Boss extends Enemy{

  public Boss(int posX, int posY) {
    this(posX, posY, 1);
  }

  public Boss(int posX, int posY, int level) {
    super(posX, posY,"img/boss.png");
    setLevel(level);
    setMaxHp( 2 * getLevel() *d6()+d6());
    setDp(getLevel()/2 * d6()+(d6()/2));
    setSp(getLevel()* d6()+d6());
    setHp(getMaxHp());
    setName("Boss");
  }
}
