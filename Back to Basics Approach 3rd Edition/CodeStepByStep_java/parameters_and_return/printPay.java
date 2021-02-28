package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/printPay
 *
 * Every hour over 8 is paid at 1.5x the normal salary.
 *
 * @author Mr.Dr.Professor
 * @since 27-Feb-21 12:47 AM
 */
/*public*/ class printPay {
  public static void main(String[] args) {
    printPay(10, 11);
  }

  public static void printPay(double hourlySalary, int hoursWorked) {
    double salary = 0;
    if (hoursWorked > 8) {
      double baseSalary = 8 * hourlySalary;
      double overtimePay = (hoursWorked - 8) * 1.5 * hourlySalary;
      salary = baseSalary + overtimePay;
    } else {
      salary += hourlySalary * hoursWorked;
    }

    System.out.printf("Hours worked: %d\n", hoursWorked);
    System.out.printf("Pay earned: $%.2f\n", salary);
  }
}
