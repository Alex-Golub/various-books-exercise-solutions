package CodeStepByStep_java.loops;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/Book2
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 4:19 PM
 */
/*public*/ class Book2 {
  static final int SIZE = 10;

  public static void main(String[] args) {
    printEdge(SIZE + 1, 3 * SIZE, 0);
    topCover();
    printEdge(0, 3 * SIZE, SIZE);
    printFront();
    printEdge(0, 3 * SIZE, 0);
    System.out.println("Now only $" + (10 * SIZE / 2) + "!");
  }

  private static void printFront() {
    for (int i = 0; i < SIZE / 2; i++) {
      System.out.print("|");
      repeat(" ", (int) (1.5 * SIZE) - 10);
      System.out.print("How to Code in Java ");
      repeat(" ", (int) (1.5 * SIZE) - 10);
      System.out.print("|");
      repeat("/", SIZE - 2 * i);
      System.out.println();
    }
  }

  private static void topCover() {
    for (int i = 0; i < SIZE; i++) {
      repeat(" ", SIZE - i);
      System.out.print("/");
      repeat(" ", 3 * SIZE - 3 * (i + 1));
      System.out.print("___/");
      repeat("__/", i);
      repeat("/", i);
      System.out.println();
    }
  }

  private static void printEdge(int spaces, int hyphens, int forewordsSlashes) {
    repeat(" ", spaces);
    System.out.print("+");
    repeat("-", hyphens);
    System.out.print("+");
    repeat("/", forewordsSlashes);
    System.out.println();
  }

  public static void repeat(String s, int t) {
    for (int i = 0; i < t; i++) {
      System.out.print(s);
    }
  }
}
