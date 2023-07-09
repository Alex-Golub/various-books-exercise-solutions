package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

import java.math.BigInteger;

/**
 * *10.16 (Divisible by 2 or 3)
 *
 * @author Mr.Dr.Professor
 * @since 25-Mar-21 10:31 AM
 */
/*public*/ class Ex10_16_divisible_by_2_or_3 {
  public static void main(String[] args) {
    BigInteger integer = new BigInteger("1" + "0".repeat(49));
    int count = 0;
    BigInteger two = BigInteger.valueOf(2);
    BigInteger three = BigInteger.valueOf(3);
    BigInteger zero = BigInteger.ZERO;
    BigInteger one = BigInteger.ONE;

    while (count < 10) {
      if (integer.remainder(two).compareTo(zero) == 0 ||
          integer.remainder(three).compareTo(zero) == 0) {
        System.out.printf("%,d\n", integer);
        count++;
      }

      integer = integer.add(one);
    }
  }
}
