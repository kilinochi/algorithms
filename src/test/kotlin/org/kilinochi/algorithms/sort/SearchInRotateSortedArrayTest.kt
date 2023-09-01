package org.kilinochi.algorithms.sort

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SearchInRotateSortedArrayTest {

    @Test
    fun testCase1() {
        val array: IntArray = intArrayOf(4, 5, 6, 7, 0, 1, 2)
        val searchIndex = SearchInRotateSortedArray.search(array, 0)
        assertEquals(4, searchIndex)
    }

    @Test
    fun testCase2() {
        val array: IntArray = intArrayOf(4, 5, 6, 7, 0, 1, 2)
        val searchIndex = SearchInRotateSortedArray.search(array, 3)
        assertEquals(-1, searchIndex)
    }

    @Test
    fun testCase3() {
        val array: IntArray = intArrayOf(1)
        val searchIndex = SearchInRotateSortedArray.search(array, 0)
        assertEquals(-1, searchIndex)
    }

    @Test
    fun testCase4() {
        val array: IntArray = intArrayOf(5, 1, 3)
        val searchIndex = SearchInRotateSortedArray.search(array, 3)
        assertEquals(2, searchIndex)
    }
}