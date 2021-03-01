package CodeStepByStep_java.if_else;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/ifelse/spending
 *
 * @author Mr.Dr.Professor
 * @since 01-Mar-21 1:49 AM
 */
/*public*/ class spending {
  public static void spending(Scanner console, String name) {
    System.out.print("How much will " + name + " be spending? ");
    double amount = console.nextDouble();
    System.out.println();
    int numbills = (int) (amount / 20.0);
    if (numbills * 20.0 < amount) {
      numbills++;
    }
    System.out.println(name + " needs " + numbills + " bills");
  }
}
