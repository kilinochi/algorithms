package org.kilinochi.algorithms.sort

object SearchInSortedArray {

    // *
    // Given an array of integers nums which is sorted in ascending order, and an integer target,
    // write a function to search target in nums.
    // If target exists, then return its index. Otherwise, return -1.
    //
    // You must write an algorithm with O(log n) runtime complexity.
    //
    //
    //
    // Example 1:
    //
    // Input: nums = [-1,0,3,5,9,12], target = 9
    // Output: 4
    // Explanation: 9 exists in nums and its index is 4
    // Example 2:
    //
    // Input: nums = [-1,0,3,5,9,12], target = 2
    // Output: -1
    // Explanation: 2 does not exist in nums so return -1
    //
    // * //

    fun search(array: IntArray, target: Int): Int {
        if (array.size == 1 && array[0] == target) {
            return 0
        } else if (array.size == 1) {
            return -1;
        }

        var left = array[0]
        var right = array.size - 1

        while (left <= right) {
            val middleIndex = left  + ((right - left) / 2)

            if (array[middleIndex] == target) {
                return middleIndex
            } else if (array[middleIndex] < target) { // ищем справа
                left = middleIndex + 1
            } else if (array[middleIndex] > target) { // ищем слева
                right = middleIndex - 1
            }
        }

        return -1
    }

    // *
    //  Time complexity: 0 ms
    //  Space complexity: 44,9 MB
    // * //
}