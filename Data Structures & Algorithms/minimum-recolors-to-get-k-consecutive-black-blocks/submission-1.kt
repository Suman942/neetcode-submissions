class Solution {
    fun minimumRecolors(blocks: String, k: Int): Int {
        var count = 0
        var max = 0
        for(i in 0 until k){
            if(blocks[i] == 'W'){
                count++ //
            }
        }
        max = count
        var j = 0
        for(i in k until blocks.length){
            
            if(blocks[j] == 'W'){
                count--
            }
            j++

            if(blocks[i]== 'W'){
                count++
            }
             max = minOf(max,count)
        }
        return max
    }
}
