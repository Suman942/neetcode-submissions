class Solution {
    fun isValid(s: String): Boolean {
        val map = mapOf(
            ')' to '(',
            '}' to '{',
            ']' to '['
        )
        val stack = ArrayDeque<Char>()

        for(ch in s){
            when(ch){
                '(','{','[' -> stack.push(ch)
                else->{
                    if(stack.isEmpty()){
                        return false
                    }

                    val top = stack.pop()
                    if(top != map[ch]!!){
                        return false
                    }
                }

            }
        }
        return stack.isEmpty()
    }
}
