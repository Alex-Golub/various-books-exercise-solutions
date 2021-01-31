package chapter6_Methods;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * **6.31 (Financial: credit card number validation)
 * 1. Between 13 and 16 digits
 *
 * 2. Start with:
 *    4 for Visa cards
 *    5 for Master cards
 *    37 for American Express cards
 *    6 for Discover cards
 *
 * 3. Numbers generated using "Luhn check" or the "Mod 10 check" Process:
 *    3.1 Double every second digit from right to left.
 *    If doubling of a digit results in a two-digit number,
 *    add up the two digits to get a single-digit number.
 *    3.2 Add all single-digit numbers from Step 1
 *    3.3 Add all digits in the odd places from right to left in the card number.
 *    3.4 Sum the results from Step 2 and Step 3
 *    3.5 If the result from Step 4 is divisible by 10, the card number is valid;
 *    otherwise, it is invalid.
 *
 * Random credit card numbers: https://www.getcreditcardnumbers.com/
 *
 * @author Mr.Dr.Professor
 * @since 29-Jan-21 2:31 PM
 */
class Ex6_31_creditNumberValidation {
  static final int
          MIN_LENGTH       = 13,
          MAX_LENGTH       = 16,
          VISA             = 4,
          MASTER           = 5,
          AMERICAN_EXPRESS = 37,
          DISCOVERY        = 6;

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    DecimalFormat format = (DecimalFormat) DecimalFormat.getNumberInstance();
    format.setGroupingSize(4);

    while (true) {
      System.out.print("Enter a credit card number as a long integer: ");
      long creditNumber = console.nextLong();
      System.out.println(format.format(creditNumber) + " is" + (isValid(creditNumber) ? " " : " not ") + "valid\n");
    }
  }

  /**
   * Return true if the card number is valid
   */
  public static boolean isValid(long number) {
    int length = getSize(number);
    if (length < MIN_LENGTH || length > MAX_LENGTH)
      return false;

    long sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

    boolean prefixMatched = prefixMatched(number, VISA) ||
                            prefixMatched(number, MASTER) ||
                            prefixMatched(number, AMERICAN_EXPRESS) ||
                            prefixMatched(number, DISCOVERY);

    return sum % 10 == 0 && prefixMatched;
  }

  /**
   * Get the result from Step 2
   */
  public static int sumOfDoubleEvenPlace(long number) {
    int sum = 0;

    while (number != 0) {
      sum += getDigit((int) (number % 100) / 10);
      number /= 100;
    }

//    System.out.println("sum = " + sum);

    return sum;
  }

  /**
   * Return this number if it is a single digit, otherwise,
   * return the sum of the two digits
   */
  public static int getDigit(int number) {
    number *= 2;
    return number > 9 ? number / 10 + number % 10 : number;
  }

  /**
   * Return sum of odd-place digits in number
   */
  public static int sumOfOddPlace(long number) {
    int sum = 0;
    while (number != 0) {
      sum += (number % 100) % 10;
      number /= 100;
    }

//    System.out.println("sum = " + sum);

    return sum;
  }

  /**
   * Return true if the number d is a prefix for number
   */
  public static boolean prefixMatched(long number, int d) {
    return getPrefix(number, getSize(d)) == d;
  }

  /**
   * Return the first k number of digits from number. If the
   * number of digits in number is less than k, return number.
   */
  public static long getPrefix(long number, int k) {
    int size = getSize(number);

    int drop = size - k; // number of numbers to drop
    while (drop > 0) {
      number /= 10;
      drop--;
    }

//    System.out.println("prefix = " + number);

    return number;
  }

  /**
   * Return the number of digits in d
   */
  public static int getSize(long d) {
    int size = 0;

    while (d != 0) {
      d /= 10;
      size++;
    }

    return size;
  }
}
