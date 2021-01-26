package chapter5_Loops;

/**
 * Program that displays the first 50 prime numbers in 5 lines,
 * each containing 10 numbers.
 *
 * @author Mr.Dr.Professor
 * @since 20-Jan-21 10:41 PM
 */
class PrimeNumber {
  public static void main(String[] args) {
    final int NUMBER_OF_PRIMES = 100;
    final int PER_LINE = 10;
    int count = 0;
    int number = 2; // p >= 2

    System.out.println("The first 100 prime numbers are\n");

    while (count < NUMBER_OF_PRIMES) {
      boolean isPrime = true;

      if (number == 2 || number == 3) {
        isPrime = true;
      } else if (number % 2 == 0) {
        isPrime = false;
      } else {
        for (int divisor = 5; divisor <= number / 2; divisor += 2) {
          if (number % divisor == 0) {
            isPrime = false;
            break;
          }
        }
      }

      if (isPrime) {
        count++;
        if (count % PER_LINE == 0) {
          System.out.printf("%-5d\n", number);
        } else {
          System.out.printf("%-5d ", number);
        }
      }

      number++; // check next number
    }
  }
}
