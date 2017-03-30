import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static int dimensionX = 1000;
  public static int dimensionY = 500;

  public static void mainDraw(Graphics graphics) {
    hyperbolas(graphics);

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

  public static void hyperbolas (Graphics g) {

    for (int i = 0; i < dimensionX; i += 20) {
      for (int j = 0; j < dimensionX; j += 20) {
        if (i == 0) {
          g.setColor(Color.RED);
          g.drawLine(j, i, dimensionX, j / 20 * (dimensionY / (dimensionX / 20)));
        } else if (j == 0) {
          g.setColor(Color.BLUE);
          g.drawLine(j, i / 20 * (dimensionY / (dimensionX / 20)), i, dimensionY);
        }
      }
    }
  }
}
