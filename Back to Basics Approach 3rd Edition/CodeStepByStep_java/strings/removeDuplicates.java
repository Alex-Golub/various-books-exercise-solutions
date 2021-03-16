package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/removeDuplicates

 * removeDuplicates("hello")                         =>  "helo"
 * removeDuplicates("bookkeeper")                    =>  "bokeper"
 * removeDuplicates("aaaAAA   bbbbBBBB    cccccCCC") =>  "aA bB cC"
 * removeDuplicates("banana")                        =>  "banana"
 * removeDuplicates("QQ")                            =>  "Q"
 * removeDuplicates("x")                             =>  "x"
 * removeDuplicates("")                              =>  ""
 *
 * @author Mr.Dr.Professor
 * @since 14/03/2021 23:52
 */
/*public*/ class removeDuplicates {
  public static void main(String[] args) {
    System.out.println(removeDuplicates("bookkeeeeeper"));
  }

  public static String removeDuplicates(String s) {
    if (s.length() == 0) {
      return s;
    }

    StringBuilder sb = new StringBuilder(s.charAt(0) + "");
    for (int i = 1; i < s.length(); i++) {
      char c = s.charAt(i);

      if (sb.charAt(sb.length() - 1) != c) {
        sb.append(c);
      }
    }
    return sb.toString();
  }
}
