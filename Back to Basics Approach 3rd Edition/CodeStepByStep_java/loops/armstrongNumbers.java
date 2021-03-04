package CodeStepByStep_java.loops;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/armstrongNumbers
 *
 * @author Mr.Dr.Professor
 * @since 03-Mar-21 4:43 PM
 */
/*public*/ class armstrongNumbers {
  public static void main(String[] args) {
    armstrongNumbers(3);
    System.out.println();
    armstrongNumbers(1);
    System.out.println();
    armstrongNumbers(5);
    System.out.println();
    armstrongNumbers(2);
    System.out.println();
    armstrongNumbers(6);
    System.out.println();
    armstrongNumbers(7);
    System.out.println();
    armstrongNumbers(0);
  }

  public static void armstrongNumbers(int n) {
    if (n <= 0) {
      return;
    }


    int from = (int) Math.pow(10, n - 1); // starting number
    if (n == 1) {
      from--; // adjust if n is 1 to include 0
    }
    int to = (int) Math.pow(10, n) - 1;   // end number

    for (int i = from; i <= to; i++) {
      int digitSum = 0;
      int temp = i;

      while (temp != 0) {
        int digit = temp % 10;
        digitSum += Math.pow(digit, n);
        temp /= 10;
      }

      if (digitSum == i) {
        System.out.print(i + " ");
      }
    }
  }
}
