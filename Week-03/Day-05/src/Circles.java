import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
  public static int width = 900;
  public static int height = 900;

  public static void mainDraw(Graphics graphics) {
    int xCoordinates = 25;
    int yCoordinates = 25;
    int size = 800;
    circles(graphics, xCoordinates, yCoordinates, size);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(width, height));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.WHITE);
      mainDraw(graphics);
    }
  }

  public static void circles(Graphics g, int x, int y, int size) {
    if (size < 10) {
      return;
    } else {
      g.setColor(Color.BLACK);
      g.drawOval(x, y, size, size);
      circles(g, (x + size / 4), y, size / 2);
      circles(g, (x + size / 20), y+ (4 * size / 10), size/2);
      circles(g, (x + (9 *size / 20)), y+ (4 * size / 10), size/2);
    }
  }
}


