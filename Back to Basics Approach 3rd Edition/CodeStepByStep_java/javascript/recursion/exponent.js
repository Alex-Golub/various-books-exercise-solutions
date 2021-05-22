/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/exponent
 *
 * @author Alex Golub
 * @since 12-May-21, 4:02 PM
 */
function exponent(a, b) {
  if (b < 0) {
    throw 'exponent should be non-negative';
  } else if (b === 0) {
    return 1; // a^0 = 1
  } else if (b % 2 === 0) { // a^b = a^2*(b / 2)
    return exponent(a * a, b / 2);
  } else {
    return a * exponent(a, b - 1);
  }
}
