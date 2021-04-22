// list = ["four", "score", "and", "seven", "years", "ago"];
let result = [];
for (let i = 0; i < list.length - 1; i += 2) {
  const left = list[i];
  const right = list[i + 1];
  if (left.length <= right.length) {
    result.push(right);
  } else {
    result.push(left);
  }

  if (list.length % 2 === 1) {
    result.push(list.pop());
  }
}

list = result;
console.log(list);