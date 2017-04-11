import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  int rowN = 0;
  int colN = 0;
  int direction;
  int testBoxX;
  int testBoxY;
  Map map = new Map();


  public Board() {
    rowN = 0;
    colN = 0;
    direction = 2;
    testBoxX = 0;
    testBoxY = 0;
    setPreferredSize(new Dimension(720, 792));
    setVisible(true);
    map.skeletonSpawn();
    map.boosDrop();
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    for (int i = 0; i < map.getMap().length; i++) {
      for (int j = 0; j < map.getMap()[i].length; j++) {
        if (map.getMap()[i][j] == 0) {
          PositionedImage image = new PositionedImage("images/floor.png", j * 72, i * 72);
          image.draw(graphics);
        } else if (map.getMap()[i][j] == 1) {
          PositionedImage image = new PositionedImage("images/wall.png", j * 72, i * 72);
          image.draw(graphics);
        } else if (map.getMap()[i][j] == 2) {
          PositionedImage image = new PositionedImage("images/floor.png", j * 72, i * 72);
          image.draw(graphics);
          PositionedImage skeleton = new PositionedImage("images/skeleton.png", j * 72, i * 72);
          skeleton.draw(graphics);
        } else if (map.getMap()[i][j] == 3) {
          PositionedImage image = new PositionedImage("images/floor.png", j * 72, i * 72);
          image.draw(graphics);
          PositionedImage skeleton = new PositionedImage("images/boss.png", j * 72, i * 72);
          skeleton.draw(graphics);
        }
      }
      if (direction == 0) {
        PositionedImage hero = new PositionedImage("images/hero-up.png", testBoxX, testBoxY);
        hero.draw(graphics);
      } else if (direction == 1) {
        PositionedImage hero = new PositionedImage("images/hero-right.png", testBoxX, testBoxY);
        hero.draw(graphics);
      } else if (direction == 2) {
        PositionedImage hero = new PositionedImage("images/hero-down.png", testBoxX, testBoxY);
        hero.draw(graphics);
      } else if (direction == 3) {
        PositionedImage hero = new PositionedImage("images/hero-left.png", testBoxX, testBoxY);
        hero.draw(graphics);
      }
    }
  }

  public static void bordMain() {
    JFrame frame = new JFrame("Dungeon Master");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      direction = 0;
      testBoxY -= 72;
      rowN--;
      if (isNotAvailable()) {
        rowN++;
        testBoxY += 72;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      direction = 2;
      testBoxY += 72;
      rowN++;
      if (isNotAvailable()) {
        rowN--;
        testBoxY -= 72;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      direction = 3;
      testBoxX -= 72;
      colN--;
      if (isNotAvailable()) {
        colN++;
        testBoxX += 72;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      direction = 1;
      testBoxX += 72;
      colN++;
      if (isNotAvailable()) {
        colN--;
        testBoxX -= 72;
      }
    }
    repaint();
  }

    public boolean isNotAvailable() {
    if ((rowN < 0 || rowN >= map.getMap().length || colN < 0 || colN >= map.getMap()[0].length) || map.getMap()[rowN][colN] == 1) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }
}
