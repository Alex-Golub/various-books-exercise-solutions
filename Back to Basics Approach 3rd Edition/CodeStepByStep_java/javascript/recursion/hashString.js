/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/hashString
 *
 * @author Alex Golub
 * @since 09-May-21, 2:35 PM
 */
function hashString(k) {
  if (k < 0) {
    throw 'n must be non-negative';
  } else if (k === 0) {
    return '#';
  } else {
    const prev = hashString(k - 1);
    return prev.repeat(2);
  }
}
