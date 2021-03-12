package CodeStepByStep_java.file_IO;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/classPresidents
 *
 * The file repeats the pattern name year votes.
 * The year is either "s" for sophomore or "j" for junior.
 *
 * Sophomore Class President: Emily (60 votes)
 * Junior Class President: Tom (44 votes)
 *
 * @author Mr.Dr.Professor
 * @since 06-Mar-21 4:53 PM
 */
/*public*/ class classPresidents {
  public static void main(String[] args) {
    classPresidents(new Scanner("Jared s 25 Sophie j 12 Tom j 44 Isaac s 30 Emily s 60 Russ s 23 Madison j 20"));
  }

  public static void classPresidents(Scanner votesResults) {
    String sophomorePresident = "", juniorPresident = "";
    int sophomoreVotes = 0, juniorVotes = 0;

    while (votesResults.hasNext()) {
      String candidateName = votesResults.next();
      char candidateYear = votesResults.next().charAt(0);
      int candidateVotes = votesResults.nextInt();

      switch (candidateYear) {
        case 'j':
          if (juniorVotes < candidateVotes) {
            juniorPresident = candidateName;
            juniorVotes = candidateVotes;
          }
          break;

        case 's':
          if (sophomoreVotes < candidateVotes) {
            sophomorePresident = candidateName;
            sophomoreVotes = candidateVotes;
          }
          break;
      }
    }

    System.out.printf("Sophomore Class President: %s (%d votes)\n",
                      sophomorePresident, sophomoreVotes);
    System.out.printf("Junior Class President: %s (%d votes)\n",
                      juniorPresident, juniorVotes);
  }
}
