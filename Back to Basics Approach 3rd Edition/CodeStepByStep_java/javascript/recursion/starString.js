/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/starString
 *
 * @author Alex Golub
 * @since 06-May-21, 11:16 AM
 */
function starString(n) {
  if (n === 0) return '*';
  return starString(n - 1) + starString(n - 1);
}
