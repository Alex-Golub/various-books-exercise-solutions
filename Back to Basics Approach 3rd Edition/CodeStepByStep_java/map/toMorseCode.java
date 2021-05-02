package CodeStepByStep.java.map;

import java.util.Map;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/toMorseCode
 *
 * (1) mapping passed contains a mapping for every letter from A-Z in uppercase.
 * (2) some characters that are not uppercase A-Z letters (like spaces);
 *     just skip those characters.
 *
 * @author Alex Golub
 * @since 02-May-21, 10:21 AM
 */
class toMorseCode {
  public static void toMorseCode(Map<Character, String> mapping, String text) {
    StringBuilder morse = new StringBuilder();
    for (char c : text.toCharArray()) {
      String s = mapping.get(c);
      if (s != null) { // s is a key in mapping
        morse.append(s).append(" ");
      }
    }
    
    System.out.println(morse.substring(0, morse.length() - 1));
  }
}
