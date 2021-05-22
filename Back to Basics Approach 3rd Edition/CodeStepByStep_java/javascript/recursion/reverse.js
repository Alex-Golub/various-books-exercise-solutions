/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/reverse
 *
 * @author Alex Golub
 * @since 06-May-21, 3:37 PM
 */
function reverse(s) {
  if (s.length === 0) return '';
  return s.charAt(s.length - 1) + reverse(s.substr(0, s.length - 1));
}
