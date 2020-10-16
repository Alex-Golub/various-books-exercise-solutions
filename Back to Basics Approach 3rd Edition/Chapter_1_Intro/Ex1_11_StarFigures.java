package Chapter_1_Intro;

/**
 * Created by ag on 16-Oct-20 11:49 PM
 */
class Ex1_11_StarFigures {
  public static void main(String[] args) {
    twoLines();
    x();
    System.out.println();
    twoLines();
    x();
    twoLines();
    System.out.println();
    verticalLine();
    twoLines();
    x();
  }

  public static void twoLines() {
    System.out.println("*****");
    System.out.println("*****");
  }

  public static void x() {
    System.out.println(" * *");
    System.out.println("  *");
    System.out.println(" * *");
  }

  public static void verticalLine() {
    System.out.println("  *");
    System.out.println("  *");
    System.out.println("  *");
  }
}
