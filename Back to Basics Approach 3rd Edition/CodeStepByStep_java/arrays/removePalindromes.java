package CodeStepByStep_java.arrays;

/**
 * Write a method named removePalindromes that that removes all
 * strings that are palindromes from an array of strings.
 *
 * Constraints:
 * 1. You are to modify the existing array in-place.
 *
 * 2. Do not create any other data structures such as temporary arrays.
 *
 * 3. You may create as many strings as you like, and you may use as
 * many simple variables (such as ints) as you like.
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 9:56 PM
 */
class removePalindromes {

  public static String[] removePalindromes(String[] words) {
    if (words == null || words.length == 0)
      return words;

    for (int i = 0; i < words.length; i++) {
      if (isPalindrome(words[i]))
        words[i] = "";
    }

    return words;
  }

  private static boolean isPalindrome(String word) {
    word = word.toLowerCase(); // case insensitive

    for (int i = 0; i < word.length() / 2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - 1 - i))
        return false;
    }

    return true;
  }
}
