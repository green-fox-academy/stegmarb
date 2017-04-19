public class Car {
  private Type type;
  private Color color;

  public Car() {
    this.type = randomType();
    this.color = randomColor();
  }

  public Type randomType() {
    Type[] types = Type.values();
    return types[(int) (Math.random()*types.length)];
  }

  public Color randomColor() {
    Color[] colors = Color.values();
    return colors[(int) (Math.random()*colors.length)];
  }
}
