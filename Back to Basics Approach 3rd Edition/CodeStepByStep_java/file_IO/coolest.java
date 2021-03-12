package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/coolest
 *
 * So we will define the "popularity" of a user to be the sum of the number
 * of their followers' followers.
 * For example, if user A has three followers
 * named B, C, and D, then A's popularity is the sum of the number of followers
 * that B, C, and D have. If B has 3 followers, C has 2, and D has 4,
 * then A's popularity is 9.
 *
 * If two users tie for the highest popularity, return the one whose name
 * comes earlier in alphabetical order.
 *
 * You may assume valid input. Specifically, assume that the given file exists,
 * is readable by your code, and that each line of it is in the format above
 * with two whitespace-separated one-word names per line.
 *
 * Constraints:
 * 1. Your solution should read the file only once, not make multiple passes
 * over the file data.
 * 2. You may create up to two additional data structures
 * (stack, queue, set, map, etc.) as auxiliary storage.
 * A nested structure, such as a set of lists, counts as one additional data structure.
 * 3. You can have as many simple variables as you like, such as ints or strings.
 * 4. Your solution should run in O(N^2) time or faster,
 * where N is the number of names in the file.
 *
 * @author Mr.Dr.Professor
 * @since 11-Mar-21 8:39 PM
 */
/*public*/ class coolest {
  public static void main(String[] args) throws FileNotFoundException {
    String mockData = "Stuart Marty\n" +
                      "Helene Elmer\n" +
                      "Donald Marty\n" +
                      "Bruce Elmer\n" +
                      "Donald Elmer\n" +
                      "Donald Stuart\n" +
                      "Stuart Mehran\n" +
                      "Mehran Donald\n" +
                      "Reid Elmer\n" +
                      "Marty Mehran";

    System.out.println(coolest(mockData));
  }
  public static String coolest(String fileName) throws FileNotFoundException {
    Map<String, List<String>> followers = new HashMap<>();
    Scanner lineReader = new Scanner(new File(fileName));
//    Scanner lineReader = new Scanner(fileName);
    while (lineReader.hasNextLine()) {
      Scanner tokenReader = new Scanner(lineReader.nextLine());
      String follower = tokenReader.next();
      String user = tokenReader.next();
      if (!followers.containsKey(user)) {
        List<String> list = new ArrayList<>();
        list.add(follower);
        followers.put(user, list);
      } else {
        followers.get(user).add(follower);
      }
    }

    Map<String, Integer> numOfFollowers = new HashMap<>();
    for (Map.Entry<String, List<String>> entry : followers.entrySet()) {
      String name = entry.getKey();
      int followersCount = 0;
      for (String follower : followers.get(name)) {
        if (followers.containsKey(follower)) {
          followersCount += followers.get(follower).size();
        }
      }

      if (!numOfFollowers.containsKey(name)) {
        numOfFollowers.put(name, followersCount);
      } else {
        numOfFollowers.put(name, 0);
        numOfFollowers.put(name, numOfFollowers.get(name) + followersCount);
      }
    }

//    printMap(followers);
//
//    for (Map.Entry<String, Integer> entry : numOfFollowers.entrySet()) {
//      System.out.println(entry.getKey() + " => " + entry.getValue());
//    }

    return findCoolest(numOfFollowers);
  }

  private static String findCoolest(Map<String, Integer> numOfFollowers) {
    String coolest = "";
    int mostFollowersSoFar = 0;

    for (Map.Entry<String, Integer> entry : numOfFollowers.entrySet()) {
      if (coolest.isEmpty()) {
        coolest = entry.getKey();
        mostFollowersSoFar = entry.getValue();
      }

      if (entry.getValue() > mostFollowersSoFar) {
        mostFollowersSoFar = entry.getValue();
        coolest = entry.getKey();
      } else if (entry.getValue() == mostFollowersSoFar) {
        coolest = entry.getKey().compareTo(coolest) < 0 ? entry.getKey() : coolest;
      }
    }
    return coolest;
  }

  private static void printMap(Map<String, List<String>> followers) {
    for (Map.Entry<String, List<String>> entry : followers.entrySet()) {
      System.out.println(entry.getKey());
      for (String follower : entry.getValue()) {
        System.out.println("\t" + follower);
      }
      System.out.println();
    }
  }
}
