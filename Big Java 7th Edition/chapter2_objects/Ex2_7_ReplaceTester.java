package chapter2_objects;

/**
 * •• Testing E2.7
 * Write a program ReplaceTester that encodes a string by replacing all
 * letters "i" with "!" and all letters "s" with "$".
 * Demonstrate that you can correctly encode the string "Mississippi".
 * Print both the actual and expected result.
 * <p>
 * Created by ag on 08-Nov-20 1:34 PM
 */
class Ex2_7_ReplaceTester {
  public static void main(String[] args) {
    String src = "Mississippi";
    String encoded = src
            .replace("i", "!")
            .replace("s", "$");
    System.out.println("Actual: " + src);
    System.out.println("Expected: M!$$!$$!pp! => " + encoded);
    System.out.println("Test pass? => " + "M!$$!$$!pp!".equals(encoded));
  }
}
