package cse_142.cs1_sections.section06_file_processing;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/4191?categoryid=119
 *
 * The input will have one movie entry per line.
 * Each line has an integer n indicating how many ratings there are,
 * followed by the n different ratings for the movie.
 * Each line ends with the title of the movie.
 *
 * E.g.
 * 4 9.2 9 8.5 9.5 Seven Samurai (1954)
 * 5 8.2 9.5 7 10 9.8 12 Angry Men (1957)
 * 6 5.7 6 9 9 8 10 Fight Club (1999)
 *
 * Each line of output should list the movie title, the number of ratings,
 * and the score (the average of the ratings).
 *
 * You passed 3 of 3 tests.
 * rateMovies(new Scanner("   1 1 The Babadook (2014)\n"));
 * console output:
 * title = The Babadook (2014), ratings = 1, score = 1.0
 *
 * rateMovies(new Scanner("   4 9.2 9 8.5 9.5 Seven Samurai (1954)\n
 * 5 8.2 9.5 7 10 9.8 12 Angry Men (1957)\n
 * 6 5.7 6 9 9 8 10 Fight Club (1999));
 * console output:
 * title = Seven Samurai (1954), ratings = 4, score = 9.05
 * title = 12 Angry Men (1957), ratings = 5, score = 8.9
 * title = Fight Club (1999), ratings = 6, score = 7.95
 *
 * @author Alex Golub
 * @since 04-Apr-21 11:12 AM
 */
class rateMovies {
  public static void main(String[] args) {
    String mockData = "4 9.2 9 8.5 9.5 Seven Samurai (1954)\n" +
                      "5 8.2 9.5 7 10 9.8 12 Angry Men (1957)\n" +
                      "6 5.7 6 9 9 8 10 Fight Club (1999)";
    rateMovies(new Scanner(mockData));
  }

  // precondition: number of ratings is always at least 1
  public static void rateMovies(Scanner fileReader) {
    while (fileReader.hasNextLine()) {
      String line = fileReader.nextLine();

      Scanner tokenReader = new Scanner(line);
      int ratings = tokenReader.nextInt();
      double ratingsSum = 0;
      for (int i = 0; i < ratings; i++) {
        ratingsSum += tokenReader.nextDouble();
      }

      String title = tokenReader.nextLine();
      System.out.println("title =" + title +
                         ", ratings = " + ratings +
                         ", score = " + ratingsSum / ratings);
    }
  }
}
