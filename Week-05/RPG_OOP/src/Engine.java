import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

public class Engine extends JComponent implements KeyListener {
  private List<Game> elements = new ArrayList<>();
  private Hero hero = new Hero(0, 0, 1);
  private Map map = new Map();
  private Enemy enemy = new Enemy();
  private int count = 0;
  private int level = 1;

  public Engine() {
    setPreferredSize(new Dimension(720, 780));
    setVisible(true);
    listFiller();
    spawnEnemies();
    elements.add(hero);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    for (Game element : elements) {
      PositionedImage image = new PositionedImage(element.getImage(), element.getPosX() * 72, element.getPosY() * 72);
      image.draw(graphics);
    }
    enemy.heroStats(graphics, hero);
    if (isThereSomebodyStat()) {
      enemy.enemyStats(graphics, giveThatMan());
    }
    if (hero.getHp() <= 0) {
      PositionedImage image = new PositionedImage("img/game-over.png", 0, 150);
      image.draw(graphics);
    }
    nextLevel();
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
    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
      battleEngine();
    }
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
    enemyMovement();
    repaint();
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }

  public void nextLevel() {
    int counter = 0;
    for (Game element : elements) {
      if (element instanceof Enemy) {
        counter++;
      }
    }
    if (counter == 0) {
      level++;
      spawnEnemies();
    }
  }

  public void enemyMovement() {
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
  }

  public void spawnEnemies() {
    String randPos = map.randomPosition();
    elements.add(new Boss(map.getRandomCoordinates(randPos)[0], map.getRandomCoordinates(randPos)[1], level));
    renderSkeletons();
  }

  public void renderSkeletons() {
    int count = -2;
    while (count < level) {
      String randPos = map.randomPosition();
      elements.add(new Skeleton(map.getRandomCoordinates(randPos)[0], map.getRandomCoordinates(randPos)[1], level));
      count++;
    }
  }

  public boolean isThereSomebodyStat() {
    for (Game element : elements) {
      if (element instanceof Enemy) {
        if (hero.getPosX() == element.getPosX() && hero.getPosY() == element.getPosY()) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean isThereSomebody(Game element) {
    if (element instanceof Enemy) {
      if (hero.getPosX() == element.getPosX() && hero.getPosY() == element.getPosY()) {
        return true;
      }
    }
    return false;
  }

  public Character giveThatMan() {
    Character temp = new Character();
    for (Game element : elements) {
      if (element instanceof Enemy) {
        if (hero.getPosX() == element.getPosX() && hero.getPosY() == element.getPosY()) {
          temp = (Character) element;
        }
      }
    }
    return temp;
  }

  public void battleEngine() {
    for (Game element : elements) {
      if (isThereSomebody(element)) {
        hero.battle(hero, (Character) element);
        if (((Enemy) element).getHp() <= 0) {
          elements.remove(element);
          elements.remove(hero);
          hero = new Hero(hero.getPosX(), hero.getPosY(), hero.getLevel()+1);
          elements.add(hero);
          break;
        } else {
          enemy.battle((Character) element, hero);
          if (hero.getHp() <= 0) {
            elements.remove(hero);
            elements.add(new Game(360, 360, "img/game-over.png"));
            break;
          }
        }
      }
    }
  }
}

