package CodeStepByStep_java.loops;

/**
 * loopMysteryExam3(7, 5);   output	2 4 -2 3 3
 * loopMysteryExam3(7, 5);   return	12
 * loopMysteryExam3(20, 4);  output 16 3 13 2 11 1 10 0 0
 * loopMysteryExam3(20, 4);  return 24
 * loopMysteryExam3(40, 10); output 30 9 21 8 13 7 6 6 0 5 5
 * loopMysteryExam3(40, 10); return 50
 *
 * @author Mr.Dr.Professor
 * @since 03-Mar-21 10:56 PM
 */
/*public*/ class loopMysteryExam3 {
  public static int loopMysteryExam3(int x, int y) {
    int z = x + y;
    while (x > 0 && y > 0) {
      x = x - y;
      y--;
      System.out.print(x + " " + y + " ");
    }

    System.out.println(y);

    return z;
  }
}
