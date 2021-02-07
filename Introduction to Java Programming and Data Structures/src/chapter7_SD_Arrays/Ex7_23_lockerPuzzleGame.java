package chapter7_SD_Arrays;

/**
 * **7.23 (Game: locker puzzle)
 *
 * Observation: if we have n students with n lockers
 * the lockers that will be left open when every student
 * will change the status of the lockers will be a perfect
 * square number up to including sqrt(n).
 * E.g. if n = 100, sqrt(100) = 10
 * thus lockers that are left open are:
 * 1     4     9     16    25    36    49    64  81      100
 * 1**2, 2**2, 3**2, 4**2, 5**2, 6**2, 7**2, 8**2, 9**2, 10**2
 *
 * @author Mr.Dr.Professor
 * @since 06-Feb-21 5:54 PM
 */
class Ex7_23_lockerPuzzleGame {
  public static void main(String[] args) {
    final int STUDENTS = 100;
    boolean[] lockers  = new boolean[STUDENTS + 1];

    // false - locker is closed
    for (int s = 1; s <= STUDENTS; s++) {
      for (int l = 1; s * l < lockers.length; l++) {
        lockers[s * l] = !lockers[s * l];
      }
    }

    System.out.print("Opened lockers are:");
    for (int i = 1; i < lockers.length; i++)
      if (lockers[i])
        System.out.print(" " + i);
  }
}
