package CodeStepByStep_java.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/UniqueNames
 *
 * @author Alex Golub
 * @since 25-Apr-21, 4:02 PM
 */
class UniqueNames {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    List<String> names = new ArrayList<>();
    
    while (true) {
      System.out.print("Enter name: ");
      String name = console.nextLine();
      
      if (name.equals("")) {
        break;
      }
      
      if (!names.contains(name)) {
        names.add(name);
      }
    }
    
    System.out.print("Unique name list contains: " + String.join(" ", names));
  }
}
