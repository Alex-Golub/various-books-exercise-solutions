package CodeStepByStep_java.arrays;

/**
 * @author Mr.Dr.Professor
 * @since 14-Jan-21 10:04 PM
 */
class arrayMysteryExam6 {
  public static void arrayMysteryExam6(int[] list) {
    for (int i = 1; i < list.length - 1; i++) {
      list[i] = list[i - 1] + list[i + 1];
      if (list[i] % 2 == 0)
        list[i] /= 2;
    }
  }

  // {1, 3, 4, 6}          =>  {1, 5, 11, 6}
  // {8, 13, 0, 6, 11, 2}  =>  {8, 4, 5, 8, 5, 2}

}
