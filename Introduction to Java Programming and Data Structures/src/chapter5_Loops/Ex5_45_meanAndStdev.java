package chapter5_Loops;

import java.util.Scanner;

/**
 * **5.45 (Statistics: compute mean and standard deviation)
 * Mean is simply the average of the numbers.
 * Standard deviation is a statistic that tells you how tightly
 * all the various data are clustered around the mean in a set of data.
 *
 * @author Mr.Dr.Professor
 * @since 26-Jan-21 9:28 PM
 */
class Ex5_45_meanAndStdev {
  public static void main(String... args) {
    Scanner   console   = new Scanner(System.in);
    final int NUMBERS   = 10;
    double    squareSum = 0; // xi^2
    double    sum       = 0; // xi

    System.out.print("Enter " + NUMBERS + " numbers (e.g. 1 2.0 3 4.5 5.9): ");

    // ignore numbers that are more then NUMBERS
    for (int i = 1; i <= NUMBERS && console.hasNextDouble(); i++) {
      double num = console.nextDouble();
      squareSum += num * num;
      sum += num;
    }

    double mean      = sum / NUMBERS;
    double deviation = Math.sqrt((squareSum - (sum * sum) / NUMBERS) / (NUMBERS - 1));

    System.out.printf("The mean is %.2f\n", mean);
    System.out.printf("The standard deviation is %.5f\n", deviation);
  }
}
