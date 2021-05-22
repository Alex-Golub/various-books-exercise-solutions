package CodeStepByStep.java.recursion;

import java.io.File;
import java.util.Arrays;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/crawl
 * <p>
 * Constraints: Your method must be recursive, though you may use a loop
 * to help you as appropriate.
 *
 * @author Alex Golub
 * @since 19-May-21, 9:25 PM
 */
class crawl {
  public static void main(String[] args) {
    crawl("C:\\Users\\thisPc\\Downloads\\CodeStepByStep-Java-master\\15-recursion\\29-crawl\\course");
  }
  
  public static void crawl(String dir) {
    crawlHelper(dir, "");
  }
  
  private static void crawlHelper(String filename, String indent) {
    File root = new File(filename);
    System.out.println(indent + root.getName());
    
    if (root.isDirectory()) {
      File[] list = root.listFiles();
      Arrays.sort(list);
      for (File f : list) {
        crawlHelper(filename + "/" + f.getName(), indent + "    ");
      }
    }
  }
}
