/**
 * @author Alex Golub
 * @since 21-Apr-21, 10:43 PM
 */
// const list = ["four", "for ", "all "];
const list = ['Don\'t', 'do', 'anything', 'to', 'the', 'list!'];
const temp = [];
for (let i = list.length - 1; i >= 0; i--) {
  temp.unshift(list[i]);
  if (list[i].length === 4) {
    temp.unshift('****');
  }
}
list.length = 0;
temp.forEach(word => list.push(word));
console.log(list);
