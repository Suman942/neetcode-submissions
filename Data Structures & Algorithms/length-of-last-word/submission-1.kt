class Solution {
    fun lengthOfLastWord(s: String): Int {
        // val splitWord = s.trim().split(" ")
        // val lastword = splitWord[splitWord.size - 1]
        // return lastword.length

        var count = 0
        for(i in s.length - 1 downTo 0){
            if(s[i] == ' ' && count > 0) break
            if(s[i] != ' ')count++
        }
        return count
    }
}
