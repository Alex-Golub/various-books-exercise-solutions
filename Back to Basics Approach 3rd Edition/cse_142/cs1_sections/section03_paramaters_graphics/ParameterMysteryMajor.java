package cse_142.cs1_sections.section03_paramaters_graphics;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section3/ParameterMysteryMajor
 *
 * sentence(major, fred, department);    => Many a student in the computer of fred
 * sentence(student, computer, fred);    => Many a computer in the department of major
 * sentence("fred", "honor", computer);  => Many a department in the honor of fred
 * sentence("foo", "bar", "baz");        => Many a baz in the bar of foo
 *
 * @author Alex Golub
 * @since 01-Apr-21 6:16 PM
 */
class ParameterMysteryMajor {
  public static void main(String[] args) {
    String major = "fred";
    String fred = "computer";
    String computer = "department";
    String department = "student";
    String student = "major";
    sentence(major, fred, department);
    sentence(student, computer, fred);
    sentence("fred", "honor", computer);
    sentence("foo", "bar", "baz");
  }

  public static void sentence(String major, String fred, String foo) {
    System.out.println("Many a " + foo + " in the " + fred + " of " + major);
  }
}
