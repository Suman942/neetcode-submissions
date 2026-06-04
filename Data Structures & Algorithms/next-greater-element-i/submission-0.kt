class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val result = IntArray(nums1.size)
        for(i in nums1.indices){
            var found = false
            var answer = -1

            for(j in nums2.indices){
                if(nums2[j] == nums1[i]){
                    found = true
                }
                if(found && nums2[j] > nums1[i]){
                    answer = nums2[j]
                    break
                }
            }
            result[i] = answer
        }

        return result
    }
}
