package chapter_12_exception_handling_and_text_io;

import utils.exceptions.BinaryFormatException;

import java.util.Scanner;

/**
 * *12.7 (NumberFormatException) Write the bin2Dec(String binaryString)
 * method to convert a binary string into a decimal number. Implement the bin-
 * 2Dec method to throw a NumberFormatException if the string is not a
 * binary string. Write a test program that prompts the user to enter a binary
 * number as a string and displays its decimal equivalent. If the method throws
 * an exception, display “Not a binary number”.
 *
 * @author Alex Golub
 * @since 09/06/2023 12:31 PM
 */
class Ex7 {

    private static final Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter binary string (e.g. 0110): ");
            String input = CONSOLE.nextLine();
            try {
                int result = bin2Dec(input);
                System.out.printf("%s(2) = %d(10)%n%n", input, result);
            } catch (Exception e) {
                System.out.println(e.getMessage() + ", try again\n");
            }
        }
    }

    public static int bin2Dec(String binaryString) {
        validateBinaryString(binaryString);
        int result = 0;
        int exponent = binaryString.length() - 1;
        for (int i = exponent; i >= 0; i--) {
            char digit = binaryString.charAt(exponent - i);
            if (digit == '1') {
                result += 1 << i; // bitwise instead of (int) Math.pow(2, i)
            }
        }

        return result;
    }

    private static void validateBinaryString(String binaryString) {
        if (!binaryString.matches("[0-1]+")) {
            throw new BinaryFormatException("Error: (" + binaryString + ") is not a valid binary number");
        }
    }
}
