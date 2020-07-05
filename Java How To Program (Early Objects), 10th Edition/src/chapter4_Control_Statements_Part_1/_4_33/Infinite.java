package chapter4_Control_Statements_Part_1._4_33;

/**
 * 4.33 (Multiples of 2 with an Infinite Loop) Write an application that keeps displaying in the
 * command window the multiples of the integer 2—namely, 2, 4, 8, 16, 32, 64, and so on. Your loop
 * should not terminate (i.e., it should create an infinite loop). What happens when you run this program?
 *
 * Created by ag on 29-Jun-20 4:31 PM
 */
class Infinite {
  public static void main(String[] args) {
    int exp = 1;
    while (true) { // infinite loop
      System.out.println((int) Math.pow(2, exp++));
    }
  }
}
