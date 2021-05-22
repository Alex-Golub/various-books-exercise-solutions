/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/printStars
 *
 * @author Alex Golub
 * @since 09-May-21, 2:43 PM
 */
function printStars(n) {
  if (n < 0) {
    throw 'argument must be non-negative';
  }
  console.log(helper(n, ''));
}

function helper(n, s) {
  if (n === 0) {
    return;
  } if (n === 1) {
    return s + '*';
  } else {
    return helper(n - 1, s + '*')
  }
}

printStars(5);
