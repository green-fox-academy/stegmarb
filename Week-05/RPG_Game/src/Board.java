import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  private int rowN;
  private int colN;
  private int direction;
  private int testBoxX;
  private int testBoxY;
  Map map = new Map();
  Hero hero = new Hero();
  Skeleton skeleton = new Skeleton();
  Boss boss = new Boss();

  public Board() {
    setPreferredSize(new Dimension(720, 852));
    setVisible(true);
    rowN = 0;
    colN = 0;
    direction = 2;
    testBoxX = 0;
    testBoxY = 0;
    map.threeSkeletonSpawn();
    map.bossDrop();
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    Render render = new Render();
    render.renderMap(graphics);
    render.renderEnemy(graphics);
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
      render.renderHub(graphics);
//    graphics.setColor(Color.WHITE);
//    graphics.fillRect(0, 792,720,60);
//    graphics.setColor(Color.BLACK);
//    graphics.setFont(new Font ("Courier New", 1, 17));
//    graphics.drawString("Hero (" + hero.level + ") HP: " + hero.hp + "/" + hero.maxHp + " | DP: " + hero.dp + " | SP: " + hero.sp, 190, 815);
//    if (map.getMap()[rowN][colN] == 2 ) {
//      graphics.setColor(Color.BLACK);
//      graphics.setFont(new Font ("Courier New", 1, 17));
//      graphics.drawString( skeleton.name+ " (" + skeleton.level + ") HP: " + skeleton.hp + "/" + skeleton.maxHp + " | DP: " + skeleton.dp + " | SP: " + skeleton.sp, 190, 835);
//    } else if (map.getMap()[rowN][colN] == 3) {
//      graphics.drawString( boss.name+ " (" + boss.level + ") HP: " + boss.hp + "/" + boss.maxHp + " | DP: " + boss.dp + " | SP: " + boss.sp, 190, 835);
//    }
  }

  public static void boardMain() {
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

  public int getRowN() {
    return rowN;
  }

  public int getColN() {
    return colN;
  }

  public int getDirection() {
    return direction;
  }
}
