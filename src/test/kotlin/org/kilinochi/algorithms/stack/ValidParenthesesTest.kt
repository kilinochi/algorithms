package org.kilinochi.algorithms.stack

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ValidParenthesesTest {

    @Test
    fun testCase1() {
        val valid = ValidParentheses.isValid("()")
        assertTrue(valid)
    }

    @Test
    fun testCase2() {
        val valid = ValidParentheses.isValid("()[]{}")
        assertTrue(valid)
    }

    @Test
    fun testCase3() {
        val valid = ValidParentheses.isValid("(]")
        assertFalse(valid)
    }

    @Test
    fun testCase4() {
        val valid = ValidParentheses.isValid("()]")
        assertFalse(valid)
    }
}
