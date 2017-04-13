public class Character extends Game {
  private int hp;
  private int maxHp;
  private int dp;
  private int sp;
  private int level;
  private String name;


  public void moveUp() {
    setPosY(getPosY()-1);
  }

  public void moveRight() {
    setPosX(getPosX()+1);
  }

  public void moveDown() {
    setPosY(getPosY()+1);
  }

  public void moveLeft() {
    setPosX(getPosX()-1);
  }

  public int d6() {
    int dice = (int) (Math.random()*6);
    return dice+1;
  }

  public boolean isAlive(Character attacker, Character defender) {
    if (attacker.getHp() <=0 || defender.getHp() <= 0){
      return true;
    } else {
      return false;
    }
  }

  public void battle(Character attacker, Character defender) {
    int attackerSv = attacker.getSp() + (2*d6());
    if (attackerSv > defender.getDp()) {
      defender.setHp(defender.getHp()-attackerSv);
    }
    if (attacker.getHp() <=0 || defender.getHp() <= 0){
      return;
    }
  }

  public Character() {
    super();
  }

  public Character(int posX, int posY, String image) {
    super(posX, posY, image);
  }

  public int getHp() {
    return hp;
  }

  public int getMaxHp() {
    return maxHp;
  }

  public int getDp() {
    return dp;
  }

  public int getSp() {
    return sp;
  }

  public int getLevel() {
    return level;
  }

  public String getName() {
    return name;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public void setMaxHp(int maxHp) {
    this.maxHp = maxHp;
  }

  public void setDp(int dp) {
    this.dp = dp;
  }

  public void setSp(int sp) {
    this.sp = sp;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public void setName(String name) {
    this.name = name;
  }
}
