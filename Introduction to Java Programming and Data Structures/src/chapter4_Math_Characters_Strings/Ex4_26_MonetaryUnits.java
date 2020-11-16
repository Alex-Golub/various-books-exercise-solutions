package chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * *4.26 (Financial application: monetary units)
 * Rewrite Listing 2.10, ComputeChange.java, to fix the possible
 * loss of accuracy when converting a float value to an int value.
 * Read the input as a string such as "11.56".
 * Your program should extract the dollar amount before the decimal
 * point, and the cents after the decimal amount using the
 * indexOf and substring methods.
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 7:33 PM
 */
class Ex4_26_MonetaryUnits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an amount for example 11.56: ");
    String amount = scanner.next();

    int dot   = amount.indexOf(".");
    int dollars;
    int cents = 0;

    if (dot == -1) {
      // Integral amount no cents
      dollars = Integer.parseInt(amount);
    } else {
      dollars = Integer.parseInt(amount.substring(0, dot));
      cents = Integer.parseInt(amount.substring(dot + 1));
      if (cents >= 100) {
        dollars += cents / 100;
        cents %= 100;
      }
    }

    System.out.println(
            dollars + " dollar" + (dollars > 1 ? "s" : "") +
                    " and " + cents + " cents"
    );
  }
}
