/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/editDistance
 *
 * @author Alex Golub
 * @since 12-May-21, 4:55 PM
 */
function editDistance(s1, s2) {
  if (s1.length === 0 || s2.length === 0) {
    return Math.abs(s1.length - s2.length);
  }

  if (s1.charAt(0) === s2.charAt(0)) { // continue
    return editDistance(s1.substring(1), s2.substring(1));
  }

  const change = 1 + editDistance(s1.substring(1), s2.substring(1));
  const deletion = 1 + editDistance(s1.substring(1), s2);
  const insert = 1 + editDistance(s1, s2.substring(1));

  return Math.min(change, deletion, insert);
}
