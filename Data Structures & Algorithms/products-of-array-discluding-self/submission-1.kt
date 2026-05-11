class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val answer = IntArray(nums.size)

        var prefix = 1
        for(i in nums.indices){
            answer[i] = prefix
            prefix *= nums[i]
        }

        var suffix = 1
        for(i in nums.size - 1 downTo 0){
            answer[i] *= suffix
            suffix *= nums[i] 
        }

        return answer
    }
}
