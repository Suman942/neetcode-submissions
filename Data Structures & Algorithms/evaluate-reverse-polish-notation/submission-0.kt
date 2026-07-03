class Solution {
    fun evalRPN(tokens: Array<String>): Int {
    var stack = ArrayDeque<Int>()    
    for(i in tokens.indices){

        if(isOper(tokens[i])){
                val a = stack.removeLast()
                val b = stack.removeLast()
                
               val result =  when(tokens[i]){
                    "+" ->{a+b}
                    "-"->{b-a}
                    "/"->{b/a}
                    "*"->{a*b}
                    else -> 0
                }
                stack.addLast(result)
            
        }else{
            stack.addLast(tokens[i].toInt())
        }
    }
    
        return stack.removeLast()
    }

    fun isOper(item:String):Boolean{
        return item in "+*-/"
    }
}
