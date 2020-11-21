package chapter3_parameters_and_objects;

/**
 * 9. Write a method called lastDigit that returns the last digit of an integer.
 * For example, lastDigit(3572) should return 2.
 * It should work for negative numbers as well.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 5:53 PM
 */
class Ex3_9_lastDigit {
  public static void main(String[] args) {
    System.out.println(lastDigit(3572));   // => 2
    System.out.println(lastDigit(-947));   // => 7
    System.out.println(lastDigit(6));      // => 6
    System.out.println(lastDigit(35));     // => 5
    System.out.println(lastDigit(123456)); // => 6
  }

  public static int lastDigit(int n) {
    return Math.abs(n % 10);
  }
}
