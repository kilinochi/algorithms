package org.kilinochi.algorithms.sort

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SearchInSortedArrayTest {

    @Test
    fun testCase1() {
        val array: IntArray = intArrayOf(0, 1, 2, 4, 5, 6, 7)
        val searchIndex = SearchInSortedArray.search(array, 0)
        assertEquals(0, searchIndex)
    }

    @Test
    fun testCase2() {
        val array: IntArray = intArrayOf(0, 1, 2, 4, 5, 6, 7)
        val searchIndex = SearchInSortedArray.search(array, 3)
        assertEquals(-1, searchIndex)
    }

    @Test
    fun testCase3() {
        val array: IntArray = intArrayOf(1)
        val searchIndex = SearchInSortedArray.search(array, 1)
        assertEquals(0, searchIndex)
    }

    @Test
    fun testCase4() {
        val array: IntArray = intArrayOf(1, 3, 5)
        val searchIndex = SearchInSortedArray.search(array, 3)
        assertEquals(1, searchIndex)
    }
}
