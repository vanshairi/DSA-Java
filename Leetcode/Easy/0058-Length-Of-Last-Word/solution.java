  class Solution {
  public int lengthOfLastWord(String s) {
    s = s.trim();
    int lastIndexOfSpace = s.lastIndexOf(" ");
    int lengthOfs = s.length();
    int lengthOfLastWord = lengthOfs - lastIndexOfSpace - 1;

    return lengthOfLastWord;
  }
}