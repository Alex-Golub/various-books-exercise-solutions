package CodeStepByStep_java.arrays;

/**
 * @author Mr.Dr.Professor
 * @since 14-Jan-21 9:39 PM
 */
class arrayMysteryExam2 {

  public static void arrayMysteryExam2(int[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      if (list[i] > list[i + 1]) {
        list[i] ^= list[i + 1];
        list[i + 1] ^= list[i];
        list[i] ^= list[i + 1];
        list[0]++;
      }
    }
  }

  // {5, 2, 5, 2}              =>  {4, 5, 2, 5}
  // {30, 10, 20, 50, 40}      =>  {13, 20, 30, 40, 50}
  // {99, 88, 77, 66, 55, 44}  =>  {93, 77, 66, 55, 44, 99}

}
