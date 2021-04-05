package cse_142.cs1_sections.section05_midterm_practice;

/**
 * https://practiceit.cs.washington.edu/problem/view/1474?categoryid=303
 *
 * Returns whether or not they have dashes in the same places
 * No dash at all in both return true.
 * To be considered a match, the Strings must have exactly
 * the same number of dashes in exactly the same positions.
 *
 * sameDashes("abc", "9.8")                                                     => true
 * sameDashes("criminal-plan", "(206)555-1384")                                 => true
 * sameDashes("1st-has-more characters", "2nd-has-less")                        => true
 * sameDashes("1st-has-less", "2nd-has-more characters")                        => true
 * sameDashes("dash-at-end-", "this-is-end-too")                                => true
 * sameDashes("1st-this-is-end-too", "2nd-dash-at-end-")                        => true
 * sameDashes("1st-has-more-characters", "2nd-has-less")                        => false
 * sameDashes("1st-has-less", "2nd-has-more-characters")                        => false
 * sameDashes("same-num-different-alignment", "same-num-different..-alignment") => false
 * sameDashes("012345678901-", "0--")                                           => false
 * sameDashes("0--", "012345678901-")                                           => false
 *
 * @author Alex Golub
 * @since 04-Apr-21 10:35 AM
 */
class sameDashes {
  public static void main(String[] args) {
    System.out.println(sameDashes("hi--there-you.", "12--(134)-7539"));
    System.out.println(sameDashes("-15-389", "-xy-zzy"));
    System.out.println(sameDashes("criminal-plan", "(206)555-1384"));
    System.out.println(sameDashes("abc", "9.8"));
  }

  public static boolean sameDashes(String s1, String s2) {
    int i = 0, j = 0; // pointers to each char is s1 and s2

    // as long as there characters in both strings check if
    // chars are different then return false (XOR)
    // A B A XOR B
    // F F    F
    // F T    T
    // T F    T
    // T T    F
    while (i < s1.length() && j < s2.length()) {
      if (s1.charAt(i) != '-' ^ s2.charAt(j) != '-') {
        return false;
      }

      i++;
      j++;
    }

    while (i < s1.length()) {
      if (s1.charAt(i) == '-') {
        return false;
      }
      i++;
    }

    while (j < s2.length()) {
      if (s2.charAt(j) == '-') {
        return false;
      }
      j++;
    }

    return true;
  }
}
