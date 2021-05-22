/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/digitsSorted
 *
 * @author Alex Golub
 * @since 09-May-21, 2:15 PM
 */
function digitsSorted(n) {
  if (n < 0) {
    return digitsSorted(-n);
  }
  if (n < 10) {
    return true;
  }

  return n % 10 >= parseInt(n / 10) % 10 && digitsSorted(n / 10);
}
