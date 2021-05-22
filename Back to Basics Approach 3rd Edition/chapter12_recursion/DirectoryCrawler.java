package chapter12_recursion;

import java.io.File;
import java.util.Scanner;

/**
 * @author Alex Golub
 * @since 03-May-21, 2:45 PM
 */
class DirectoryCrawler {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("directory or file name? ");
    String name = console.nextLine();
    File f = new File(name);
    if (!f.exists()) {
      System.out.println("No such file/directory");
    } else {
      print(f, 0);
    }
  }
  
  private static void print(File f, int level) {
    System.out.println(" ".repeat(level) + "" + f.getName());
    if (f.isDirectory()) {
      for (File subF : f.listFiles()) {
        print(subF, level + 2);
      }
    }
  }
}
