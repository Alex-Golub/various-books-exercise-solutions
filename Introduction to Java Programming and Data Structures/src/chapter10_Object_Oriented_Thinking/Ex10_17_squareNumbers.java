package chapter10_Object_Oriented_Thinking;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * *10.17 (Square numbers)
 *
 * @author Mr.Dr.Professor
 * @since 25-Mar-21 11:20 AM
 */
/*public*/ class Ex10_17_squareNumbers {
  public static void main(String[] args) {
    BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
    long start = (long) Math.sqrt(Long.MAX_VALUE);
    BigDecimal n = new BigDecimal(start);
    int count = 0;

    while (count < 10) {
      BigDecimal squared = n.multiply(n);

      if (squared.compareTo(longMaxValue) > 0) {
        count++;
        System.out.println(count + ": " + n + " squared = " + squared);
      }

      n = n.add(BigDecimal.ONE);
    }
  }
}
