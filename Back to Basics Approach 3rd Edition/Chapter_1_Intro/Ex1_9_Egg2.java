package Chapter_1_Intro;

/**
 * Created by ag on 16-Oct-20 11:18 PM
 */
class Ex1_9_Egg2 {
  public static void main(String[] args) {
    upper();
    lower();
    middle();

    upper();
    lower();
    middle();
    lower();

    upper();
    middle();
    lower();
  }

  public static void upper() {
    System.out.println("  _______ ");
    System.out.println(" /       \\");
    System.out.println("/         \\");
  }

  public static void middle() {
    System.out.println("-\"-'-\"-'-\"-");
  }

  public static void lower() {
    System.out.println("\\         /");
    System.out.println(" \\_______/");
  }
}
