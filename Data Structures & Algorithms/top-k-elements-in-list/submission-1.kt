class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val ans = mutableListOf<Int>()
        val map = mutableMapOf<Int,Int>()
        for(i in nums){
            map[i] = map.getOrDefault(i,0) + 1
        }

        val bucket = Array(nums.size + 1){mutableListOf<Int>()}
        
        for((key,value) in map){
            bucket[value].add(key)
        }

        for(i in bucket.lastIndex downTo 0){
            
            for (j in bucket[i]){
                ans.add(j)
                if(ans.size == k){
                    return ans.toIntArray()
                }
            }
        }

        return ans.toIntArray()
    }
}
