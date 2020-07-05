package chapter4_Control_Statements_Part_1._4_24_Validating;

import java.util.Scanner;

/**
 * 4.24 (Validating User Input) Modify the program in Fig. 4.12 to validate its inputs.
 * For any input, if the value entered is other than 1 or 2, keep looping until the user enters a correct value.
 *
 * Created by ag on 26-Jun-20 2:34 PM
 */
class Analysis {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int passes = 0;
    int failures = 0;
    int studentCounter = 1;

    while (studentCounter <= 10) {
      System.out.print("Enter result (1 = pass, 2 = fail): ");
      int result = input.nextInt();

      if (result < 1 || result > 2) {
        System.out.println("Invalid value entered (" + result + "), try again");
        continue; // skip rest of while block and start again from line 19
      }

      if (result == 1)
        passes = passes + 1;
      else
        failures = failures + 1;

      studentCounter = studentCounter + 1;
    }

    System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

    // determine whether more than 8 students passed
    if (passes > 8)
      System.out.println("Bonus to instructor!");

  }
}


