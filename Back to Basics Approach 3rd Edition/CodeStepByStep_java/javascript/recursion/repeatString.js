/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/repeatString
 *
 * @author Alex Golub
 * @since 06-May-21, 3:27 PM
 */
function repeatString(s, n) {
  if (n < 0) throw 'n must be non-negative';
  if (n === 0) return '';

  const half = repeatString(s, Math.floor(n / 2));
  return (n % 2 === 0 ? '' : s) + half + half;
}
