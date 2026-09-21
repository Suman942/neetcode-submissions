class Solution {
    fun stringMatching(words: Array<String>): List<String> {
        val list = mutableListOf<String>()
        for(i in words.indices){
            for(j in words.indices){
                if(i != j){
                    if(words[j].contains(words[i])){
                        list.add(words[i])
                        break
                    }
                }
            }
        }

        return list
    }
}
