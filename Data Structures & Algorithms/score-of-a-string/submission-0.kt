class Solution {
    fun scoreOfString(s: String): Int {
        var i = 0
        var j = 1
        var sum = 0
        while(j < s.length){
            val a = s[i].toInt()
            val b = s[j].toInt()
            val mod = abs(a - b)
            sum += mod
            i++
            j++
        }
        return sum
    }
}
