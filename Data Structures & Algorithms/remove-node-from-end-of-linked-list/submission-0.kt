/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val node = ListNode(0)
        node.next = head

        var slow :ListNode? = node
        var fast :ListNode? = node

        for(i in 0..n){
            fast = fast?.next
        }

        while(fast != null){
            slow = slow?.next
            fast = fast.next
        }

        slow?.next = slow?.next?.next

        return node.next
    }
}
