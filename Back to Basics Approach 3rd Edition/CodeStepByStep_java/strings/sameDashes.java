package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/sameDashes
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
 * sameDashes("0--", "012345678901")                                            => false
 *
 * @author Mr.Dr.Professor
 * @since 16/03/2021 20:01
 */
/*public*/ class sameDashes {
  public static void main(String[] args) {
    System.out.println(sameDashes("hi--there-you.", "12--(134)-7539"));
    System.out.println(sameDashes("hi--there-you", "hey-there-yo-"));
  }

  // A B A ^ B
  // 0 0 F
  // 0 1 T
  // 1 0 T
  // 1 1 F
  public static boolean sameDashes(String a, String b) {
    int i = 0;
    while (i < Math.min(a.length(), b.length())) {
      if (a.charAt(i) == '-' ^ b.charAt(i) == '-') {
        return false;
      }
      i++;
    }

    while (i < a.length()) {
      if (a.charAt(i) == '-') {
        return false;
      }
      i++;
    }

    while (i < b.length()) {
      if (b.charAt(i) == '-') {
        return false;
      }
      i++;
    }

    return true;
  }
}
