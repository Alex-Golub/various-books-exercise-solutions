/**
 * https://www.codestepbystep.com/problem/view/javascript/recursion/indexOf
 *
 * @author Alex Golub
 * @since 08-May-21, 1:30 PM
 */
function indexOf(src, tgt) {
  if (tgt.length > src.length) return -1;
  if (src.startsWith(tgt)) return 0;
  let nextIdx = indexOf(src.substring(1), tgt);
  return nextIdx === -1 ? -1 : 1 + nextIdx;
}
