package CodeStepByStep_java.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/justifyText
 *
 * @author Mr.Dr.Professor
 * @since 13/03/2021 23:34
 */
/*public*/ class justifyText {
  public static void main(String[] args) {
    justifyText("This is an example of text justification", 16);
    System.out.printf("%5.16s", "This is an example");
  }

  public static void justifyText(String s, int width) {
    List<String> words = splitWords(s);
    List<String> result = justify(words, width);
    printJustifiedText(result);
  }

  private static void printJustifiedText(List<String> result) {
    for (String s : result) {
      System.out.println(s);
    }
  }

  private static ArrayList<String> justify(List<String> words, int width) {
    return null; // TODO
  }

  private static ArrayList<String> splitWords(String s) {
    ArrayList<String> words = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c != ' ') {
        sb.append(c);
      } else {
        words.add(sb.toString());
        sb.delete(0, sb.length());
      }
    }

    words.add(sb.toString());

    return words;
  }
}
