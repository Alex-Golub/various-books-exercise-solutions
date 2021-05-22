/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/evenDigits
 *
 * @author Alex Golub
 * @since 06-May-21, 1:45 PM
 */
function evenDigits(n) {
  if (n < 0) {
    return -evenDigits(-n);
  }

  if (n < 10) {
    return n % 2 === 0 ? n : 0;
  }

  let prev = evenDigits(Math.floor(n / 10));
  if (n % 10 % 2 === 0) {
    prev = prev * 10 + n % 10;
  }

  return prev;
}
