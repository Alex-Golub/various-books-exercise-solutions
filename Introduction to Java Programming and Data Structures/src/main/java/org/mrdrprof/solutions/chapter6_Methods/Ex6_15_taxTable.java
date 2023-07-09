package org.mrdrprof.solutions.chapter6_Methods;

/**
 * *6.15 (Financial application: print a tax table)
 * NOTE: I will use array here to eliminate redundant code
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 4:21 PM
 */
class Ex6_15_taxTable {
  static final double TAX_1 = 0.10;
  static final double TAX_2 = 0.15;
  static final double TAX_3 = 0.25;
  static final double TAX_4 = 0.28;
  static final double TAX_5 = 0.33;
  static final double TAX_6 = 0.35;

  static final int[] singleLevels      = {8_350, 33_950, 82_250, 171_550, 372_950};
  static final int[] marriedJoint      = {16_700, 67_900, 137_050, 208_850, 372_950};
  static final int[] marriedSeparate   = {8_350, 33_950, 68_525, 104_425, 186_475};
  static final int[] headOfHouseLevels = {11_950, 45_500, 117_450, 190_200, 372_950};


  public static void main(String[] args) {
    System.out.printf("%-20s%-20s%-20s%-20s%s\n",
                      "Taxable", "Single", "Married Joint", "Married", "Head of");
    System.out.printf("%-20s%-20s%-20s%-20s%s\n",
                      "Income", "", "Or Qualifying", "Separate", "a House");
    System.out.printf("%-20s%-20s%-20s%-20s%s\n",
                      "", "", "Widow(er)", "", "");
    System.out.println("-".repeat(90));

    final int FROM = 50_000;
    final int TO   = 70_000;
    for (int i = FROM; i <= TO; i += 100) {
      System.out.printf("%-20d%-20d%-20d%-20d%d\n",
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
      case 0:
        tax = getTax(taxableIncome, singleLevels);
        break;
      case 1:
        tax = getTax(taxableIncome, marriedJoint);
        break;
      case 2:
        tax = getTax(taxableIncome, marriedSeparate);
        break;
      case 3:
        tax = getTax(taxableIncome, headOfHouseLevels);
        break;

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
      tax = income * TAX_1;

    else if (income <= LEVEL_2)
      tax = LEVEL_1 * TAX_1 +
            (income - LEVEL_1) * TAX_2;

    else if (income <= LEVEL_3)
      tax = LEVEL_1 * TAX_1 +
            (LEVEL_2 - LEVEL_1) * TAX_2 +
            (income - LEVEL_2) * TAX_3;

    else if (income <= LEVEL_4)
      tax = LEVEL_1 * TAX_1 +
            (LEVEL_2 - LEVEL_1) * TAX_2 +
            (LEVEL_3 - LEVEL_2) * TAX_3 +
            (income - LEVEL_3) * TAX_4;

    else if (income <= LEVEL_5)
      tax = LEVEL_1 * TAX_1 +
            (LEVEL_2 - LEVEL_1) * TAX_2 +
            (LEVEL_3 - LEVEL_2) * TAX_3 +
            (LEVEL_4 - LEVEL_3) * TAX_4 +
            (income - LEVEL_4) * TAX_5;

    else
      tax = LEVEL_1 * TAX_1 +
            (LEVEL_2 - LEVEL_1) * TAX_2 +
            (LEVEL_3 - LEVEL_2) * TAX_3 +
            (LEVEL_4 - LEVEL_3) * TAX_4 +
            (LEVEL_5 - LEVEL_4) * TAX_5 +
            (income - LEVEL_5) * TAX_6;

    return tax;
  }
}
