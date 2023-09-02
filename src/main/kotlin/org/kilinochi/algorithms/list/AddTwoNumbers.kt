package org.kilinochi.algorithms.list

import java.math.BigInteger

object AddTwoNumbers {

    /// *
    // You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
    //
    // You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    //
    //
    //
    //  Example 1:
    //  Input: l1 = [2,4,3], l2 = [5,6,4]
    //  Output: [7,0,8]
    //  Explanation: 342 + 465 = 807.
    //
    //  Example 2:
    //  Input: l1 = [0], l2 = [0]
    //  Output: [0]
    //  Example 3:
    //
    //  Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    //  Output: [8,9,9,9,0,0,0,1]
    //
    //
    //  Constraints:
    //
    //  The number of nodes in each linked list is in the range [1, 100].
    //  0 <= Node.val <= 9
    //  It is guaranteed that the list represents a number that does not have leading zeros.
    //
    // * //

    fun addTwoNumbers(first: ListNode?, second: ListNode?): ListNode? {
        val sumFromFirst = reverseListAndSumNumbers(first)
        val sumFromSecond = reverseListAndSumNumbers(second)
        val resultSum = sumFromFirst + sumFromSecond

        val resultArray: CharArray = resultSum.toString().toCharArray()
        val resultStack: ArrayDeque<ListNode> = ArrayDeque()
        for(i in resultArray.indices) {
            val currentNode = ListNode(
                Character.getNumericValue(resultArray[i])
            )
            resultStack.addFirst(currentNode)
        }

        val resultNode: ListNode? = resultStack.firstOrNull()
        while (!resultStack.isEmpty()) {
            val currentNode = resultStack.removeFirst()
            val nextNode: ListNode? = resultStack.firstOrNull()
            currentNode.next = nextNode
        }

        return resultNode
    }

    private fun reverseListAndSumNumbers(head: ListNode?): BigInteger {
        val stackNumbers: ArrayDeque<String> = ArrayDeque()
        var previous: ListNode? = null
        var current: ListNode? = head
        while (current != null) {
            val next = current.next
            current.next = previous
            previous = current
            stackNumbers.addFirst(previous.`val`.toString())
            current = next
        }
        val stringBuilder = StringBuilder()
        while (!stackNumbers.isEmpty()) {
            stringBuilder.append(stackNumbers.removeFirst())
        }
        return stringBuilder.toString().toBigInteger()
    }

    data class ListNode(
        val `val`: Int,
        var next: ListNode? = null
    )
}