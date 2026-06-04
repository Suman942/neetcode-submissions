class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val result = IntArray(nums1.size)
        val stack = ArrayDeque<Int>()
        val map = mutableMapOf<Int,Int>()
        for(i in nums2){
            while(stack.isNotEmpty() && i > stack.last()){
                val removed = stack.removeLast()
                map[removed] = i
            }
            stack.addLast(i)
        }
       
        for(i in nums1.indices){
            result[i] = map[nums1[i]] ?: -1
        }
        return result
    }
}
