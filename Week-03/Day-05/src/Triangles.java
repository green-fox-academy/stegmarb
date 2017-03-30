import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class Triangles {
  public static int width = 600;
  public static int height = 600;

  public static void mainDraw(Graphics graphics) {
    int x = 300;
    int y = 300;
    triangles(graphics, x, y, 200);


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

  public static void triangles(Graphics g, int x, int y, int size) {
    if (size < 5) {
      return;
    } else {
      double preside = Math.sqrt((size * size) - ((size / 2) * (size / 2)));
      int side = (int) preside;
      int[] xArray = new int[3];
      int[] yArray = new int[3];
      for (int i = 0; i < 3; i++) {
        if (i == 0) {
          xArray[i] = x - side;
          yArray[i] = y - (size / 2);
        } else if (i == 1) {
          xArray[i] = x;
          yArray[i] = y + size;
        } else {
          xArray[i] = x + side;
          yArray[i] = y - (size / 2);
        }
      }
      g.setColor(Color.BLACK);
      g.drawPolygon(xArray, yArray, xArray.length);
      triangles(g, (x + side/2), (y - size/4), size/2);
      triangles(g, (x - side/2), (y - size/4), size/2);
      triangles(g, x, y + size/2, size/2);
    }
  }
}
