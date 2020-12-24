package chapter5_logic_and_loops;

/**
 * @author Mr.Dr.Professor
 * @since 19-Dec-20 3:06 PM
 */
class CommonPrefix {
  public static void main(String[] args) {
    printCommonPrefix(123456785, 123896664);
  }

  public static void printCommonPrefix(int x, int y) {
    int z = 0;
    while (x != y) {
      z++; // discard number
      if (x > y) x /= 10;
      else y /= 10;
    }

    System.out.println("common prefix = " + x);
    System.out.println("digits discarded = " + z);
  }
}

