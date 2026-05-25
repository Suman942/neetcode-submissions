/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
       // find the middle
       var slow : ListNode? = head
       var fast : ListNode? = head
       while(fast != null && fast?.next != null){
        slow = slow?.next
        fast = fast?.next?.next
       }

       // reverse
       val splitNode : ListNode? = slow?.next
       slow?.next = null

       var current : ListNode? = splitNode
       var prev : ListNode? = null
       while(current != null){
        val next = current?.next
        current?.next = prev
        prev = current
        current = next
       }

       // merge
       var first:ListNode? = head
       var second : ListNode? = prev
       while(second != null){
        val firstNext = first?.next
        val secondNext = second?.next

        first?.next = second
        second?.next = firstNext

        first = firstNext
        second = secondNext
       }
    }
}
