package chapter3_Intro_Classes_Objects_Methods_Strings._3_16_HeartRate;

import chapter3_Intro_Classes_Objects_Methods_Strings._3_14_Date.Date;

/**
 * Created by ag on 21-Jun-20 12:31 PM
 */
public class HeartRateTest {
  public static void main(String[] args) {
    HeartRates rates = new HeartRates("Michael", "Scoot",
            new Date(12, 1, 1965));

    rates.displayDate();

    System.out.println("---");

    HeartRates rates2 = new HeartRates("Dwight", "Schrute",
            new Date(9, 6, 1975));

    rates2.displayDate();
  }
}
