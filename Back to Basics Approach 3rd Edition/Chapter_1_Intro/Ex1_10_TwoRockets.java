package Chapter_1_Intro;

/**
 * Created by ag on 16-Oct-20 11:24 PM
 */
class Ex1_10_TwoRockets {
  public static void main(String[] args) {
    pairCone();
    pairSquare();
    pairContent();
    pairSquare();
    pairCone();
  }

  public static void pairCone() {
    System.out.println("   /\\       /\\");
    System.out.println("  /  \\     /  \\");
    System.out.println(" /    \\   /    \\");
  }

  public static void pairSquare() {
    System.out.println("+------+ +------+");
    System.out.println("|      | |      |");
    System.out.println("|      | |      |");
    System.out.println("+------+ +------+");
  }

  public static void pairContent() {
    System.out.println("|United| |United|");
    System.out.println("|States| |States|");
  }
}