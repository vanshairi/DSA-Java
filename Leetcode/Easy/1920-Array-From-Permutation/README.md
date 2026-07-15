# 1920. Build Array from Permutation

## Problem
Given a zero-based permutation `nums`, build and return an array `ans` where `ans[i] = nums[nums[i]]` for each index `i`.

## Difficulty
Easy

## Approach
- Create a new array of the same size as `nums`.
- Traverse the input array.
- For each index `i`, assign `ans[i] = nums[nums[i]]`.
- Return the resulting array.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Solution
See `solution.java`.