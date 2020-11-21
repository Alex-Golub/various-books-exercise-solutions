package chapter3_parameters_and_objects;

/**
 * BJP5 3.23: Write a method called printIndexed that accepts a String as
 * its parameter and prints the String's characters in order followed
 * by their indexes in reverse order.
 * printIndexed("ZELDA") -> "Z4E3L2D1A0"
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 8:33 PM
 */
class Ex3_24_printIndexed {
  public static void main(String[] args) {
    printIndexed("ZELDA");
  }

  public static void printIndexed(String s) {
    int len = s.length();
    for (int i = 0; i < len; i++)
      System.out.print("" + s.charAt(i) + (len - i - 1));
  }
}
