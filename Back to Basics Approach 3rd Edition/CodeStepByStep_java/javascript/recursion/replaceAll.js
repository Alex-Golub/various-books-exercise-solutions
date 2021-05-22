/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/replaceAll
 *
 * @author Alex Golub
 * @since 09-May-21, 4:21 PM
 */
function replaceAll(s, from, to) {
  if (s.length === 0) {
    return '';
  } else if (s.charAt(0) === from) {
    return to + replaceAll(s.substring(1), from, to);
  } else {
    return s.charAt(0) + replaceAll(s.substring(1), from, to);
  }
}
