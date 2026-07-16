class Solution {
    fun findMin(nums: IntArray): Int {
        val n = nums.size
        var left = 0
        var right = n -1

        while(left < right){
            val mid = left + (right - left)/2
            if(nums[mid] > nums[right]){
                left = mid + 1
            }else{
                right = mid
            }

            if(left == right){
                return nums[left]
            }
        }

        return nums[left]
    }
}
