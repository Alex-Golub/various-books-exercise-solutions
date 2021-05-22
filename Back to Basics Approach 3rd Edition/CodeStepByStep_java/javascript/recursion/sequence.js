/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/sequence
 *
 * @author Alex Golub
 * @since 09-May-21, 4:02 PM
 */
function sequence(k) {
  if (k < 1) {
    throw 'k must be greater than 0';
  }
  console.log(helper(k));
}

function helper(k) {
  if (k === 1) {
    return k;
  } else if (k % 2 === 0) {
    return `(${k} + ${helper(k - 1)})`;
  } else {
    return `(${helper(k - 1)} + ${k})`;
  }
}

sequence(1);
sequence(2);
sequence(3);
sequence(4);
