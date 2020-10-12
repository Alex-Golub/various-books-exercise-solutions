package chapter5_Control_Statements_Part_2;

/**
 * 5.14 (Modified Compound-Interest Program)
 *  Modify the compound-interest application of
 *  Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%.
 *  Use a for loop to vary the interest rate.
 *
 * Created by ag on 12-Jul-20 7:55 PM
 */
class Ex5_14_Compound_Interest {
  public static void main(String[] args) {
    double amount;
    double principal = 1000.0;
    double rate = 0.05;

    System.out.printf("%s%20s%5s%n", "Year", "Amount on deposit", "%");
    System.out.println("-".repeat(29));

    for (int percent = 5; percent <= 10; percent++, rate += 0.01) {
      for (int year = 1; year <= 10; ++year) {
        amount = principal * Math.pow(1.0 + rate, year);
        System.out.printf("%4d%,20.2f%5.0f%n", year, amount, rate * 100);
      }
      System.out.println("-".repeat(29));
    }
  }
}
