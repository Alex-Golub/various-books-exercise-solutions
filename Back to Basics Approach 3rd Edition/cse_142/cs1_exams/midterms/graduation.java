package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm4/graduation
 *
 * @author Alex Golub
 * @since 10-Apr-21 12:47 PM
 */
class graduation {
  public static void main(String[] args) {
    System.out.println(graduation(3.87, 178, 16).equals("not graduating"));
    System.out.println(graduation(1.5, 199, 30).equals("not graduating"));
    System.out.println(graduation(2.7, 380, 50).equals("graduating"));
    System.out.println(graduation(3.62, 200, 20).equals("magna cum laude"));
    System.out.println(graduation(3.93, 185, 0).equals("magna cum laude"));
    System.out.println(graduation(3.85, 190, 15).equals("summa cum laude"));
    System.out.println(graduation(2.0, 180, 0).equals("graduating"));
    System.out.println(graduation(2.1, 185, 10).equals("graduating"));
  }

  /**
   * The total credit count already includes the honors credits.
   * 1. Students must have completed at least 180 credits with a GPA of
   * at least 2.0 to graduate.
   * 2. Students who do have enough credits to graduate and sufficiently high
   * GPAs will receive one of four return values depending on the GPA and number
   * of honors credits:
   *   2.1 All students with GPAs between 2.0 and 3.6 receive a return
   *   value of "graduating".
   *   2.2 Students with fewer than 15 honors credits receive a return of
   *   "cum laude" if their GPA is at least 3.6 but less than 3.8, and a return
   *   of "magna cum laude" if their GPA is at least 3.8.
   *   2.3 Students with 15 or more honors credits receive a return of
   *   "magna cum laude" if their GPA is at least 3.6 but less than 3.8,
   *   and a return of "summa cum laude" if their GPA is at least 3.8.
   */
  public static String graduation(double gpa, int totalCredit, int honorsCredit) {
    if (totalCredit < 180 || gpa < 2.0) {
      return "not graduating";
    }

    if (honorsCredit >= 15 && gpa >= 3.8) {
      return "summa cum laude";
    }

    if (honorsCredit >= 15 && gpa >= 3.6 || gpa >= 3.8) {
      return "magna cum laude";
    }

    return gpa >= 3.6 ? "cum laude" : "graduating";
  }
}
