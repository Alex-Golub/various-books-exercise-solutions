package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import org.mrdrprof.solutions.utils.exceptions.HexFormatException;

import java.util.Scanner;

/**
 * *12.6 (NumberFormatException) + *12.8 (HexFormatException)
 * Valid hex number contains one or more of the following characters: [0-9A-Fa-f]+
 *
 * @author Alex Golub
 * @since 09-Jun-23 12:14 PM
 */
class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a hex number: ");
            String hex = sc.next();
            System.out.printf("(%s)16 = (%d)10%n%n", hex, hex2Dec(hex));
        }
    }

    private static int hex2Dec(String hex) {
        validateHex(hex);
        int decimalValue = 0;
        hex = hex.toUpperCase();

        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    private static void validateHex(String hex) {
        if (!hex.matches("(?i)[\\d+A-F]+")) {
            throw new HexFormatException("Error: invalid hex " + hex);
        }
    }

    private static int hexCharToDecimal(char hexChar) {
        return 'A' <= hexChar && hexChar <= 'F' ?
                10 + hexChar - 'A' :
                hexChar - '0';
    }
}
