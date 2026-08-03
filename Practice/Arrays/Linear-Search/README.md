# Linear Search

## Learning

While solving this problem, I learned how to pass an array directly to a method without storing it in a variable.

1. **Passing an Array Directly to a Method**
   - To create and pass an array in a single statement, use the following syntax:
     ```java
     new int[] {1, 2, 3, 4, 5}
     ```
   - The `new int[]` keyword explicitly creates an array object, and the values inside `{}` initialize it.
   - This is useful when the array is needed only once and does not need to be stored in a separate variable.

2. **Example**
   ```java
   linearSearch(new int[] {1, 2, 3, 4, 5}, 4);
   ```
   - Here, a new integer array is created and immediately passed as an argument to the `linearSearch()` method.