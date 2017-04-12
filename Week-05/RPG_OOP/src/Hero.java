public class Hero extends Character {


  public Hero() {
    setHp(20 + 3 * d6());
    setDp(2 * d6());
    setSp(5 + d6());
    setLevel(1);
    setMaxHp(getHp());
  }

  public Hero(int posX, int posY, String image) {
    super(posX, posY, image);
  }
}
