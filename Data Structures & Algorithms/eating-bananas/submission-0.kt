class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var low = 1
        var high = piles.maxOrNull()!!
      
        while(low <= high){
            val mid = low + (high - low)/2
            var hour = 0
            // calculate total hours taken
            for(pile in piles){
                hour += (pile + mid - 1) / mid
            }
            // compare with h
            if(hour <= h){
                high = mid - 1
            }else{
               low = mid + 1
            }

        }

        return low
    }
}
