class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val map = HashMap<Int,Boolean>()
        for(num in nums){
            map[num]= false
        }

        var max = 0

        for(num in nums){
            var count = 1
            var next = num + 1
            while(map.containsKey(next) && map[next]!! == false){
                count++
                map[next] = true
                next++
            }

            var prev = num - 1
            while(map.containsKey(prev) && map[prev]!! == false){
                count++
                map[prev] = false
                prev--
            }

            max = maxOf(max,count)
        }
        return max
    }
}
