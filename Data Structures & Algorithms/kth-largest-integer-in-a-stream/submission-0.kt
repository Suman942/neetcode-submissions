class KthLargest(k: Int, nums: IntArray) {
    val heap = PriorityQueue<Int>()
    val limit = k
    init{
        for(num in nums){
            heap.add(num)

            if(heap.size > limit){
                heap.poll()
            }
        }
    }
    fun add(`val`: Int): Int {
        heap.add(`val`)

        if(heap.size > limit){
            heap.poll()
        }

        return heap.peek()
    }
}
