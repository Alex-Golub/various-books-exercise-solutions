/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/nonMatching
 *
 * @author Alex Golub
 * @since 12-May-21, 2:22 PM
 */
function nonMatching(s1, s2) {
  if (s1.length === 0 || s2.length === 0) {
    return Math.abs(s1.length - s2.length);
  }
  return (s1.charAt(0) !== s2.charAt(0) ? 1 : 0) +
    nonMatching(s1.substring(1), s2.substring(1));
}


console.log(nonMatching('I love Mariana!', 'U Love Marty'));
