package CodeStepByStep_java.if_else;

/**
 * https://www.codestepbystep.com/problem/view/java/ifelse/numUnique
 *
 * @author Mr.Dr.Professor
 * @since 01-Mar-21 1:31 AM
 */
/*public*/ class numUnique {
  public static void main(String[] args) {
    System.out.println(numUnique(18, 3, 4));
    System.out.println(numUnique(6, 7, 6));
  }

  public static int numUnique(int a, int b, int c) {
    int unique = 3;
    if (a == b || a == c) {
      unique--;
    }

    if (b == c) {
      unique--;
    }

    return unique;
  }
}
