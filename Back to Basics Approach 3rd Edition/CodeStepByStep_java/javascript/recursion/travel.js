/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/travel
 *
 * @author Alex Golub
 * @since 09-May-21, 3:28 PM
 */
function travel(x, y) { // pre: x, y >= 0
  helper(x, y, 0, 0, '');
}

function helper(x, y, currX, currY, path) {
  if (currX > x || currY > y) { // out of bounds
    return;
  } else if (currY === y && currX === x) { // hit tgt point
    console.log(path);
  } else {
    helper(x, y, currX + 1, currY, path + 'E ');
    helper(x, y, currX, currY + 1, path + 'N ');
    helper(x, y, currX + 1, currY + 1, path + 'NE ');
  }
}

travel(1, 2);
