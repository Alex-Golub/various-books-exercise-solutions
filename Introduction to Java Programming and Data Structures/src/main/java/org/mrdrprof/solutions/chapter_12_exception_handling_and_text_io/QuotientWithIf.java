package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import java.util.Scanner;

class QuotientWithIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number2 != 0)
            System.out.printf("%d / %d is %d%n", number1, number2, number1 / number2);
        else
            System.out.println("Divisor cannot be zero ");
    }
}
