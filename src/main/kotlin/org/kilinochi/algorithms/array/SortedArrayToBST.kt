package org.kilinochi.algorithms.array

object SortedArrayToBST {

    // *
    //  Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced BST
    //
    //  Example 1:
    //  Input: nums = [-10,-3,0,5,9]
    //  Output: [0,-3,9,-10,null,5]
    //  Explanation: [0,-10,5,null,-3,null,9] is also accepted
    //
    //  Example 2:
    //  Input: nums = [1,3]
    //  Output: [3,1]
    //  Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
    // * //
    fun sortedArrayToBST(sortedArray: IntArray): TreeNode? {
        if (sortedArray.isEmpty()) return null

        val mid = sortedArray.size / 2

        val root = TreeNode(sortedArray[mid])
        val leftArray = sortedArray.sliceArray(0..< mid)
        val rightArray = sortedArray.sliceArray(mid + 1..< sortedArray.size)

        root.left = sortedArrayToBST(leftArray)
        root.right = sortedArrayToBST(rightArray)

        return root
    }

    // *
    //  Time complexity: 181 ms
    //  Space complexity: 37.4 MB
    // * //

    data class TreeNode(
        val `val`: Int
    ) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}