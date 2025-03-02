function main() {
  console.log(twoSum2([2, 7, 11, 15], 9)); // [1, 2]
  console.log(twoSum2([2, 3, 4], 6)); // [1, 3]
  console.log(twoSum2([-1,0], -1)); // [1, 2]
}

function twoSum2(numbers, target) {
  let start = 0;
  let end = numbers.length - 1;
  let resp = null;
  while (true) {
    let sum = numbers[start] + numbers[end];
    if (sum == target) {
      resp = [start + 1, end + 1];
      break;
    }

    if (sum < target) {
      start++;
    }

    if (sum > target) {
      end--;
    }

    if (start == end) {
      break;
    }
  }
  return resp; 
}

main();
