class PalindromeNumber {
  public static void main(String[] args) {
    System.out.println(isPalindromeNumber(121)); // true
    System.out.println(isPalindromeNumber(-121)); // false
    System.out.println(isPalindromeNumber(10)); // false
  }

  public static boolean isPalindromeNumber(int number) {
    if (number < 0) {
      return false;
    }

    int newNumber = number;
    int reversed = 0;
    while (newNumber > 0) {
      reversed = reversed * 10 + newNumber % 10;
      newNumber = newNumber / 10;
    }
    return number == reversed;
  }
}
