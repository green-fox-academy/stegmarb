import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {
  public static int dimensionX = 1000;
  public static int dimensionY = 1000;
  public static void mainDraw(Graphics graphics) {
    int x = 500;
    int y = 500;
    int size = 500;
    hexagon(graphics, x, y, size);
  }
  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(dimensionX, dimensionY));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }

  public static void hexagon(Graphics g, int x, int y, int size) {
    if (size < 2) {
      return;
    } else {
      int[] arrayX = new int[6];
      int[] arrayY = new int[6];
      for (int i = 0; i < arrayX.length; i++) {
        if (i == 0) {
          arrayX[i] = x - (size / 2);
          arrayY[i] = y + size;
        } else if (i == 1) {
          arrayX[i] = x - size;
          arrayY[i] = y;
        } else if (i == 2) {
          arrayX[i] = x - (size / 2);
          arrayY[i] = y - size;
        } else if (i == 3) {
          arrayX[i] = x + (size / 2);
          arrayY[i] = y - size;
        } else if (i == 4) {
          arrayX[i] = x + size;
          arrayY[i] = y;
        } else if (i == 5) {
          arrayX[i] = x + (size / 2);
          arrayY[i] = y + size;
        }
      }
      g.setColor(Color.BLACK);
      g.drawPolygon(arrayX, arrayY, arrayX.length);
      hexagon(g, x - (2*(size/3)), y, size/3);
      hexagon(g, x - ((size/3)), y - (2*(size/3)), size/3);
      hexagon(g, x + ((size/3)), y - (2*(size/3)), size/3);
      hexagon(g, x + (2*(size/3)), y, size/3);
      hexagon(g, x + ((size/3)), y + (2*(size/3)), size/3);
      hexagon(g, x - ((size/3)), y + (2*(size/3)), size/3);
    }
  }
}
