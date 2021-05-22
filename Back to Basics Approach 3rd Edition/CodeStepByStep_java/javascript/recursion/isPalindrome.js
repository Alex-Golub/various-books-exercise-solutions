/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/isPalindrome
 *
 * @author Alex Golub
 * @since 09-May-21, 2:39 PM
 */
function isPalindrome(s) {
  if (s.length <= 1) {
    return true;
  } else {
    const first = s.charAt(0).toLowerCase();
    const last = s.charAt(s.length - 1).toLowerCase();
    return first === last && isPalindrome(s.substring(1, s.length - 1));
  }
}
