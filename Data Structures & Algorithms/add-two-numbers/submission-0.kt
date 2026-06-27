/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        /*
        Algorithm
        Create a dummy node.
        Keep a pointer current.
        Keep carry = 0.
        While either list has nodes or carry is not 0
        Read value from first list (or 0 if null)
        Read value from second list (or 0 if null)
        sum = val1 + val2 + carry
        carry = sum / 10
        digit = sum % 10
        Create a new node with digit
        Move pointers
        Return dummy.next.
        */

        val dummy = ListNode(0)
        var carry = 0
        var current = dummy

        var p1 = l1
        var p2 = l2

        while(p1 != null || p2 != null || carry != 0){
            val x = p1?.`val` ?: 0
            val y = p2?.`val` ?: 0
            val sum = x + y + carry

            carry = sum / 10
            current.next = ListNode(sum % 10)
            current = current.next!!

            p1 = p1?.next
            p2 = p2?.next

        }
        return dummy.next
    }
}
