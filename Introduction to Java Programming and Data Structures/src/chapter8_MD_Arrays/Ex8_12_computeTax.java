package chapter8_MD_Arrays;

/**
 * **8.12 (Financial application: compute tax)
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 6:09 PM
 */
class Ex8_12_computeTax {
  static final double[] RATES = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
  static final int[][] BRACKETS = {
          {8_350, 33_950, 82_250, 171_550, 372_950},
          {16_700, 67_900, 137_050, 208_850, 372_950},
          {8_350, 33_950, 68_525, 104_425, 186_475},
          {11_950, 45_500, 117_450, 190_200, 372_950}
  };

  public static void main(String[] args) {
    System.out.printf("%-20s%-20s%-20s%-20s%s\n",
                      "Taxable", "Single", "Married Joint", "Married", "Head of");
    System.out.printf("%-20s%-20s%-20s%-20s%s\n",
                      "Income", "", "Or Qualifying", "Separate", "a House");
    System.out.printf("%-20s%-20s%-20s%-20s%s\n",
                      "", "", "Widow(er)", "", "");
    System.out.println("-".repeat(90));

    final int FROM = 50_000;
    final int TO = 70_000;
    for (int i = FROM; i <= TO; i += 100) {
      System.out.printf("%,-20d%,-20d%,-20d%,-20d%,d\n",
                        i,
                        Math.round(computeTax(0, i)),
                        Math.round(computeTax(1, i)),
                        Math.round(computeTax(2, i)),
                        Math.round(computeTax(3, i))
      );
    }
  }

  public static double computeTax(int status, double taxableIncome) {
    double tax = 0;

    switch (status) {
      case 0: tax = getTax(taxableIncome, BRACKETS[0]); break;
      case 1: tax = getTax(taxableIncome, BRACKETS[1]); break;
      case 2: tax = getTax(taxableIncome, BRACKETS[2]); break;
      case 3: tax = getTax(taxableIncome, BRACKETS[3]); break;

      default:
        System.err.println("There is not such status");
    }

    return tax;
  }

  private static double getTax(double income, int[] levels) {
    final double LEVEL_1 = levels[0];
    final double LEVEL_2 = levels[1];
    final double LEVEL_3 = levels[2];
    final double LEVEL_4 = levels[3];
    final double LEVEL_5 = levels[4];

    double tax;
    if (income <= LEVEL_1)
      tax = income * RATES[0];

    else if (income <= LEVEL_2)
      tax = LEVEL_1 * RATES[0] +
            (income - LEVEL_1) * RATES[1];

    else if (income <= LEVEL_3)
      tax = LEVEL_1 * RATES[0] +
            (LEVEL_2 - LEVEL_1) * RATES[1] +
            (income - LEVEL_2) * RATES[2];

    else if (income <= LEVEL_4)
      tax = LEVEL_1 * RATES[0] +
            (LEVEL_2 - LEVEL_1) * RATES[1] +
            (LEVEL_3 - LEVEL_2) * RATES[2] +
            (income - LEVEL_3) * RATES[3];

    else if (income <= LEVEL_5)
      tax = LEVEL_1 * RATES[0] +
            (LEVEL_2 - LEVEL_1) * RATES[1] +
            (LEVEL_3 - LEVEL_2) * RATES[2] +
            (LEVEL_4 - LEVEL_3) * RATES[3] +
            (income - LEVEL_4) * RATES[4];

    else
      tax = LEVEL_1 * RATES[0] +
            (LEVEL_2 - LEVEL_1) * RATES[1] +
            (LEVEL_3 - LEVEL_2) * RATES[2] +
            (LEVEL_4 - LEVEL_3) * RATES[3] +
            (LEVEL_5 - LEVEL_4) * RATES[4] +
            (income - LEVEL_5) * RATES[5];

    return tax;
  }
}
