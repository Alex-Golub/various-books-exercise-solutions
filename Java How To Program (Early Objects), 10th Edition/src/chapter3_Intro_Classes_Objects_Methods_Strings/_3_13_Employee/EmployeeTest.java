package chapter3_Intro_Classes_Objects_Methods_Strings._3_13_Employee;

/**
 * 3.13 (Employee Class) Create a class called Employee that includes three instance variables—a
 * first name (type String), a last name (type String) and a monthly salary (double).
 * Provide a constructor that initializes the three instance variables. Provide a set and a get
 * method for each instance
 * variable. If the monthly salary is not positive, do not set its value.
 * Write a test app named EmployeeTest that demonstrates class Employee’s capabilities.
 * Create two Employee objects and display each
 * object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly
 * salary again.
 * Created by ag on 21-Jun-20 11:54 AM
 */
public class EmployeeTest {
  public static void main(String[] args) {
    Employee jane = new Employee("Jane", "Silky", 2500.0);
    Employee amy = new Employee("Amy", "Wilson", 4000.0);

    System.out.println(jane);
    System.out.println(amy);

    System.out.println("---");

    System.out.println(jane.getFirstName() + " yearly salary -> $" + jane.yearlySalary());
    System.out.println(amy.getFirstName() + " yearly salary -> $" + amy.yearlySalary());

    System.out.println("---");

    jane.raise(10);
    amy.raise(10);

    System.out.println(jane);
    System.out.println(amy);

    System.out.println("---");

    System.out.println(jane.getFirstName() + " yearly salary -> $" + jane.yearlySalary());
    System.out.println(amy.getFirstName() + " yearly salary -> $" + amy.yearlySalary());


  }

}
