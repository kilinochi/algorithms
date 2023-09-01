package org.kilinochi.algorithms.stack

object ValidParentheses {

    // *
    // Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    //
    //  An input string is valid if:
    //
    //  Open brackets must be closed by the same type of brackets.
    //  Open brackets must be closed in the correct order.
    //  Every close bracket has a corresponding open bracket of the same type.
    //
    //
    //  Example 1:
    //
    //  Input: s = "()"
    //  Output: true
    //  Example 2:
    //
    //  Input: s = "()[]{}"
    //  Output: true
    //  Example 3:
    //
    //  Input: s = "(]"
    //  Output: false
    //
    // * //

    fun isValid(s: String): Boolean {

        val stack: ArrayDeque<Char> = ArrayDeque()
        for (c in s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.addFirst(c)
            } else if (c == ')' && !stack.isEmpty() && stack.firstOrNull() == '(') {
                stack.removeFirst()
            } else if (c == '}' && !stack.isEmpty() && stack.firstOrNull() == '{') {
                stack.removeFirst()
            } else if (c == ']' && !stack.isEmpty() && stack.firstOrNull() == '[') {
                stack.removeFirst()
            } else {
                return false
            }
        }
        return stack.isEmpty()
    }
}