package chapter4_Control_Statements_Part_1._4_20_Salary;

/**
 * Created by ag on 26-Jun-20 1:45 PM
 */
public class Salary {

  private int weeklyHours;
  private double hourlyRate;

  public Salary(int weeklyHours, double hourlyRate) {
    this.weeklyHours = weeklyHours;
    this.hourlyRate = hourlyRate;
  }

  /** first 40 hours worked by each employee and time and a half for all hours worked in excess of 40 */
  public double grossPay() {
    return weeklyHours <= 40 ?
            hourlyRate * weeklyHours :
            hourlyRate * 40 + (weeklyHours - 40) * hourlyRate * 1.5;
  }
}
