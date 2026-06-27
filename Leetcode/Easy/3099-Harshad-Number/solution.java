class Solution {
  public int sumOfTheDigitsOfHarshadNumber(int x) {
    int sumOfDigits = 0;
    int also_x = x;

    while (x != 0) {
      sumOfDigits += x % 10;
      x = x / 10;
    }
    if (also_x % sumOfDigits == 0) {
      return sumOfDigits;
    }
    return -1;
  }
}