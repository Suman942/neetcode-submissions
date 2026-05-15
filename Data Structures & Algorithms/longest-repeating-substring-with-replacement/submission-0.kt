class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val map = mutableMapOf<Char,Int>()
        var left = 0
        var maxFreq = 0
        var result = 0

        for(right in s.indices){
            // store frequency
            map[s[right]] = map.getOrDefault(s[right],0) + 1 
            // get max frequency
            maxFreq = maxOf(maxFreq,map[s[right]]!!)
            // window size
            var windowSize = right - left + 1

            while(windowSize - maxFreq > k){
                map[s[left]] = map.getOrDefault(s[left],0) - 1
                left++
                windowSize = right - left + 1
            }
            result = maxOf(result,windowSize)
        }

        return result
    }
}
