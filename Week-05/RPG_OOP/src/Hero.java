public class Hero extends Character {


  public Hero(int posX, int posY) {
    super(posX, posY, "img/hero.png" );
    setMaxHp(20 + 3 * d6());
    setDp(2 * d6());
    setSp(5 + d6());
    setLevel(1);
    setHp(getMaxHp());
  }
}
