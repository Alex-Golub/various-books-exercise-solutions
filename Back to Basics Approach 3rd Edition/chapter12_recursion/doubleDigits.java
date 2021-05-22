package chapter12_recursion;

/**
 * Write a recursive method called doubleDigits that accepts an integer n as
 * a parameter and returns the integer obtained by replacing every digit of
 * n with two of that digit.
 * <p>
 * For example, doubleDigits(348) should return 334488.
 * The call doubleDigits(0) should return 0.
 * Calling doubleDigits on a negative number should return
 * the negation of calling doubleDigits on the corresponding positive number;
 * for example, doubleDigits(–789) should return –778899.
 *
 * @author Alex Golub
 * @since 06-May-21, 11:46 AM
 */
class doubleDigits {
  public static void main(String[] args) {
    System.out.println(doubleDigits(348));
    System.out.println(doubleDigits(0));
    System.out.println(doubleDigits(-789));
    System.out.println(doubleDigits(-7));
    System.out.println(doubleDigits(-20));
  }
  
  public static int doubleDigits(int n) {
    if (n < 0) {
      return -doubleDigits(-n);
    }
    
    if (n < 10) {
      return n * 10 + n;
    }
    
    return (doubleDigits(n / 10) * 10 + n % 10) * 10 + n % 10;
  }
}

/*
f(-15) -> -f(15)
  f(15) -> (f(1) * 10 + 5) * 10 + 5
    f(1) -> 1 * 10 + 1 = 11
  f(15) -> (11 * 10 + 5) * 10 + 5 = 1155
f(-15) -> -1155
 */
