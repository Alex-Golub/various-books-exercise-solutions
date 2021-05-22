package chapter12_recursion;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter12/e13-indexOf
 *
 * @author Alex Golub
 * @since 06-May-21, 3:47 PM
 */
class indexOf {
  public static void main(String[] args) {
    System.out.println(indexOf("Barack Obama", "Bar") + " => " + 0);
    System.out.println(indexOf("Barack Obama", "ck") + " => " + 4);
    System.out.println(indexOf("Barack Obama", "a") + " => " + 1);
    System.out.println(indexOf("Barack Obama", "McCain") + " => " + -1);
    System.out.println(indexOf("Barack Obama", "BAR") + " => " + -1);
  }
  
  public static int indexOf(String src, String tgt) {
    if (src.length() < tgt.length()) {
      return -1;
    }
    if (src.startsWith(tgt)) {
      return 0;
    }
    int nextIdx = indexOf(src.substring(1), tgt);
    return nextIdx == -1 ? -1 : 1 + nextIdx;
  }
}

/*
f("Recursion", "ion") -> nextIdx = f("ecursion", "ion)
  f("ecursion", "ion) -> nextIdx = f("cursion", "ion)
    f("cursion", "ion) -> nextIdx = f("ursion", "ion)
      f("ursion", "ion) -> nextIdx = f("rsion", "ion)
        f("rsion", "ion) -> nextIdx = f("sion", "ion)
          f("sion", "ion) -> nextIdx = f("ion", "ion)
            f("ion", "ion) -> 0
          f("sion", "ion) -> nextIdx = 0; 1 + 0; 1
        f("rsion", "ion) -> nextIdx = 1; 1 + 1 = 2
      f("ursion", "ion) -> nextIdx = 2; 1 + 2 = 3
    f("cursion", "ion) -> nextIdx = 3; 1 + 3 = 4
  f("ecursion", "ion) -> nextIdx = 4; 1 + 4 = 5
f("Recursion", "ion") -> nextIdx = 5; 1 + 5 = 6 -> 6 is the final answer
*/
