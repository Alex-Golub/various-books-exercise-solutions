package org.mrdrprof.solutions.utils.exceptions;

/**
 * @author Alex Golub
 * @since 02/06/2023 1:21 PM
 */
public class InsufficientFunds extends RuntimeException {
    public InsufficientFunds() {
        super();
    }

    public InsufficientFunds(String message) {
        super(message);
    }
}
