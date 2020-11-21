package chapter3_parameters_and_objects;

/**
 * 13. Write a method called pay that accepts two parameters: a real
 * number for a TA’s salary, and an integer for the number of hours
 * the TA worked this week. The method should return how much money
 * to pay the TA.
 * NOTE: The TA should receive “overtime” pay of 1.5 times the normal salary for
 * any hours above 8.
 * e.g.
 * pay(5.50, 6)  -> 33.0
 * pay(4.00, 11) -> 50.0
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 6:07 PM
 */
class Ex3_13_pay {
  public static void main(String[] args) {
    System.out.println(pay(5.50, 6)); // => 33.0
    System.out.println(pay(5.0, 8)); // => 40.0
    System.out.println(pay(4.00, 11)); // => 4 * 8 + 4*1.5 * (11 - 8) = 32 + 18 = 50.0
  }

  public static double pay(double salary, int hours) {
    return hours <= 8 ? hours * salary : 8 * salary + (hours - 8) * salary * 1.5;
  }
}
