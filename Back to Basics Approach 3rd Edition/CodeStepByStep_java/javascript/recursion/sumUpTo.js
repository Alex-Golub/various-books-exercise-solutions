/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/sumUpTo
 *
 * @author Alex Golub
 * @since 06-May-21, 2:10 PM
 */
function sumUpTo(n) {
  if (n < 0) throw 'n must be non-negative';
  return n === 0 ? 0 : sumUpTo(n - 1) + 1 / n;
}
