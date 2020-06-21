package chapter3_Intro_Classes_Objects_Methods_Strings._3_1_DialogBox;

import javax.swing.*;

/**
 * 3.1  Modify the addition program in Fig. 2.7 to use dialog-based input and output with the
 *      methods of class JOptionPane.
 *      Since method showInputDialog returns a String, you must convert
 *      the String the user enters to an int for use in calculations.
 *      The static method parseInt of class Integer (package java.lang) takes a String argument
 *      representing an integer and returns the value as an int.
 *      If the String does not contain a valid integer, the program will terminate with an error.
 *
 * Created by ag on 18-Jun-20 2:20 PM
 */
class Addition {
  public static void main(String[] args) {
    String num1 = JOptionPane.showInputDialog("Enter 1st number");
    String num2 = JOptionPane.showInputDialog("Enter 2nd number");

    // If parsing fails, application will terminate with an NumberFormatException
    int n1 = Integer.parseInt(num1);
    int n2 = Integer.parseInt(num2);

    String result = String.format("%d + %d = %d", n1, n2, (n1 + n2));

    JOptionPane.showMessageDialog(null, result);

  }
}
