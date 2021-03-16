package CodeStepByStep_java.arrays;

/**
 * @author Mr.Dr.Professor
 * @since 14-Jan-21 9:47 PM
 */
class arrayMysteryExam4 {
  public static void arrayMysteryExam4(int[] list) {
    for (int i = 1; i < list.length; i++) {
      list[i] = list[list.length - i - 1] - list[i - 1];
    }
  }

  // {6, 2, 4}                =>  {6, -4, 10}
  // {4, 2, 3, 1, 2, 5}       =>  {4, -2, 3, 0, -2, 6}
  // {6, 0, -1, 3, -2, 0, 4}  =>  {6, -6, 4, -1, 5, -11, 17}

}
