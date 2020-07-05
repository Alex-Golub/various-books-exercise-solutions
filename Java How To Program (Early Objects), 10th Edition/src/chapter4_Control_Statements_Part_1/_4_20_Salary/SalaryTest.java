package chapter4_Control_Statements_Part_1._4_20_Salary;

import java.util.Scanner;

/**
 * 4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of
 * three employees.
 * The company pays straight time for the first 40 hours worked by each employee
 * and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
 * number of hours worked last week and their hourly rates. Your program should input this information for each employee,
 * then determine and display the employee’s gross pay. Use class Scanner to
 * input the data.
 *
 * Created by ag on 26-Jun-20 1:42 PM
 */
class SalaryTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int NUM_OF_EMPLOYEES = 3;

    int i = 1;
    while (i <= NUM_OF_EMPLOYEES) {
        System.out.print("Employee number " + i + " total hours: ");
        int hours = Integer.parseInt(scanner.nextLine());
      while (hours < 0) {
        System.out.print("Invalid number of hours (" + hours + "), try again: ");
        hours = Integer.parseInt(scanner.nextLine());
      }

      System.out.print("Employee number " + i + " hourly rate: ");
      double rate = Double.parseDouble(scanner.nextLine());
      while (rate < 0.0) {
        System.out.print("Invalid number of rate ($" + rate + "), try again: ");
        rate = Double.parseDouble(scanner.nextLine());
      }

      System.out.printf("Weekly Gross Pay: $%.2f%n%n", new Salary(hours, rate).grossPay());

      i++;
    }

    System.out.println("\nHave a good day!");
  }
}
