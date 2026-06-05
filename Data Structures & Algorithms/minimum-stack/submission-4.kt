class MinStack() {
    val stack = ArrayDeque<Long>()
    var minValue = Long.MAX_VALUE

    fun push(`val`: Int) {
        val x = `val`.toLong()
        if(stack.isEmpty()){
            stack.addLast(x)
            minValue = x
        }else if (x < minValue){
            stack.addLast(2 * x - minValue)
            minValue = x
        }else{
            stack.addLast(x)
        }
    }

    fun pop() {
       if(stack.last() < minValue){
        minValue = 2 * minValue - stack.last()
       }
       stack.removeLast()
    }

    fun top(): Int {
        if(stack.last() < minValue){
            return minValue.toInt()
        }else{
            return stack.last().toInt()
        }
    }

    fun getMin(): Int {
        return minValue.toInt()
    }
}
