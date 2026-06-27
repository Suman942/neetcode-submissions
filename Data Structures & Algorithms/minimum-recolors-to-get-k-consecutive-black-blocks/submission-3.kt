class Solution {
    fun minimumRecolors(blocks: String, k: Int): Int {
        var count = 0
        var max = 0

        // calculate the count till K
        for(i in 0 until k){
            if(blocks[i] == 'W'){
                count++ 
            }
        }
        max = count
        // iterate afer k
        for(i in k until blocks.length){
          
            // add to right 
            if(blocks[i]== 'W'){
                count++
            }

            // remove left
            if(blocks[i - k] == 'W'){
                count--
            }

            // calculate minimum
            max = minOf(max,count)
        }
        return max
    }
}
