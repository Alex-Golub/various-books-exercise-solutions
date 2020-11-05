package chapter2_data_loops;

/**
 * 6. Write a program that produces the following rocket ship figure as its
 * output using nested for loops.
 * Use a class constant to make it possible to change the size of
 * the rocket (the following output uses a size of 3).
 *
 * Created by ag on 04-Nov-20 5:35 PM
 */

//      /**\
//     //**\\
//    ///**\\\
//   ////**\\\\
//  /////**\\\\\
// +=*=*=*=*=*=*+
// |../\..../\..|
// |./\/\../\/\.|
// |/\/\/\/\/\/\|
// |\/\/\/\/\/\/|
// |.\/\/..\/\/.|
// |..\/....\/..|
// +=*=*=*=*=*=*+
// |\/\/\/\/\/\/|
// |.\/\/..\/\/.|
// |..\/....\/..|
// |../\..../\..|
// |./\/\../\/\.|
// |/\/\/\/\/\/\|
// +=*=*=*=*=*=*+
//      /**\
//     //**\\
//    ///**\\\
//   ////**\\\\
//  /////**\\\\\

class PP2_6_RocketShip {
  static final int SIZE = 4;

  public static void main(String[] args) {
    pyramid();   // head
    separator();
    twoHalfDiamonds();
    twoHalfInvertedDiamonds();
    separator();
    twoHalfInvertedDiamonds();
    twoHalfDiamonds();
    separator();
    pyramid(); // thruster
  }

  public static void separator() {
    System.out.print("+");
    for (int i = 0; i < 2 * SIZE; i++)
      System.out.print("=*");
    System.out.println("+");
  }

  public static void twoHalfInvertedDiamonds() {
    for (int i = 0; i < SIZE; i++) {
      System.out.print("|");
      for (int j = 0; j < i; j++)
        System.out.print(".");
      for (int j = 0; j < SIZE - i; j++)
        System.out.print("\\/");
      for (int j = 0; j < 2 * i; j++)
        System.out.print(".");
      for (int j = 0; j < SIZE - i; j++)
        System.out.print("\\/");
      for (int j = 0; j < i; j++)
        System.out.print(".");
      System.out.println("|");
    }
  }

  public static void twoHalfDiamonds() {
    for (int i = 0; i < SIZE; i++) {
      System.out.print("|");
      for (int j = 0; j < -i + SIZE - 1; j++)
        System.out.print(".");
      for (int j = 0; j < i + 1; j++)
        System.out.print("/\\");
      for (int j = 0; j < -2 * i + 2 * SIZE - 2; j++)
        System.out.print(".");
      for (int j = 0; j < i + 1; j++)
        System.out.print("/\\");
      for (int j = 0; j < -i + SIZE - 1; j++)
        System.out.print(".");
      System.out.println("|");
    }
  }

  public static void pyramid() {
    for (int i = 0; i < 2 * SIZE - 1; i++) {
      for (int j = 0; j < 2 * SIZE - 1 - i; j++)
        System.out.print(" ");
      for (int j = 0; j < i + 1; j++)
        System.out.print("/");
      System.out.print("**");
      for (int j = 0; j < i + 1; j++)
        System.out.print("\\");
      System.out.println();
    }
  }
}
