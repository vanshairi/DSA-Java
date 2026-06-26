class Solution {
  public int subtractProductAndSum(int n) {
    int sumOfDigits = 0;
    int productOfDigits = 1;
    while (n != 0) {
      sumOfDigits += n % 10;
      productOfDigits *= n % 10;
      n = n / 10;
    }
    return productOfDigits - sumOfDigits;
  }
}