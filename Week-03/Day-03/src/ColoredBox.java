import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by stegmarb on 2017. 03. 29..
 */
public class ColoredBox {

  public static void mainDraw(Graphics graphics){

    graphics.setColor(Color.YELLOW);
    graphics.drawLine(25,25,275,25);

    graphics.setColor(Color.RED);
    graphics.drawLine(275,25,275,275);

    graphics.setColor(Color.CYAN);
    graphics.drawLine(25,275,275,275);

    graphics.setColor(Color.BLACK);
    graphics.drawLine(25,25,25,275);

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
}
