package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm13/anglePairs
 *
 * returns whether or not there exists both complementary and supplementary
 * angles amongst the three angles passed.
 * 1. Two angles are complementary if their sum is exactly 90 degrees;
 * 2. two angles are supplementary if their sum is exactly 180 degrees.
 *
 * @author Alex Golub
 * @since 11-Apr-21 8:54 PM
 */
class anglePairs {
  public static void main(String[] args) {
    System.out.println(anglePairs(0, 90, 180) + " => " + true);
    System.out.println(anglePairs(45, 135, 45) + " => " + true);
    System.out.println(anglePairs(177, 87, 3) + " => " + true);
    System.out.println(anglePairs(120, 60, 30) + " => " + true);
    System.out.println(anglePairs(35, 60, 30) + " => " + false);
    System.out.println(anglePairs(120, 60, 45) + " => " + false);
    System.out.println(anglePairs(45, 90, 45) + " => " + false);
    System.out.println(anglePairs(180, 45, 45) + " => " + false);
  }

  public static boolean anglePairs(int a, int b, int c) {
    return (a + b == 90 || b + c == 90 || a + c == 90) &&   // is_complementary?
           (a + b == 180 || b + c == 180 || a + c == 180); // is_supplementary?
  }
}
