package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import java.util.Scanner;

class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.printf("%d / %d is %d%n", number1, number2, number1 / number2);
    }
}
