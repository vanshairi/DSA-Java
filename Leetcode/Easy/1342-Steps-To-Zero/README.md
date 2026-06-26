# 1342. Number of Steps to Reduce a Number to Zero

## Problem
Given an integer `num`, return the number of steps required to reduce it to `0`. If the current number is even, divide it by `2`; otherwise, subtract `1`.

## Difficulty
Easy

## Approach
- Initialize a counter to track the number of steps.
- While the number is not `0`:
  - If it is even, divide it by `2`.
  - Otherwise, subtract `1`.
  - Increment the step counter.
- Return the total number of steps.

## Time Complexity
O(log₂ n)

## Space Complexity
O(1)

## Solution
See `solution.java`.