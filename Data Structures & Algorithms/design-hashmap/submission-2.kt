class MyHashMap() {
   val size = 769
   val bucket = Array<Node?>(size){null}

    fun put(key: Int, value: Int) {
       val index = getHash(key)
       if(bucket[index] == null){
        bucket[index] = Node(key,value)
        return
       }
       var current = bucket[index]
       while(current != null){
        if(current.key == key){
            current.value = value
            return
        }

        if(current.next == null){
            current.next = Node(key,value)
            return
        }

        current = current.next
       }
    }

    fun get(key: Int): Int {
        val index = getHash(key)
        var current = bucket[index] 

        while(current != null){

        if(current.key == key) { return current.value}

        current = current.next!!
       }

       return -1
    }

    fun remove(key: Int) {
       val index = getHash(key)
       var current = bucket[index] ?: return
       if(current.key == key){
        bucket[index] = current?.next
        return
       }

       while(current.next != null){
        if(current.next?.key == key){
            current.next = current?.next?.next
            return
        }
        current = current.next!!
       }
    }

    private fun getHash(key:Int):Int{
        return key % size
    }
}

class Node(val key:Int,var value:Int){
    var next : Node? = null
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */
