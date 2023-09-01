package org.kilinochi.algorithms.array

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RemovingStarsFromAStringTest {


    @Test
    fun testCase1() {
        val input = "leet**cod*e"
        val res = RemovingStarsFromAString.removeStars(input)
        assertEquals("lecoe", res)
    }

    @Test
    fun testCase2() {
        val input = "erase*****"
        val res = RemovingStarsFromAString.removeStars(input)
        assertEquals("", res)
    }
}