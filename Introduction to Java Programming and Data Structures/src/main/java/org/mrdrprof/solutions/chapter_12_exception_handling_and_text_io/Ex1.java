package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

/**
 * *12.1 (NumberFormatException)
 * Run using the terminal e.g.
 * <pre>javac Ex1.java</pre>
 * <pre>java Ex1 4 * 8</pre>
 *
 * @author Alex Golub
 * @since 08/06/2023 10:10 PM
 */
class Ex1 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            char operation = args[1].charAt(0);
            int b = Integer.parseInt(args[2]);
            int result = performCalculation(a, operation, b);
            System.out.printf("%d %s %d = %d%n", a, operation, b, result);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int performCalculation(int a, char op, int b) {
        return switch (op) {
            case '+' -> Math.addExact(a, b);
            case '-' -> Math.subtractExact(a, b);
            case '*' -> Math.multiplyExact(a, b);
            case '/' -> Math.floorDiv(a, b);
            default -> throw new RuntimeException(op + " operation is not supported");
        };
    }
}
