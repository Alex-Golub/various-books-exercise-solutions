/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/countToBy
 *
 * @author Alex Golub
 * @since 19-May-21, 9:15 PM
 */
function countToBy(n, m) {
  if (n < 1 || m < 1)
    return '';
  return `${helper(n - m, m)}${n}`;
}

function helper(n, m) {
  if (n >= 1) {
    return helper(n - m, m) + '' + n + ', ';
  } else {
    return '';
  }
}

console.log(countToBy(10, 1));
console.log(countToBy(25, 4));
