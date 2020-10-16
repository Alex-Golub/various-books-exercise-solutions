package Chapter_1_Intro;

/**
 * Created by ag on 16-Oct-20 11:53 PM
 */
class Ex1_12_Lanterns {
  public static void main(String[] args) {
    threeLines();
    System.out.println();
    threeLines();
    middle();
    longLine();
    threeLines();
    System.out.println();
    threeLines();
    shortLine();
    middle();
    middle();
    shortLine();
    shortLine();
  }

  public static void threeLines() {
    System.out.println("    *****");
    System.out.println("  *********");
    System.out.println("*************");
  }

  public static void longLine() {
    System.out.println("*************");
  }

  public static void shortLine() {
    System.out.println("    *****");
  }

  public static void middle() {
    System.out.println("* | | | | | *");
  }
}
