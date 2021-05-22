package chapter12_recursion;

/**
 * Write a recursive method called writeBinary that accepts an integer as a
 * parameter and writes its binary representation to the console.
 * For example, writeBinary(44) should print 101100.
 *
 * @author Alex Golub
 * @since 06-May-21, 12:06 PM
 */
class writeBinary {
  public static void main(String[] args) {
    writeBinary(44);
    System.out.println();
    writeBinary(3);
  }
  
  public static void writeBinary(int n) {
    if (n == 0) {
      System.out.print("");
    } else {
      writeBinary(n / 2);
      System.out.print(n % 2);
    }
  }
}

/*
f(44) -> f(22) "0"
  f(22) -> f(11) "0"
    f(11) -> f(5) "1"
      f(5) -> f(2) "1"
        f(2) -> f(1) "0"
          f(1) -> f(0) "1"
            f(0) -> ""
          f(1) -> "1"
        f(2) -> "10"
      f(5) -> "101"
    f(11) -> "1011"
  f(22) -> "10110"
f(44) -> "101100"
*/
