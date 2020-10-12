package chapter5_Control_Statements_Part_2;

/**
 * 5.28
 * Describe in general how you’d remove any continue statement from a loop in a program
 * and replace it with some structured equivalent.
 * Use the technique you develop here to remove the continue statement
 * from the program in Fig. 5.14.
 *
 * Created by ag on 12-Oct-20 1:47 PM 
 */
class Ex5_28_Continue_Test {
  public static void main(String[] args) {
    withContinue();
    noContinue();
  }

  private static void withContinue() {
    for (int count = 1; count <= 10; count++) {
      if (count == 5)
        continue;

      System.out.printf("%d ", count);
    }

    System.out.printf("%n(withContinue) Used continue to skip printing 5%n");
  }

  private static void noContinue() {
    for (int count = 1; count <= 10; count++) {
      if (count != 5)
        System.out.printf("%d ", count);
    }

    System.out.printf("%n(noContinue) Used structured equivalent to skip printing 5%n");
  }
}
