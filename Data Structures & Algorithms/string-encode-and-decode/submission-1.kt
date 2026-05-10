class Solution {

    fun encode(strs: List<String>): String {
        val encodedStr = StringBuilder()

        for(str in strs){
            encodedStr.append(str.length)
            encodedStr.append("#")
            encodedStr.append(str)
        }
        return encodedStr.toString()
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0
        while(i < str.length){
            var j = i
            while(str[j] != '#'){
                j++
            }

            val length  = str.substring(i,j).toInt()
            val start = j+1
            val end = start + length

            val word = str.substring(start,end)
            result.add(word)
            i = end
        }
        return result
    }
}
