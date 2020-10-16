package Chapter_1_Intro;

/**
 * 16. Write a program called Shining that prints the following line of output 1000 times:
 * All work and no play makes Jack a dull boy.
 * You should not write a program that uses 1000 lines of source code;
 * use methods to shorten the program. What is the
 * shortest program you can write that will produce the 1000 lines of output,
 * using only the material from this chapter?
 *
 * Created by ag on 17-Oct-20 1:06 AM
 */
class Ex1_16_Shining {
  public static void main(String[] args) {
    _500();
    _500();
  }

  private static void _500() {
    _100();
    _100();
    _100();
    _100();
    _100();
  }

  private static void _100() {
    _50();
    _50();
  }

  private static void _50() {
    _10();
    _10();
    _10();
    _10();
    _10();
  }

  private static void _10() {
    _5();
    _5();
  }

  public static void _5() {
    System.out.println("All work and no play makes Jack a dull boy.");
    System.out.println("All work and no play makes Jack a dull boy.");
    System.out.println("All work and no play makes Jack a dull boy.");
    System.out.println("All work and no play makes Jack a dull boy.");
    System.out.println("All work and no play makes Jack a dull boy.");
  }
}