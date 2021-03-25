package chapter10_Object_Oriented_Thinking;

import java.util.Arrays;

/**
 * **10.9 (The Course class)
 */
/*public*/ class Course {
  private String courseName;
  private String[] students = new String[4];
  private int numberOfStudents;

  public Course(String courseName) {
    this.courseName = courseName;
  }

  public void addStudent(String student) {
    if (numberOfStudents == students.length) {
      String[] temp = new String[2 * students.length];
      System.arraycopy(students, 0, temp, 0, students.length);
      students = temp;
    }

    students[numberOfStudents] = student;
    numberOfStudents++;
  }

  /** remove all students from the course */
  public void clear() {
    students = new String[4];
    numberOfStudents = 0;
  }

  /** return array with the current active students in this course */
  public String[] getStudents() {
    String[] activeStudents = new String[getNumberOfStudents()];
    int i = 0;
    for (String student : students) {
      if (student != null) {
        activeStudents[i] = student;
        i++;
      }
    }

    return activeStudents;
  }

  /** if student found then null will be assigned in its place */
  public void dropStudent(String student) {
    for (int i = 0; i < students.length; i++) {
      if (student.equalsIgnoreCase(students[i])) {
        students[i] = null;
        numberOfStudents--;
        return;
      }
    }
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }

  public String getCourseName() {
    return courseName;
  }

  public static void main(String[] args) {
    Course course1 = new Course("Data Structures");

    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("Anne Kennedy");
    course1.addStudent("John Grow");
    course1.addStudent("Gaby Troll");
    course1.addStudent("Anne Kennedy");
    course1.addStudent("Brian Smith");
    course1.addStudent("Peter Jones");

    System.out.println("Number of students in course1: "
                       + course1.getNumberOfStudents());

    course1.dropStudent("Brian Smith");
    course1.dropStudent("Peter Jones");
    course1.dropStudent("Anne Kennedy");
    course1.dropStudent("John Grow");

    System.out.println("Number of students in course1: "
                       + course1.getNumberOfStudents());

    String[] students = course1.getStudents();
    int numberOfStudents = course1.getNumberOfStudents();
    if (numberOfStudents > 0) {
      System.out.print(students[0]);
      for (int i = 1; i < numberOfStudents; i++) {
        System.out.print(", " + students[i]);
      }
      System.out.println("\n" + Arrays.toString(students));
    } else {
      System.out.println("[]");
    }

    System.out.println("\n\ncourse1.clear()");
    course1.clear();
    System.out.println("Number of students in course1: "
                       + course1.getNumberOfStudents());
  }
}