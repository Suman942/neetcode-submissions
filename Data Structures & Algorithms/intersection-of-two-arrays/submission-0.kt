class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set = mutableSetOf<Int>()
        nums2.sort()
        for(num in nums1){
            var l = 0
            var r = nums2.size -1
            while(l <= r){
                val mid =l+ (r - l)/2
                if(nums2[mid] == num){
                    set.add(num)
                    break
                }
                if(nums2[mid] < num){
                    l = mid + 1
                }else{
                    r = mid - 1
                }

            }
        }

        return set.toIntArray()
    }
}
