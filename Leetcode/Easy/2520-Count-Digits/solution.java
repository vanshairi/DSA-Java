class Solution {
  public int countDigits(int num) {
      int alsoNum = num;
      int digit=0;
      int count =0;
        while (num!=0){
          digit = num%10;
          if (alsoNum%digit==0){
            count+=1;
          }
          num = num/10;
        }
        return count;
    }
}