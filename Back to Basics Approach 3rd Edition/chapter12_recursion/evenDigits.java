package chapter12_recursion;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter12/e14-evenDigits
 *
 * @author Alex Golub
 * @since 08-May-21, 1:43 PM
 */
class evenDigits {
  public static void main(String[] args) {
    System.out.println(evenDigits(8342116) + " => " + 8426);
    System.out.println(evenDigits(4109) + " => " + 40);
    System.out.println(evenDigits(8) + " => " + 8);
    System.out.println(evenDigits(-34512) + " => " + -42);
    System.out.println(evenDigits(-163505) + " => " + -60);
    System.out.println(evenDigits(3052) + " => " + 2);
    System.out.println(evenDigits(7010496) + " => " + 46);
    System.out.println(evenDigits(35179) + " => " + 0);
    System.out.println(evenDigits(5307) + " => " + 0);
    System.out.println(evenDigits(7) + " => " + 0);
  }
  
  public static int evenDigits(int n) {
    if (n < 0) {
      return -evenDigits(-n);
    }
    if (n < 10) { // base case
      return n % 2 == 0 ? n : 0;
    }
    int prev = evenDigits(n / 10); // step
    return n % 10 % 2 == 0 ? prev * 10 + n % 10 : prev;
  }
}
