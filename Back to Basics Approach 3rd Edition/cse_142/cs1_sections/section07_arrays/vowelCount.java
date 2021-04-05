package cse_142.cs1_sections.section07_arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/3925?categoryid=120
 *
 * test #1:vowelCount("i think, therefore i am")
 * return:{1, 3, 3, 1, 0}
 * result: pass
 *
 * test #2:vowelCount("martin douglas stepp")
 * return:{2, 1, 1, 1, 1}
 * result: pass
 *
 * test #3:vowelCount("four score and seven years ago")
 * return:{3, 4, 0, 3, 1}
 * result: pass
 *
 * test #4:vowelCount("")
 * return:{0, 0, 0, 0, 0}
 * result: pass
 *
 * @author Alex Golub
 * @since 04-Apr-21 12:00 PM
 */
class vowelCount {
 // pre: string contains no uppercase letters
 public static int[] vowelCount(String str) {
  int[] vowelCount = new int[5];

  if (str == null || str.length() == 0)
   return vowelCount;

  for (char c : str.toLowerCase().toCharArray()) {
   switch (c) {
    case 'a': vowelCount[0]++; break;
    case 'e': vowelCount[1]++; break;
    case 'i': vowelCount[2]++; break;
    case 'o': vowelCount[3]++; break;
    case 'u': vowelCount[4]++; break;
   }
  }

  return vowelCount;
 }
}
