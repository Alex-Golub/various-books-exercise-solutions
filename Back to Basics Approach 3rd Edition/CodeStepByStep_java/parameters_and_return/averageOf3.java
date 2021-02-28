package CodeStepByStep_java.parameters_and_return;

import java.util.Arrays;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/averageOf3
 *
 * Write a method named averageOf3 that accepts three integers as
 * parameters and returns the average of the three integers as a real number.
 * For example, the call of averageOf3(4, 7, 13) returns 8.0.
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 2:06 PM
 */
/*public*/ class averageOf3 {
  public static double averageOf3(int... numbers) {
    return 1.0 * Arrays.stream(numbers).sum() / numbers.length;
  }
}
