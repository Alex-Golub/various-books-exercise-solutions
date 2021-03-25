package chapter10_Object_Oriented_Thinking;

import java.math.BigInteger;

/**
 * *10.18 (Large prime numbers)
 *
 * @author Mr.Dr.Professor
 * @since 25-Mar-21 11:31 AM
 */
/*public*/ class Ex10_18_largePrimeNumbers {
  public static void main(String[] args) {
    BigInteger start = BigInteger.valueOf(Long.MAX_VALUE);
    int count = 0;
    long startTime = System.currentTimeMillis();

    while (count < 5) {
      BigInteger prime = start.nextProbablePrime();
      System.out.println(prime);
      count++;
      start = prime;
    }
    long endTime = System.currentTimeMillis() - startTime;
    System.out.println("Time: " + endTime + "ms");
  }
}
