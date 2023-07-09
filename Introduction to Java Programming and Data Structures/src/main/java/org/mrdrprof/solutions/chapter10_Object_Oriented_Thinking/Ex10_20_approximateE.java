package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * *10.20 (Approximate e)
 *
 * @author Mr.Dr.Professor
 * @since 25-Mar-21 12:06 PM
 */
/*public*/ class Ex10_20_approximateE {
  public static void main(String[] args) {
    BigDecimal e = BigDecimal.ONE;
    BigDecimal term = BigDecimal.ONE;

    for (int i = 1; i <= 1_000; i++) {
      term = term.divide(BigDecimal.valueOf(i), 25, RoundingMode.HALF_EVEN);
      e = e.add(term);

      if (i % 100 == 0) {
        System.out.printf("e = %s, %d iterations\n", e, i);
      }
    }
  }
}
