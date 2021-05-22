/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/isSubsequence
 *
 * @author Alex Golub
 * @since 12-May-21, 3:57 PM
 */
function isSubsequence(s1, s2) {
  if (s2.length === 0) {
    return true;
  } else if (s1.length === 0) {
    return false;
  }

  return s1.charAt(0) === s2.charAt(0) ?
         isSubsequence(s1.substring(1), s2.substring(1)) :
         isSubsequence(s1.substring(1), s2);
}
