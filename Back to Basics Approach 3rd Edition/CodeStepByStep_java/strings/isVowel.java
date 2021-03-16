package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/isVowel
 *
 * @author Mr.Dr.Professor
 * @since 13/03/2021 23:31
 */
/*public*/ class isVowel {
  public static boolean isVowel(String s) {
    return !s.isEmpty() && "aeiouAEIOU".contains(s);
  }
}
