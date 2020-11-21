package chapter3_parameters_and_objects;

/**
 * 17. Write a method called padString that accepts two parameters:
 * a string and an integer representing a length. The method
 * should pad the parameter string with spaces until
 * its length is the given length.
 * NOTE: If the string's length is already at least as long as the
 * length parameter, your method should return the original string.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 7:04 PM
 */
class Ex3_17_padString {
  public static void main(String[] args) {
    System.out.println("|" + padString("hello", 8) + "|");            // => |   hello|
    System.out.println("|" + padString("congratulations", 10) + "|"); // => |congratulations|
  }

  public static String padString(String s, int len) {
    for (; s.length() < len; ) s = " " + s;
    return s;
  }
}
