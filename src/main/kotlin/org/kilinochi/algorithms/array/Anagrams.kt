package org.kilinochi.algorithms.array

object Anagrams {

    // **
    //  Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
    //
    //  An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    //
    //
    //
    //  Example 1:
    //
    //  Input: s = "cbaebabacd", p = "abc"
    //  Output: [0,6]
    //  Explanation:
    //  The substring with start index = 0 is "cba", which is an anagram of "abc".
    //  The substring with start index = 6 is "bac", which is an anagram of "abc".
    //
    //  Example 2:
    //
    //  Input: s = "abab", p = "ab"
    //  Output: [0,1,2]
    //  Explanation:
    //  The substring with start index = 0 is "ab", which is an anagram of "ab".
    //  The substring with start index = 1 is "ba", which is an anagram of "ab".
    //  The substring with start index = 2 is "ab", which is an anagram of "ab".
    //
    // * //

    fun findAllAnagramsInAString(input: String, word: String): List<Int> {
        return emptyList()
//        val wordAsCharArray = word.toCharArray()
//        wordAsCharArray.sort()
//
//        val wordSize = wordAsCharArray.size
//        val inputCharArray = input.toCharArray()
//
//        for (i in inputCharArray.indices) {
//             if (inputCharArray[i] )
//        }
    }

    private fun isAnagram(input: String, sortedWord: CharArray): Boolean {
        val inputCharArray = input.toCharArray()
        inputCharArray.sort()
        return inputCharArray.contentEquals(sortedWord)
    }
}