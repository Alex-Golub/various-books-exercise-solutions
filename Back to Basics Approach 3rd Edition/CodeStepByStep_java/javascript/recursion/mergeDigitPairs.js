/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/mergeDigitPairs
 *
 * @author Alex Golub
 * @since 12-May-21, 3:14 PM
 */
function mergeDigitPairs(n) {
  if (n < 0) {
    return -mergeDigitPairs(-n);
  } else if (n < 10) {
    return n;
  } else {
    let sum = Math.floor(n % 10) + Math.floor(n / 10) % 10;
    if (sum > 9) {
      sum = mergeDigitPairs(sum);
    }
    return mergeDigitPairs(Math.floor(n / 100)) * 10 + sum;
  }
}
