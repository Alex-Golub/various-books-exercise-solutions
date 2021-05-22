package chapter12_recursion;

/**
 * Algorithm eliminates any multiples of the smaller integer from the larger integer.
 * Gommon in mathematics to return the GCD  of the absolute value of the two values.
 *
 * @author Alex Golub
 * @since 03-May-21, 2:25 PM
 */
class gcd {
  public static void main(String[] args) {
    System.out.println(gcd(4, 16));
    System.out.println(gcd(3, 64));
    System.out.println(gcd(20, 132));
    System.out.println(gcd(-20, -132));
  }
  
  public static int gcd(int x, int y) {
    if (x < 0 || y < 0) {
      return gcd(Math.abs(x), Math.abs(y));
    }
    
    if (y == 0) {
      return x;
    }
    
    return gcd(y, x % y);
  }
}
