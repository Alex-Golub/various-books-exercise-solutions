package chapter10_Object_Oriented_Thinking;

import utils.chapter_10.Course;

import java.util.Arrays;

/**
 * **10.9 (The Course class)
 */
class Ex_9 {
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

    System.out.printf("Number of students in course1: %d%n", course1.getNumberOfStudents());

    course1.dropStudent("Brian Smith");
    course1.dropStudent("Peter Jones");
    course1.dropStudent("Anne Kennedy");
    course1.dropStudent("John Grow");

    System.out.printf("Number of students in course1: %d%n", course1.getNumberOfStudents());

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
    System.out.printf("Number of students in course1: %d%n", course1.getNumberOfStudents());
  }
}
