package utils.exceptions;

/**
 * *12.9 (BinaryFormatException) Exercise 12.7 implements the bin2Dec method
 * to throw a BinaryFormatException if the string is not a binary string. Define
 * a custom exception called BinaryFormatException. Implement the bin2Dec
 * method to throw a BinaryFormatException if the string is not a binary string.
 * 
 * @author Alex Golub
 * @since 09/06/2023 1:10 PM
 */
public class BinaryFormatException extends RuntimeException {
    public BinaryFormatException() {
    }

    public BinaryFormatException(String message) {
        super(message);
    }
}
