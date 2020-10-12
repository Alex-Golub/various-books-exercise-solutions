package chapter5_Control_Statements_Part_2;

/**
 * 5.20 (Calculating the Value of π) Calculate the value of π from the infinite series.
 * Print a table that shows the value of π approximated by computing the first 200,000
 * terms of this series.
 * How many terms do you have to use before you first get a value that begins
 * with 3.14159?
 *
 * Created by ag on 25-Sep-20 3:30 PM
 */
class Ex5_20_Value_Of_PI {
  public static void main(String[] args) {
    final int terms = 200_000;
    double res = 0.0;

    int it = 0; // record first time precision is encountered
    final int precision = 314159;

    // Headers
    System.out.printf("%s%22s%n", "Iteration", "Approximation");

    // 4 * (1/1 - 1/3 + 1/5 - 1/7 + .. + (-1)^t * 1/(2t - 1))
    for (int t = 1; t <= terms; t++) {
      res += Math.pow(-1, t - 1) * (4.0 / ((2 * t) - 1));
      System.out.printf("%9d%22.10f%n", t, res);

      // Check if required precision encountered
      if ((int) (res * 100_000) == precision && it == 0) it = t;
    }

    System.out.println("# of terms before 3.14159 encountered => " + it);
  }
}
