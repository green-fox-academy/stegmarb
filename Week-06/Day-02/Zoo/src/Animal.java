public abstract class Animal {
  private String name;
  private int age;
  private boolean isHungry;
  private String gender;

  public Animal(String name) {
    this.name = name;
  }

  public abstract String wantChild();


  public String getName() {
    return name;
  }
}
