package chapter12_recursion;

/**
 * Integer Exponentiation
 *
 * @author Alex Golub
 * @since 03-May-21, 2:07 PM
 */
class pow {
  public static void main(String[] args) {
    System.out.println(pow(2, 16));
    System.out.println(pow(2, 10));
  }
  
  public static int pow(int x, int y) {
    if (y < 0)
      throw new IllegalArgumentException("negative exponent: " + y);
    if (y == 0)
      return 1;
    if (y % 2 == 0)
      return pow(x * x, y / 2);
    
    return x * pow(x, y - 1);
  }
}
