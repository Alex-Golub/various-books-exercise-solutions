package chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * *7.21 (Sum integers)
 * Sum unspecified number of integers from command line
 * and displays their total.
 *
 * E.g. java Ex7_21_sumIntegers 12 12 12 13 154 15 12
 * output: 12 + 12 + 12 + 13 + 154 + 15 + 12 = 230
 *
 * @author Mr.Dr.Professor
 * @since 06-Feb-21 4:34 PM
 */
class Ex7_21_sumIntegers {
  public static void main(String[] args) {
    Scanner       reader = new Scanner(String.join(" ", args));
    int           sum    = 0;
    StringBuilder sb     = new StringBuilder();

    while (reader.hasNextInt()) {
      int value = reader.nextInt();
      sb.append(value);
      sum += value;

      if (reader.hasNextInt())
        sb.append(" + ");
    }

    System.out.println(sb + " = " + sum);
  }
}
