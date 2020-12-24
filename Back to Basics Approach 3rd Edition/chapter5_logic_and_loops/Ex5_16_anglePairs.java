package chapter5_logic_and_loops;

/**
 * 16. Write a method called anglePairs that accepts three angles (integers),
 * measured in degrees, as parameters and returns whether or not there exist
 * both complementary and supplementary angles among the three angles passed.
 *
 * Two angles are complementary if their sum is exactly 90 degrees;
 * two angles are supplementary if their sum is exactly 180 degrees.
 *
 * Assume that each angle passed is nonnegative.
 *
 * @author Mr.Dr.Professor
 * @since 21-Dec-20 2:42 PM
 */
class Ex5_16_anglePairs {
  public static void main(String[] args) {
    System.out.println(anglePairs(0, 90, 180));
    System.out.println(anglePairs(45, 135, 45));
    System.out.println(anglePairs(177, 87, 3));
    System.out.println(anglePairs(120, 60, 30));
    System.out.println(anglePairs(35, 60, 30));
    System.out.println(anglePairs(120, 60, 45));
    System.out.println(anglePairs(45, 90, 45));
    System.out.println(anglePairs(180, 45, 45));
  }

  public static boolean anglePairs(int a, int b, int c) {
    return (a + b == 90 || b + c == 90 || a + c == 90) &&   // is_complementary?
            (a + b == 180 || b + c == 180 || a + c == 180); // is_supplementary?
  }
}
