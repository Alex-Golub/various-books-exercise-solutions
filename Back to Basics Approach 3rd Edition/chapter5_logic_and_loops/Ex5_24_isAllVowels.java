package chapter5_logic_and_loops;

/**
 * 24. Write a method called isAllVowels that returns whether a
 * string consists entirely of vowels (a, e, i, o, or u, case insensitively).
 * If and only if every character of the string is a vowel,
 * your method should return true.
 *
 * @author Mr.Dr.Professor
 * @since 24-Dec-20 12:00 AM
 */
class Ex5_24_isAllVowels {
  public static void main(String[] args) {
    System.out.println(isAllVowels("") + " => " + true);
  }

  public static boolean isAllVowels(String str) {
    String vowels = "aeiouAEIOU";

    for (int i = 0; i < str.length(); i++)
      if (vowels.indexOf(str.charAt(i)) == -1)
        return false;

    return true;
  }
}
