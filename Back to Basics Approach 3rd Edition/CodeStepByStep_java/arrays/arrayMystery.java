package CodeStepByStep_java.arrays;

/**
 * @author Mr.Dr.Professor
 * @since 14-Jan-21 9:04 PM
 */
class arrayMystery {
  public static void mystery(int[] list) {
    for (int i = 1; i < list.length; i++)
      list[i] = list[i] + list[i - 1];
  }

  //  {8}              =>  {8}
  //  {6, 3}           =>  {6, 9}
  //  {2, 4, 6}        =>  {2, 6, 12}
  //  {1, 2, 3, 4}     =>  {1, 3, 6, 10}
  //  {7, 3, 2, 0, 5}  =>  {7, 10, 12, 12, 17}
}
