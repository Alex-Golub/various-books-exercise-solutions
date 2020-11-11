package chapter2_objects;

/**
 * • Testing E2.9
 * The StringBuilder class has a method for reversing a string.
 *
 * Created by ag on 08-Nov-20 1:56 PM
 */
class Ex2_9_ReverseTester {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("desserts");
    System.out.println("sb => " + sb);
    System.out.println("Expected: stressed => " + sb.reverse());
  }
}
