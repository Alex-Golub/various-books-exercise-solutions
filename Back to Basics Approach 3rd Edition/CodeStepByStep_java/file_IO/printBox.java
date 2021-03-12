package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/printBox
 *
 * ###################
 * #Roses are red    #
 * #Violets are blue #
 * #                 #
 * #All my base      #
 * #Are belong to you#
 * ###################
 *
 * ##############################
 * #Roses are red               #
 * #Violets are blue            #
 * #                            #
 * #All my base                 #
 * #Are belong to you           #
 * ##############################
 *
 * #######
 * #Roses#
 * #Viole#
 * #     #
 * #All m#
 * #Are b#
 * #######
 *
 * ##
 * ##
 * ##
 * ##
 * ##
 * ##
 * ##
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 8:30 PM
 */
/*public*/ class printBox {
  public static void main(String[] args) throws FileNotFoundException {
    printBox("poem.txt", 19);
    System.out.println();
    printBox("poem.txt", 30);
    System.out.println();
    printBox("poem.txt", 7);
    System.out.println();
    printBox("poem.txt", 2);
  }

  public static void printBox(String fileName, int width) throws FileNotFoundException {
    Scanner reader = new Scanner(new File(fileName));
    printCharacter('#', width);
    System.out.println();

    while (reader.hasNextLine()) {
      String line = reader.nextLine().toLowerCase();
      System.out.print("#");

      if (line.isEmpty()) {
        printCharacter(' ', width - 2);
      } else if (width > 2) { // file content can be printed only if there is empty spaces within the box
        int printTillThisIndex = Math.min(width - 2, line.length()); // fit content to available empty spaces
        line = Character.toUpperCase(line.charAt(0)) +
               line.substring(1, printTillThisIndex);
        System.out.print(line);
        printCharacter(' ', width -  2 - line.length()); // fill remaining spaces till right edge of box
      }

      System.out.println("#");
    }
    printCharacter('#', width);
    System.out.println();
  }

  public static void printCharacter(char c, int times) {
    while (times-- > 0) {
      System.out.print(c);
    }
  }
}
