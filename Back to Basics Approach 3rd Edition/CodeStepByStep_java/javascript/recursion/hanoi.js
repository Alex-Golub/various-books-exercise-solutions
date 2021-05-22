/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/hanoi
 *
 * @author Alex Golub
 * @since 22-May-21, 3:23 PM
 */
function hanoi(n, from, to) {
  let temp;
  if (from === 1 && to === 2 || from === 2 && to === 1) {
    temp = 3;
  } else if (from === 2 && to === 3 || from === 3 && to === 2) {
    temp = 1;
  } else {
    temp = 2;
  }

  helper(n, from, temp, to);
}

function helper(n, from, temp, to) {
  if (n === 0) return;
  helper(n - 1, from, to, temp);
  console.log(`move disk ${n} from peg ${from} to peg ${to}`);
  helper(n - 1, temp, from, to);
}
