/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        val result = mutableListOf<Int>()
        inOrder(root,result)
        if(result.isEmpty()) return true
        for(i in 1 until result.size){
            if(result[i] <= result[i - 1])
            return false
        }
        return true
    }

    fun inOrder(root:TreeNode?,result:MutableList<Int>){
        if(root == null) return 
        inOrder(root.left,result)
        result.add(root.`val`)
        inOrder(root.right,result)
    }
}
