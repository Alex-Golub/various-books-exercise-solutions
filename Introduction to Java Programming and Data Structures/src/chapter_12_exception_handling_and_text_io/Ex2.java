package chapter_12_exception_handling_and_text_io;

import java.util.Scanner;

/**
 * *12.2 (InputMismatchException)
 *
 * @author Alex Golub
 * @since 08/06/2023 10:56 PM
 */
class Ex2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean correctInput;
        do {
            try {
                System.out.print("Enter two integers seperated by space (e.g. 5 10): ");
                String[] tokens = console.nextLine().split("\\s+");
                int a = Integer.parseInt(tokens[0]);
                int b = Integer.parseInt(tokens[1]);
                correctInput = true;
                System.out.println(a + " + " + b + " = " + Math.addExact(a, b));
            } catch (NumberFormatException e) {
                System.out.println("Invalid " + e.getMessage() + ", try again");
                correctInput = false;
            }
        } while (!correctInput);
        console.close();
    }
}
