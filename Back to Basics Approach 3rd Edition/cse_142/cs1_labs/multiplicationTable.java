package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab2/multiplicationTable
 *
 * 1        2        3        4        5        6        7        8        9        10
 * 2        4        6        8        10       12       14       16       18       20
 * 3        6        9        12       15       18       21       24       27       30
 * 4        8        12       16       20       24       28       32       36       40
 * 5        10       15       20       25       30       35       40       45       50
 * 6        12       18       24       30       36       42       48       54       60
 * 7        14       21       28       35       42       49       56       63       70
 * 8        16       24       32       40       48       56       64       72       80
 * 9        18       27       36       45       54       63       72       81       90
 * 10       20       30       40       50       60       70       80       90       100
 *
 * @author Alex Golub
 * @since 05-Apr-21 1:24 PM
 */
class multiplicationTable {
  public static void main(String[] args) {
    multiplicationTable();
  }

  public static void multiplicationTable() {
    final int TO = 10;
    for (int i = 1; i <= TO; i++) {
      System.out.print(i);

      for (int j = 2; j <= TO; j++) {
        System.out.print("\t" + (i * j));
      }

      System.out.println();
    }
  }
}
