package CodeStepByStep_java.file_IO;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/reverseChunksInFile
 *
 * Assumptions:
 * 1. You may assume that the given file exists, is readable, and follows the
 * given format with an alternating pattern of words and integers.
 * 2. You may assume that the integers that follow each word are positive numbers.
 * 3. You may assume that each word on each line of the file is separated by a single space.
 *
 * Constraints:
 * 1. In solving this problem, you should not create any data structures such as arrays.
 * 2. But you may create as many strings or Scanners as you like, and
 * 3. you may use as many simple variables (such as ints) as you like.
 *
 * file input:
 * reverseChunksInFile_test2.txt:
 * beautiful 8 banana 6 ABCDE 1
 * x 2 abc 3 zz 3 Q 1
 * ABCDEFGHIJ 1 ABCDEFGHIJ 2 ABCDEFGHIJ 3 ABCDEFGHIJ 4 ABCDEFGHIJ 5 ABCDEFGHIJ 6
 *
 * console output:
 * ufituaebl ananab ABCDE
 * x cba zz Q
 * ABCDEFGHIJ BADCFEHGJI CBAFEDIHGJ DCBAHGFEIJ EDCBAJIHGF FEDCBAGHIJ
 *
 * @author Mr.Dr.Professor
 * @since 10-Mar-21 10:47 PM
 */
/*public*/ class reverseChunksInFile {
  public static void main(String[] args) {
    String mockData = "MehranSahami 3 ChrisP 2\n" +
                  "MartyStepp 4 KeithSchwarz 5 CynthiaBLee 3\n" +
                  "\n" +
                  "NickT 1";
    reverseChunksInFile(new Scanner(mockData));

  }
  public static void reverseChunksInFile(Scanner inputFile) {
    StringBuilder result = new StringBuilder();

    while (inputFile.hasNextLine()) {
      String line = inputFile.nextLine();

      Scanner tokenReader = new Scanner(line);
      while (tokenReader.hasNext()) {
        result.append(reverseChunks(tokenReader.next(),
                                    tokenReader.nextInt()))
                .append(" ");
      }

      if (inputFile.hasNextLine()) {
        result.append("\n");
      }
    }

    System.out.println(result);
  }

  private static String reverseChunks(String word, int k) {
    StringBuilder res = new StringBuilder(word.length());

    int i = 0;
    while (i + k <= word.length()) {
      res.append(reverseWord(word.substring(i, i + k)));
      i += k;
    }

    res.append(word.substring(i));
    return res.toString();
  }

  private static String reverseWord(String s) {
    return new StringBuilder(s).reverse().toString();
  }
}
