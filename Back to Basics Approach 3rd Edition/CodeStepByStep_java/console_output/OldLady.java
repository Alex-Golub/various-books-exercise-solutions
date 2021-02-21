package CodeStepByStep_java.console_output;

/**
 * Write a complete Java program in a class named OldLady that prints the
 * following cumulative song as console output.
 * USE METHODS to capture the structure of the song and to eliminate redundancy.
 * For example, no complete line of output should be println'd in two or
 * more places in your code.
 *
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 9:45 PM
 */
public class OldLady {
  public static void main(String[] args) {
    System.out.println("There was an old lady who swallowed a fly.");
    dontKnow("fly");
    die();

    swallowed("spider");
    System.out.println("That wriggled and iggled and jiggled inside her.");
    toCatch("spider", "fly");
    dontKnow("fly");
    die();

    swallowed("bird");
    System.out.println("How absurd to swallow a bird.");
    toCatch("bird", "spider");
    toCatch("spider", "fly");
    dontKnow("fly");
    die();

    swallowed("cat");
    System.out.println("Imagine that to swallow a cat.");
    toCatch("cat", "bird");
    toCatch("bird", "spider");
    toCatch("spider", "fly");
    dontKnow("fly");
    die();

    swallowed("dog");
    System.out.println("What a hog to swallow a dog.");
    toCatch("dog", "cat");
    toCatch("cat", "bird");
    toCatch("bird", "spider");
    toCatch("spider", "fly");
    dontKnow("fly");
    die();

    swallowed("horse");
    System.out.println("She died of course.");
  }

  public static void toCatch(String a, String b) {
    System.out.printf("She swallowed the %s to catch the %s,\n", a, b);
  }

  public static void die() {
    System.out.println("Perhaps she'll die.\n");
  }

  public static void swallowed(String s) {
    System.out.println("There was an old lady who swallowed a " + s + ",");
  }

  public static void dontKnow(String s) {
    System.out.println("I don't know why she swallowed that " + s + ",");
  }

  public static void f1() {}
  public static void f2() {}
  public static void f3() {}
  public static void f4() {}
}
