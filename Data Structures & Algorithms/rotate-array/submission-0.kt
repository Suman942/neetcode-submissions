class Solution {
    fun rotate(nums: IntArray, k: Int) {
        val n = nums.size
        val shift = k % n
        var arr = IntArray(n)
        var j = 0
        for(i in nums.size - shift until nums.size){
            arr[j] = nums[i]
            j++
        }

        for(i in 0 until nums.size - shift){
            arr[j] = nums[i]
            j++
        }

        for (i in nums.indices){
            nums[i] = arr[i]
        }
    }
}
