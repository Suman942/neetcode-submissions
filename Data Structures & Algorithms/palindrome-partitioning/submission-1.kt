class Solution {
    fun partition(s: String): List<List<String>> {
        val partition = mutableListOf<String>()
        val answer = mutableListOf<List<String>>()

        helper(s,partition,answer)

        return answer
    }

    fun helper(s:String,partition:MutableList<String>,answer:MutableList<List<String>>){
        if(s.length == 0){
            answer.add(partition.toList())
            return 
        }
        for(i in 0 until s.length){
            val part = s.substring(0,i+1)
            if(isPalin(part)){
                partition.add(part)
                helper(s.substring(i+1),partition,answer)
                partition.removeAt(partition.lastIndex)
            }
        }
    }

    fun isPalin(str:String):Boolean{
        var i = 0
        var j = str.length - 1
        while(i < j){
            if(str[i] != str[j]){
                return false
            }
            i++
            j--
        }
        return true
    }
}
