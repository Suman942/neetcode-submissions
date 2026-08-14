class Solution {
    val result = mutableListOf<List<Int>>()
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        nums.sort()
        val ans = mutableListOf<Int>()
        var i = 0
        subset(nums,ans,i)
        return result
    }

    fun subset(nums:IntArray,ans:MutableList<Int>,i:Int){
        if(i == nums.size){
            result.add(ans.toList())
            return
        }

        // include 
        ans.add(nums[i])
        subset(nums,ans,i+1)

        // backtrack
        ans.removeAt(ans.lastIndex)

        // check repeated elements
        var idx = i + 1
        while(idx < nums.size && nums[idx] == nums[i]){
            idx++
        }
        subset(nums,ans,idx)
    }
}
