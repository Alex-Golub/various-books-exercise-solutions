package Chapter_1_Intro;

/**
 * Created by ag on 17-Oct-20 12:23 AM
 */
class Ex1_15_EggStop {
  public static void main(String[] args) {
    upper();
    lower();
    System.out.println();
    upper();
    lower();
    table();
    System.out.println();
    upper();
    stop();
    lower();
    table();
  }

  public static void upper() {
    System.out.println("  ______ ");
    System.out.println(" /      \\");
    System.out.println("/        \\");
  }

  public static void lower() {
    System.out.println("\\        /");
    System.out.println(" \\______/");
  }

  public static void table() {
    System.out.println("+--------+");
  }

  public static void stop() {
    System.out.println("|  STOP  |");
  }
}
