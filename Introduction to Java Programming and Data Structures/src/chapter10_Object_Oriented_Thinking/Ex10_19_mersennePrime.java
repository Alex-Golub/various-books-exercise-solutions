package chapter10_Object_Oriented_Thinking;

import java.math.BigInteger;

/**
 * *10.19 (Mersenne prime)
 * NB: program may take several hours to run.
 *
 * p         2^p - 1
 * --------------------
 * 2         3
 * 3         7
 * 5         31
 * 7         127
 * 13        8,191
 * 17        131,071
 * 19        524,287
 * 31        2,147,483,647
 * ...
 *
 * @author Mr.Dr.Professor
 * @since 25-Mar-21 11:39 AM
 */
/*public*/ class Ex10_19_mersennePrime {
  public static void main(String[] args) {
    final int UP_TO = 61;

    System.out.printf("%-10s%s\n", "p", "2^p - 1");
    System.out.println("-".repeat(20));

    for (int p = 0; p <= UP_TO; p++) {
      BigInteger term = BigInteger.TWO.pow(p).subtract(BigInteger.ONE);

      if (isPrime(term)) {
        System.out.printf("%-10d%,d\n", p, term);
      }
    }
  }

  private static boolean isPrime(BigInteger n) {
    BigInteger one = BigInteger.ONE;
    BigInteger two = BigInteger.TWO;
    BigInteger five = BigInteger.valueOf(5L);
    BigInteger six = BigInteger.valueOf(6L);

    if (n.compareTo(one) == 0) {
      return false;
    }

    if (n.compareTo(two) == 0 || n.compareTo(BigInteger.valueOf(3L)) == 0) {
      return true;
    }

    if (n.remainder(two).compareTo(BigInteger.ZERO) == 0) {
      return false;
    }

    if (n.remainder(six).compareTo(one) != 0 &&
        n.remainder(six).compareTo(five) != 0) {
      return false;
    }

    BigInteger sqrt = n.sqrt();
    for (BigInteger i = five; i.compareTo(sqrt) <= 0; i = i.add(one)) {
      if (n.remainder(i).compareTo(BigInteger.ZERO) == 0) {
        return false;
      }
    }

    return true;
  }
}
