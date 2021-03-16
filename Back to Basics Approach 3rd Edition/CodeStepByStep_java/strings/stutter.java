package CodeStepByStep_java.strings;

/**
 * https://www.codestepbystep.com/problem/view/java/strings/stutter
 *
 * stutter("hello")             => "hheelllloo"
 * stutter("Pikachu")           => "PPiikkaacchhuu"
 * stutter("It's a-me, Mario!") => "IItt''ss  aa--mmee,,  MMaarriioo!!"
 * stutter("X")                 => "XX"
 *
 * @author Mr.Dr.Professor
 * @since 16/03/2021 20:54
 */
/*public*/ class stutter {
  public static void main(String[] args) {
    System.out.println(stutter("hello").equals("hheelllloo"));
  }

  public static String stutter(String s) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      builder.append(c).append(c);
    }
    return builder.toString();
  }
}
