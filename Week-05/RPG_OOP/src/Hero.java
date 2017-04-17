public class Hero extends Character {

  public Hero() {
    super(0,0,"img/hero-down.png");
    setLevel(1);

  }

  public Hero(int posX, int posY, int level) {
    super(posX, posY, "img/hero-down.png" );
    setMaxHp(20 + 3 * d6());
    setDp(2 * d6());
    setSp(5 + d6());
    setLevel(level);
    setHp(getMaxHp());
    setName("Hero");
  }
}
