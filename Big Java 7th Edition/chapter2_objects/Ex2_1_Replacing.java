package chapter2_objects;

/**
 * •• E2.1 Write a program that initializes a string with "Mississippi".
 * Then replace all "i" with "ii" and print the length of the resulting string.
 * In that string, replace all "ss" with "s" and print the length of the
 * resulting string.
 *
 * Created by ag on 08-Nov-20 12:49 PM
 */
class Ex2_1_Replacing {
  public static void main(String[] args) {
    String river = "Mississippi";
    System.out.println("river => " + river + ", length => " + river.length());

    river = river.replace("i", "ii");
    System.out.println("river => " + river + ", length => " + river.length());

    river = river.replace("ss", "s");
    System.out.println("river => " + river + ", length => " + river.length());
  }
}
