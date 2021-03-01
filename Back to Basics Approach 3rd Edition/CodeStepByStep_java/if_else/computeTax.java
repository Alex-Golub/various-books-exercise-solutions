package CodeStepByStep_java.if_else;

/**
 * https://www.codestepbystep.com/problem/view/java/ifelse/computeTax
 *
 * Write a method named computeTax that accepts a salary as a parameter
 * and that returns the amount of tax you would owe if you make that salary.
 *
 * The tax is based on your tax bracket as found from the first two columns below.
 * Once you know which row to use, start with the "flat amount" and add the
 * "plus %" of the amount over the amount listed in the final column.
 *
 * For example, if your income is $50,000, then you use the third row of
 * the table and compute the tax as $4,000 plus 25% of the amount over $29,050,
 * which comes to $9,237.50.
 * The total tax on $27,500 is $3,767.50.
 * For $6,000, the tax is $600.
 * For $120,000, the tax is $28,227.
 * Assume your method is passed a value ≥ 0.
 *
 * over	   but not over flat amount plus % of excess over
 * $0      $7150        $0          10%    $0
 * $7150   $29050       $715        15%    $7150
 * $29050  $70350       $4000       25%    $29050
 * $70350  unlimited    $14325      28%    $70350
 *
 * @author Mr.Dr.Professor
 * @since 01-Mar-21 1:05 AM
 */
/*public*/ class computeTax {
  public static void main(String[] args) {
    System.out.println(computeTax(50_000));
    System.out.println(computeTax(27500));
  }

  public static double computeTax(int income) {
    double tax = 0;
    if (income > 70350) {
      tax = 14325 + 0.28 * (income - 70350);
    } else if (income > 29050) {
      tax = 4000 + 0.25 * (income - 29050);
    } else if (income > 7150) {
      tax = 715 + 0.15 * (income - 7150);
    } else {
      tax = 0.10 * income;
    }

    return tax;
  }
}
