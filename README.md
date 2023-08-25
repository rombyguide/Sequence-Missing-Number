# Finding a Missing Number in a Sequence

This task involves writing a function to find a missing number in a sequence of numbers.

## Task

Write a function that finds the first missing number in a sequence.

### Input

- Array `nums` - an array of integers representing the sequence. The array may contain positive, negative numbers, as well as zero.

### Output

- Integer - the first missing number in the sequence.

## Solution

To solve this task, the following algorithm is proposed:

1. Start by checking if the array is empty. Return -1 if the array is empty.

2. Create variables `min` and `max` to determine the range of numbers in the array, and create a HashSet `numSet` for fast number presence checking.

3. Iterate through the array of numbers, adding each number to `numSet` and updating `min` and `max`.

4. Then, iterate through the range from `min` to `max`, and find the first number missing in `numSet`.

5. If a missing number is found, return it. If no such number is found, return -1.

This solution efficiently finds the first missing number in the given sequence.

## Explanation

A detailed description of the algorithm is provided, which helps to find the missing number in a sequence. The `findMissingNumber` function code and usage examples demonstrate this algorithm in practice.
