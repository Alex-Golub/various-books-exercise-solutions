package chapter9_Objects_and_Classes;

import java.util.Arrays;

/**
 * @author Mr.Dr.Professor
 * @since 17/03/2021 15:11
 */
/*public*/ class Test {
  private int[] intArray;

  Test() {
    intArray = new int[]{1, 2, 3, 4, 5, 6};
  }


  public static void main(String[] args) {
    Test test = new Test();

    int[] list = test.getIntArray();
    System.out.println(Arrays.toString(list));
    list[2] = 9999;
    System.out.println(Arrays.toString(test.getIntArray()));
  }

  public int[] getIntArray() {
    return Arrays.copyOf(intArray, intArray.length);
  }
}
