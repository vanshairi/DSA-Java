# 1523. Count Odd Numbers in an Interval Range

## Problem
Given two non-negative integers `low` and `high`, return the count of odd numbers between `low` and `high` (inclusive).

## Difficulty
Easy

## Approach
- Check whether `low` is odd or even.
- Start from the first odd number in the range.
- Iterate through the range by incrementing by `2`.
- Count each odd number encountered.

## Time Complexity
O(high − low)

## Space Complexity
O(1)

## Solution
See `bruteforce.java`.