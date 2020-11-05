package chapter3_Selections;

import java.time.Month;

/**
 * **3.4 (Random month)
 * Write a program that randomly generates an integer between 1
 * and 12 and displays the English month names
 * January, February, . . . , December
 * for the numbers 1, 2, . . . , 12, accordingly.
 *
 * Created by ag on 22-Oct-20 9:24 AM
 */
class Ex3_4_Random_Month {
  public static void main(String[] args) {

    for (int i = 0; i <= 10; i++) {
    int month = 1 + (int) (Math.random() * 12); // [1, 12]
    switch (month) {
      case 1: System.out.println("January");   break;
      case 2: System.out.println("February");  break;
      case 3: System.out.println("March");     break;
      case 4: System.out.println("April");     break;
      case 5: System.out.println("May");       break;
      case 6: System.out.println("June");      break;
      case 7: System.out.println("July");      break;
      case 8: System.out.println("August");    break;
      case 9: System.out.println("September"); break;
      case 10: System.out.println("October");  break;
      case 11: System.out.println("November"); break;
      case 12: System.out.println("December"); break;
    }

    // Can be also done with time library
    System.out.println("Using Library: " + month + " => " + Month.of(month));
    }
  }
}
