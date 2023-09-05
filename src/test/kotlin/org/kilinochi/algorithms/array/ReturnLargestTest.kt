package org.kilinochi.algorithms.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import org.kilinochi.algorithms.array.ReturnLargest.topKFrequent

class ReturnLargestTest {

    @Test
    fun testCase1() {
        val array: IntArray = intArrayOf(1, 1, 1, 2, 2, 3)
        val res = topKFrequent(array, 2)
        assertArrayEquals(intArrayOf(1, 2), res)
    }

    @Test
    fun testCase2() {
        val array: IntArray = intArrayOf(1)
        val res = topKFrequent(array, 1)
        assertArrayEquals(intArrayOf(1), res)
    }

    @Test
    fun testCase3() {
        val array: IntArray = intArrayOf(1, 2, 2, 3, 3)
        val res = topKFrequent(array, 2)
        assertArrayEquals(intArrayOf(2, 3), res)
    }
}
