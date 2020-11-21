package chapter3_parameters_and_objects;

/**
 * 12. Write a method called scientific that accepts a real number base and
 * an exponent as parameters and computes
 * the base times 10 to the exponent, as seen in scientific notation.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 6:03 PM
 */
class Ex3_12_scientific {
  public static void main(String[] args) {
    System.out.println(scientific(6.23, 5)); // => 623000.0
  }

  public static double scientific(double base, int exp) {
    return base * Math.pow(10, exp);
  }
}
