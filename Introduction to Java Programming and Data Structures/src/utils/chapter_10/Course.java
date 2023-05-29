package utils.chapter_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * **10.9 (The Course class)
 * 11.5 (The Course class)
 */
public class Course {

  private String courseName;
  //  private String[] students = new String[4];
  private List<String> students;
//  private int numberOfStudents;

  public Course(String courseName) {
    this.courseName = courseName;
    this.students = new ArrayList<>();
  }

  public void addStudent(String student) {
//    if (numberOfStudents == students.length) {
//      String[] temp = new String[2 * students.length];
//      System.arraycopy(students, 0, temp, 0, students.length);
//      students = temp;
//    }
//
//    students[numberOfStudents] = student;
//    numberOfStudents++;

    students.add(student);
  }

  /**
   * remove all students from the course
   */
  public void clear() {
//    students = new String[4];
//    numberOfStudents = 0;
    students.clear();
  }

  /**
   * return array with the current active students in this course
   */
  public String[] getStudents() {
//    String[] activeStudents = new String[getNumberOfStudents()];
//    int i = 0;
//    for (String student : students) {
//      if (student != null) {
//        activeStudents[i] = student;
//        i++;
//      }
//    }
//
//    return activeStudents;

    students.removeIf(Objects::isNull);
    return students.toArray(new String[0]);
  }

  /**
   * if student found then null will be assigned in its place
   */
  public void dropStudent(String student) {
//    for (int i = 0; i < students.length; i++) {
//      if (student.equalsIgnoreCase(students[i])) {
//        students[i] = null;
//        numberOfStudents--;
//        return;
//      }
//    }

    students.remove(student);
//    numberOfStudents--;
  }

  public int getNumberOfStudents() {
//    return numberOfStudents;
    return students.size();
  }

  public String getCourseName() {
    return courseName;
  }
}
