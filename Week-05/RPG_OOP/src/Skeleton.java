public class Skeleton extends Enemy{

  public Skeleton(int posX, int posY){
    this(posX, posY, 1);
  }

  public Skeleton(int posX, int posY, int level) {
    super(posX, posY, "img/skeleton.png");
    setLevel(level);
    setMaxHp( 2 * getLevel() *d6());
    setDp(getLevel()/2 * d6());
    setSp(getLevel()* d6());
    setHp(52);
    //    setHp(getMaxHp());
    setName("Skeleton");
  }
}
