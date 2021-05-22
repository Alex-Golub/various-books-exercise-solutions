/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/mirrorSequence
 *
 * mirrorSequence(1)  1
 * mirrorSequence(2)  1 1
 * mirrorSequence(3)  2 1 2
 * mirrorSequence(4)  2 1 1 2
 * mirrorSequence(5)  3 2 1 2 3
 * mirrorSequence(6)  3 2 1 1 2 3
 * mirrorSequence(7)  4 3 2 1 2 3 4
 * mirrorSequence(8)  4 3 2 1 1 2 3 4
 * mirrorSequence(9)  5 4 3 2 1 2 3 4 5
 * mirrorSequence(10) 5 4 3 2 1 1 2 3 4 5
 *
 * @author Alex Golub
 * @since 12-May-21, 2:44 PM
 */
function mirrorSequence(n) {
  if (n < 1) {
    throw 'argument must be greater than 0';
  }
  return helper(n, '');
}

function helper(n, res) {
  if (n === 1) {
    return '1';
  } else if (n === 2) {
    return '1 1';
  }
  const edge = Math.floor((n + 1) / 2);
  return `${edge} ${helper(n - 2, res)} ${edge}`;
}

console.log(mirrorSequence(1));
console.log(mirrorSequence(2));
console.log(mirrorSequence(3));
console.log(mirrorSequence(4));
