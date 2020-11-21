package chapter3_parameters_and_objects;

/**
 * 19. Write a method called printReverse that accepts a
 * string as its parameter and prints the characters in opposite
 * order.
 * NOTE: If the empty string is passed, the method should produce no output.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 8:11 PM
 */
class Ex3_19_printReverse {
  public static void main(String[] args) {
    printReverse("hello there!"); // => "!ereht olleh"
    printReverse("evian");        // => "naive"
    printReverse("");             // => ""
  }

  public static void printReverse(String s) {
    for (int i = s.length() - 1; i >= 0; i--)
      System.out.print(s.charAt(i));
  }
}
