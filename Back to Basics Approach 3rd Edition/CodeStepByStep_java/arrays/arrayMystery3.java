package CodeStepByStep_java.arrays;

/**
 * @author Mr.Dr.Professor
 * @since 14-Jan-21 9:35 PM
 */
class arrayMystery3 {
  public static void arrayMystery3(int[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      if (list[i] > list[i + 1])
        list[i + 1]++;
    }
  }

  // {42}                    =>  {42}
  // {14, 7}                 =>  {14, 8}
  // {7, 1, 3, 2, 0, 4}      =>  {7, 2, 3, 3, 1, 4}
  // {10, 8, 9, 5, 5         =>  {10, 9, 9, 6, 6}
  // {12, 11, 10, 10, 8, 7}  =>  {12, 12, 11, 11, 9, 8}

}
