package chapter5_Control_Statements_Part_2;

/**
 * 5.18 (Modified Compound-Interest Program) Modify the application in Fig. 5.6
 * to use only integers to calculate the compound interest.
 * [Hint: Treat all monetary amounts as integral numbers of pennies.
 * Then break the result into its dollars and cents portions by using
 * the division and remainder operations, respectively.
 * Insert a period between the dollars and the cents portions.]
 *
 * Created by ag on 25-Sep-20 2:37 PM 
 */
class Ex5_18_Compound_Interest_V2 {
  public static void main(String[] args) {
    int amount;
    int principal = 1000;
    int rate = 5; // 5%

    System.out.printf("%s%20s%10s%8s%n",
            "Year", "Amount on deposit", "Dollars", "Cents");

    for (int year = 1; year <= 10; ++year) {
      amount = (int) ((principal *
              Math.pow(100 + rate, year)) / Math.pow(100, year));
      int dollars = amount;
      int cents = amount % 100;
      System.out.printf("%4d%,20d%,10d%,8d%n", year, amount, dollars, cents);
    }
  }
}
