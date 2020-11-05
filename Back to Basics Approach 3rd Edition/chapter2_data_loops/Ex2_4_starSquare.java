package chapter2_data_loops;

/**
 * Created by ag on 30-Oct-20 1:58 PM
 */
public class Ex2_4_starSquare {
  static final int HEIGHT = 4;
  public static void main(String[] args) {
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
