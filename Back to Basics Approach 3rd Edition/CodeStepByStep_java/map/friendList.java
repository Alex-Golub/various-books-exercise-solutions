package CodeStepByStep.java.map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/friendList
 *
 * @author Alex Golub
 * @since 01-May-21, 9:22 PM
 */
class friendList {
  public static void main(String[] args) throws FileNotFoundException {
    System.out.println(friendList("buddies.txt"));
  }
  
  public static TreeMap<String, TreeSet<String>> friendList(String fn)
    throws FileNotFoundException {
    Scanner in = new Scanner(new File(fn));
    TreeMap<String, TreeSet<String>> map = new TreeMap<>();
    while (in.hasNextLine()) {
      String[] rel = in.nextLine().split(" ");
      
      // left -> right
      map.compute(rel[0], (k, v) -> {
        if (v == null) {
          v = new TreeSet<>();
        }
        v.add(rel[1]);
        return v;
      });
      
      // right -> left
      map.compute(rel[1], (k, v) -> {
        if (v == null) {
          v = new TreeSet<>();
        }
        v.add(rel[0]);
        return v;
      });
    }
    
    return map;
  }
}
