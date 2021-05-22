/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/collapseSequences
 *
 * @author Alex Golub
 * @since 22-May-21, 3:46 PM
 */
function collapseSequences(s, c) {
  if (s.length === 0) return s;
  return helper("", s, c);
}

function helper(prefix, suffix, c) {
  if (suffix.length <= 1) return prefix + suffix;
  const c1 = suffix.charAt(0);
  const c2 = suffix.charAt(1);
  if (c1 !== c2 || c1 !== c) {
    prefix += c1;
  }
  return helper(prefix, suffix.substr(1), c);
}
