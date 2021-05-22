/**
 * @author Alex Golub
 * @since 07-May-21, 9:12 PM
 */
function fibonacci(n) {
  if (n === 0) return 0;
  if (n === 1) return 1;
  return fibonacci1(n, 2, 0, 1);
}

function fibonacci1(n, i, f0, f1) {
  return n === i ? f0 + f1 : fibonacci1(n, i + 1, f1, f1 + f0);
}

console.log(fibonacci(1));
console.log(fibonacci(2));
console.log(fibonacci(3));
console.log(fibonacci(4));
console.log(fibonacci(50) === 12_586_269_025);
console.log(fibonacci(80) === 23416728348467685);

// 0  1  2  3  4  5  6
// 0, 1, 1, 2, 3, 5, 8
