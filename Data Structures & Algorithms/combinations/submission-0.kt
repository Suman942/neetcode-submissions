class Solution {
    val result = mutableListOf<List<Int>>()
    fun combine(n: Int, k: Int): List<List<Int>> {
        val nums = IntArray(n)
        var j = 0
        for(i in 1 until n+1){
            nums[j] = i
            j++
        }
        val ans = mutableListOf<Int>()
        val i = 0
        subset(nums,ans,i,k)
        return result
    }

    fun subset(nums:IntArray,ans:MutableList<Int>,i:Int,k:Int){
        if(ans.size == k){
            result.add(ans.toList())
            return
        }

        if(i == nums.size){
            return
        }

        ans.add(nums[i])
        subset(nums,ans,i+1,k)
        ans.removeAt(ans.lastIndex)
        subset(nums,ans,i+1,k)

    }
}