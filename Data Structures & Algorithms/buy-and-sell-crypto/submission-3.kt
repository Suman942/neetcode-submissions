class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var minPrice = prices[0]

        for(i in 1 until prices.size){
            minPrice = minOf(minPrice,prices[i])
            maxProfit = maxOf(maxProfit,prices[i] - minPrice)
        }
        return maxProfit
    }
}
