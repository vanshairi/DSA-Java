# 2520. Count the Digits That Divide a Number

## Problem
Given an integer `num`, return the number of digits in `num` that evenly divide `num`.

## Difficulty
Easy

## Approach
- Store the original number for future divisibility checks.
- Traverse each digit of the number.
- Check if the original number is divisible by the current digit.
- Count every digit that divides the number evenly.
- Return the total count.

## Time Complexity
O(log₁₀ n)

## Space Complexity
O(1)

## Solution
See `solution.java`.