package chapter5_logic_and_loops;

/**
 * 19. Write a method called firstDigit that returns the
 * first (most significant) digit of an integer. For example,
 * firstDigit(3572) should return 3.
 * It should work for negative numbers as well;
 * firstDigit(-947) should return 9.
 *
 * @author Mr.Dr.Professor
 * @since 21-Dec-20 4:13 PM
 */
class Ex5_19_firstDigit {
  public static void main(String[] args) {
    System.out.println(firstDigit(3572) + " => " + 3);
    System.out.println(firstDigit(-947) + " => " + 9);
    System.out.println(firstDigit(6) + " => " + 6);
    System.out.println(firstDigit(35) + " => " + 3);
    System.out.println(firstDigit(123456) + " => " + 1);
  }

  public static int firstDigit(int n) {
    return (Math.abs(n) + "").charAt(0) - '0';

//    n = Math.abs(n);
//    while (n > 9)
//      n /= 10;
//
//    return n;
  }
}
