package org.kilinochi.algorithms.array

object ReturnLargest {

    // *
    // Given an integer array nums and an integer k, return the k most frequent elements.
    // You may return the answer in any order.
    //
    // Example 1:
    //
    // Input: nums = [1,1,1,2,2,3], k = 2
    // Output: [1,2]
    // Example 2:
    //
    // Input: nums = [1], k = 1
    // Output: [1]
    //
    //
    // *
    fun topKFrequent(array: IntArray, numberK: Int): IntArray {
        val resMap: MutableMap<Int, Int> = mutableMapOf()

        for (i in array.indices) {
            if (resMap.containsKey(array[i])) {
                var count = resMap.getValue(array[i])
                count += 1
                resMap[array[i]] = count
            } else {
                resMap[array[i]] = 1
            }
        }

        return resMap.toList()
            .sortedByDescending { it.second }
            .map { it.first }
            .take(numberK)
            .toIntArray()
    }

    private fun findLargest(array: IntArray): Int {
        val resMap: MutableMap<Int, Int> = mutableMapOf()

        for (i in array.indices) {
            if (resMap.containsKey(array[i])) {
                var count = resMap.getValue(array[i])
                count += 1
                resMap[array[i]] = count
            } else {
                resMap[array[i]] = 1
            }
        }

        var maxValue = 0
        var maxKey = 0
        val resEntries = resMap.entries
        for (resEntry in resEntries) {
            val key = resEntry.key
            val value = resEntry.value
            if (value > maxValue) {
                maxValue = value
                maxKey = key
            }
        }
        return maxKey
    }
}