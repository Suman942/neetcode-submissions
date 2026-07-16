class Solution {
    fun check(nums: IntArray): Boolean {
        var drop = 0
        for(i in nums.indices){
            if(nums[i] > nums[(i+1) % nums.size]){
                drop++
            }
        }

        return drop <= 1
    }
}