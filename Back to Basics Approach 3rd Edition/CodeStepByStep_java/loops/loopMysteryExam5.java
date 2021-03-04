package CodeStepByStep_java.loops;

/**
 * loopMysteryExam5(12, 4);  (12 4) (8 5) 4
 * loopMysteryExam5(14, 2);	 (14 2) (12 3) (9 4) 2
 * loopMysteryExam5(27, 3);	 (27 3) (24 4) (20 5) (15 6) 3
 *
 * @author Mr.Dr.Professor
 * @since 03-Mar-21 11:01 PM
 */
/*public*/ class loopMysteryExam5 {
  public static void loopMysteryExam5(int x, int y) {
    int z = y;
    while (x % z == 0) {
      System.out.print("(" + x + " " + z + ") ");
      x = x - z;
      z++;
    }
    System.out.println("(" + x + " " + z + ") " + y);
  }
}
