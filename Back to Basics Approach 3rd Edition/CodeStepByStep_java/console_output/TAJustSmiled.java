package CodeStepByStep_java.console_output;

/**
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 11:01 PM
 */
/*public*/ class TAJustSmiled {
  public static int count = 0;

  public static void main(String[] args) {
    System.out.println("I once wrote a program that wouldn't compile");
    list();
    System.out.println("My program did nothing\nSo I started typing.");
    list();
    System.out.println("\"Parse error,\" cried the compiler\nLuckily I'm such a code baller.");
    list();
    System.out.println("Now the compiler wanted an identifier\nAnd I thought the situation was getting dire.");
    list();
    System.out.println("Java complained it expected an enum\nBoy, these computers really are dumb!");
    list();

  }

  public static void idk() {
    System.out.println("I don't know why it wouldn't compile,\nMy TA just smiled.");
  }

  public static void sysout() {
    System.out.println("I added System.out.println(\"I <3 coding\"),");
  }

  public static void slash() {
    System.out.println("I added a backslash to escape the quotes,");
  }

  public static void method() {
    System.out.println("I added a main method with its String[] args,");
  }

  public static void pclass() {
    System.out.println("I added a class and called it Scum,");
  }

  public static void line() {
    System.out.println("");
  }

  public static void list() {
    if (count > 3)
      pclass();
    if (count > 2)
      method();
    if (count > 1)
      slash();
    if (count > 0)
      sysout();
    if (count >= 0)
      idk();
    line();
    count++;
  }
}









