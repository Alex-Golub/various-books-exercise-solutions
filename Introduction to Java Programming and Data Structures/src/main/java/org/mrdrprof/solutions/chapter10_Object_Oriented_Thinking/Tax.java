package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

/**
 * ***10.8 (Financial: the Tax class)
 *
 * @author Mr.Dr.Professor
 * @since 3/23/2021 7:25 PM
 */
/*public*/ class Tax {
  private FilingStatus filingStatus;
  private final int[][] brackets;
  private final double[] rates;
  private double taxableIncome;

  public Tax(FilingStatus filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
    this.filingStatus = filingStatus;
    this.brackets = brackets;

    for (int i = 0; i < rates.length; i++) {
      rates[i] /= 100;
    }
    this.rates = rates;
    this.taxableIncome = taxableIncome;
  }

  public void setTaxableIncome(double taxableIncome) {
    this.taxableIncome = taxableIncome;
  }

  public void setFilingStatus(FilingStatus filingStatus) {
    this.filingStatus = filingStatus;
  }

  public double getTax() {
    int status = filingStatus.getFilingStatus();

    final double LEVEL_1 = brackets[status][0];
    final double LEVEL_2 = brackets[status][1];
    final double LEVEL_3 = brackets[status][2];
    final double LEVEL_4 = brackets[status][3];

    double tax = 0;
    if (taxableIncome <= LEVEL_1)
      tax = taxableIncome * rates[0];

    else if (taxableIncome <= LEVEL_2)
      tax = LEVEL_1 * rates[0] +
            (taxableIncome - LEVEL_1) * rates[1];

    else if (taxableIncome <= LEVEL_3)
      tax = LEVEL_1 * rates[0] +
            (LEVEL_2 - LEVEL_1) * rates[1] +
            (taxableIncome - LEVEL_2) * rates[2];

    else if (taxableIncome <= LEVEL_4)
      tax = LEVEL_1 * rates[0] +
            (LEVEL_2 - LEVEL_1) * rates[1] +
            (LEVEL_3 - LEVEL_2) * rates[2] +
            (taxableIncome - LEVEL_3) * rates[3];

    return tax;
  }
}
