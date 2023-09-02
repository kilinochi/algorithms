package org.kilinochi.algorithms.list

import org.junit.jupiter.api.Test
import org.kilinochi.algorithms.list.AddTwoNumbers.ListNode
import org.kilinochi.algorithms.list.AddTwoNumbers.addTwoNumbers
import kotlin.test.assertEquals

class AddTwoNumbersTest {

    @Test
    fun testCase1() {

        val node1 = ListNode(2)
        val node2 = ListNode(4)
        val node3 = ListNode(3)

        node1.next = node2
        node2.next = node3

        val node4 = ListNode(5)
        val node5 = ListNode(6)
        val node6 = ListNode(4)

        node4.next = node5
        node5.next = node6

        val result = addTwoNumbers(node1, node4)
        assertEquals(7, result?.`val`)
    }

    @Test
    fun testCase2() {
        val node1 = ListNode(0)
        val node4 = ListNode(0)

        val result = addTwoNumbers(node1, node4)
        assertEquals(0, result?.`val`)
    }
}