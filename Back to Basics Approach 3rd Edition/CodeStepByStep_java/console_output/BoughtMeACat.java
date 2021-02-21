package CodeStepByStep_java.console_output;

/**
 * Write a complete Java program in a class named BoughtMeACat
 * that prints the following cumulative song as console output.
 * Use methods to capture the structure of the song and to eliminate redundancy.
 * For example, no complete line of output should be println'd in two
 * or more places in your code.
 *
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 10:44 PM
 */
/*public*/ class BoughtMeACat {
  public static int count = 0;

  public static void main(String[] args) {
    System.out.println("Bought me a cat and the cat pleased me,\nI fed my cat under yonder tree.");
    list();
    System.out.println("Bought me a hen and the hen pleased me,\nI fed my hen under yonder tree.");
    list();
    System.out.println("Bought me a duck and the duck pleased me,\nI fed my duck under yonder tree.");
    list();
    System.out.println("Bought me a goose and the goose pleased me,\nI fed my goose under yonder tree.");
    list();
    System.out.println("Bought me a sheep and the sheep pleased me,\nI fed my sheep under yonder tree.");
    list();
    System.out.println("Bought me a pig and the pig pleased me,\nI fed my pig under yonder tree.");
    list();
  }

  public static void list() {
    if (count > 4)
      pig();
    if (count > 3)
      sheep();
    if (count > 2)
      goose();
    if (count > 1)
      duck();
    if (count > 0)
      hen();
    if (count >= 0)
      cat();
    count++;
    line();
  }

  private static void pig() {
    System.out.println("Pig goes oink, oink,");
  }

  public static void line() {
    System.out.println("");
  }

  public static void sheep() {
    System.out.println("Sheep goes baa, baa,");
  }

  public static void goose() {
    System.out.println("Goose goes hissy, hissy,");
  }

  public static void duck() {
    System.out.println("Duck goes quack, quack,");
  }

  public static void hen() {
    System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
  }

  public static void cat() {
    System.out.println("Cat goes fiddle-i-fee.");
  }
}
