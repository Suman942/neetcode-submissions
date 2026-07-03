class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val ans = IntArray(nums.size * 2)
        var j = nums.size -1
        for(i in 0 until nums.size){
            ans[i] = nums[i]
             j++
            ans[j] = nums[i]
        }
        
      

        return ans
    }
}
