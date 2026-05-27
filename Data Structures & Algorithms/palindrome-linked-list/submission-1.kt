/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        var slow : ListNode? = head
        var fast : ListNode? = head
        // find middle
        while(fast != null && fast?.next != null){
            slow = slow?.next
            fast = fast?.next?.next
        }

        // reverse
        var current :ListNode? = slow
        var prev: ListNode? = null
        while(current != null){
            val next = current?.next
            current.next = prev
            prev = current
            current = next
        }

        // compare eeach value
        var first :ListNode? = head
        var second : ListNode? = prev
        while(second != null){
            val firstNext = first?.next
            val secondNext = second?.next
            if(first?.`val` != second?.`val`){
                return false
            }
            first = firstNext
            second = secondNext
        }
        return true
    }
}
