public class StartGame {
  public static void main(String[] args) {
    Engine engine = new Engine();
    engine.listFiller();
    for (Game element : engine.getElements()) {
      if (element instanceof Enemy) {
        System.out.println(((Enemy) element).getName());
      }
    }
    Engine.setFrameElem();

  }
}
