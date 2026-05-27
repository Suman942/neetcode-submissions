class Solution {
    fun lengthOfLastWord(s: String): Int {
        val splitWord = s.trim().split(" ")
        val lastword = splitWord[splitWord.size - 1]
        return lastword.length
    }
}
