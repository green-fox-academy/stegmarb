import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

public class Engine extends JComponent implements KeyListener {
  private List<Game> elements = new ArrayList<>();
  private Hero hero = new Hero();
  private Map map = new Map();
  private Enemy enemy = new Enemy();

  public Engine() {
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
    listFiller();
  }

  public void listFiller() {
    for (int i = 0; i < map.getMap().length; i++) {
      for (int j = 0; j < map.getMap()[i].length; j++) {
        if (map.getMap()[i][j] == 0) {
          elements.add(new Floor(j, i));
        } else {
          elements.add(new Wall(j, i));
        }
      }
    }
    elements.add(new Boss(map.getRandomCoordinates()[0], map.getRandomCoordinates()[1]));
    renderSkeletons(enemy.getLevel());
    elements.add(hero);
  }

  public void renderSkeletons(int level) {
    int count = -2;
    while (count < level) {
      elements.add(new Skeleton(map.getRandomCoordinates()[0], map.getRandomCoordinates()[1]));
      count++;
    }
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    for (Game element : elements) {
      PositionedImage image = new PositionedImage(element.getImage(), element.getPosX() * 72, element.getPosY() * 72);
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
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      if (map.isItFree(hero.getPosX(), hero.getPosY() - 1)) {
        hero.moveUp();
      }
      hero.setImage("img/hero-up.png");
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (map.isItFree(hero.getPosX(), hero.getPosY() + 1)) {
        hero.moveDown();
      }
      hero.setImage("img/hero-down.png");
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (map.isItFree(hero.getPosX() + 1, hero.getPosY())) {
        hero.moveRight();
      }
      hero.setImage("img/hero-right.png");
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (map.isItFree(hero.getPosX() - 1, hero.getPosY())) {
        hero.moveLeft();
      }
      hero.setImage("img/hero-left.png");
    }
    repaint();
  }

  @Override
  public void keyReleased(KeyEvent e) {

  }
}

