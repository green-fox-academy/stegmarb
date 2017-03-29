import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 29..
 */
public class LinePlayQuarters {
  public static int dimensionX = 500;
  public static int dimensionY = 500;

  public static void mainDraw(Graphics graphics) {
    // divide the canvas into 4 parts
    // and repeat this pattern in each quarter:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]
    quarterLines(graphics);

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
  public static void quarterLines (Graphics g) {

    for (int i = 0; i < dimensionY+1; i += 20) {
      for (int j = 0; j < dimensionX+1; j += 20) {
        if (i == 0 && j <= dimensionX / 2) {
          g.setColor(Color.BLUE);
          g.drawLine(j, i, 0, (dimensionY/2)-j);
        } else if (i == 0 && j > dimensionX/2) {
          g.setColor(Color.RED);
          g.drawLine(j, i, dimensionX, j-(dimensionY/2));
        } else if (j == 0 && i > dimensionY/2) {
          g.setColor(Color.BLACK);
          g.drawLine(j, i, i-(dimensionX/2), dimensionY);
        } else if (j == dimensionX && i > dimensionY/2) {
          g.setColor(Color.GREEN);
          g.drawLine(j, i, dimensionX-(i-dimensionX/2), dimensionY);
        }
      }
    }
  }

}