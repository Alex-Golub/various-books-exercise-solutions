/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/sumOfSquares
 *
 * @author Alex Golub
 * @since 09-May-21, 3:33 PM
 */
function sumOfSquares(n) {
  if (n < 0) {
    throw n + '';
  } else if (n === 0) {
    return 0;
  } else {
    return n * n + sumOfSquares(n - 1);
  }
}
