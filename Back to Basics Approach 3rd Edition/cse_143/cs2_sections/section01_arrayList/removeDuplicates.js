/**
 * @author Alex Golub
 * @since 21-Apr-21, 10:29 PM
 */
// const list = ["be", "be", "is", "not", "or", "question", "that", "the", "to", "to"];
const list = ['duplicate', 'duplicate', 'duplicate', 'duplicate', 'duplicate'];
const noDup = [list[0]]; // pre: list.length > 0
for (let i = 1; i < list.length; i++) {
  if (list[i] !== list[i - 1]) {
    noDup.push(list[i]);
  }
}

list.length = 0; // remove all content from list
for (const word of noDup) {
  list.push(word);
}
console.log(list);
