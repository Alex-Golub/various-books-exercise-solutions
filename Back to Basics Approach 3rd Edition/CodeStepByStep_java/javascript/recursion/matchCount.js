/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/matchCount
 *
 * matchCount([2, 5, 0, 3, 8, 9, 1, 1, 0, 7], [2, 5, 3, 0, 8, 4, 1]) -> 4
 * matchCount([1, 2, 4], [3, 6, 7]) -> 0
 * matchCount([0, 19, -1, 27, 45], [-1, 19, 0, 0, 45, 77, 19]) -> 2
 * matchCount([], []) -> 0
 *
 * @author Alex Golub
 * @since 06-May-21, 2:49 PM
 */
function matchCount(v1, v2) {
  if (v1.length === 0 || v2.length === 0) {
    return 0;
  }

  return (v1[0] === v2[0] ? 1 : 0) +
    matchCount(v1.slice(1), v2.slice(1)); // pass subarray from index 1 to end
}
