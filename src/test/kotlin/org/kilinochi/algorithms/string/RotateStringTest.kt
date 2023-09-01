package org.kilinochi.algorithms.string

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RotateStringTest {

    @Test
    fun testCase1() {
        val isRotate = RotateString.isRotate("abcde", "cdeab")
        assertTrue(isRotate)
    }

    @Test
    fun testCase2() {
        val isRotate = RotateString.isRotate("abcde", "abced")
        assertFalse(isRotate)
    }
}