class Solution {
    fun findPeakElement(nums: IntArray): Int {
        val n = nums.size
        if(n == 1)return 0

        var left = 0
        var right = n - 1

        while(left <= right){
            val mid = left +(right - left)/2

            if(mid == 0){
                if(nums[mid] > nums[mid + 1]) return mid
            }else if (mid == n -1){
                if(nums[mid] > nums[mid - 1]) return mid
            }else{
                if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]){
                    return mid
                }
            }

            if(nums[mid] < nums[mid + 1]){
                left = mid + 1
            }else{
                right = mid
            }
        }

        return left
    }
}
