class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val i = 0
        val ans = mutableListOf<List<Int>>()
        getPermutation(nums,i,ans)

        return ans
    }

    fun getPermutation(nums:IntArray,idx:Int,ans:MutableList<List<Int>>){
    if(idx == nums.size){
       // need to add answer here
        ans.add(nums.toList())
             return
    }
    
    for(i in idx until nums.size){
        swap(nums,idx,i)
        getPermutation(nums,idx+1,ans)
        
 		swap(nums,idx,i)
    }
    
    }
    fun swap(nums:IntArray,i:Int,j:Int){
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}