package utils.exceptions;

/**
 * *12.8 (HexFormatException)
 * 
 * @author Alex Golub
 * @since 09/06/2023 1:09 PM
 */
public class HexFormatException extends RuntimeException {
    public HexFormatException() {
    }

    public HexFormatException(String message) {
        super(message);
    }
}
