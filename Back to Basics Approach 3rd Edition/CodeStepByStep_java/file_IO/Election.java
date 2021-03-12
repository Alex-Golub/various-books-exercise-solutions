package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/Election
 *
 * File format:
 * State  Candidate1%  Candidate2%  ElectoralVotes  Pollster
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 10:19 PM
 */
/*public*/ class Election {
  public static void main(String[] args) throws FileNotFoundException {
    System.out.print("Input file? ");
    String inputFile = new Scanner(System.in).next();

    Scanner fileReader = new Scanner(new File(inputFile));

    int candidate1Votes = 0, candidate2Votes = 0;
    while (fileReader.hasNextLine()) {
      Scanner tokenReader = new Scanner(fileReader.nextLine());

      tokenReader.next();
      int c1Percent = tokenReader.nextInt();
      int c2Percent = tokenReader.nextInt();
      int electoralVotes = tokenReader.nextInt();

      while (tokenReader.hasNext()) { // read remaining unnecessary data
        tokenReader.next();
      }

      if (c1Percent > c2Percent) {
        candidate1Votes += electoralVotes;
      } else if (c1Percent < c2Percent) {
        candidate2Votes += electoralVotes;
      }
    }

    System.out.println("Candidate 1: " + candidate1Votes + " votes");
    System.out.println("Candidate 2: " + candidate2Votes + " votes");
  }
}
