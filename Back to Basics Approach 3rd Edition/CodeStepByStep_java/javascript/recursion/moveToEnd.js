/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/moveToEnd
 *
 * @author Alex Golub
 * @since 12-May-21, 2:39 PM
 */
function moveToEnd(s, c) {
  return helper(s, c.toUpperCase(), s.length);
}

function helper(s, c, n) {
  if (n === 0) {
    return s;
  }
  if (s.charAt(0).toUpperCase() === c) {
    return helper(s.substring(1), c, n - 1) + c;
  } else {
    return s.charAt(0) + helper(s.substring(1), c, n - 1);
  }
}

console.log(moveToEnd('AlexEae', 'e')); // 'AlxaEEE'
