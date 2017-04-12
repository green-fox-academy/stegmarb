public class Game {
  private int posX;
  private int posY;
  private String image;

  public Game() {}

  public Game(int posX, int posY, String image) {
    this.posX = posX;
    this.posY = posY;
    this.image = image;
  }
  public int getPosX() {
    return posX;
  }

  public int getPosY() {
    return posY;
  }

  public String getImage() {
    return image;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }

  public void setImage(String image) {
    this.image = image;
  }


}
