package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab5/isAllVowels
 *
 * test #1: isAllVowels("eIEiO")
 *          return:true
 *          result: pass
 *
 * test #2: isAllVowels("oink")
 *          return:false
 *          result: pass
 *
 * test #3: isAllVowels("Maui")
 *          return:false
 *          result: pass
 *
 * test #4: isAllVowels("aeiouAEIOU")
 *          return:true
 *          result: pass
 *
 * test #5: isAllVowels("I")
 *          return:true
 *          result: pass
 *
 * test #6: isAllVowels("q")
 *          return:false
 *          result: pass
 *
 * test #7: isAllVowels("Borat")
 *          return:false
 *          result: pass
 *
 * test #8: isAllVowels("obama")
 *          return:false
 *          result: pass
 *
 * test #9: isAllVowels("")
 *          return:true
 *          result: pass
 *
 * @author Alex Golub
 * @since 05-Apr-21 4:31 PM
 */
class isAllVowels {
  public static boolean isAllVowels(String s) {
    s = s.toLowerCase();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
        return false;
    }

    return true;
  }
}
