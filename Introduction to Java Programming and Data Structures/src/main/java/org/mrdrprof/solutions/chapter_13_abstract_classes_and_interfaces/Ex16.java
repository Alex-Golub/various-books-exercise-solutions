package org.mrdrprof.solutions.chapter_13_abstract_classes_and_interfaces;

import org.mrdrprof.solutions.utils.chapter_13.Rational;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 13.16 (Create a rational-number calculator) Write a program similar to Listing 7.9,
 * Calculator.java. Instead of using integers, use rationals, as shown in Figure 13.10.
 * You will need to use the split method in the String class, introduced in
 * Section 10.10.3, Replacing and Splitting Strings, to retrieve the numerator string
 * and denominator string, and convert strings into integers using the Integer
 * .parseInt method.
 *
 * @author Alex Golub
 * @since July 01, 2023 12:59 PM
 */
/*public*/ class Ex16 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter two rational numbers e.g. \"3/4 + 1/5\": ");
            Scanner scanner = new Scanner(System.in);
            calculate(scanner.nextLine());
            System.out.println();
        }
    }

    public static void calculate(String exp) {
        Pattern pattern = Pattern.compile(" ([+\\-*/]) ");

        Matcher matcher = pattern.matcher(exp);
        String operation = "";
        if (matcher.find()) {
            operation = matcher.group(1);
        }

        String[] tokens = pattern.split(exp);
        String[] firstNumberTokens = tokens[0].split("/");
        String[] secondNumberTokens = tokens[1].split("/");
        Rational r1 = new Rational(BigInteger.valueOf(Long.parseLong(firstNumberTokens[0])),
                                   BigInteger.valueOf(Long.parseLong(firstNumberTokens[1])));
        Rational r2 = new Rational(BigInteger.valueOf(Long.parseLong(secondNumberTokens[0])),
                                   BigInteger.valueOf(Long.parseLong(secondNumberTokens[1])));

        Rational result = switch (operation) {
            case "+" -> r1.add(r2);
            case "-" -> r1.subtract(r2);
            case "*" -> r1.multiply(r2);
            case "/" -> r1.divide(r2);
            default ->
                    throw new IllegalArgumentException("Error: the operation \"" + operation + "\" is not supported");
        };

        System.out.printf("%s %s %s = %s%n", r1, operation, r2, result);
    }
}
