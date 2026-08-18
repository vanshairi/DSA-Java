class Solution {
  public String toLowerCase(String s) {
    String result = "";
    for (int i = 0; i < s.length(); i++) {
      if ((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90) {
        result += (char) ((int) s.charAt(i) + 32);
      } else {
        result += s.charAt(i);
      }
    }
    return result;
  }
}

// Can also use inbuilt function s.toLowerCase()