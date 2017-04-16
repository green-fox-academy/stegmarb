import java.awt.*;

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

  public void battle(Character attacker, Character defender) {
    int attackerSv = attacker.getSp() + (2 * d6());
    if (attackerSv > defender.getDp()) {
      if (defender.getHp() <= attackerSv) {
        defender.setHp(0);
      } else {
        defender.setHp(defender.getHp() - attackerSv);
      }
    }
  }

  public void heroStats(Graphics graphics, Character character) {
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 792, 720, 60);
    graphics.setColor(Color.BLACK);
    graphics.setFont(new Font("Courier New", 1, 17));
    graphics.drawString(character.getName() +" (" + character.getLevel() + ") HP: " + character.getHp() + "/" + character.getMaxHp() + " | DP: " + character.getDp() + " | SP: " + character.getSp(), 190, 745);
  }

  public void enemyStats(Graphics graphics, Character character) {
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 792, 720, 60);
    graphics.setColor(Color.BLACK);
    graphics.setFont(new Font("Courier New", 1, 17));
    graphics.drawString(character.getName() +" (" + character.getLevel() + ") HP: " + character.getHp() + "/" + character.getMaxHp() + " | DP: " + character.getDp() + " | SP: " + character.getSp(), 190, 775);
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
