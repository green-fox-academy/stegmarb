import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 29..
 */

public class HorizontalLines {
  public static void mainDraw(Graphics graphics){
    drawHorizontalLine(graphics, 30, 48);
    drawHorizontalLine(graphics, 250, 150);
    drawHorizontalLine(graphics, 195, 285);



  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
  public static void drawHorizontalLine (Graphics g, int x, int y) {
    g.setColor(Color.BLUE);
    if (x <= 250) {
      g.drawLine(x, y, x + 50, y);
    }
  }

}
