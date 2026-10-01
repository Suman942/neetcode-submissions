class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val nums = cost
        val dp = Array(nums.size){-1}
        val result = minOf(minCost(nums,0,dp), minCost(nums,1,dp))

        return result
    }

    fun minCost(nums:IntArray,i:Int,dp:Array<Int>):Int{
        val n = nums.size
        
        if(i >= n) return 0
        
        if(dp[i] != -1){
            return dp[i]
        }
        
        val one = minCost(nums,i+1,dp)
        val two = minCost(nums,i+2,dp)
        
        dp[i] = nums[i] + minOf(one,two)
        
        return dp[i]
    }
}
