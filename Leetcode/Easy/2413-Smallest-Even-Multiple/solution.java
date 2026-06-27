class Solution {
  public int smallestEvenMultiple(int n) {
    int i = 0;
    for (i = 2; i <= 2 * n; i++) {
      if (i % 2 == 0 && i % n == 0) {
        break;
      }
    }
    return i;
  }
}