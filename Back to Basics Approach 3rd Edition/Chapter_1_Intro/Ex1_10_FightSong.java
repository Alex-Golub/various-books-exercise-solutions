package Chapter_1_Intro;

/**
 * Created by ag on 16-Oct-20 11:31 PM
 */
class Ex1_10_FightSong {
  public static void main(String[] args) {
    phrase1();
    repeat2();
    repeat2();
    linebreak();
    phrase1();
  }

  private static void repeat2() {
    repeat();
    phrase1();
  }

  private static void repeat() {
    linebreak();
    phrase1();
    phrase2();
  }

  public static void linebreak() {
    System.out.println();
  }

  public static void phrase1() {
    System.out.println("Go, team, go!");
    System.out.println("You can do it.");
  }

  public static void phrase2() {
    System.out.println("You're the best,");
    System.out.println("In the West.");
  }

}
