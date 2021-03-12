package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/flipLines
 *
 * in:
 * TWAS brillig and the Slithy Toves
 * did GYRE and gimble in the Wabe.
 * All mimsey were the Borogroves,
 * and the mome RATHS outgrabe.
 *
 * "Beware the Jabberwock, my Son,
 * the JAWS that bite, the claws that Catch,
 * Beware the JubJub bird and SHUN
 * The Frumious Bandersnatch."
 *
 * out:
 * DID GYRE AND GIMBLE IN THE WABE.
 * twas brillig and the slithy toves
 * AND THE MOME RATHS OUTGRABE.
 * all mimsey were the borogroves,
 * "BEWARE THE JABBERWOCK, MY SON,
 *
 * BEWARE THE JUBJUB BIRD AND SHUN
 * the jaws that bite, the claws that catch,
 * THE FRUMIOUS BANDERSNATCH."
 *
 * @author Mr.Dr.Professor
 * @since 11-Mar-21 10:23 PM
 */
/*public*/ class flipLines {
  public static void main(String[] args) throws FileNotFoundException {
    flipLines("carroll.txt");
  }

  public static void flipLines(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    if (!file.exists() || !file.canRead()) {
      System.out.printf("Unable to open input file \"%s\"!\n", fileName);
      return;
    }

    Scanner fileReader = new Scanner(file);
    while (fileReader.hasNextLine()) {
      String firstLine = fileReader.nextLine();
      String secondLine = "";
      if (fileReader.hasNextLine()) {
        secondLine = fileReader.nextLine();
      }

      if (!secondLine.isEmpty()) {
        System.out.println(secondLine.toUpperCase());
        System.out.println(firstLine.toLowerCase());
      } else {
        System.out.println(firstLine.toUpperCase());
      }
    }
  }
}
