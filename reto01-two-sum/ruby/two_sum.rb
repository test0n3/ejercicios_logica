# frozen_string_literal: true

def main
  puts two_sum2([2, 7, 11, 15], 9).inspect # 0, 1
  puts two_sum2([3, 2, 4], 6).inspect # 1, 2
  puts two_sum2([3, 3], 6).inspect # 0, 1
end

def two_sum(nums, target)
  counter = 1
  (nums.length - 1).times do |i|
    new_arr = nums.drop(counter)
    missing = target - nums[i]

    return [i, new_arr.index(missing) + counter] if new_arr.include?(missing)

    counter += 1
  end
end

def two_sum2(nums, target)
  temporal_hash = {}
  nums.length.times do |i|
    num = nums[i]
    return [temporal_hash[target - num], i] if temporal_hash.keys.include?(target - num)

    temporal_hash[num] = i
  end
  []
end

main
