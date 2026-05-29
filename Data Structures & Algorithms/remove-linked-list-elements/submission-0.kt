/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var current : ListNode? = head
        var newHead = ListNode(0)
        newHead.next = head
        var prev :ListNode? = newHead

        while(current != null){
            if(current.`val` == `val`){
                prev?.next = current.next
            }else{
                prev = current
            }
            current = current.next
        }
        return newHead.next
    }
}
