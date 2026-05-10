class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int,Int>()

        for( i in nums.indices){
            val compliment = target - nums[i]

            if(map.containsKey(compliment)){
                return intArrayOf(map[compliment]!!,i)
            }

            map[nums[i]] = i
        }

        return intArrayOf()
    }
}
