class Solution {
    fun combinationSum(nums: IntArray, target: Int): List<List<Int>> {
            val combine = mutableListOf<Int>()
            val ans = mutableListOf<List<Int>>()

            helper(nums,0,combine,ans,target)

            return ans.toList()
    }

    fun helper(arr:IntArray,i:Int,combine:MutableList<Int>,answer:MutableList<List<Int>>,target:Int){
        // base
        if(i == arr.size || target < 0){
            return
        }

        if(target == 0){
            if(!answer.contains(combine.toList())){
                answer.add(combine.toList())
            }
            return
        }

        // single inclusion choice
        combine.add(arr[i])
        helper(arr,i+1,combine,answer,target - arr[i])

        // multiple includion choice
        helper(arr,i,combine,answer,target - arr[i])

        // exclusion choice
        //-> backtrack to previous state
        combine.removeAt(combine.lastIndex)
        helper(arr,i+1,combine,answer,target)

    }
}
