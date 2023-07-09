package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

import java.util.Scanner;

/**
 * *10.26 (Calculator)
 *
 * Enter operand1 op operand2 => 3+4
 * 3 + 4 = 7
 *
 * Enter operand1 op operand2 => 1*2
 * 1 * 2 = 2
 *
 * Enter operand1 op operand2 => 15            / 2
 * 15 / 2 = 7
 *
 * Enter operand1 op operand2 => 17 /         1
 * 17 / 1 = 17
 *
 * Enter operand1 op operand2 =>
 *
 * @author Mr.Dr.Professor
 * @since 25-Mar-21 4:08 PM
 */
/*public*/ class Ex10_26_calculator {
  public static void main(String[] args) {
    while (true) {
      System.out.print("Enter operand1 op operand2 => ");
      Scanner scanner = new Scanner(System.in);
      calculate(parseExpression(scanner.nextLine()));
      System.out.println();
    }
  }

  private static void calculate(String exp) {
    String[] tokens = exp.split("\\s+");
    int op1 = Integer.parseInt(tokens[0]);
    int op2 = Integer.parseInt(tokens[2]);
    String operation = tokens[1];
    int result = 0;

    switch (operation) {
      case "+": result = op1 + op2; break;
      case "-": result = op1 - op2; break;
      case "*": result = op1 * op2; break;
      case "/": result = op1 / op2; break;
    }

    System.out.printf("%d %s %d = %d\n", op1, operation, op2, result);
  }

  /** normalize expression e.g. "3+4" => "3 + 4" */
  private static String parseExpression(String exp) {
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < exp.length(); i++) {
      char c = exp.charAt(i);

      if (c == '+' || c == '-' || c == '*' || c == '/') {
        builder.append(" ").append(c).append(" ");
      } else {
        builder.append(c);
      }
    }

    return builder.toString();
  }
}
