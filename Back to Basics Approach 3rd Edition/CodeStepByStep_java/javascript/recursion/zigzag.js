/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/zigzag
 *
 * @author Alex Golub
 * @since 09-May-21, 3:05 PM
 */
function zigzag(n) {
  if (n < 1) {
    throw 'argument must be greater than or equal to 1';
  }
  console.log(helper(n, ''));
}

function helper(n, accum) {
  if (n === 1) {
    return '*';
  } else if (n === 2) {
    return '**';
  } else {
    return '<' + helper(n - 2, accum) + '>';
  }
}

zigzag(1);
zigzag(2);
zigzag(3);
zigzag(4);
