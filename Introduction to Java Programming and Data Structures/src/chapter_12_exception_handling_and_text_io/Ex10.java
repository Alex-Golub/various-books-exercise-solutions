package chapter_12_exception_handling_and_text_io;

/**
 * *12.10 (OutOfMemoryError) Write a program that causes the JVM to throw an
 * OutOfMemoryError and catches and handles this error.
 *
 * @author Alex Golub
 * @since 09/06/2023 1:11 PM
 */
class Ex10 {
    public static void main(String[] args) {
        try {
            int[] ints = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
        }
    }
}
