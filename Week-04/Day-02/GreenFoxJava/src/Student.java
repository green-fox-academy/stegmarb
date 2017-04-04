public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  public void getGoal() {
    System.out.println("Be a junior developer.");
  }

  public void introduce() {
    System.out.println( "Hi, I'm " + name + " a " + age + " years old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays() {
    skippedDays++;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super();
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    super();
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }
}
