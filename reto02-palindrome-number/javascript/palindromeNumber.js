function main() {
  console.log(isPalindrome(121)); // true
  console.log(isPalindrome(-121)); // false
  console.log(isPalindrome(10)); // false
}

function isPalindrome(number) {
  if (number < 0) {
    return false;
  }

  let newNumber = number;
  let reversed = 0;
  while (newNumber > 0) {
    reversed = reversed * 10 + newNumber % 10;
    newNumber = parseInt(newNumber / 10);
  }
  return number == reversed;
}

main();
