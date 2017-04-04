import java.util.ArrayList;
import java.util.List;

public class LagopusClass {
  private String className;
  private List<Student> students;
  private List<Mentor> mentors;

  public void addStudent(Student s) {
    this.students.add(s);
  }

  public void addMentor(Mentor m) {
    this.mentors.add(m);
  }

  public void info() {
    System.out.println("Lagopus " + className + " class has " + students.size() + " students and " + mentors.size() + " mentors.");
  }

  public LagopusClass(String className) {
    this.students = new ArrayList<Student>();
    this.mentors = new ArrayList<Mentor>();
    this.className = className;
  }

}
