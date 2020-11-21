package chapter3_parameters_and_objects;

/**
 * 18. Write a method called vertical that accepts a string as its
 * parameter and prints each letter of the string on separate
 * lines.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 8:07 PM
 */
class Ex3_18_vertical {
  public static void main(String[] args) {
    vertical("hey now");
    System.out.println("--------");
    vertical("BOOYAH");
    System.out.println("--------");
    vertical("");
    System.out.println("--------");
  }

  public static void vertical(String s) {
    for (int i = 0; i < s.length(); i++)
      System.out.println(s.charAt(i));
  }
}
