package leetcode.editor.en._longest_palindromic_substring

// [5]Longest Palindromic Substring

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    fun longestPalindrome(s: String): String {
        var result = ""
        for (index in s.indices) {
            val s1 = palindrome(s, index, index)
            val s2 = palindrome(s, index, index + 1)
            result = if (result.length > s1.length) result else s1
            result = if (result.length > s2.length) result else s2
        }
        return result
    }

    fun palindrome(s: String, start: Int, end: Int): String {
        var startIndex = start
        var endIndex = end
        while (startIndex >= 0 && endIndex < s.length && s[startIndex] == s[endIndex]) {
            startIndex--
            endIndex++
        }
        return s.substring(startIndex + 1, endIndex)
    }


//    fun longestPalindrome(s: String): String {
//        var start = 0
//
//        var max = ""
//        var maxLength = max.length
//
//        while (start < s.length && maxLength < s.length - start) {
//            var end = s.length
//            while (start < end && maxLength < end - start) {
//                if (isPalindrome(s, start, end)) {
//                    max = s.substring(start, end)
//                    maxLength = max.length
//                }
//                end--
//            }
//            start++
//        }s
//        return max
//    }
//
//    private fun isPalindrome(s: String, start: Int, end: Int): Boolean {
//        val interval = end - start
//        for (index in 0 until interval) {
//            if (s[start + index] != s[end - index - 1]) {
//                return false
//            }
//        }
//        return true
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
