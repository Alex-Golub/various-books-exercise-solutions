package CodeStepByStep.java.map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/biggestFamily
 *
 * Open and read the contents of this input file and figure out which last name(s)
 * occur most frequently in the data, and print the members of that family in ABC
 * order in exactly the format shown below.
 *
 * If multiple families are tied for the most members, print each of the tied
 * families in the same format.
 *
 * It is possible that more than two families might tie for the most members.
 *
 * @author Alex Golub
 * @since 01-May-21, 6:36 PM
 */
class biggestFamily {
  public static void main(String[] args) throws FileNotFoundException {
    biggestFamily("families.txt");
  }
  
  public static void biggestFamily(String fn) throws FileNotFoundException {
    Scanner fileReader = new Scanner(new File(fn));
    Map<String, List<String>> members = new TreeMap<>();
  
    // 1. read each line of the file
    // 2. if map contain the family name add the persons name to the list
    //   2.1. otherwise create new list and add the person to the empty list
    // 3. find the family with the most number of members
    // 4. scan map and find largest families and print there members
    while (fileReader.hasNextLine()) {
      String[] firstLast = fileReader.nextLine().split(" ");
      
      members.compute(firstLast[1], (k, v) -> {
        if (v == null) {
          v = new ArrayList<>();
        }
        v.add(firstLast[0]);
        return v;
      });
    }
  
    int mostFamilyMembers = members.values().stream().max(Comparator.comparingInt(List::size)).get().size();
    
    for (Map.Entry<String, List<String>> e : members.entrySet()) {
      List<String> familyMembers = e.getValue();
      if (familyMembers.size() == mostFamilyMembers) {
        Collections.sort(familyMembers);
        System.out.println(e.getKey() + " family: " + String.join(" ", familyMembers));
      }
    }
  }
}
