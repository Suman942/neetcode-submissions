class Solution {
    fun mySqrt(x: Int): Int {
        var l = 1
        var r = x

        while(l <= r){
            val mid = l + (r - l)/2
            val sq = mid.toLong() * mid

            if(sq == x.toLong()){
                return mid
            }
            if(sq > x){
                r = mid -1
            }else{
                l = mid + 1
            }
        }
        return r
    }
}
