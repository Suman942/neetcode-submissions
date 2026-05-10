class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String,MutableList<String>>()
        for(str in strs){
            val arr = IntArray(26)
            for(ch in str){
                arr[ch - 'a']++
            }

            val key = arr.joinToString("#")
            map.getOrPut(key){mutableListOf()}.add(str)
        }

        return map.values.toList()
    }
}
