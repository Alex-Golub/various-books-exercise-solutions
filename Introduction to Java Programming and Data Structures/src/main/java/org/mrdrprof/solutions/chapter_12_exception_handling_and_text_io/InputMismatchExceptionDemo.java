package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import java.util.InputMismatchException;
import java.util.Scanner;

class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer: ");
                int number = input.nextInt();

                // Display the result
                System.out.printf("The number entered is %d%n", number);

                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.printf("Try again. (Incorrect input: an integer is required)%n");
                input.nextLine(); // discard input 
            }
        } while (continueInput);
    }
}
