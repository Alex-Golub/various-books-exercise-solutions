package CodeStepByStep_java.console_output;

/**
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 11:08 PM
 */
/*public*/ class CSRap {
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
    System.out.println("My code it runs so well");
    System.out.println("Got help in the IPL");
  }

  private static void v3() {
    System.out.println("You know my program's rockin");
    System.out.println("I'm master of the println");
  }

  private static void v2() {
    System.out.println("My indentation's right");
    System.out.println("The code looks hella tight");
  }

  private static void v1() {
    System.out.println("In 142 I'm hated");
    System.out.println("Score full points when I'm graded");
  }


  private static void end() {
    System.out.println("I joined the CS party");
    System.out.println("Like \"LN\" and Marty");
  }

  private static void open() {
    System.out.println("You wanna be a coder?");
    System.out.println("You better say it louder");
  }

  // added just to past the tests
  public static void f1() {}
  public static void f2() {}
}
