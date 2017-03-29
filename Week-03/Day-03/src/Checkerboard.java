import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 29..
 */


public class Checkerboard {
  public static int dimensionX = 1000;
  public static int dimensionY = 1000;

  public static void mainDraw(Graphics graphics) {
    // fill the canvas with a checkerboard pattern.
    checkerboardPattern(graphics);


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

  public static void checkerboardPattern(Graphics g) {
    int sizeX = dimensionX / 25;
    for (int i = 0; i < dimensionX; i += sizeX) {
      if (i % (sizeX * 2) == 0) {
        for (int j = 0; j < dimensionY; j += 2 * sizeX) {
          g.setColor(Color.BLACK);
          g.fillRect(j, i, sizeX, sizeX);
          g.setColor(Color.WHITE);
          g.fillRect(j + sizeX, i, sizeX, sizeX);
        }
      } else {
        for (int j = 0; j < dimensionY; j += 2 * sizeX) {
          g.setColor(Color.WHITE);
          g.fillRect(j, i, sizeX, sizeX);
          g.setColor(Color.BLACK);
          g.fillRect(j + sizeX, i, sizeX, sizeX);
        }
      }
    }
  }
}