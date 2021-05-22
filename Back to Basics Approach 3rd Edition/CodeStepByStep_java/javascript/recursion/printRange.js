/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/printRange
 *
 * @author Alex Golub
 * @since 09-May-21, 5:16 PM
 */
function printRange(x, y) {
  if (x > y) {
    throw 'x must be less than or equal to y';
  }
  console.log(helper(x, y));
}

function helper(x, y) {
  if (x === y) {
    return x;
  } else if (x + 1 === y) { // y is even
    return x + ' -- ' + y;
  } else {
    return `${x} > ${helper(x + 1, y - 1)} < ${y}`;
  }
}
