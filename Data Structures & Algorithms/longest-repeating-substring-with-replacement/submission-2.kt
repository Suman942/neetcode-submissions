class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val arr = IntArray(26)
        var left = 0
        var maxFreq = 0
        var result = 0

        for(right in s.indices){
            // store frequency of new character
           arr[s[right] - 'A']++ 
            // store the max frequency of new character
            maxFreq = maxOf(maxFreq,arr[s[right] - 'A'])
            // window size
            var windowSize = right - left + 1
            /* 
            1. how many replacement needed = windowSize - frequency
            2. if replacement is greater then frequency then shrink window from left
            */
            if(windowSize - maxFreq > k){
                arr[s[left] - 'A']--
                left++
            }
            // record the maximum window valid size
            result = maxOf(result,right - left + 1)
        }

        return result
    }
}
