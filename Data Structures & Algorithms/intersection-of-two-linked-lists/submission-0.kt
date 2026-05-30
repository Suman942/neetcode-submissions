/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        val set = mutableSetOf<ListNode>()
        var c1: ListNode? = headA
        while(c1 != null){
            set.add(c1)
            c1 = c1.next
        }

        var c2 :ListNode? = headB
        while(c2 != null){
            if(set.contains(c2)){
                return c2
            }
            c2 = c2.next
        }

        return null
    }
}
