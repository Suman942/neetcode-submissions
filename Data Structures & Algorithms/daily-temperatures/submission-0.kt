class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        var result = IntArray(temperatures.size)

        for(i in temperatures.indices){
            while(stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]){
                val prevIdx = stack.removeLast()
                result[prevIdx] = i - prevIdx
            }
            stack.addLast(i)
        }

        return result
    }
}
