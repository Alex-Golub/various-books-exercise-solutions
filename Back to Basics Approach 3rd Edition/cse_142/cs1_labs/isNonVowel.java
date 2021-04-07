package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab5/isNonVowel
 *
 * test #1: isNonVowel("q")
 *          return:true
 *          result: pass
 *
 * test #2: isNonVowel("A")
 *          return:false
 *          result: pass
 *
 * test #3: isNonVowel("e")
 *          return:false
 *          result: pass
 *
 * test #4: isNonVowel("X")
 *          return:true
 *          result: pass
 *
 * test #5: isNonVowel("O")
 *          return:false
 *          result: pass
 *
 * test #6: isNonVowel("u")
 *          return:false
 *          result: pass
 *
 * test #7: isNonVowel("Borat")
 *          return:true
 *          result: pass
 *
 * test #8: isNonVowel("obama")
 *          return:true
 *          result: pass
 *
 * test #9: isNonVowel("")
 *          return:true
 *          result: pass
 *
 * @author Alex Golub
 * @since 05-Apr-21 4:11 PM
 */
class isNonVowel {

  // pre: s != null
  public static boolean isNonVowel(String s) {
    if (s.length() != 1)
      return true;

    char c = s.toLowerCase().charAt(0);
    return !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
  }
}
