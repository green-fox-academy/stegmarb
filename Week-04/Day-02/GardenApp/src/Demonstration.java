public class Demonstration {
  public static void main(String[] args) {
    Garden garden = new Garden();
    garden.addPlant(new Flower("yellow", 0));
    garden.addPlant(new Flower("blue", 0));
    garden.addPlant(new Tree("purple", 0));
    garden.addPlant(new Tree("orange", 0));


    System.out.println(garden.writeContent());
    garden.water(40);
    System.out.println(garden.writeContent());
    garden.water(70);
    System.out.println(garden.writeContent());
  }
}
