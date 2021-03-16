package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/isAllVowels
 *
 * @author Mr.Dr.Professor
 * @since 13-Mar-21 11:13 PM
 */
/*public*/ class isAllVowels {
  public static boolean isAllVowels(String s) {
    String vowels = "AEIOUaeiou";

    for (int i = 0; i < s.length(); i++) {
      if (vowels.indexOf(s.charAt(i)) == -1) {
        return false;
      }
    }

    return true;
  }
}
