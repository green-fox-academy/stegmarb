public class Hero extends Character {

  public Hero() {
    super(0,0,"img/hero-down.png");
  }

  public Hero(int posX, int posY) {
    super(posX, posY, "img/hero-down.png" );
    setMaxHp(20 + 3 * d6());
    setDp(2 * d6());
    setSp(5 + d6());
    setLevel(1);
    setHp(getMaxHp());
    setName("Hero");
  }
}
