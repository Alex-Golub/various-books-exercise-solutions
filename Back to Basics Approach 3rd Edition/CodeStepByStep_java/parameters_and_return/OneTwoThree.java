package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/OneTwoThree
 *
 * Bugged exercise
 *
 * addOne: a = 101, b = 201
 * addTwo: a = 102, b = 203
 * addThreeAndReturnResult: a = 103, b = 206
 * run: a = 103, b = 206
 *
 * @author Mr.Dr.Professor
 * @since 26-Feb-21 11:39 PM
 */
/*public*/ class OneTwoThree {
  private int b = 200;

  public static void main(String[] args) {
    int a = 100;
    addOne();
    addTwo(a);
    a = addThreeAndReturnResult(a);
//    System.out.printf("run: a = %d, b = %d\n", a, b);
  }

  private static int addThreeAndReturnResult(int a) {
    a += 3;
//    b += 3;
//    System.out.printf("addThreeAndReturnResult: a = %d, b = %d\n", a, b);
    return a;
  }

  private static void addTwo(int a) {
    a += 2;
//    b += 2;
//    System.out.printf("addTwo: a = %d, b = %d\n", a, b);
  }

  private static void addOne() {
    int a = 101;
//    b++;
//    System.out.printf("addOne: a = %d, b = %d\n", a, b);
  }
}
