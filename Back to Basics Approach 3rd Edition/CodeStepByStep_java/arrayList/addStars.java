package CodeStepByStep_java.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/addStars
 *
 * @author Alex Golub
 * @since 22-Apr-21, 11:40 PM
 */
class addStars {
  public static void addStars(List<String> list) {
    List<String> temp = new ArrayList<>(2 * list.size() + 1);
    for (String s : list) {
      temp.add("*");
      temp.add(s);
    }
    
    temp.add("*");
    list.clear();
    list.addAll(temp);
  }
}
