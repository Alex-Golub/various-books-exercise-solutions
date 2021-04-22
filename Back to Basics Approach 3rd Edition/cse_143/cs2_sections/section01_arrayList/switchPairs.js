/**
 * @author Alex Golub
 * @since 21-Apr-21, 10:22 PM
 */
// list = ["four", "score", "and", "seven", "years", "ago"];
// list = ["I", "love", "programming!"];
let list = ['don\'t move me'];

for (let i = 1; i < list.length; i += 2) {
  const temp = list[i];
  list[i] = list[i - 1];
  list[i - 1] = temp;
}

console.log(list);
