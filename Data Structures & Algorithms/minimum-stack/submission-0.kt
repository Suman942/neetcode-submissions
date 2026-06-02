class MinStack() {
    val stack = ArrayDeque<Pair<Int,Int>>()
    fun push(`val`: Int) {
        if(stack.isEmpty()){
            stack.addLast(`val` to `val`)
        }else{
            val minValue = minOf(`val`,stack.last().second)
            stack.addLast(`val` to minValue)
        }
    }

    fun pop() {
        stack.removeLast()
    }

    fun top(): Int {
       return stack.last().first
    }

    fun getMin(): Int {
        return stack.last().second
    }
}
