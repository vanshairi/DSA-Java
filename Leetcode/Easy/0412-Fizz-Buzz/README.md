# 412. Fizz Buzz

## Problem
Given an integer `n`, return a string array where:
- `"Fizz"` is used for numbers divisible by `3`.
- `"Buzz"` is used for numbers divisible by `5`.
- `"FizzBuzz"` is used for numbers divisible by both `3` and `5`.
- Otherwise, use the number itself as a string.

## Difficulty
Easy

## Approach
- Iterate through the numbers from `1` to `n`.
- Check divisibility by `3` and `5`.
- Add the appropriate string (`"Fizz"`, `"Buzz"`, `"FizzBuzz"`, or the number as a string) to the result array.
- Convert the array to a list and return it.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Solution
See `solution.java`.