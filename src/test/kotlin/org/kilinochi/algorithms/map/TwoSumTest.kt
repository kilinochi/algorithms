package org.kilinochi.algorithms.map

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TwoSumTest {

    @Test
    fun testCase1() {
        val array: IntArray = intArrayOf(2, 7, 11, 15)
        val res = TwoSum.twoSum(array, 9)
        assertArrayEquals(intArrayOf(0, 1), res)
    }
}