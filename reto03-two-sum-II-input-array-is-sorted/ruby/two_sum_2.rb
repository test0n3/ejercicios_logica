def main
  puts two_sum_2([2, 7, 11, 15], 9).inspect # [1, 2]
  puts two_sum_2([2, 3, 4], 6).inspect # [1, 3]
  puts two_sum_2([-1, 0], -1).inspect # [1, 2]
end

def two_sum_2(numbers, target)
  start_pos = 0
  end_pos = numbers.length - 1
  resp = nil
  while true
    sum = numbers[start_pos] + numbers[end_pos]
    start_pos += 1 if sum < target
    end_pos -= 1 if sum > target
    if sum == target
      resp = [start_pos + 1, end_pos + 1]
      break;
    end

    break if start_pos == end_pos
  end
  resp
end

main
