class MyQueue() {
    val stack1 =  ArrayDeque<Int>()
    val stack2 = ArrayDeque<Int>()

    fun push(x: Int) {
        stack1.addLast(x)
    }

    fun pop(): Int {
        transfer()
        return stack2.removeLast()
    }

    fun peek(): Int {
        transfer()
        return stack2.last()
    }

    fun empty(): Boolean {
        return stack1.isEmpty() && stack2.isEmpty()
    }

    private fun transfer(){
        if(stack2.isEmpty()){
            while(stack1.isNotEmpty()){
                stack2.addLast(stack1.removeLast())
            }
        }
    }
}
