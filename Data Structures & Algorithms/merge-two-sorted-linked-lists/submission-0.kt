/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val node = ListNode(0)
        var current : ListNode? = node

        var i : ListNode? = list1
        var j : ListNode?= list2

        while(i != null && j != null){
            if(i.`val` < j.`val`){
                current?.next = i
                i = i.next
            }else{
                current?.next = j
                j = j.next
            }
            current = current?.next
        }
        if(i != null){
            current?.next = i 
        }
         if(j != null){
            current?.next = j
        }
        return node.next
    }
}
