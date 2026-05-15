class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val arr = IntArray(26)
        var left = 0
        var maxFreq = 0
        var result = 0

        for(right in s.indices){
            // store frequency
           arr[s[right] - 'A']++ 
            // get max frequency
            maxFreq = maxOf(maxFreq,arr[s[right] - 'A'])
            // window size
            var windowSize = right - left + 1

            if(windowSize - maxFreq > k){
                arr[s[left] - 'A']--
                left++
            }
            result = maxOf(result,right - left + 1)
        }

        return result
    }
}
