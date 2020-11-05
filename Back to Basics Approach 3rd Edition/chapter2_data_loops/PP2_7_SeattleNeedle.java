package chapter2_data_loops;

/**
 * 7. Write a program that produces the following figure
 * (which vaguely resembles the Seattle Space Needle) as its output
 * using nested for loops. Use a class constant to make it possible
 * to change the size of the figure (the following output
 * uses a size of 4).
 *
 * Created by ag on 05-Nov-20 6:02 PM
 */
//             ||
//             ||
//             ||
//             ||
//          __/||\__
//       __/:::||:::\__
//    __/::::::||::::::\__
// __/:::::::::||:::::::::\__
// |""""""""""""""""""""""""|
// \_/\/\/\/\/\/\/\/\/\/\/\_/
//   \_/\/\/\/\/\/\/\/\/\_/
//     \_/\/\/\/\/\/\/\_/
//       \_/\/\/\/\/\_/
//             ||
//             ||
//             ||
//             ||
//          |%%||%%|
//          |%%||%%|
//          |%%||%%|
//          |%%||%%|
//          |%%||%%|
//          |%%||%%|
//          |%%||%%|
//          |%%||%%|
//          |%%||%%|
//          |%%||%%|
//          |%%||%%|
//          |%%||%%|
//          |%%||%%|
//          |%%||%%|
//          |%%||%%|
//          |%%||%%|
//          __/||\__
//       __/:::||:::\__
//    __/::::::||::::::\__
// __/:::::::::||:::::::::\__
// |""""""""""""""""""""""""|

class PP2_7_SeattleNeedle {
  static final int SIZE = 4;

  public static void main(String[] args) {
    post();
    upperBase();
    separator();
    lowerBase();
    post();
    floors();
    upperBase();
    separator();
  }

  public static void post() {
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < 3 * SIZE; j++)
        System.out.print(" ");
      System.out.println("||");
    }
  }

  public static void floors() {
    for (int i = 0; i < 4 * SIZE; i++) {
      for (int j = 0; j < 3 * SIZE - 3; j++)
        System.out.print(" ");
      System.out.println("|%%||%%|");
    }
  }

  public static void separator() {
    System.out.print("|");
    for (int i = 0; i < 6 * SIZE; i++)
      System.out.print("\"");
    System.out.println("|");
  }

  public static void lowerBase() { // FIXME: not working for different SIZE values
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < 2 * i; j++)
        System.out.print(" ");
      System.out.print("\\_/");
      for (int j = 0; j < -2 * i + 10; j++)
        System.out.print("\\/");
      System.out.println("\\_/");
    }
  }

  public static void upperBase() {
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < -3 * i + 3 * SIZE - 3; j++)
        System.out.print(" ");
      System.out.print("__/");
      for (int j = 0; j < 3 * i; j++)
        System.out.print(":");
      System.out.print("||");
      for (int j = 0; j < 3 * i; j++)
        System.out.print(":");
      System.out.println("\\__");
    }
  }

}
