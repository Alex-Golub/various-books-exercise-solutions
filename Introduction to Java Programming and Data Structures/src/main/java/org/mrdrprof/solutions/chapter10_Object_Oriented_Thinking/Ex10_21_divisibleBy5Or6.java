package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

import java.math.BigInteger;

/**
 * 10.21 (Divisible by 5 or 6)
 *
 * @author Mr.Dr.Professor
 * @since 25-Mar-21 12:21 PM
 */
/*public*/ class Ex10_21_divisibleBy5Or6 {
  public static void main(String[] args) {
    BigInteger one = BigInteger.ONE;
    BigInteger five = BigInteger.valueOf(5L);
    BigInteger six = BigInteger.valueOf(6L);
    BigInteger zero = BigInteger.ZERO;

    BigInteger start = BigInteger.valueOf(Long.MAX_VALUE).add(one);

    int count = 0;
    while (count < 10) {
      if (start.remainder(five).compareTo(zero) == 0 ||
          start.remainder(six).compareTo(zero) == 0) {
        System.out.println(start);
        count++;
      }

      start = start.add(one);
    }
  }
}
