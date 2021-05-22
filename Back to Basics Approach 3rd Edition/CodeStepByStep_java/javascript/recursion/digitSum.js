/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/digitSum
 *
 * @author Alex Golub
 * @since 03-May-21, 7:50 PM
 */
function digitSum(n) {
  const neg = n < 0;
  if (Math.abs(n) < 10) {
    return n;
  }

  const result = Math.abs(n) % 10 + digitSum(Math.floor(Math.abs(n) / 10));
  return neg ? -result : result;
}

console.log(digitSum(-1729));
console.log(digitSum(-7));
