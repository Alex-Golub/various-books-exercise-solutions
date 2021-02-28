package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/boxOfStars
 *
 * Write a method named boxOfStars that accepts two integer parameters
 * representing a width and height in characters, and prints to the console
 * a 'box' figure whose border is * stars and whose center is made of spaces.
 * For example, the call of boxOfStars(8, 5); should print the following output:
 *
 * ********
 * *      *
 * *      *
 * *      *
 * ********
 *
 * You may assume that the values passed for the width and height are at least 2.
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 3:15 PM
 */
/*public*/ class boxOfStars {
  public static void main(String[] args) {
    boxOfStars(8, 5);
    System.out.println();
    boxOfStars(6, 3);
    System.out.println();
    boxOfStars(11, 14);
    System.out.println();
    boxOfStars(2, 2);
  }

  public static void boxOfStars(int w, int h) {
    // first line
    for (int j = 0; j < w; j++)
      System.out.print("*");
    System.out.println();

    // middle lines
    for (int i = 0; i < h - 2; i++) {
      System.out.print("*");

      for (int j = 0; j < w - 2; j++)
        System.out.print(" ");

      System.out.println("*");
    }

    // last line
    for (int j = 0; j < w; j++)
      System.out.print("*");
    System.out.println();
  }
}
