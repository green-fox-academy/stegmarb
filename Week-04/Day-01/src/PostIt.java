
public class PostIt {
  String backgroundColor;
  String text;
  String textColor;

  public PostIt(String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }

  public static void main(String[] args) {
    PostIt first = new PostIt("orange", "Idea1", "blue");
    PostIt second = new PostIt("pink", "Awesome", "black");
    PostIt third = new PostIt("yellow", "Superb!", "green");
    System.out.println(first.text);
    System.out.println(third.backgroundColor);
    System.out.println(second.textColor);
  }
}

