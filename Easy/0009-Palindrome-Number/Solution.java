class Solution {
  public boolean isPalindrome(int x) {
    int reversedInteger = 0, remainder, originalInteger = x;

    if (x >= 0) {

      while (x != 0) {
        remainder = x % 10;
        reversedInteger = reversedInteger * 10 + remainder;
        x = x / 10;
      }

      if (reversedInteger == originalInteger) {
        return true;
      }
      return false;
    }
    return false;
  }
}