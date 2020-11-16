package chapter4_Math_Characters_Strings;

import java.util.Scanner;

/**
 * *4.23 (Financial application: payroll)
 * Write a program that reads the following information and prints
 * a payroll statement:
 *   Employee’s name (e.g., Smith)
 *   Number of hours worked in a week (e.g., 10)
 *   Hourly pay rate (e.g., 9.75)
 *   Federal tax withholding rate (e.g., 20%)
 *   State tax withholding rate (e.g., 9%)
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 6:31 PM
 */
class Ex4_23_Payroll {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter employee's name: ");
    String name = scanner.nextLine();

    System.out.print("Enter number of hours worked in a week: ");
    double weeklyHours = scanner.nextDouble();

    System.out.print("Enter hourly pay rate: ");
    double payRate = scanner.nextDouble();

    System.out.print("Enter federal tax withholding rate: ");
    double federalTax = scanner.nextDouble();

    System.out.print("Enter state tax withholding rate: ");
    double stateTax = scanner.nextDouble();

    // Payroll information
    System.out.println("\nEmployee Name: " + name);
    System.out.printf("Hours Worked: %.1f\n", weeklyHours);
    System.out.printf("Pay Rate: $%.2f\n", payRate);

    double grossPay = weeklyHours * payRate;
    System.out.printf("Gross Pay: $%.1f\n", grossPay);

    System.out.println("Deductions:");

    double federalWithholding = grossPay * federalTax;
    System.out.printf("\tFederal Withholding (%.1f%%): $%.1f\n",
            federalTax * 100, federalWithholding);

    double stateWithholding = grossPay * stateTax;
    System.out.printf("\tState Withholding (%.1f%%): $%.1f\n",
            stateTax * 100, stateWithholding);
    System.out.printf("\tTotal Deduction: $%.2f\n",
            federalWithholding + stateWithholding);

    double netPay = grossPay - (federalWithholding + stateWithholding);
    System.out.printf("Net Pay: $%.2f\n", netPay);

  }
}
