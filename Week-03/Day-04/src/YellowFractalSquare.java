import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 30..
 */
public class YellowFractalSquare {
  public static int width = 700;
  public static int height = 700;

  public static void mainDraw(Graphics graphics) {
    fractalThirder(graphics, 0, 0, width, height, 5);

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
      this.setBackground(Color.YELLOW);
      mainDraw(graphics);

    }
  }

  public static void fractalThirder(Graphics g, int x, int y, int width, int heigth, int count) {
    if (count == 0) {
      return;
    } else {
      g.setColor(Color.BLACK);
      g.drawRect(x, y, width, heigth);
      g.drawRect(x + (width / 3)+1, y+1, width / 3, heigth / 3);
      g.drawRect(x+1, y + (heigth / 3)+1, width / 3, heigth / 3);
      g.drawRect(x + (2 * (width / 3))+1, y + (heigth / 3)+1, width / 3, heigth / 3);
      g.drawRect(x + (width / 3)+1, y + (2 * (heigth / 3))+1, width / 3, heigth / 3);
      fractalThirder(g, x + (width / 3)+1, y+1, width / 3, heigth / 3, count-1);
      fractalThirder(g, x+1, y + (heigth/3)+1, width/3, heigth/3, count-1);
      fractalThirder(g, x + (2*(width/3)+1), y + (heigth/3)+1, width/3, heigth/3, count-1);
      fractalThirder(g, x + (width / 3)+1, y + (2*(heigth/3))+1, width/3, heigth/3, count-1 );
    }
  }
}