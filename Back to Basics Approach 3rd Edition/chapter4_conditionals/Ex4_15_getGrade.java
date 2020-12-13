package chapter4_conditionals;

/**
 * 15. Write a method called getGrade that accepts an integer representing a
 * student’s grade in a course and returns that
 * student’s numerical course grade. The grade can be between
 * 0.0 (failing) and 4.0 (perfect). Assume that scores are
 * in the range of 0 to 100
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 7:35 PM
 */
class Ex4_15_getGrade {
  public static void main(String[] args) {
    System.out.printf("%-10s%-5s\n", "Score", "Grade");
    for (int i = 50; i <= 100; i++) {
      System.out.printf("%-10d%-5.2f\n", i, getGrade(i));
    }
  }

  public static double getGrade(int score) {
    if (score < 0 || score > 100)
      throw new IllegalArgumentException(score + " is out of range [0, 100]");

    if (score < 60) return 0.0;
    if (score < 62) return 0.7;
    if (score >= 95) return 4.0;

    return (score - 63) / 10.0 + 0.8;
  }
}
