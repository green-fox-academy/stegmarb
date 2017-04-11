import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  int direction;
  int testBoxX;
  int testBoxY;
  int[][] map = {{0,0,0,1,0,1,0,0,0,0},
                 {0,0,0,1,0,1,0,1,1,0},
                 {0,1,1,1,0,1,0,1,1,0},
                 {0,0,0,0,0,1,0,0,0,0},
                 {1,1,1,1,0,1,1,1,1,0},
                 {0,1,0,1,0,0,0,0,1,0},
                 {0,1,0,1,0,1,1,0,1,0},
                 {0,0,0,0,0,1,1,0,1,0},
                 {0,1,1,1,0,0,0,0,1,0},
                 {0,0,0,1,0,1,1,0,1,0},
                 {0,1,0,1,0,1,0,0,0,0}};

  public Board() {
    direction = 2;
    testBoxX = 0;
    testBoxY = 0;

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 792));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        if (map[i][j] == 0) {
          PositionedImage image = new PositionedImage("images/floor.png", j * 72, i * 72);
          image.draw(graphics);
        } else if (map[i][j] == 1) {
          PositionedImage image = new PositionedImage("images/wall.png", j * 72, i * 72);
          image.draw(graphics);
        }
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



  public static void bordMain() {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("Dungeon Master");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      testBoxY -= 72;
      direction = 0;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += 72;
      direction = 2;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      testBoxX -= 72;
      direction = 3;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      testBoxX += 72;
      direction = 1;
    }
    borders();
    repaint();
  }

  public void borders() {
  if (testBoxX < 0) {
      testBoxX += 72;
    } else if (testBoxX >= 720) {
      testBoxX -= 72;
    } else if (testBoxY < 0) {
      testBoxY += 72;
    } else if (testBoxY >= 792) {
      testBoxY -= 72;
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    // and redraw to have a new picture with the new coordinates
  }
}
