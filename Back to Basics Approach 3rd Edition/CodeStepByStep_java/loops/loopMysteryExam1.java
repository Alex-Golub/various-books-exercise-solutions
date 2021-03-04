package CodeStepByStep_java.loops;

/**
 * loopMysteryExam1(5, 0)     output 5
 * loopMysteryExam1(5, 0)     return 5
 * loopMysteryExam1(3, 2)     output 1 0 1
 * loopMysteryExam1(3, 2)     return 1
 * loopMysteryExam1(16, 5)    output 3 2 1 0 1
 * loopMysteryExam1(16, 5)    return 1
 * loopMysteryExam1(80, 9)    output 8 4 2 1 2 0 2
 * loopMysteryExam1(80, 9)    return 2
 * loopMysteryExam1(1600, 40) output 40 19 2 9 0 4 0
 * loopMysteryExam1(1600, 40) return 4
 *
 * @author Mr.Dr.Professor
 * @since 03-Mar-21 10:48 PM
 */
/*public*/ class loopMysteryExam1 {
  public static int loopMysteryExam1(int i, int j) {
    while (i != 0 && j != 0) {
      i = i / j;
      j = (j - 1) / 2;
      System.out.print(i + " " + j + " ");
    }

    System.out.println(i);

    return i + j;
  }
}
