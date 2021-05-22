package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/evenDigits
 *
 * @author Alex Golub
 * @since 06-May-21, 1:23 PM
 */
class evenDigits {
  public static void main(String[] args) {
    System.out.println(evenDigits(8342116));
    System.out.println(evenDigits(35179));
    System.out.println(evenDigits(-163505));
  }
  
  public static int evenDigits(int n) {
    if (n < 0) {
      return -evenDigits(-n);
    }
    
    if (n < 10) {
      return n % 2 == 0 ? n : 0;
    }
    
    int prev = evenDigits(n / 10);
    if (n % 10 % 2 == 0) {
      prev = prev * 10 + n % 10;
    }
    
    return prev;
  }
}
