/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/factorial
 *
 * @author Alex Golub
 * @since 03-May-21, 7:38 PM
 */
function factorial(n) {
  if (n < 0) {
    throw 'n must be non-negative';
  } else if (n <= 1) {
    return 1;
  }
  return n * factorial(n - 1);
}
