import java.awt.*;

public class Render {
  Map map = new Map();

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
}
