/**
 * Created by stegmarb on 2017. 03. 21..
 */
public class Cuboid {
  public static void main(String[] args) {
    double aSide = 5;
    double bSide = 15;
    double cSide = 7;
    double surfaceArea = (aSide*bSide + aSide*cSide + bSide*cSide)*2;
    double volume = aSide*bSide*cSide;
    System.out.println("Surface area: " + surfaceArea);
    System.out.println("Volume: " + volume);
  }
}
