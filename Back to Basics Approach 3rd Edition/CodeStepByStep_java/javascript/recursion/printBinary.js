/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/printBinary
 *
 * @author Alex Golub
 * @since 12-May-21, 12:58 PM
 */
function printBinary(n) {
  console.log(helper(n, ''));
}

function helper(n, res) {
  if (n < 0) {
    return '-' + helper(-n, res);
  } else if (n > 1) {
    return helper(Math.floor(n / 2), (n % 2) + res);
  } else {
    return n + res;
  }
}

printBinary(43);
printBinary(-43);
