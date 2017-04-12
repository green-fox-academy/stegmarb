import java.awt.*;

public class Render {
  Map map = new Map();
  static Hero hero = new Hero();
  Skeleton skeleton = new Skeleton();
  Boss boss = new Boss();

  public void renderMap(Graphics graphics) {
    for (int i = 0; i < map.getMap().length; i++) {
      for (int j = 0; j < map.getMap()[i].length; j++) {
        if (map.getMap()[i][j] == 1) {
          PositionedImage image = new PositionedImage("images/wall.png", j * 72, i * 72);
          image.draw(graphics);
        } else {
          PositionedImage image = new PositionedImage("images/floor.png", j * 72, i * 72);
          image.draw(graphics);
        }
      }
    }
  }

  public void renderEnemy(Graphics graphics) {
    for (int i = 0; i < map.getMap().length; i++) {
      for (int j = 0; j < map.getMap()[i].length; j++) {
        if (map.getMap()[i][j] == 2) {
          PositionedImage image = new PositionedImage("images/skeleton.png", j * 72, i * 72);
          image.draw(graphics);
        } else if (map.getMap()[i][j] == 3) {
          PositionedImage image = new PositionedImage("images/boss.png", j * 72, i * 72);
          image.draw(graphics);
        }
      }
    }
  }

  public void renderHub(Graphics graphics) {
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 792,720,60);
    graphics.setColor(Color.BLACK);
    graphics.setFont(new Font ("Courier New", 1, 17));
    graphics.drawString("Hero (" + hero.level + ") HP: " + hero.hp + "/" + hero.maxHp + " | DP: " + hero.dp + " | SP: " + hero.sp, 190, 815);
    if (map.getMap()[hero.getRowN()][hero.getColN()] == 2 ) {
      graphics.setColor(Color.BLACK);
      graphics.setFont(new Font ("Courier New", 1, 17));
      graphics.drawString( skeleton.name+ " (" + skeleton.level + ") HP: " + skeleton.hp + "/" + skeleton.maxHp + " | DP: " + skeleton.dp + " | SP: " + skeleton.sp, 190, 835);
    } else if (map.getMap()[hero.getRowN()][hero.getColN()] == 3) {
      graphics.drawString( boss.name+ " (" + boss.level + ") HP: " + boss.hp + "/" + boss.maxHp + " | DP: " + boss.dp + " | SP: " + boss.sp, 190, 835);
    }
  }
}
