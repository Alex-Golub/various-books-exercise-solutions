package chapter5_logic_and_loops;

import java.util.Random;

/**
 * 11. Write a method called threeHeads that repeatedly
 * flips a coin until the results of the coin toss are
 * three heads in a row.
 *
 * @author Mr.Dr.Professor
 * @since 21-Dec-20 12:40 PM
 */
class Ex5_11_threeHeads {
  public static void main(String[] args) {
    threeHeads();
  }

  public static void threeHeads() {
    Random rnd   = new Random();
    int    heads = 0;

    while (heads < 3) {
      if (rnd.nextBoolean()) {
        heads++;
        System.out.print("H");
      } else {
        heads = 0;
        System.out.print("T");
      }

      if (heads < 3)
        System.out.print(" ");
    }

    System.out.println("\nThree heads in a row!");
  }

//  public static void threeHeads() {
//    Random rnd = new Random();
//
//    char prev_prev = rnd.nextBoolean() ? 'H' : 'T';
//    char prev      = rnd.nextBoolean() ? 'H' : 'T';
//    char curr      = rnd.nextBoolean() ? 'H' : 'T';
//    System.out.print(prev_prev + " " + prev + " " + curr);
//
//    while (prev_prev != 'H' || prev != 'H' || curr != 'H') {
//      prev_prev = prev;
//      prev = curr;
//      curr = rnd.nextBoolean() ? 'H' : 'T';
//      System.out.print(" " + curr);
//    }
//
//    System.out.println("\nThree heads in a row!");
//  }
}
