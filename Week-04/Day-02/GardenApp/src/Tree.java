public class Tree extends Plant {
  private double absorbtion;


  public Tree() {
    setThirst(7);
    this.absorbtion = 0.4;
    setName("Tree");
  }

  public Tree(String color, int thirst) {
    super(color, thirst);
    this.absorbtion = 0.4;
    setName("Tree");
  }

  public double getAbsorbtion() {
    return absorbtion;
  }

  public void setAbsorbtion(double absorbtion) {
    this.absorbtion = absorbtion;
  }
}
