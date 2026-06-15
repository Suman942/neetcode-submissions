class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var result = 0
        var count = 0
        for(num in nums){
            if(num == 1){
                count++
            }else{
                count = 0
            }
       
            result = maxOf(result,count)

        }
        

        return result
    }
}
