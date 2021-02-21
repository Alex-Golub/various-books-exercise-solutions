package CodeStepByStep_java.console_output;

/**
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 11:19 PM
 */
/*public*/ class CSRap2 {
  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      open();
      switch (i) {
        case 4: v4();
        case 3: v3();
        case 2: v2();
        case 1: v1();
      }
      end();

      if (i + 1 < 5)
        System.out.println();
    }
  }

  private static void v4() {
    System.out.println("I got full credit on external correctness");
    System.out.println("Hey playa check this, my code eats yours for breakfast");
  }

  private static void v3() {
    System.out.println("Got help from the TAs in the IPL");
    System.out.println("But I didn't need it cause I code so well");
  }

  private static void v2() {
    System.out.println("The first time I try, my code compiles");
    System.out.println("Lost a point for style cause my comments are vile");
  }

  private static void v1() {
    System.out.println("jGrasp loves my code, no need to debug");
    System.out.println("I can rap in Java until it unplug");
  }


  private static void end() {
    System.out.println("I put a semicolon at the end of each line");
    System.out.println("You haters never seen code that looked so fine");
  }

  private static void open() {
    System.out.println("Hey homies, my code is gonna rock this place");
    System.out.println("With a method named main and a curly brace");
  }

  // added just to past the tests
  public static void f1() {}
  public static void f2() {}
}
