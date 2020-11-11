package chapter2_objects;

/**
 * ••• E2.8
 * Write a program HollePrinter that switches the letters "e" and "o" in a string.
 * Demonstrate that the string "Hello, World!" turns into "Holle, Werld!"
 * <p>
 * Created by ag on 08-Nov-20 1:39 PM
 */
class Ex2_8_HollePrinter {
  public static void main(String[] args) {
    String src = "Hello, World!";
    String switched = src
            .replace("e", "_")
            .replace("o", "e")
            .replace("_", "o");

    System.out.println("Actual: " + src);
    System.out.println("Expected: Holle, Werld! => " + switched);
    System.out.println("Test pass? => " + src.equals(switched));

  }
}
