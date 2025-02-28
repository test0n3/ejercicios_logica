function twoSum(nums, target) {
  for (let i = 0; i < nums.length - 1; i++) {
    let missing = target - nums[i];
    for (let j = i+1; j < nums.length; j++) {
      if (nums[j] == missing) {
        return [i,j];
      }
    }
  }
  return [];
}

function twoSum2(nums, target) {
  const pairIdx = {};
  for (let i = 0; i < nums.length; i++) {
    const num = nums[i];
    if (target - num in pairIdx) {
      return [pairIdx[target - num], i];
    }
    pairIdx[num] = i;
  }
}

console.log(twoSum2 ([2, 7, 11, 15], 9)); // [0, 1]
console.log(twoSum2([3, 2, 4], 6)); // [1, 2]
console.log(twoSum2([3, 3], 6)); // [0, 1]
