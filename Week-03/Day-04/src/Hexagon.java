import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class Hexagon {
  public static int width = 600;
  public static int height = 600;

  public static void mainDraw(Graphics graphics) {
    int[] xDots = {150,450,600,450,150,0};
    int[] yDots = {25,25,300,575,575,300};
    hexagonDrawer(graphics,xDots, yDots,5);

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
  public static void hexagonDrawer (Graphics g, int[] x, int[] y, int counter) {
    int nPoints = x.length;
    if (counter == 0) {
      return;
    } else {
    g.setColor(Color.BLACK);
    g.drawPolygon(x, y, nPoints);
    for (int i = 0; i < x.length; i++) {
      x[i] = x[i] / 2;
      y[i] = y[i] / 2;
      hexagonDrawer(g, x, y, counter-1);
    }
    }
  }
}