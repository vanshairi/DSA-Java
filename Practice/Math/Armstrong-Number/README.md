# Armstrong Number

## Learning

While solving this problem, I learned the following concepts:

   **Counting the Number of Digits Using Strings**
   - The number of digits in an integer can be found using:
     ```java
     String.valueOf(num).length();
     ```
   - `String.valueOf(num)` converts the integer into its string representation.
   - Calling `.length()` on the resulting string returns the total number of characters, which is equal to the number of digits in the integer.
   - For example:
     - `String.valueOf(153)` returns `"153"`.
     - `"153".length()` returns `3`.
