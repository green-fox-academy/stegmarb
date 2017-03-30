import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class Hexagon {
  public static int width = 600;
  public static int height =600;

  public static void mainDraw(Graphics graphics) {
    int x = 300;
    int y = 300;
    hexagonDrawer(graphics,x,y,200);

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
  public static void hexagonDrawer (Graphics g, int x, int y, int size) {
    int[] arrayX = new int[6];
    int[] arrayY = new int[6];
    for (int i = 0; i < arrayX.length; i++) {
      if (i==0) {
        arrayX[i] = x-(size/2);
        arrayY[i] = y+size;
      } else if (i == 1) {
        arrayX[i] = x-size;
        arrayY[i] = y;
      } else if (i == 2) {
        arrayX[i] = x-(size/2);
        arrayY[i] = y-size;
      } else if (i == 3) {
        arrayX[i] = x+(size/2);
        arrayY[i] = y-size;
      } else if (i == 4) {
        arrayX[i] = x+size;
        arrayY[i] = y;
      } else if (i == 5) {
        arrayX[i] = x+(size/2);
        arrayY[i] = y+size;
      }
    }
    g.setColor(Color.BLACK);
    g.drawPolygon(arrayX,arrayY,arrayX.length);
  }
}