package chapter3_Intro_Classes_Objects_Methods_Strings._3_13_Employee;

/**
 * Created by ag on 21-Jun-20 11:53 AM
 */
public class Employee {

  private String firstName;
  private String lastName;
  private double salary;

  public Employee(String firstName, String lastName, double salary) {
    if (salary > 0.0) {
      this.salary = salary;
    }

    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    if (salary > 0.0D) {
      this.salary = salary;
    }
  }

  public double yearlySalary() {
    return this.getSalary() * 12;
  }

  public void raise(double percent) {
    if (percent > 0.0) {
      this.setSalary(this.getSalary() + this.getSalary() * percent / 100);
    }
  }

  @Override
  public String toString() {
    return this.getFirstName() + " " + this.getLastName() +
            ", Monthly Salary: $" + this.getSalary();
  }

}
