class MyHashSet() {
    val size = 769
    val table = Array<Node?>(size){null}
    
    fun add(key: Int) {
        val index = key % size

        if(table[index] == null){
            table[index] = Node(key)
            return
        }

        var current = table[index]
        while(current != null){
            if(current.key == key) return
            if(current.next == null){
                current.next = Node(key)
                return
            }
            current = current.next
        }
    }

    fun remove(key: Int) {
        val index = key % size
        var current = table[index] ?: return
        if(current.key == key){
            table[index] = current.next
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

    fun contains(key: Int): Boolean {
        val index = key % size
        var current = table[index]
        while(current != null){
            if(current.key == key){
                return true
            }
            current = current.next
        }
        return false
    }
}
class Node(val key:Int,var next:Node?=null)

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
