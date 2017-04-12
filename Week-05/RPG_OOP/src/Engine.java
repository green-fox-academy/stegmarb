import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

public class Engine extends JComponent implements KeyListener{
  private List<Game> elements = new ArrayList<Game>();
  int testBoxX;
  int testBoxY;

  public Engine() {
    testBoxX = 0;
    testBoxY = 0;
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
    listFiller();
  }

  public void listFiller() {
    Map map = new Map();
    for (int i = 0; i < map.getMap().length; i++) {
      for (int j = 0; j < map.getMap()[i].length; j++) {
        if (map.getMap()[i][j] == 0) {
          elements.add(new Floor(j, i));
        } else {
          elements.add(new Wall(j, i));
        }
      }
    }
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    for (Game element : elements) {
      PositionedImage image = new PositionedImage(element.getImage(), element.getPosX()*72, element.getPosY()*72);
      image.draw(graphics);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    Engine engine = new Engine();
    frame.add(engine);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(engine);
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      testBoxY -= 72;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += 72;
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      testBoxX += 72;
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      testBoxX -= 72;
    }
    repaint();
  }
}

