package org.kilinochi.algorithms.tree

object IsValidBST {

    // *
    // Given the root of a binary tree, determine if it is a valid binary search tree (BST).
    //
    //  A valid BST is defined as follows:
    //
    //  The left subtree of a node contains only nodes with keys less than the node's key.
    //  The right subtree of a node contains only nodes with keys greater than the node's key.
    //  Both the left and right subtrees must also be binary search trees.
    //
    //  Example 1:
    //  Input: root = [2,1,3]
    //  Output: true
    //
    //  Example 2:
    //  Input: root = [5,1,4,null,null,3,6]
    //  Output: false
    //  Explanation: The root node's value is 5 but its right child's value is 4.
    // * //
    fun isValidBST(root: TreeNode?): Boolean {
        return isValidBST(root, null, null)
    }

    private fun isValidBST(node: TreeNode?, left: Int?, right : Int?): Boolean {
        if (node == null) {
            return true
        }

        //  If the current node is null then return true
        //  If the value of the left child of the node is greater than or equal to the current node then return false
        //  If the value of the right child of the node is less than or equal to the current node then return false
        //  If the left subtree or the right subtree is not a BST then return false
        //  Else return true

        if (left != null && node.`val` <= left || right != null && node.`val` >= right)
            return false

        return isValidBST(node.left, left, node.`val`) && isValidBST(node.right, node.`val`, right)
    }

    // *
    //  Time complexity: 206 ms
    //  Space complexity: 37.3 MB
    // * //

    data class TreeNode(
        val `val`: Int
    ) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}