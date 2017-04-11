import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
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
          PositionedImage image = new PositionedImage("images/floor.png", j*72, i*72);
          image.draw(graphics);
        } else if (map[i][j] == 1) {
          PositionedImage image = new PositionedImage("images/wall.png", j*72, i*72);
          image.draw(graphics);
        }
      }
    }
    PositionedImage hero = new PositionedImage("images/hero-down.png", 0, 0);
    hero.draw(graphics);
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

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      testBoxY -= 100;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += 100;
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}
