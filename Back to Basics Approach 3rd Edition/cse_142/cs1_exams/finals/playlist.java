package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final11/playlist
 * <p>
 * Additionally, your method will return whether or not all the songs in
 * the file would fit on a standard CD.
 * A standard CD can hold up to, and including, 80 minutes of audio data.
 *
 * @author Alex Golub
 * @since 15-Apr-21 5:47 PM
 */
class playlist {
  public static void main(String[] args) {
    String data = "Alejandro ;      8 43\n" +
                  "  hOme       ; 5 3\n" +
                  "WHEN yoU Love SomEBODY ;  2 5\n" +
                  "   rudE to rile ; 3        30\n" +
                  "CALIFORNIa   gurls ; 3      56 ";
    playlist(new Scanner(data));
  }

  public static boolean playlist(Scanner file) {
    int totalTimeInSeconds = 0;
    while (file.hasNextLine()) {
      String line = file.nextLine();
      Scanner tokenReader = new Scanner(line);
      StringBuilder songName = new StringBuilder();
      int min = 0, sec = 0;

      while (tokenReader.hasNext()) {
        String token = tokenReader.next();

        if (token.equals(";")) {
          min = tokenReader.nextInt();
          sec = tokenReader.nextInt();
          totalTimeInSeconds += 60 * min + sec;
          break;
        }

        // process song title
        String word = token.toLowerCase();
        songName.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1))
                .append(" ");
      }

      System.out.println(songName + "" + min + ":" + sec);
    }

    return totalTimeInSeconds <= 80 * 60;
  }
}
