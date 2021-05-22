package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/reverse
 *
 * @author Alex Golub
 * @since 06-May-21, 3:32 PM
 */
class reverse {
  public static void main(String[] args) {
    System.out.println(reverse("Hi you!"));
  }
  
  public static String reverse(String s) {
    if (s.length() == 0) {
      return "";
    }
    
    return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
  }
}

/*
f("Alex") -> 'x' + f("Ale")
  f("Ale) -> 'e' + f("Al")
    f("Al") -> 'l' + f("A")
      f("A") -> 'A' + f("")
        f("") -> ""
      f("A") -> 'A' + "" = "A"
    f("Al") -> 'l' + "A" = "lA"
  f("Ale) -> 'e' + "lA" = "elA";
f("Alex") -> 'x' + "elA" = "xelA"
*/
