package chapter5_Control_Statements_Part_2;

/**
 * 5.26
 * A criticism of the break statement and the continue statement is that each
 * is unstructured.
 * Actually, these statements can always be replaced by structured statements,
 * although doing so can be awkward.
 * Describe in general how you’d remove any break statement from a loop in a program
 * and replace it with some structured equivalent.
 *
 * [Hint: The break statement exits a loop from the body of the loop.
 * The other way to exit is by failing the loop-continuation test.
 * Consider using in the loop-continuation test a second test that indicates
 * “early exit because of a ‘break’ condition.”]
 * Use the technique you develop here to remove the break statement from the application in
 * Fig. 5.13.
 *
 * === ANS ===
 * Break statement is used when some condition is meet.
 * This condition can be moved to the loop condition checking before starting
 * next iteration.
 *
 * Created by ag on 12-Oct-20 1:34 PM 
 */
class Ex5_26_Break_Test {
  public static void main(String[] args) {
    breakExit();
    noBreak();
  }

  private static void breakExit() {
    int count;

    for (count = 1; count <= 10; count++) {
      if (count == 5)
        break;
      System.out.printf("%d ", count);
    }

    System.out.printf("%n(breakExit) Broke out of loop at count = %d%n", count);
  }

  private static void noBreak() {
    int count;

    for (count = 1; count <= 10 && count != 5; count++) {
      System.out.printf("%d ", count);
    }

    System.out.printf("%n(noBreak) Structured equivalent broke out of loop at count = %d%n", count);
  }
}
