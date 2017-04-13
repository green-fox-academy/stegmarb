import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

public class Engine extends JComponent implements KeyListener {
  private List<Game> elements = new ArrayList<>();
  private Hero hero = new Hero(0,0);
  private Map map = new Map();
  private Enemy enemy = new Enemy();
  private int count = 0;
  private int[] heroPosition = new int[2];

  public Engine() {
    setPreferredSize(new Dimension(720, 780));
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
    String randPos = map.randomPosition();
    elements.add(new Boss(map.getRandomCoordinates(randPos)[0], map.getRandomCoordinates(randPos)[1]));
    renderSkeletons(enemy.getLevel());
    elements.add(hero);
  }

  public void renderSkeletons(int level) {
    int count = -2;
    while (count < level) {
      String randPos = map.randomPosition();
      elements.add(new Skeleton(map.getRandomCoordinates(randPos)[0], map.getRandomCoordinates(randPos)[1]));
      count++;
    }
  }

  public boolean isThereSomebody() {
    for (Game element : elements) {
      if (element instanceof Enemy) {
        if (hero.getPosX() == element.getPosX() && hero.getPosY() == element.getPosY()) {
          return true;
        }
      }
    }
    return false;
  }

  public Game giveThatMan() {
    List<Game> temp = new ArrayList<>();
    for (Game element : elements) {
      if (element instanceof Enemy) {
        if (hero.getPosX() == element.getPosX() && hero.getPosY() == element.getPosY()) {
          temp.add(element);
        }
      }
    }
    return temp.get(0);
  }


  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    for (Game element : elements) {
      PositionedImage image = new PositionedImage(element.getImage(), element.getPosX() * 72, element.getPosY() * 72);
      image.draw(graphics);
    }
    enemy.heroStats(graphics, hero);
    if (isThereSomebody()) {
      enemy.enemyStats(graphics, enemy);
    }
  }

  public static void setFrameElem() {
    JFrame frame = new JFrame("Dungeon Warrior");
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
//    for (Game element : elements) {
//      if (element instanceof Enemy) {
//        if (element.getPosX() == heroPosition[0] && element.getPosY() == heroPosition[1]) {
//          if (e.getKeyCode() == KeyEvent.VK_SPACE) {
//            System.out.println("Working");
//            while (hero.isAlive(hero, element))
//            hero.battle(hero, enemy);
//            hero.battle(enemy, hero);
//          }
//        }
//      }
//    }
//
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
    count++;
    heroPosition[0] = hero.getPosX();
    heroPosition[1] = hero.getPosY();

    if (count % 2 == 0) {
      for (Game element : elements) {
        if (element instanceof Enemy) {
          int dice = (int) (Math.random() * 4);
          switch (dice) {
            case 0:
              if (map.isItFree(element.getPosX(), element.getPosY() - 1)) {
                ((Enemy) element).moveUp();
              }
              break;
            case 1:
              if (map.isItFree(element.getPosX(), element.getPosY() + 1)) {
                ((Enemy) element).moveDown();
              }
              break;
            case 2:
              if (map.isItFree(element.getPosX() - 1, element.getPosY())) {
                ((Enemy) element).moveLeft();
              }
              break;
            case 3:
              if (map.isItFree(element.getPosX() + 1, element.getPosY())) {
                ((Enemy) element).moveRight();
              }
          }
        }
      }
    }
    repaint();
  }

  @Override
  public void keyReleased(KeyEvent e) {

  }

  public List<Game> getElements() {
    return elements;
  }
}

