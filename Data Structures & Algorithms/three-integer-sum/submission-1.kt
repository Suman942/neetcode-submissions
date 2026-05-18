class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = mutableListOf<List<Int>>()
        for(i in nums.indices){
            if(i > 0 && nums[i] == nums[i -1]) continue
            var j = i+1
            var k = nums.size - 1 
            while(j < k){
                val sum = nums[i] + nums[j] + nums[k]

                when{
                    sum > 0 -> k--
                    sum < 0 -> j++
                    else -> {
                        val list = mutableListOf<Int>()
                        list.add(nums[i])
                        list.add(nums[j])
                        list.add(nums[k])

                        result.add(list)
                            j++
                            k--

                         while(j < k && nums[j] == nums[j -1]){
                            j++
                        }
                    }
                }

               
            }
        }

        return result
    }
}
