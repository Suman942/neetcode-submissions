class Solution {
    val result = mutableListOf<List<Int>>()
    fun subsets(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<Int>()
        val i = 0
        subset(nums,ans,i)

        return result
    }

    fun subset(nums:IntArray,ans:MutableList<Int>,i :Int){
        if(i == nums.size){
            result.add(ans.toList())
            return
        }

        // add 
        ans.add(nums[i])

        // include
        subset(nums,ans,i+1)

        // backtrack
        ans.removeAt(ans.lastIndex)

        // exclude
        subset(nums,ans,i+1)
    }
}
