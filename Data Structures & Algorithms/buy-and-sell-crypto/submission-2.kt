class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var maxProfit = 0
        var minPrice = prices[0]

        for(i in 1 until prices.size){
            minPrice = minOf(minPrice,prices[i])
            profit = prices[i] - minPrice
            maxProfit = maxOf(maxProfit,profit)
        }
        return maxProfit
    }
}
