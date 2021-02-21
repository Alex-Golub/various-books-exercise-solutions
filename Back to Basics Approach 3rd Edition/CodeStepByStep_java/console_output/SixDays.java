package CodeStepByStep_java.console_output;

/**
 * Write a complete Java program in a class named SixDays that prints
 * the following cumulative song as console output.
 * Use methods to capture the structure of the song and to eliminate redundancy.
 * For example, no complete line of output should be println'd in two or more places in your code.
 *
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 10:03 PM
 */
/*public*/ class SixDays {
  public static void main(String[] args) {
    firstDay();
    secondDay();
    thirdDay();
    forthDay();
    fifthDay();
    sixthDay();
  }

  private static void sixthDay() {
    onNDay("6th");
    System.out.println("six geese a-laying,");
    System.out.println("five golden rings,");
    System.out.println("four calling birds,");
    System.out.println("three French hens,");
    System.out.println("two turtle doves, and");
    System.out.println("a partridge in a pear tree.");
  }

  private static void fifthDay() {
    onNDay("5th");
    System.out.println("five golden rings,");
    System.out.println("four calling birds,");
    System.out.println("three French hens,");
    System.out.println("two turtle doves, and");
    System.out.println("a partridge in a pear tree.\n");
  }

  private static void forthDay() {
    onNDay("4th");
    System.out.println("four calling birds,");
    System.out.println("three French hens,");
    System.out.println("two turtle doves, and");
    System.out.println("a partridge in a pear tree.\n");
  }


  private static void thirdDay() {
    onNDay("3rd");
    System.out.println("three French hens,");
    System.out.println("two turtle doves, and");
    System.out.println("a partridge in a pear tree.\n");
  }

  private static void secondDay() {
    onNDay("2nd");
    System.out.println("two turtle doves, and");
    System.out.println("a partridge in a pear tree.\n");
  }

  private static void firstDay() {
    onNDay("1st");
    System.out.println("a partridge in a pear tree.\n");
  }

  public static void onNDay(String n) {
    System.out.printf("On the %s day of \"Xmas\", my true love gave to me\n", n);
  }
}
