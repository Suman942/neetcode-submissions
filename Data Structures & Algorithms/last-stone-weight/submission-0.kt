class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val heap = PriorityQueue<Int>(compareByDescending{it})

        for(stone in stones){
            heap.add(stone)
        }

        while(heap.size > 1){
            val first = heap.poll()
            val second = heap.poll()

            if(first != second){
                heap.add(first - second)
            }
        }

        return heap.peek() ?: 0
    }
}
