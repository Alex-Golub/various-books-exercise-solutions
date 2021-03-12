package CodeStepByStep_java.file_IO;

import java.io.File;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/askFileName
 *
 * Type a file name: bad.txt
 * Type a file name: not_here.txt
 * Type a file name: good.txt
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 8:26 PM
 */
/*public*/ class askFileName {
  public static String askFileName() {
    Scanner console = new Scanner(System.in);
    String fileName;

    while (true) {
      System.out.print("Type a file name: ");
      fileName = console.next();

      if (new File(fileName).exists()) {
        break;
      }
    }

    return fileName;
  }
}
