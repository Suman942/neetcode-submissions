class Solution {
    fun maxArea(heights: IntArray): Int {
        var i = 0
        var j = heights.size - 1
        var maxWater = 0
        while(i < j){
            var w = j - i
            var h = 0
            if(heights[i] < heights[j]){
                h = heights[i]
                i++
            }else{
                h = heights[j]
                j--
            }
            val area = h * w
            maxWater = maxOf(maxWater, area)
        }

        return maxWater
    }
}
