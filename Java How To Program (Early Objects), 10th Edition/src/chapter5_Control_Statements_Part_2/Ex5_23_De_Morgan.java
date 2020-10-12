package chapter5_Control_Statements_Part_2;

import java.util.Random;

/**
 * 5.23 (De Morgan’s Laws)
 * Use De Morgan’s laws to write equivalent expressions for each of the following,
 * then write an application to show that both the original expression and the new
 * expression in each case produce the same value
 *
 * Created by ag on 12-Oct-20 12:35 PM 
 */
class Ex5_23_De_Morgan {
  public static void main(String[] args) {

    for (int t = 1; t <= 5; t++) {
      Random rnd = new Random();
      int a = rnd.nextInt(10);
      int b = rnd.nextInt(10);
      int g = rnd.nextInt(10);
      int x = rnd.nextInt(10);
      int y = rnd.nextInt(10);
      int i = rnd.nextInt(10);
      int j = rnd.nextInt(10);

      System.out.printf("a=%d, b=%d, g=%d, x=%d, y=%d, i=%d, j=%d\n",
                        a, b, g, x, y, i, j);

      System.out.println((!(x < 5) && !(y >= 7)) == (x >= 5 && y < 7));
      System.out.println((!(a == b) || !(g != 5)) == (a != b || g == 5));
      System.out.println(!((x <= 8) && (y > 4)) == (x > 8 || y <= 4));
      System.out.println(!((i > 4) || (j <= 6)) == (i <= 4 && j > 6));
      System.out.println();
    }
  }
}
