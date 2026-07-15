# 1929. Concatenation of Array

## Problem
Given an integer array `nums` of length `n`, return an array `ans` of length `2n` where `ans[i] == nums[i]` and `ans[i + n] == nums[i]` for `0 <= i < n`.

## Difficulty
Easy

## Approach
- Create a new array of size `2 × nums.length`.
- Copy the elements of `nums` into the first half of the new array.
- Copy the elements of `nums` again into the second half.
- Return the concatenated array.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Solution
See `solution.java`.