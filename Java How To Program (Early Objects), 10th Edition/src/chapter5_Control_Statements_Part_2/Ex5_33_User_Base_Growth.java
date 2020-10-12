package chapter5_Control_Statements_Part_2;

import java.time.Month;

/**
 * 5.33 (Facebook User Base Growth)
 * According to CNNMoney.com, Facebook hit one billion users in October 2012.
 * Assuming its user base grows at a rate of 4% per month,
 * how many months will it take for Facebook to grow its user base to
 * 1.5 billion users?
 * How many months will it take for Facebook to grow its user base
 * to two billion users?
 *
 * Created by ag on 12-Oct-20 6:07 PM 
 */
class Ex5_33_User_Base_Growth {
  public static void main(String[] args) {
    final double GROWTH_PER_MONTH = 0.04;
    long         users            = 1_000_000_000; // users in October 2012

    final long UPPER_BOUND = 2 * users;
    int        months      = 0;
    int        year        = 2012;

    System.out.printf("%s%15s%20s\n\n", "Year", "Month", "Users");
    for (int m = 9; users <= UPPER_BOUND; m++) {
      System.out.printf("%4d%15s%,20d\n", year, Month.of(1 + (m % 12)).toString(), users);

      users += users * GROWTH_PER_MONTH;

      if ((m + 1) % 12 == 0) {
        year++;
        System.out.println();
      }

      months++;
    }

    System.out.printf("\nIt would take %d months for Facebook to get %,d users base.",
                      months, UPPER_BOUND);
  }
}
