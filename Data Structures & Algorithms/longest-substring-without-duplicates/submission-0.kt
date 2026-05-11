class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val set = mutableSetOf<Char>()
        var j = 0
        var max = 0
        for(i in s.indices){

            while(set.contains(s[i])){
                set.remove(s[j])
                j++
            }

            set.add(s[i])

            max = maxOf(max,i -j + 1)
        }

        return max
    }
}
