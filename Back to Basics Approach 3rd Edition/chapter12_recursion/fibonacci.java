package chapter12_recursion;

/**
 * @author Alex Golub
 * @since 03-May-21, 8:19 PM
 */
class fibonacci {
  public static void main(String[] args) {
//    System.out.println(fibonacci(20));
//    System.out.println(DecimalFormat.getInstance().format(fibonacci(40)));
    System.out.println(fibonacci(0));
    System.out.println(fibonacci(1));
    System.out.println(fibonacci(2));
    System.out.println(fibonacci(3));
    System.out.println(fibonacci(4));
  }
  
  public static long fibonacci(long n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibonacci(n, 2, 0, 1);
  }
  
  private static long fibonacci(long n, long i, long f0, long f1) {
    if (n == i) {
      return (i % 2 == 0 ? -1 : 1) * (f1 + f0);
    }
    
    return fibonacci(n, i + 1, f1, f0 + f1);
  }
}

/*
f(10) -> f(10, 3, 1, 1)
  f(10, 3, 1, 1) -> f(10, 4, 1, 2)
    f(10, 4, 1, 2) -> f(10, 5, 2, 3)
      f(10, 5, 2, 3) -> f(10, 6, 3, 5)
        f(10, 6, 3, 5) -> f(10, 7, 5, 8)
          f(10, 7, 5, 8) -> f(10, 8, 8, 13)
            f(10, 8, 8, 13) -> f(10, 9, 13, 21)
              f(10, 9, 13, 21) -> f(10, 10, 21, 34)
                f(10, 10, 21, 34) -> 55
*/
