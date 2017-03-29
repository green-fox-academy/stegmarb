import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


/**
 * Created by stegmarb on 2017. 03. 29..
 */
public class LineInTheMiddle {

  public static void mainDraw(Graphics graphics){
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
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

      graphics.setColor(Color.GREEN);
      graphics.drawLine(0, 150, 300, 150);

      graphics.setColor(Color.RED);
      graphics.drawLine(150, 0, 150, 300);

    }
  }

}
