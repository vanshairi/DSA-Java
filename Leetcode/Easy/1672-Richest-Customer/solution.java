class Solution {
  public int maximumWealth(int[][] accounts) {

    int maximumWealth = 0;

    for (int i = 0; i < accounts.length; i++) {
      int totalWealth = 0;

      for (int j = 0; j < accounts[0].length; j++) {
        totalWealth += accounts[i][j];

      }
      if (totalWealth >= maximumWealth) {
        maximumWealth = totalWealth;
      }
    }
    return maximumWealth;
  }
}