# 58. Length of Last Word

## Problem
Given a string `s` consisting of words and spaces, return the length of the last word.

## Difficulty
Easy

## Approach
- Remove the leading and trailing spaces using `trim()`.
- Find the index of the last space using `lastIndexOf()`.
- Calculate the length of the last word by subtracting the last space index from the string length.
- Return the calculated length.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Solution
See `solution.java`.