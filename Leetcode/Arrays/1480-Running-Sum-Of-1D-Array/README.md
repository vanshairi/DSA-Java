# Running Sum of 1D Array

## Learning

While solving this problem, I learned a more efficient way to compute the running sum.

1. **Use the Previously Computed Running Sum**
   - Instead of using one loop to calculate the cumulative sum and another to store it, the running sum can be built in a single loop.
   - Initialize the first element:
     ```java
     runningSum[0] = nums[0];
     ```
   - For every subsequent index:
     ```java
     runningSum[i] = runningSum[i - 1] + nums[i];
     ```
   - Here, `runningSum[i - 1]` already contains the sum of all previous elements, so adding `nums[i]` gives the running sum up to the current index.

2. **Benefits**
   - Eliminates the need for an extra variable to store the cumulative sum.
   - Computes the running sum in a single traversal of the array.
   - Makes the code simpler and easier to understand.