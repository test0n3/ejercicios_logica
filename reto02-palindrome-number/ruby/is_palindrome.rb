# frozen_string_literal: true
def main 
   puts is_palindrome2?(121) # true
   puts is_palindrome2?(-121) # false
   puts is_palindrome2?(10) # false
end

def is_palindrome?(x)
  x.to_s.split("").reverse.join("").to_i == x
end

def is_palindrome2?(x)
  return false if x < 0

  reversed = 0
  new_number = x
  while new_number > 0 
    reversed = reversed * 10 + new_number % 10
    new_number = new_number / 10
  end
  x == reversed 
end

main
